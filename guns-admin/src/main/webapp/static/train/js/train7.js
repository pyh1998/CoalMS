var Train7 = {
    id: "Train7Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/train/list_train7"
};

Train7.initColumn = function () {
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
            title: '发站', field: 'FSTATSTASTIONNAME', align: 'center', valign: 'middle'
        },
        {title: '公司', field: 'COMPANY', align: 'center', valign: 'middle'},
        {title: '煤种', field: 'FCOALNAME', align: 'center', valign: 'middle'},
        {title: '列车编号', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle'},
        {title: '车次', field: 'FTRAINORDERVCR', align: 'center', valign: 'middle'},
        {title: '翻车机', field: 'TICKET_NO', align: 'center', valign: 'middle'},
        {
            title: '车厢数', field: 'FTRAINNUMNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FTRAINNUMNUM"]);
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
            title: '重车吨', field: 'FHEAVYTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["FHEAVYTONNUM"]);
                    if (!Number.isNaN(number))
                        count += number;
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
        {
            title: '空车吨', field: 'FEMPTYTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["FEMPTYTONNUM"]);
                    if (!Number.isNaN(number))
                        count += number;
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
        {
            title: '过衡吨', field: 'FWEIGHTTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["FWEIGHTTONNUM"]);
                    if (!Number.isNaN(number))
                        count += number;
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
        {
            title: '货票吨', field: 'FCHECKTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FCHECKTONNUM"]);
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
            title: '过衡盈亏率%', field: 'RATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;

                //货票吨
                var FCHECKTONNUM = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FCHECKTONNUM"]);
                    if (!Number.isNaN(number))
                        FCHECKTONNUM += number;
                }

                //过衡吨
                var FWEIGHTTONNUM = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["FWEIGHTTONNUM"]);
                    if (!Number.isNaN(number))
                        FWEIGHTTONNUM += number;
                }

                if (FCHECKTONNUM === 0 || FCHECKTONNUM == undefined || FCHECKTONNUM == null) {
                    return 0;
                }

                //过衡盈亏率%
                var count = ((FWEIGHTTONNUM - FCHECKTONNUM) / FCHECKTONNUM) * 100;
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

Train7.search = function () {
    if ($("#str_station").val() == null || $("#str_station").val() == "") {
        // Feng.alert("请选择一个发站");
        // return ;
    }
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_station'] = $("#str_station").val();
    queryData['str_first'] = "1";
    queryData['str_coalname'] = $("#str_coalname").val();

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train7.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Train7.bootstrapTableUrl
        });
    } else {
        Train7.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;

    $("#Train7Table").bootstrapTable('selectPage', 1);
};

function showSelect() {
    $.ajax({
        url: Feng.ctxPath + "/train/list_train7Q",
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#str_station").empty();
            $("#str_station").append("<option value=''>--请选择--</option>");

            //判断下拉宽度
            // todo

            var beanList = data;   //返回的json数据
            if (beanList) {                   //判断
                for (var i = 0; i < beanList.length; i++) {
                    // 去除所有空格:
                    var str = beanList[i].NAME.replace(/\s+/g, "");
                    // JS截取字符串
                    if (str.length > 5) {
                        str = str.substring(0, 5) + "...";
                    }
                    //遍历，动态赋值
                    $("#str_station").append("<option value='" + beanList[i].CODE + "'>" + str + "</option>");
                }
            }
            $("#str_station").selectpicker('refresh');
        }
    });
}

/**
 *
 * 功能: 查询煤种下拉
 *
 * @作者 Andy
 * @时间 2019/4/9 11:37
 * @return
 *
 */
function showCoalnameList() {

    $.ajax({
        url: Feng.ctxPath + "/train/getsCoalnameList",
        type: "POST",
        data: {},
        dataType: "json",
        success: function (data) {
            $("#str_coalname").empty();
            $("#str_coalname").append("<option value=''>--请选择--</option>");

            //判断下拉宽度
            // todo

            var beanList = data;   //返回的json数据
            if (beanList) {                   //判断
                for (var i = 0; i < beanList.length; i++) {
                    // 去除所有空格:
                    var str = beanList[i].FNAMEVCR.replace(/\s+/g, "");
                    // JS截取字符串
                    if (str.length > 12) {
                        str = str.substring(0, 12) + "...";
                    }
                    //遍历，动态赋值
                    $("#str_coalname").append("<option value='" + beanList[i].FNAMEVCR + "'>" + str + "</option>");
                }
            }
            $("#str_coalname").selectpicker('refresh');
        },
        error: function (data) {
            Feng.error("煤种查询失败!" + data.responseJSON.message + "!");
        }
    });

}

Train7.export = function () {
    if ($("#str_station").val() == null || $("#str_station").val() == "") {
        // Feng.alert("请选择一个发站");
        // return ;
    }

    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var str_station = $("#str_station").val();
        var str_stationname = $("#str_station").find("option:selected").text();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        var str_coalname = $("#str_coalname").val();
        window.location.href = Feng.ctxPath + "/train/list_train7_excel?str_company=" + str_company + "&str_station=" + str_station + "&str_coalname=" + str_coalname
            + "&dt_start=" + dt_start + "&dt_end=" + dt_end + "&str_stationname=" + str_stationname;
    });
};


$(function () {
    showSelect();
    showCoalnameList();
    window.setTimeout(init_time, 300);
    window.setTimeout(init_table, 500);
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


function init_table() {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train7Dbody").style.height = bodyheight;

    var defaultColunms = Train7.initColumn();
    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var table = new BSTable(Train7.id, Train7.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_coalname'] = $("#str_coalname").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Train7.table = table.init();
}