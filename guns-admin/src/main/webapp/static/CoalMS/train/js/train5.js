 var gd_company = "";
var gd_trainno = "";
var Train5 = {
    id: "Train5Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/train/search4"
};

Train5.initColumn = function () {
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
        {title: '公司', field: 'COMPANY', align: 'center', valign: 'middle', width: '20%'},
        // {title: '列车编号', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle',formatter:opendetail,width:'40%'},
        {
            title: '列车编号',
            field: 'FTRAINCODEVCR',
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
                return "<a href='#'>" + value + "</a>";
            },
            width: '40%'
        },
        {title: '翻净率%', field: 'RATE', align: 'center', valign: 'middle', width: '40%'}
    ];
};

Train5.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_ftraincodevcr'] = $("#str_ftraincodevcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    console.log(queryData);
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train5.table.refresh({
            query: queryData,
            url: Train5.bootstrapTableUrl
        });
    } else {
        Train5.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train5Table").bootstrapTable('selectPage', 1);
};


var Train5D = {
    id: "Train5DTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Train5D.initColumn = function () {
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
            title: '列车编号', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle', width: '10%'
        },
        {title: '一次车号', field: 'FTRAINNONUM', align: 'center', valign: 'middle', width: '9%'},
        {title: '二次车号', field: 'FTRAINNONUM2', align: 'center', valign: 'middle', width: '9%'},
        {title: '翻车机', field: 'TICKET_NO', align: 'center', valign: 'middle', width: '4%'},
        // {title: '重车吨', field: 'FHEAVYTONNUM', align: 'center', valign: 'middle'},
        {
            title: '空车吨', field: 'FEMPTYTONNUM', align: 'center', valign: 'middle', width: '8%',
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
            title: '重车吨', field: 'FHEAVYTONNUM', align: 'center', valign: 'middle', width: '8%',
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
            title: '空车吨极限均值', field: 'LIMITEMPTY', align: 'center', valign: 'middle', width: '10%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["LIMITEMPTY"]);
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
            title: '翻净率%', field: 'EMPTYRATE', align: 'center', valign: 'middle', width: '10%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["EMPTYRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count;
                return "";
            }
        },
        // {title: '货票吨', field: 'FCHECKTONNUM', align: 'center', valign: 'middle'},
        // {title: '过衡吨', field: 'FWEIGHTTONNUM', align: 'center', valign: 'middle'},
        {
            title: '过衡盈亏率%', field: 'WEIGHTRATE', align: 'center', valign: 'middle', width: '9%',
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
        },
        {
            title: '空车扫描体积', field: 'FVOLUME', align: 'center', valign: 'middle', width: '10%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FVOLUME"]);
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
            title: '扫描极限值', field: 'LIMITVOL', align: 'center', valign: 'middle', width: '10%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["LIMITVOL"]);
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
            title: '体积偏差率%', field: 'VOLRATE', align: 'center', valign: 'middle', width: '9%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["VOLRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count;
                return "";
            }
        }
    ];
};

function opendetail(value, row, index) {
    var funurl = "openInfoDetail('" + row.COMPANY + "','" + row.FTRAINCODEVCR + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, trainno) {
    var queryData = {};
    queryData['str_company'] = company;
    queryData['str_trainno'] = trainno;
    gd_company = company;
    gd_trainno = trainno;

    Train5D.table.refresh({query: queryData});
    $("#Train5DTable").bootstrapTable('selectPage', 1);
};

Train5.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var str_ftraincodevcr = $("#str_ftraincodevcr").val();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        window.location.href =  "/train/list_train5_excel?str_company=" + str_company + "&str_ftraincodevcr=" + str_ftraincodevcr + "&dt_start=" + dt_start + "&dt_end=" + dt_end +
            "&str_company2=" + gd_company + "&str_trainno=" + gd_trainno;
    });
};


$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train5Dbody").style.height = bodyheight;

    var tableheight1 = $(document).height() - document.getElementById("qdiv").offsetHeight - 36;
    var tableheight2 = $(document).height() - 36;

    var defaultColunms = Train5.initColumn();
    var table = new BSTable(Train5.id, Train5.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight1);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_ftraincodevcr'] = $("#str_ftraincodevcr").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    console.log(queryData);

    table.onClickCell = function (field, value, row, $element) {
        if (field !== "FTRAINCODEVCR") {
            return;
        }
        var queryData = {};
        queryData['str_company'] = row.COMPANY;
        queryData['str_trainno'] = row.FTRAINCODEVCR;
        queryData['dt_start'] = $("#dt_start").val();
        queryData['dt_end'] = $("#dt_end").val();
        gd_company = row.COMPANY;
        gd_trainno = row.FTRAINCODEVCR;
        Train5D.table.refresh({query: queryData});
        $("#Train5DTable").bootstrapTable('selectPage', 1);
    };
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = Train5.bootstrapTableUrl;
    }
    //table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Train5.table = table.init();

    var defaultColunmsD = Train5D.initColumn();
    var tableD = new BSTable(Train5D.id, "/train/Train5D", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), tableheight2);
    //tableD.setPaginationType("client");
    //tableD.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    //tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Train5D.table = tableD.init();

    init_time();

    //获取当前Iframe URL
    // if ($("iframe[name='iframe10000']", parent.document) && $("iframe[name='iframe10000']", parent.document).last()) {
    //     var iframe = $("iframe[name='iframe10000']", parent.document).last();
    //     var cid = $(iframe).attr("cid");
    //     var fid = $(iframe).attr("fid");
    //     var ftime = $(iframe).attr("ftime");
    //     if (cid !== undefined && cid !== null && cid !== "" && fid !== undefined && fid !== null && fid !== "" && ftime !== undefined && ftime !== null && ftime !== "") {
    //         //执行点击方法
    //         $("#str_company").val(cid);
    //         $("#str_ftraincodevcr").val(fid);
    //         $("#dt_start").val(ftime);
    //         $("#dt_end").val(ftime);
    //         $("#train5SearchButton").click();
    //         var queryData = {};
    //         queryData['str_company'] = cid;
    //         queryData['str_trainno'] = fid;
    //         gd_company = cid;
    //         gd_trainno = fid;
    //         Train5D.table.refresh({query: queryData});
    //         Train5D.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    //         $("#Train5DTable").bootstrapTable('selectPage', 1);
    //     }
    // }

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

