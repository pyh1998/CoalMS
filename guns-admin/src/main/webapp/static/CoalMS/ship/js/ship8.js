var gd_company = "";
var gd_shipno = "";
var Ship8Q = {
    id: "Ship8QTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: Feng.ctxPath + "/ship/list_ship7Q"
};

Ship8Q.initColumn = function () {
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
            }
        },
        {title: '公司', field: 'COMPANY', align: 'center', valign: 'middle'},
        // {title: '船舶年序号', field: 'FSHIPYEARNUMVCR', align: 'center', valign: 'middle',formatter:opendetail},
        {
            title: '船舶年序号',
            field: 'FSHIPYEARNUMVCR',
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
                return "<a href='#'>" + value + "</a>";
            }
        },
        {title: '船舶名称', field: 'FSHIPNAME', align: 'center', valign: 'middle'}
    ];
};

Ship8Q.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_fshipyearnumvcr'] = $("#str_fshipyearnumvcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship8Q.table.refresh({
            query: queryData,
            url: Ship8Q.bootstrapTableUrl
        });
    } else {
        Ship8Q.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship8Table").bootstrapTable('selectPage', 1);
};

var Ship8 = {
    id: "Ship8Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Ship8.initColumn = function () {
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
            title: '船舶年序号', field: 'FSHIPYEARNUMVCR', align: 'center', valign: 'middle'
        },
        {title: '开始时间', field: 'FSTARTTIMEDTM', align: 'center', valign: 'middle'},
        {title: '结束时间', field: 'FSTOPTIMEDTM', align: 'center', valign: 'middle'},
        {title: '流程', field: 'FFLOWNAME', align: 'center', valign: 'middle'},
        {title: '仓位', field: 'FCABINNUMNUMNO', align: 'center', valign: 'middle'},
        {title: '垛位', field: 'FBATTLENAME', align: 'center', valign: 'middle'},
        {title: '煤种', field: 'FCOALNAME1', align: 'center', valign: 'middle'},
        {
            title: '取料机秤数', field: 'RTON', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["RTON"]);
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
            title: 'BM秤数', field: 'BMTON', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["BMTON"]);
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
            title: 'BQ秤数', field: 'BQTON', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["BQTON"]);
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
            title: 'BJ秤数', field: 'BJTON', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["BJTON"]);
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
        }
    ];
};

function opendetail(value, row, index) {
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FSHIPYEARNUMVCR + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, shipno) {
    var queryData = {};
    queryData['str_company'] = company;
    queryData['str_shipno'] = shipno;
    gd_company = company;
    gd_shipno = shipno;

    Ship8.table.refresh({query: queryData});
    Ship8.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship8Table").bootstrapTable('selectPage', 1);
};

Ship8.export = function () {
    if (CustomizeParameters.isEmpty(gd_shipno)) {
        Feng.alert("导出前请选择详细船舶年序号！", 7);
        return;
    }
    Feng.confirm("是否按现查询条件导出word?", function () {
        window.location.href = Feng.ctxPath + "/ship/list_shipdetail_word";
    });
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship8Dbody").style.height = bodyheight;

    var tableheight1 = $(document).height() - document.getElementById("qdiv").offsetHeight - 36;
    var tableheight2 = $(document).height() - 36;

    var defaultColunms = Ship8Q.initColumn();
    var table = new BSTable(Ship8Q.id, Ship8Q.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight1);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_fshipyearnumvcr'] = $("#str_fshipyearnumvcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.onClickCell = function (field, value, row, $element) {
        if (field !== "FSHIPYEARNUMVCR") {
            return;
        }
        var queryData = {};
        queryData['str_company'] = row.COMPANY;
        queryData['str_shipno'] = row.FSHIPYEARNUMVCR;
        gd_company = row.COMPANY;
        gd_shipno = row.FSHIPYEARNUMVCR;
        Ship8.table.refresh({query: queryData});
        $("#Ship8Table").bootstrapTable('selectPage', 1);
    };
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship8Q.table = table.init(); //左部小Table

    var defaultColunmsD = Ship8.initColumn();
    var tableD = new BSTable(Ship8.id, "/ship/list_ship8", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), tableheight2);
    tableD.setPaginationType("client");
    tableD.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship8.table = tableD.init(); //右部大Table

    init_time();

    //获取当前Iframe URL
    if ($("iframe[name='iframe10000']", parent.document) && $("iframe[name='iframe10000']", parent.document).last()) {
        var iframe = $("iframe[name='iframe10000']", parent.document).last();
        var cid = $(iframe).attr("cid");
        var fid = $(iframe).attr("fid");
        var ftime = $(iframe).attr("ftime");
        if (cid !== undefined && cid !== null && cid !== "" && fid !== undefined && fid !== null && fid !== "" && ftime !== undefined && ftime !== null && ftime !== "") {
            //执行点击方法
            $("#str_company").val(cid);
            $("#str_fshipyearnumvcr").val(fid);
            $("#dt_start").val(ftime);
            $("#dt_end").val(ftime);
            $("#ship8SearchButton").click();
            var queryData = {};
            queryData['str_company'] = cid;
            queryData['str_shipno'] = fid;
            gd_company = cid;
            gd_shipno = fid;
            Ship8.table.refresh({query: queryData});
            Ship8.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
            $("#Ship8Table").bootstrapTable('selectPage', 1);
        }
    }

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


