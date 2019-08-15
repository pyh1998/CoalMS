var gd_company = "";
var gd_month = "";

var Ship2 = {
    id: "Ship2Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/ship/list_ship2"
};
Ship2.initColumn = function () {
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
            title: '合格船数', field: 'HEGE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["HEGE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                return count;
            }
        },
        {
            title: '全月装船总数', field: 'TOTAL', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["TOTAL"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                return count;
            }
        },
        {
            title: '同线皮带秤误差合格率', field: 'RATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;

                //全月装船总数
                var TOTAL = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["TOTAL"]);
                    if (!Number.isNaN(number))
                        TOTAL += number;
                }

                //合格船数
                var HEGE = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["HEGE"]);
                    if (!Number.isNaN(number))
                        HEGE += number;
                }

                //全月装船总数 为零则返回零
                if (TOTAL === 0 || TOTAL == undefined || TOTAL == null) {
                    return 0;
                }

                //同线皮带秤误差合格率
                var count = (HEGE / TOTAL) * 100;
                if (Number.isNaN(count))
                    count = 0;
                return count.toFixed(2) + "%";
            }
        }
    ];
};

var Ship2D = {
    id: "Ship2DTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};
Ship2D.initColumn = Ship1Table.initColumn;

function opendetail(value, row, index) {
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, month) {
    var y = parseInt(month.replace(/-\d{2}$/, ""));
    var m = parseInt(month.replace(/^\d{4}-/, ""));
    var curDate = new Date();
    curDate.setFullYear(y);
    curDate.setMonth(m);
    curDate.setDate(0);
    var queryData = {};
    queryData['str_company'] = company;
    queryData['dt_start'] = month + "-01";
    queryData['dt_end'] = month + "-" + curDate.getDate();
    queryData['str_first'] = "1";
    console.log(queryData);
    gd_company = company;
    gd_month = month;


    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship2D.table.refresh({
            query: queryData,
            url:  "/ship/list_ship3"
        });
    } else {
        Ship2D.table.refresh({query: queryData});
    }
    Ship2D.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship2DTable").bootstrapTable('selectPage', 1);
}


Ship2.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship2.table.refresh({
            query: queryData,
            url: Ship2.bootstrapTableUrl
        });
    } else {
        Ship2.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship2Table").bootstrapTable('selectPage', 1);
};

Ship2.export = function () {
    //判断公司是否为空
    if (CustomizeParameters.isEmpty(gd_month)) {
        Feng.alert("导出前请选择详细月份！", 7);
        return;
    }

    Feng.confirm("是否按现查询条件导出Word?", function () {

        var map = new Map();
        // 添加键
        map.set("month", gd_month);
        //公司名称
        map.set("company", gd_company);

        CustomizeParameters.response4Download('/ship/list_ship2_excel', map);

    });
};


$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship2Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tables_height = $(document).height() - oddheight;
    var table1 = tables_height * 2 / 5;
    var table2 = tables_height - table1;

    var defaultColunms = Ship2.initColumn();
    var table = new BSTable(Ship2.id, Ship2.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table1);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship2.table = table.init();

    var defaultColunmsD = Ship2D.initColumn();
    var tableD = new BSTable(Ship2D.id, "/ship/list_ship3", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), table2);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    tableD.queryParams = queryData;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        tableD.url = "";
    }
    tableD.setPaginationType("client");
    tableD.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    tableD.onClickCell = function (field, value, row, $element) {
        if (field !== "FSHIPYEARNUMVCR") {
            return;
        }
        var url =  "/ship/ship8";
        var title = "单船皮带秤明细";
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').find(".J_menuTab.active").removeClass("active");
        $(window.parent.document).find('.J_mainContent').find("iframe").css("display", "none");
        var iframe = '<iframe class="J_iframe" name="iframe10000" cid="' + row.COMPANY + '" fid="' + value + '" ftime="' + row["FCOUNTTIMEDTM"] + '" width="100%" height="100%" src="' + url + '" frameborder="0" data-id="' + url + '" seamless="" style="display: inline;"></iframe>';
        $(window.parent.document).find('.J_mainContent').append(iframe);
        // 判断是否已存在标签
        var flag = true;
        $(".J_menuTab", parent.document).each(function () {
            //选项卡菜单已存在
            if ($(this).data('id') == url) {
                //效果:当前页面切换
                // flag = false;
                //移除重复标签和页面,排除最后一个页面
                $(this).remove();
                $("iframe[name='iframe10000']:not(:last)", parent.document).remove();
            }
        });
        if (flag) {
            $(window.parent.document).find('.J_menuTabs .page-tabs-content ').append(' <a href="javascript:;" class="J_menuTab active" data-id="' + url + '">' + title + ' <i class="fa fa-times-circle"></i></a>');
        }
    };
    Ship2D.table = tableD.init();

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
