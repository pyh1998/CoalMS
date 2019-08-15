var str_first;
var gd_chart;  //全局变量，用来导出echart
var gd_trainno = "";

function search_line() {
    var ajax = new $ax("/train/search3", function (data) {
        if (data == null || data.length == 0) {
            show_line(data);
        } else {
            show_line(data);
        }
    }, function (data) {
        Feng.error("查询失败!" + data.responseJSON.message + "!");
    });
    ajax.set("str_company", $("#str_company option:selected").val());
    ajax.set("dt_start", $("#dt_start").val());
    ajax.set("dt_end", $("#dt_end").val());
    ajax.set("str_first", str_first);
    ajax.start();
}

function show_line(data) {
    var pName = new Array();
    var pData = new Array();

    if (data != null) {
        for (var i = 0; i < data.length; i++) {
            pName.push(data[i]["FTRAINCODEVCR"]);
            pData.push(data[i]["RATE"]);
        }
    } else {

    }
    console.log(pName);
    console.log(pData);
    // var pName = new Array("73003Q","73023Q","73173Q","73185Q","73189Q","871001","871007","871173","P71005","P73001Y","P73011Y","P73015Q","P73015Y");
    // var pData = new Array(1.547,2.237,1.077,-0.912,-2.334,0.887,1.105,3.622,-0.838,1.326,2.888,2.738,2.458);
    var dom = document.getElementById("echartdiv");
    var myChart = echarts.init(dom);

    var option = {
        // backgroundColor: '#fff',
        // title : {
        //     text : '分析',
        //     x:'center',
        //     y:10,
        //     textStyle: {  color: '#fff'}
        // },
        tooltip: {
            trigger: 'axis',
            formatter: "偏差率 : <br/>{b}列车 : {c}%"
        },
        dataZoom: {
            show: true,
            start: 50
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
                axisLabel: {textStyle: {color: '#000'}},
                splitLine: {show: false},
                data: pName
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {textStyle: {color: '#000'}}
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
                type: 'line',
                showAllSymbol: true,
                data: pData,
                itemStyle: {normal: {label: {show: true}}}
            }
        ]
    };

    myChart.setOption(option);
    myChart.on('click', function (param) {
        search_table(param);
    })
    gd_chart = myChart;
}

var Train4 = {
    id: "Train4Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Train4.initColumn = function () {
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
                return "合计";
            }
        },
        {
            title: '公司', field: 'COMPANY', align: 'center', valign: 'middle', width: '6%'
        },
        {title: '列车编码', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle', width: '10%'},
        {title: '车次', field: 'FTRAINORDERVCR', align: 'center', valign: 'middle', width: '10%'},
        {title: '抵港时间', field: 'FARRIVEPORTTIMEDTM', align: 'center', valign: 'middle', width: '10%'},
        {title: '车厢数', field: 'FTRAINNUMNUM', align: 'center', valign: 'middle', width: '10%'},
        {title: '是否有效', field: 'FISWEIGHTNUM', align: 'center', valign: 'middle', width: '10%'},
        {title: '过衡时间', field: 'FWEIGHTDTM', align: 'center', valign: 'middle', width: '10%'}
    ];
};


function search_chart() {
    str_first = "1";
    search_line();
    //show_line();
}

function search_table(param) {
    // alert(param.name + ' '+param.value);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['str_ftraincodevcr'] = param.name;
    gd_trainno = param.name;

    Train4.table.refresh({query: queryData});
    Train4.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train4Table").bootstrapTable('selectPage', 1);
}

Train4.export = function () {
    //因为是文件流，ajax不能使用（只能字符串），
    //因为图片解码长度太长，不能用winodw.location,href（参数少时可以用），
    //所以只能创建一个form
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var form = $("<form>");
        form.attr('style', 'display:none');
        form.attr('target', '');
        form.attr('method', 'post');
        form.attr('action', Feng.ctxPath + '/train/list_train4_excel');

        //参数
        var input1 = $('<input>');
        input1.attr('type', 'hidden');
        input1.attr('name', 'str_company');
        input1.attr('value', $("#str_company").val());

        var input2 = $('<input>');
        input2.attr('type', 'hidden');
        input2.attr('name', 'dt_start');
        input2.attr('value', $("#dt_start").val());

        var input3 = $('<input>');
        input3.attr('type', 'hidden');
        input3.attr('name', 'dt_end');
        input3.attr('value', $("#dt_end").val());

        var input4 = $('<input>');
        input4.attr('type', 'hidden');
        input4.attr('name', 'chartCode');
        input4.attr('value', gd_chart.getDataURL("png"));

        var input5 = $('<input>');
        input5.attr('type', 'hidden');
        input5.attr('name', 'str_trainno');
        input5.attr('value', gd_trainno);

        $('body').append(form);
        form.append(input1);
        form.append(input2);
        form.append(input3);
        form.append(input4);
        form.append(input5);

        form.submit();
        form.remove();
    });
};


$(function () {
    init_time();
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        show_line([]);
    } else {
        search_line();
    }


    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train4Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var table_height = $(document).height() - oddheight - document.getElementById("echartdiv").offsetHeight;
    //alert(table_height);
    var defaultColunms = Train4.initColumn();
    var table = new BSTable(Train4.id, "/train/search3D", CustomizeParameters.formatGlobalTableColumn(defaultColunms), table_height);
    table.setPaginationType("client");
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    // table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    Train4.table = table.init();

    // window.setTimeout(init_time,300);
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
