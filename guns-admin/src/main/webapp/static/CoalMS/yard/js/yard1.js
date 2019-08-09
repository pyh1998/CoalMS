var gd_company = "";
var gd_coalcode = "";
var gd_subcode = "";
var Yard1 = {
    id: "Yard1Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/yard/list_yard1"
};

Yard1.initColumn = function () {
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
        {title: '垛位', field: 'SUBNAME', align: 'center', valign: 'middle', width: '100'},
        {title: '煤种', field: 'COALNAME', align: 'center', valign: 'middle', width: '100'},
        {title: '坐标XY', field: 'FZB', align: 'center', valign: 'middle', width: '100'},
        {
            title: '库存', field: 'FNUMNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FNUMNUM"]);
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
        // {title: '期初', field: 'FEXPECTFIRSTNUM', align: 'center', valign: 'middle'},
        // {title: '调进', field: '', align: 'center', valign: 'middle'},
        // {title: '调出', field: '', align: 'center', valign: 'middle'},
        // {title: '实时参考', field: '', align: 'center', valign: 'middle'},
        {
            title: '人工盘点', field: 'FAFTERREWORKNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FAFTERREWORKNUM"]);
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
            title: '无人机盘点', field: '', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    // var number = parseInt(value[i]["TICKET_NO"]);
                    // if(!Number.isNaN(number))
                    // count += number;
                }
                return count;
            }
        },
        {
            title: '盘点数', field: '', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    // var number = parseInt(value[i]["TICKET_NO"]);
                    // if(!Number.isNaN(number))
                    //     count += number;
                }
                return count;
            }
        },
        {title: '首堆时间', field: 'FSDSJ', align: 'center', valign: 'middle'},
        {title: '清堆时间', field: 'FQDSJ', align: 'center', valign: 'middle'},
        {title: '堆存时间', field: 'LASTHOUR', align: 'center', valign: 'middle'},
        {title: '垛位code', field: 'FSUBBUTTLECODEVCR', align: 'center', valign: 'middle', visible: false},
        {title: '煤种code', field: 'FCOALCODEVCR', align: 'center', valign: 'middle', visible: false}
    ];
};

Yard1.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_subname'] = $("#str_subname").val();
    queryData['str_coalname'] = $("#str_coalname").val();

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Yard1.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Yard1.bootstrapTableUrl
        });
    } else {
        Yard1.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;

    $("#Yard1Table").bootstrapTable('selectPage', 1);
};


var Yard1D1 = {
    id: "Yard1D1Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};
Yard1D1.initColumn = function () {
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
        // {title: '分公司', field: 'COMPANY', align: 'center', valign: 'middle'},
        // {title: '垛位', field: 'SUBNAME', align: 'center', valign: 'middle'},
        // {title: '煤种', field: 'COALNAME', align: 'center', valign: 'middle'},
        {
            title: '列车编号', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle'
        },
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
        }
    ];
};

var Yard1D2 = {
    id: "Yard1D2Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};
Yard1D2.initColumn = function () {
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
        // {title: '分公司', field: 'COMPANY', align: 'center', valign: 'middle'},
        // {title: '垛位', field: 'SUBNAME', align: 'center', valign: 'middle'},
        // {title: '煤种', field: 'COALNAME', align: 'center', valign: 'middle'},
        {
            title: '船舶年序号', field: 'FSHIPYEARNUMVCR', align: 'center', valign: 'middle'
        },
        {
            title: '船舱数', field: 'FCABINNUMNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FCABINNUMNUM"]);
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
            title: 'BQ秤', field: 'FBQTON1NUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FBQTON1NUM"]);
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
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FSUBBUTTLECODEVCR + "','" + row.FCOALCODEVCR + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, subcode, coalcode) {
    var queryData = {};
    queryData['str_company'] = company;
    queryData['str_subcode'] = subcode;
    queryData['str_coalcode'] = coalcode;

    gd_company = company;
    gd_coalcode = coalcode;
    gd_subcode = subcode;
    Yard1D1.table.refresh({query: queryData});
    Yard1D2.table.refresh({query: queryData});

    Yard1D1.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    Yard1D2.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;

    $("#Yard1D1Table").bootstrapTable('selectPage', 1);
    $("#Yard1D2Table").bootstrapTable('selectPage', 1);
}

Yard1.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var str_subname = $("#str_subname").val();
        var str_coalname = $("#str_coalname").val();
        window.location.href = Feng.ctxPath + "/yard/list_yard1_excel?str_company=" + str_company + "&str_subname=" + str_subname + "&str_coalname=" + str_coalname +
            "&str_company2=" + gd_company + "&str_subcode=" + gd_subcode + "&str_coalcode=" + gd_coalcode;
    });
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Yard1Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tables_height = $(document).height() - oddheight;
    var table1 = tables_height * 2 / 5;
    var table2 = tables_height - table1;

    var defaultColunms = Yard1.initColumn();
    var table = new BSTable(Yard1.id, Yard1.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table1);
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Yard1.table = table.init();

    var defaultColunmsD1 = Yard1D1.initColumn();
    var tableD1 = new BSTable(Yard1D1.id, "/yard/list_yard1D1", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD1), table2);
    tableD1.setPaginationType("client");
    tableD1.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD1.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Yard1D1.table = tableD1.init();

    var defaultColunmsD2 = Yard1D2.initColumn();
    var tableD2 = new BSTable(Yard1D2.id, "/yard/list_yard1D2", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD2), table2);
    tableD2.setPaginationType("client");
    tableD2.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD2.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Yard1D2.table = tableD2.init();
});
