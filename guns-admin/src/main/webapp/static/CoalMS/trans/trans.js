var Ship4 = {
    id: "Ship4Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/ship/list_ship4"
};

Ship4.initColumn = function () {
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
            title: '公司', field: 'COMPANY', align: 'center', valign: 'middle', width: '5%'
        },
        {title: '所属日期', field: 'FCOUNTTIMEDTM', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶年序号', field: 'FSHIPYEARNUMVCR', align: 'center', valign: 'middle', width: '6%'},
        {title: '航次', field: 'FSHIPORDERNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: '抵达时间', field: 'FARRIVETIMEDTM', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶代码', field: 'FSHIPCODENUM', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位代码', field: 'FBERTHNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位名称', field: 'FBERTHNAME', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数吨2', field: 'FSIGNTONNUM2', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数吨', field: 'FSIGNTONNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: '装船状态', field: 'FSHIPSTATEVCR', align: 'center', valign: 'middle', width: '6%'},
        {title: '统计年月 月份 所属日期', field: 'FCOUNTTIMEDTM', align: 'center', valign: 'middle', width: '6%'},
        {title: '舱数', field: 'FCABINNUMNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: '11最大承重吨', field: 'FMAXWEIGHNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数1', field: 'FRTON1NUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数1', field: 'FBQTON1NUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数2', field: 'FRTON2NUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数2', field: 'FBQBTON2NUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨数', field: 'FBMTONNUM', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数1', field: 'FBJTONNUM1', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数2', field: 'FBJTONNUM2', align: 'center', valign: 'middle', width: '6%'},
        {title: '11结果', field: 'LINERESULT', align: 'center', valign: 'middle', width: '6%'},
        {title: '11状态', field: 'LINESTATE', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数', field: 'RTON', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨数', field: 'BMTON', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数', field: 'BQTON', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数', field: 'BJTON', align: 'center', valign: 'middle', width: '6%'},
        {title: '最大吨数', field: 'MAXTON', align: 'center', valign: 'middle', width: '6%'},
        {title: '最小吨数', field: 'MINTON', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨偏差率', field: 'RRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨偏差率', field: 'BMRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨偏差率', field: 'BQRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨偏差率', field: 'BJRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '煤种名称1', field: 'FCOALNAME1', align: 'center', valign: 'middle', width: '6%'},
        {title: '煤种名称2', field: 'FCOALNAME2', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数结果', field: 'SIGNRESULT', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数状态', field: 'SIGNSTATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数率', field: 'SIGNRRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BM率', field: 'SIGNBMRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BQ率', field: 'SIGNBQRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BJ率', field: 'SIGNBJRATE', align: 'center', valign: 'middle', width: '6%'},
        {title: '11开始时间', field: 'FSTARTTIMEDTM', align: 'center', valign: 'middle', width: '6%'},
        {title: '11停止时间', field: 'FSTOPTIMEDTM', align: 'center', valign: 'middle', width: '6%'},
        {title: '11battle名称', field: 'FBATTLENAME', align: 'center', valign: 'middle', width: '6%'},
        {title: '11流动名称', field: 'FFLOWNAME', align: 'center', valign: 'middle', width: '6%'},
        {title: '11船舱数量', field: 'FCABINNUMNUMNO', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶名称', field: 'FSHIPNAME', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位', field: 'FBERTHNAME', align: 'center', valign: 'middle', width: '5%'},
        {title: '煤种', field: 'FCOALNAME1', align: 'center', valign: 'middle', width: '20%'},
        {
            title: '船舶签数', field: 'FSIGNTONNUM', align: 'center', valign: 'middle', width: '5%'
        },
        {
            title: '取料机秤数', field: 'RTON', align: 'center', valign: 'middle', width: '6%'

        },
        {
            title: 'BM秤数', field: 'BMTON', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: 'BQ秤数', field: 'BQTON', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: 'BJ秤数', field: 'BJTON', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: '取料机秤偏差率%', field: 'RRATE', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BM偏差率%', field: 'BMRATE', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BQ偏差率%', field: 'BQRATE', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BJ偏差率%', field: 'BJRATE', align: 'center', valign: 'middle', width: '7%'
        },
        {title: '签数对照分析', field: 'STATE', align: 'center', valign: 'middle', width: '6%', cellStyle: cellformat}
    ];
};

function cellformat(value, row, index) {
    if (value != '合格' && value != '基本合格') {
        return {css: {"color": "red"}}
    } else {
        return {css: {}};
    }
};

Ship4.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship4.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Ship4.bootstrapTableUrl
        });
    } else {
        Ship4.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;

    $("#Ship4Table").bootstrapTable('selectPage', 1);
};

Ship4.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        window.location.href = Feng.ctxPath + "/ship/list_ship4_excel?str_company=" + str_company + "&dt_start=" + dt_start + "&dt_end=" + dt_end;
    });
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship4Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var defaultColunms = Ship4.initColumn();
    var table = new BSTable(Ship4.id, Ship4.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight);
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
    Ship4.table = table.init();

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

