var Trans = {
    id: "TransTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/trans/transShip"
};

Trans.initColumn = function () {
    var me = this;
    return [
        {field: 'selectitem', radio: true, visible: false},
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
            title: '公司', field: 'company', align: 'center', valign: 'middle', width: '5%'
        },
        {title: '所属日期', field: 'fcounttimedtm', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶年序号', field: 'fshipyearnumvcr', align: 'center', valign: 'middle', width: '6%'},
        {title: '航次', field: 'fshipordernum', align: 'center', valign: 'middle', width: '6%'},
        {title: '抵达时间', field: 'farrivetimedtm', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶代码', field: 'fshipcodenum', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位代码', field: 'fberthnum', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位名称', field: 'fberthname', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数吨2', field: 'fsigntonnum2', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数吨', field: 'fsigntonnum', align: 'center', valign: 'middle', width: '6%'},
        {title: '装船状态', field: 'fshipstatevcr', align: 'center', valign: 'middle', width: '6%'},
        {title: '统计年月 月份 所属日期', field: 'fcounttimedtm', align: 'center', valign: 'middle', width: '6%'},
        {title: '舱数', field: 'fcabinnumnum', align: 'center', valign: 'middle', width: '6%'},
        {title: '11最大承重吨', field: 'fmaxweighnum', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数1', field: 'frton1num', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数1', field: 'fbqton1num', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数2', field: 'frton2num', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数2', field: 'fbqbton2num', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨数', field: 'fbmtonnum', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数1', field: 'fbjtonnum1', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数2', field: 'fbjtonnum2', align: 'center', valign: 'middle', width: '6%'},
        {title: '11结果', field: 'lineresult', align: 'center', valign: 'middle', width: '6%'},
        {title: '11状态', field: 'linestate', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨数', field: 'rton', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨数', field: 'bmton', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨数', field: 'bqton', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨数', field: 'bjton', align: 'center', valign: 'middle', width: '6%'},
        {title: '最大吨数', field: 'maxton', align: 'center', valign: 'middle', width: '6%'},
        {title: '最小吨数', field: 'minton', align: 'center', valign: 'middle', width: '6%'},
        {title: 'R吨偏差率', field: 'rrate', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BM吨偏差率', field: 'bmrate', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BQ吨偏差率', field: 'bqrate', align: 'center', valign: 'middle', width: '6%'},
        {title: 'BJ吨偏差率', field: 'bjrate', align: 'center', valign: 'middle', width: '6%'},
        {title: '煤种名称1', field: 'fcoalname1', align: 'center', valign: 'middle', width: '6%'},
        {title: '煤种名称2', field: 'fcoalname2', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数结果', field: 'signresult', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数状态', field: 'signstate', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数率', field: 'signrrate', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BM率', field: 'signbmrate', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BQ率', field: 'signbqrate', align: 'center', valign: 'middle', width: '6%'},
        {title: '签数BJ率', field: 'signbjrate', align: 'center', valign: 'middle', width: '6%'},
        {title: '11开始时间', field: 'fstarttimedtm', align: 'center', valign: 'middle', width: '6%'},
        {title: '11停止时间', field: 'fstoptimedtm', align: 'center', valign: 'middle', width: '6%'},
        {title: '11battle名称', field: 'fbattlename', align: 'center', valign: 'middle', width: '6%'},
        {title: '11流动名称', field: 'fflowname', align: 'center', valign: 'middle', width: '6%'},
        {title: '11船舱数量', field: 'fcabinnumnumno', align: 'center', valign: 'middle', width: '6%'},
        {title: '船舶名称', field: 'fshipname', align: 'center', valign: 'middle', width: '6%'},
        {title: '泊位', field: 'fberthname', align: 'center', valign: 'middle', width: '5%'},
        {title: '煤种', field: 'fcoalname1', align: 'center', valign: 'middle', width: '20%'},
        {
            title: '船舶签数', field: 'fsigntonnum', align: 'center', valign: 'middle', width: '5%'
        },
        {
            title: '取料机秤数', field: 'rton', align: 'center', valign: 'middle', width: '6%'

        },
        {
            title: 'BM秤数', field: 'bmton', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: 'BQ秤数', field: 'bqton', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: 'BJ秤数', field: 'bjton', align: 'center', valign: 'middle', width: '6%'
        },
        {
            title: '取料机秤偏差率%', field: 'rrate', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BM偏差率%', field: 'bmrate', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BQ偏差率%', field: 'bqrate', align: 'center', valign: 'middle', width: '7%'
        },
        {
            title: 'BJ偏差率%', field: 'bjrate', align: 'center', valign: 'middle', width: '7%'
        },
        {title: '签数对照分析', field: 'state', align: 'center', valign: 'middle', width: '6%', cellStyle: cellformat}
    ];
};

function cellformat(value, row, index) {
    if (value != '合格' && value != '基本合格') {
        return {css: {"color": "red"}}
    } else {
        return {css: {}};
    }
};

Trans.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Trans.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Trans.bootstrapTableUrl
        });
    } else {
        Trans.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;

    $("#TransTable").bootstrapTable('selectPage', 1);
};

Trans.export = function () {
    $.ajax({
        url:"/trans/deleteShip",//访问的地址
        type:"get",
        success:function(data) {
            console.log(data);

        }
    })

};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("TransDbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var defaultColunms = Trans.initColumn();
    var table = new BSTable(Trans.id, Trans.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight);
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
    Trans.table = table.init();

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

