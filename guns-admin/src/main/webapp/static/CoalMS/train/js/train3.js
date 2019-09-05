var gd_company = ""; //全局变量：用于点击主表数据查询分表，公司、月份
var gd_date = "";

var Train3 = {
    id: "Train3Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: Feng.ctxPath + "/train/search2"
};

Train3.initColumn = function () {
    //绑定this对象
    var me = this;
    return [
        {field: 'selectItem', radio: true, visible: false},
        {
            title: '序号',
            field: 'index',
            align: 'center',
            valign: 'middle',
            width: '3%',
            formatter: function (value, row, index) {
                if (me.table.getPaginationType() === "server") {
                    var pageSize = $('#' + Train1.id).bootstrapTable('getOptions').pageSize;
                    var pageNumber = $('#' + Train1.id).bootstrapTable('getOptions').pageNumber;
                    return pageSize * (pageNumber - 1) + index + 1;
                } else {
                    return index + 1;
                }
            },
            footerFormatter: function (value, row, index) {
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return "求和";
                } else {
                    //求平均
                    return "平均";
                }
            }
        },
        {
            title: '分公司', field: 'COMPANY', align: 'center', valign: 'middle', formatter: opendetail
        },
        {title: '月份', field: 'FBELONGMONTH', align: 'center', valign: 'middle'},
        {
            title: '有效列数', field: 'WEIGHTTRAIN', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["WEIGHTTRAIN"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count;
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(0);
                }
            }
        },
        {
            title: '无效列数', field: 'NOWEIGHTTRAIN', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["NOWEIGHTTRAIN"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count.toFixed(0);
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(0);
                }
            }
        },
        {
            title: '总列数', field: 'TOTALTRAIN', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["TOTALTRAIN"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count;
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(0);
                }
            }
        },
        {
            title: '有效过衡率%', field: 'RATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;

                //有效列数
                var WEIGHTTRAIN = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["WEIGHTTRAIN"]);
                    if (!Number.isNaN(number))
                        WEIGHTTRAIN += number;
                }

                //总列数
                var TOTALTRAIN = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["TOTALTRAIN"]);
                    if (!Number.isNaN(number))
                        TOTALTRAIN += number;
                }

                //有效过衡率%
                var count = (WEIGHTTRAIN / TOTALTRAIN) * 100;
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return "";
                } else {
                    //求平均
                    if (Number.isNaN(count))
                        return "空值";
                    return count.toFixed(2);
                }
            }
        }
    ];
};

var Train3D = {
    id: "Train3DTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Train3D.initColumn = function () {
    var me = this;
    return [
        {field: 'selectItem', radio: true, visible: false},
        {
            title: '序号',
            field: 'index',
            align: 'center',
            valign: 'middle',
            width: '3%',
            formatter: function (value, row, index) {
                if (me.table.getPaginationType() === "server") {
                    var pageSize = $('#' + Train1.id).bootstrapTable('getOptions').pageSize;
                    var pageNumber = $('#' + Train1.id).bootstrapTable('getOptions').pageNumber;
                    return pageSize * (pageNumber - 1) + index + 1;
                } else {
                    return index + 1;
                }
            },
            footerFormatter: function (value, row, index) {
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return "求和";
                } else {
                    //求平均
                    return "平均";
                }
            }
        },
        {
            title: '公司', field: 'COMPANY', align: 'center', valign: 'middle'
        },
        {title: '日期', field: 'FBELONGDATETIMEDTM', align: 'center', valign: 'middle'},
        {
            title: '列车编号',
            field: 'FTRAINCODEVCR',
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
                return "<a href='#'>" + value + "</a>";
            }
        },
        {
            title: '车厢数', field: 'FTRAINNUMNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    count += parseInt(value[i]["FTRAINNUMNUM"]);
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count;
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(0);
                }
            }
        },
        {
            title: '货票吨', field: 'FCHECKTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    count += parseInt(value[i]["FCHECKTONNUM"]);
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count;
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(0);
                }
            }
        },
        {
            title: '过衡吨', field: 'FWEIGHTTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    count += parseFloat(value[i]["FWEIGHTTONNUM"]);
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return count.toFixed(2);
                } else {
                    //求平均
                    var avg = count / value.length;
                    if (Number.isNaN(avg))
                        return "空值";
                    return avg.toFixed(2);
                }
            }
        },
        {title: '是否有效', field: 'ISVALID', align: 'center', valign: 'middle', cellStyle: cellformat}
    ];
};

function cellformat(value, row, index) {
    if (value == '无效') {
        return {css: {"color": "red"}}
    } else {
        return {css: {}};
    }
};


function opendetail(value, row, index) {
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    console.log(url);
    return url;
}

function openInfoDetail(company, month) {
    var queryData = {};
    queryData['str_company'] = company;
    queryData['dt_date'] = month;
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    gd_company = company;
    gd_date = month;
    console.log(queryData);
    Train3D.table.refresh({query: queryData});
    Train3D.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train3DTable").bootstrapTable('selectPage', 1);
}

Train3.search = function () {
    var queryData = {};
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train3.table.refresh({
            query: queryData,
            url:Train3.bootstrapTableUrl
        });
    } else {
        Train3.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train3Table").bootstrapTable('selectPage', 1);
};

Train3.export = function () {

    //判断公司是否为空
    if (CustomizeParameters.isEmpty(gd_company)) {
        Feng.alert("导出前请选择公司！", 7);
        return;
    }
    console.log(gd_company+"**********"+gd_date);
    window.location.href =  Feng.ctxPath + "/train/list_train3_excel?gd_company=" + gd_company + "&gd_date=" + gd_date;

    // Feng.confirm("是否按现查询条件导出Word?", function () {
    //
    //     var map = new Map();
    //     map.set("month", $("#dt_start").val().match(/^[\d]{4}-[\d]{2}/g));
    //     map.set("method", $("#radio label[class~='active'] input").attr('id') === "sum" ? "sum" : "average"); //average 平均//sum 总和
    //     //公司名称
    //     map.set("company", gd_company);
    //
    //     CustomizeParameters.response4Download('/train/list_train3_excel', map);
    //
    //
    // });

};


$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train3Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tables_height = $(document).height() - oddheight;
    var table1 = tables_height * 2 / 5;
    var table2 = tables_height - table1;

    var defaultColunms = Train3.initColumn();
    var table = new BSTable(Train3.id, Train3.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table1);
    var queryData = {};
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    Train3.table = table.init();

    var defaultColunmsD = Train3D.initColumn();
    var tableD = new BSTable(Train3D.id, Feng.ctxPath + "/train/search2D", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), table2);
    tableD.setPaginationType("client");
    tableD.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;

    //页面跳转
    tableD.onClickCell = function (field, value, row, $element) {
        //自定义函数 Cell点击触发
        if (field !== "FTRAINCODEVCR") {
            return;
        }
        var url = Feng.ctxPath + "/train/train4";
        var title = "单车过衡数据分析";
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').find(".J_menuTab.active").removeClass("active");
        $(window.parent.document).find('.J_mainContent').find("iframe").css("display", "none");
        var iframe = '<iframe class="J_iframe" name="iframe10000" cid="' + row.COMPANY + '" fid="' + value + '" ftime="' + row["FBELONGDATETIMEDTM"] + '" width="100%" height="100%" src="' + url + '" frameborder="0" data-id="' + url + '" seamless="" style="display: inline;"></iframe>';
        $(window.parent.document).find('.J_mainContent').append(iframe);
        $(".J_menuTab", parent.document).each(function () {
            //选项卡菜单已存在
            if ($(this).data('id') == url) {
                $(this).remove();
                $("iframe[name='iframe10000']:not(:last)", parent.document).remove();
            }
        });
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').append(' <a href="javascript:;" class="J_menuTab active" data-id="' + url + '">' + title + ' <i class="fa fa-times-circle"></i></a>');
    };

    Train3D.table = tableD.init();

    window.setTimeout(init_time, 300);
});


function init_time() {
    // var dtmin = document.getElementById("dt_min").value;
    // var dtmax = document.getElementById("dt_max").value;

    laydate.render({
        elem: '#dt_start'
        // ,min: dtmin
        // ,max: dtmax
    });
    laydate.render({
        elem: '#dt_end'
        // ,min: dtmin
        // ,max: dtmax
    });
}
