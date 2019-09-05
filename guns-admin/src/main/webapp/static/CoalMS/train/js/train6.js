var chartCode;

var Train6 = {
    id: "Train6Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: Feng.ctxPath + "/train/search5"
};

function show_line(data) {
    var pLegend = new Array();
    var pSeries = new Array();

    var pName = new Array("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月");
    if (data != null && data.length > 0) {
        for (var i = 0; i < data.length; i++) {
            if (pLegend.indexOf(data[i]["COMPANY"]) == -1) {
                pLegend.push(data[i]["COMPANY"]);
            }
        }
        for (var i = 0; i < pLegend.length; i++) {
            var company = pLegend[i];
            var temp;
            var pData = [];
            for (var j = 0; j < data.length; j++) {
                if (company == data[j]["COMPANY"]) {
                    temp = data[j]["FBELONGMM"];
                    pData[temp - 1] = data[j]["RATE"];
                }
            }
            pSeries.push({
                type: 'line', name: pLegend[i], data: pData,
                showAllSymbol: true, itemStyle: {normal: {label: {show: true}}}
            });
        }
    } else {
        pSeries = [{
            type: 'line',
            name: '空',
            data: [],
            showAllSymbol: true,
            itemStyle: {normal: {label: {show: true}}}
        }];
    }

    var dom = document.getElementById("echartdiv");
    var myChart = echarts.init(dom);

    var option = {
        tooltip: {
            trigger: 'axis'
            //,formatter: "{b}月偏差率 : <br/>{a}公司 : {c}%"
        },
        legend: {
            data: pLegend
        },
        grid: {
            left: 10,   //图表距边框的距离
            right: 10,
            bottom: 10,
            containLabel: true
        },
        xAxis: [
            {
                type: 'category',
                // axisLabel: {textStyle: {color: '#000'}, formatter: '{value}月'},
                // splitLine: {show: false},
                data: data == null || data.length == 0 ? ['空'] : pName
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {textStyle: {color: '#000'}, formatter: '{value}%'}
            }
        ],
        noDataLoadingOption: {
            text: '暂无数据',
            effect: 'bubble',
            effectOption: {
                effect: {
                    n: 0
                }
            }
        },
        series: pSeries
    };

    myChart.setOption(option);
    chartCode = myChart;
}

Train6.initColumn = function () {
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
        {title: '月份', field: 'FBELONGMM', align: 'center', valign: 'middle'},
        {
            title: '空车吨和', field: 'FEMPTYTONNUM', align: 'center', valign: 'middle',
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
            title: '空车吨均值和', field: 'AVGNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["AVGNUM"]);
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
            title: '翻净率%', field: 'RATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["RATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                if (1 === CustomizeParameters.radioValue) {
                    //求和
                    return "";
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


function search_chart() {
    search_table();
}

function search_table() {
    //alert(param.name + ' '+param.value);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_year'] = $("#dt_year").val();

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train6.table.refresh({
            query: queryData,
            url:Train6.bootstrapTableUrl
        });
    } else {
        Train6.table.refresh({query: queryData});
    }
    Train6.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train6Table").bootstrapTable('selectPage', 1);
}

Train6.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var form = $("<form>");
        form.attr('style', 'display:none');
        form.attr('target', '');
        form.attr('method', 'post');
        form.attr('action', Feng.ctxPath + '/train/list_train6_excel');

        //参数
        var input1 = $('<input>');
        input1.attr('type', 'hidden');
        input1.attr('name', 'str_company');
        input1.attr('value', $("#str_company").val());

        var input2 = $('<input>');
        input2.attr('type', 'hidden');
        input2.attr('name', 'dt_year');
        input2.attr('value', $("#dt_year").val());

        var input3 = $('<input>');
        input3.attr('type', 'hidden');
        input3.attr('name', 'chartCode');
        input3.attr('value', chartCode.getDataURL("png"));

        $('body').append(form);
        form.append(input1);
        form.append(input2);
        form.append(input3);

        form.submit();
        form.remove();
    });
};

function init_time() {
    $("#dt_year").val(new Date().getFullYear());

    laydate.render({
        elem: '#dt_year'
        , type: 'year'
    });
}


$(function () {
    init_time();

    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train6Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var table_height = $(document).height() - oddheight - document.getElementById("echartdiv").offsetHeight;
    var defaultColunms = Train6.initColumn();
    var table = new BSTable(Train6.id, Train6.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table_height);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_year'] = $("#dt_year").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
        show_line([]);
    }
    table.responseSuccessFun = function (data) {
        if (data === undefined || data === null || data === "" || data === []) {
            show_line([]);
        } else {
            show_line(data);
        }
        return data;
    };

    Train6.table = table.init();
});