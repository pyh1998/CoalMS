var gd_company = "";
var gd_shipno = "";

var Ship7Q = {
    id: "Ship7QTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/ship/list_ship7Q"
};

Ship7Q.initColumn = function () {
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

Ship7Q.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_fshipyearnumvcr'] = $("#str_fshipyearnumvcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship7Q.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Ship7Q.bootstrapTableUrl
        });
    } else {
        Ship7Q.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship7QTable").bootstrapTable('selectPage', 1);
};

function opendetail(value, row, index) {
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FSHIPYEARNUMVCR + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, shipno) {
    gd_company = company;
    gd_shipno = shipno;
    var ajax = new $ax(Feng.ctxPath + "/ship/list_ship7", function (data) {
        // if(data==null || data.length==0){}else{}
        show_detail(data);
    }, function (data) {
        Feng.error("查询失败!" + data.responseJSON.message + "!");
    });
    ajax.set("str_company", company);
    ajax.set("str_shipno", shipno);
    ajax.start();
};

function show_detail(data) {
    if (CustomizeParameters.isEmpty(data)) {
        $("#FSHIPYEARNUMVCR").val("");
        $("#FSHIPNAME").val("");
        $("#FTONNUM").val("");
        $("#FSIGNTON1").val("");
        $("#FSIGNTON2").val("");

        $("#RTON").val("");
        $("#RRATE1").val("");
        $("#RRATE2").val("");

        $("#BMTON").val("");
        $("#BMRATE1").val("");
        $("#BMRATE2").val("");

        $("#BQTON").val("");
        $("#BQRATE1").val("");
        $("#BQRATE2").val("");

        $("#BJTON").val("");
        $("#BJRATE1").val("");
        $("#BJRATE2").val("");

        $("#SIGNRATE").val();
    } else {
        $("#FSHIPYEARNUMVCR").val(data[0]["FSHIPYEARNUMVCR"]);
        $("#FSHIPNAME").val(data[0]["FSHIPNAME"]);
        $("#FTONNUM").val(data[0]["FTONNUM"]);
        $("#FSIGNTON1").val(data[0]["FSIGNTON1"]);
        $("#FSIGNTON2").val(data[0]["FSIGNTON2"]);

        $("#RTON").val(data[0]["RTON"]);
        $("#RRATE1").val(data[0]["RRATE1"]);
        $("#RRATE2").val(data[0]["RRATE2"]);

        $("#BMTON").val(data[0]["BMTON"]);
        $("#BMRATE1").val(data[0]["BMRATE1"]);
        $("#BMRATE2").val(data[0]["BMRATE2"]);

        $("#BQTON").val(data[0]["BQTON"]);
        $("#BQRATE1").val(data[0]["BQRATE1"]);
        $("#BQRATE2").val(data[0]["BQRATE2"]);

        $("#BJTON").val(data[0]["BJTON"]);
        $("#BJRATE1").val(data[0]["BJRATE1"]);
        $("#BJRATE2").val(data[0]["BJRATE2"]);

        $("#SIGNRATE").val(data[0]["SIGNRATE"]);
    }
}

function Ship7_export() {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var str_fshipyearnumvcr = $("#str_fshipyearnumvcr").val();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        window.location.href = Feng.ctxPath + "/ship/list_ship7_excel?str_company=" + str_company + "&str_fshipyearnumvcr=" + str_fshipyearnumvcr + "&dt_start=" + dt_start + "&dt_end=" + dt_end +
            "&str_company2=" + gd_company + "&str_shipno=" + gd_shipno;
    });
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship7Dbody").style.height = bodyheight;

    var tableheight1 = $(document).height() - document.getElementById("qdiv").offsetHeight - 36;

    var defaultColunmsD = Ship7Q.initColumn();
    var tableD = new BSTable(Ship7Q.id, Ship7Q.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), tableheight1);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_fshipyearnumvcr'] = $("#str_fshipyearnumvcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    tableD.queryParams = queryData;
    tableD.setPaginationType("client");
    tableD.onClickCell = function (field, value, row, $element) {
        if (field !== "FSHIPYEARNUMVCR") {
            return;
        }
        gd_company = row.COMPANY;
        gd_shipno = row.FSHIPYEARNUMVCR;
        var ajax = new $ax(Feng.ctxPath + "/ship/list_ship7", function (data) {
            show_detail(data);
        }, function (data) {
            Feng.error("查询失败!" + data.responseJSON.message + "!");
        });
        ajax.set("str_company", row.COMPANY);
        ajax.set("str_shipno", row.FSHIPYEARNUMVCR);
        ajax.start();
    };
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        tableD.url = "";
    }
    tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship7Q.table = tableD.init();

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

