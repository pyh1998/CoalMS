var gd_chart;

function search_line() {
    if ($("#str_station").val() == null || $("#str_station").val() == "") {
        // Feng.alert("请选择一个发站");
        // return ;
    }

    /**
     *
     * 功能: 修复点击搜索查询了两次Bug
     *
     * @作者 Andy
     * @时间 2019/4/10 14:58
     * @return
     *
     */
    Train8.search();
}

function show_line(data) {
    var pLegend = new Array();
    var pName = new Array("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
    var pSeries = new Array();

    if (data != null && data.length > 0) {
        for (var i = 0; i < data.length; i++) {
            if (pLegend.indexOf(data[i]["FCOALNAME"]) == -1) {
                pLegend.push(data[i]["FCOALNAME"]);
            }
        }

        for (var i = 0; i < pLegend.length; i++) {
            var coalname = pLegend[i];
            var temp;
            // var pData = new Array(0,0,0,   0,0,0,   0,0,0,  0,0,0);
            var pData = [];
            for (var j = 0; j < data.length; j++) {
                if (coalname == data[j]["FCOALNAME"]) {
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
        // var pData = new Array(0,0,0,   0,0,0,   0,0,0,  0,0,0);
        var pData = [];
        pSeries = new Array({
            type: 'line',
            name: '空',
            data: pData,
            showAllSymbol: true,
            itemStyle: {normal: {label: {show: true}}}
        });
    }

    var dom = document.getElementById("echartdiv");
    var myChart = echarts.init(dom);
    var option = {
        tooltip: {
            trigger: 'axis'
        },
        dataZoom: {
            show: true
            // start : 50
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
    gd_chart = myChart;
    //myChart.on('click',function(param){search_table(param);})
}


var Train8 = {
    id: "Train8Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: "/train/list_train8"
};

Train8.initColumn = function () {
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
            title: '发站', field: 'FSTATSTASTIONNAME', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                return "合计";
            }
        },
        {title: '月份', field: 'FBELONGMM', align: 'center', valign: 'middle'},
        {title: '煤种', field: 'FCOALNAME', align: 'center', valign: 'middle'},
        {
            title: '过衡吨和', field: 'FWEIGHTTONNUM', align: 'center', valign: 'middle',
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
            title: '货票吨和', field: 'FCHECKTONNUM', align: 'center', valign: 'middle',
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
            title: '盈亏率%', field: 'RATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;

                //货票吨和
                var FCHECKTONNUM = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FCHECKTONNUM"]);
                    if (!Number.isNaN(number))
                        FCHECKTONNUM += number;
                }

                //过衡吨和
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

Train8.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_year'] = $("#dt_year").val();
    queryData['str_station'] = $("#str_station").val();
    queryData['str_coalname'] = $("#str_coalname").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train8.table.refresh({
            query: queryData,
            url: Feng.ctxPath + Train8.bootstrapTableUrl
        });
    } else {
        Train8.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train8Table").bootstrapTable('selectPage', 1);
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
          //  Feng.error("煤种查询失败!" + data.responseJSON.message + "!");
        }
    });

}

Train8.export = function () {
    if ($("#str_station").val() == null || $("#str_station").val() == "") {
        // Feng.alert("请选择一个发站");
        // return ;
    }
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var form = $("<form>");
        form.attr('style', 'display:none');
        form.attr('target', '');
        form.attr('method', 'post');
        form.attr('action', Feng.ctxPath + '/train/list_train8_excel');

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
        input3.attr('name', 'str_coalname');
        input3.attr('value', $("#str_coalname").find("option:selected").text());

        var input4 = $('<input>');
        input4.attr('type', 'hidden');
        input4.attr('name', 'chartCode');
        input4.attr('value', gd_chart.getDataURL("png"));

        var input5 = $('<input>');
        input5.attr('type', 'hidden');
        input5.attr('name', 'str_station');
        input5.attr('value', $("#str_station").val());
        var input6 = $('<input>');
        input6.attr('type', 'hidden');
        input6.attr('name', 'str_stationname');
        input6.attr('value', $("#str_station").find("option:selected").text());

        $('body').append(form);
        form.append(input1);
        form.append(input2);
        form.append(input3);
        form.append(input4);
        form.append(input5);
        form.append(input6);

        form.submit();
        form.remove();
    });
};

$(function () {
    showSelect();
    showCoalnameList();
    init_time();

    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train8Dbody").style.height = bodyheight;

    var defaultColunms = Train8.initColumn();
    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var table_height = $(document).height() - oddheight - document.getElementById("echartdiv").offsetHeight;
    var table = new BSTable(Train8.id, Train8.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table_height);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_year'] = $("#dt_year").val();
    queryData['str_coalname'] = $("#str_coalname").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    table.responseSuccessFun = function (data) {
        show_line(data);
        return data;
    };
    table.responseErrorFun = function (status, jqXHR) {
    };
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
        show_line([]);
    }
    Train8.table = table.init();

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