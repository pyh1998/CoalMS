var gd_chart;
var str_first = 0;

function search_line() {
    var ajax = new $ax(Feng.ctxPath + "/ship/list_ship6", function (data) {
        if (data == null || data.length == 0) {
            //查询为空数据,也要渲染
            show_line(data);
        } else {
            show_line(data);
        }
    }, function (data) {
        Feng.error("查询失败!" + data.responseJSON.message + "!");
    });
    ajax.set("str_company", $("#str_company option:selected").val());
    ajax.set("dt_year", $("#dt_year").val());
    ajax.set("str_first", str_first);
    ajax.start();
    str_first = +1;
}

function show_line(data) {
    var pLegend = new Array("取料机秤", "BM秤", "BQ秤", "BJ秤");
    var pName = new Array("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");

    /**
     *
     * 功能: 修改折线图中最后的斜线节点归零
     *
     * @作者 Andy
     * @时间 2019/4/9 9:17
     * @return
     *
     */
        // var pDataR = new Array(0,0,0,0,0,0,0,0,0,0,0,0);
        // var pData1 = new Array(0,0,0,0,0,0,0,0,0,0,0,0);
        // var pData2 = new Array(0,0,0,0,0,0,0,0,0,0,0,0);
        // var pData3 = new Array(0,0,0,0,0,0,0,0,0,0,0,0);
        // var pDataRate = new Array(0,0,0,0,0,0,0,0,0,0,0,0);
    var pDataR = [];
    var pData1 = [];
    var pData2 = [];
    var pData3 = [];
    var pDataRate = [];

    if (data != null) {
        for (var i = 0; i < data.length; i++) {
            var month = data[i]["FCOUNTTIMEDTM"];//parseInt();
            pDataR[month - 1] = data[i]["RRATE"];
            pData1[month - 1] = data[i]["BMRATE"];
            pData2[month - 1] = data[i]["BQRATE"];
            pData3[month - 1] = data[i]["BJRATE"];
            pDataRate[month - 1] = data[i]["HEGERATE"];
        }
    }

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var table_height = $(document).height() - oddheight;
    document.getElementById("echartdiv").style.height = table_height + 'px';


    var dom = document.getElementById("echartdiv");
    var myChart = echarts.init(dom);
    myChart.resize();

    var option = {
        tooltip: {
            trigger: 'axis'
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
                axisLabel: {textStyle: {color: '#000'}, formatter: '{value}月'},
                splitLine: {show: false},
                data: pName
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
        series: [
            {
                name: '取料机秤',
                type: 'line',
                data: pDataR,
                showAllSymbol: true,
                itemStyle: {normal: {label: {show: true}}}
            },
            {
                name: 'BM秤',
                type: 'line',
                data: pData1,
                showAllSymbol: true,
                itemStyle: {normal: {label: {show: true}}}
            },
            {
                name: 'BQ秤',
                type: 'line',
                data: pData2,
                showAllSymbol: true,
                itemStyle: {normal: {label: {show: true}}}
            },
            {
                name: 'BJ秤',
                type: 'line',
                data: pData3,
                showAllSymbol: true,
                itemStyle: {normal: {label: {show: true}}}
            },
            {
                name: '同线误差',
                type: 'line',
                data: pDataRate,
                showAllSymbol: true,
                itemStyle: {normal: {label: {show: true}}}
            }
        ]
    };

    myChart.setOption(option);
    gd_chart = myChart;
}

function search_chart() {
    search_line();
}

function Ship6_export() {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var form = $("<form>");
        form.attr('style', 'display:none');
        form.attr('target', '');
        form.attr('method', 'post');
        form.attr('action', Feng.ctxPath + '/ship/list_ship6_excel');

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
        input3.attr('value', gd_chart.getDataURL("png"));

        $('body').append(form);
        form.append(input1);
        form.append(input2);
        form.append(input3);

        form.submit();
        form.remove();
    });
};

$(function () {
    init_time();
    if (!CustomizeParameters.autoSearch_switch) {
        show_line([]);
    } else {
        search_line();
    }
    // window.setTimeout(init_time,300);
});

function init_time() {
    // var dtmin = document.getElementById("dt_min").value;
    // var dtmax = document.getElementById("dt_max").value;
    //
    // var dt_minyear = dtmin.substr(0,4);
    $("#dt_year").val(new Date().getFullYear());
    laydate.render({
        elem: '#dt_year'
        , type: 'year'
        // ,min: dtmin
        // ,max: dtmax
    });
}
