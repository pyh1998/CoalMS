var str_first;
var gd_state = "";
var gd_chart;

function search_pie() {
    var ajax = new $ax(Feng.ctxPath + "/ship/list_ship5", function (data) {
        if (data == null || data.length == 0) {
            show_pie([]);
        } else {
            show_pie(data);
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

function show_pie(data) {
    // var pName= new Array("合格","基本合格","签数异常","签数负异常","记录异常","不合格");
    // var pData = new Array({name:"合格",value:30},{name:"基本合格",value:27},{name:"签数异常",value:3},
    //     {name:"签数负异常",value:2},{name:"记录异常",value:1},{name:"不合格",value:2})
    var pName = new Array();
    var pData = new Array();
    if (data != null) {
        for (var i = 0; i < data.length; i++) {
            pName.push(data[i]["STATE"]);
            pData.push({name: data[i]["STATE"], value: data[i]["TOTAL"]});
        }
    } else {

    }

    var dom = document.getElementById("echartdiv");
    var myChart = echarts.init(dom);

    var option = {
        tooltip: {
            trigger: 'item',
            formatter: "{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data: pName
        },
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
                name: '签数对照结果',
                type: 'pie',
                // radius : ['50%','70%'],
                radius: '66%',
                center: ['40%', '60%'],
                itemStyle: {
                    normal: {
                        label: {
                            show: true,
                            position: 'inside',
                            formatter: '{d}%'
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    emphasis: {
                        label: {
                            show: false,
                            position: 'center',
                            textStyle: {
                                fontSize: '20'
                                //,fontWeight : 'bold'
                            }
                        }
                    }
                },
                data: pData
            }
        ]
    };

    myChart.setOption(option);
    myChart.on('click', function (param) {
        search_table(param);
    })
    gd_chart = myChart;
}

var Ship5 = {
    id: "Ship5Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Ship5.initColumn = function () {
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
            title: '分公司', field: 'COMPANY', align: 'center', valign: 'middle'
        },
        {title: '船舶年序号', field: 'FSHIPYEARNUMVCR', align: 'center', valign: 'middle'},
        {title: '船舶名称', field: 'FSHIPNAME', align: 'center', valign: 'middle'},
        {title: '泊位', field: 'FBERTHNAME', align: 'center', valign: 'middle'},
        {
            title: '签数', field: 'FSIGNTONNUM', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FSIGNTONNUM"]);
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
        },
        {
            title: '取料秤偏差率%', field: 'RRATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["RRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return "";
            }
        },
        {
            title: 'BM偏差率%', field: 'BMRATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["BMRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return "";
            }
        },
        {
            title: 'BQ偏差率%', field: 'BQRATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["BQRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return "";
            }
        },
        {
            title: 'BJ偏差率%', field: 'BJRATE', align: 'center', valign: 'middle',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["BJRATE"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return "";
            }
        }
    ];
};


function search_chart() {
    str_first = "1";
    search_pie();
}

function search_table(param) {
    //alert(param.name + ' '+param.value);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_state'] = param.name;
    gd_state = param.name;

    Ship5.table.refresh({query: queryData});
    Ship5.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship5Table").bootstrapTable('selectPage', 1);
}

Ship5.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var form = $("<form>");
        form.attr('style', 'display:none');
        form.attr('target', '');
        form.attr('method', 'post');
        form.attr('action', Feng.ctxPath + '/ship/list_ship5_excel');

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
        input5.attr('name', 'str_state');
        input5.attr('value', gd_state);

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
    if (!CustomizeParameters.autoSearch_switch) {
        show_pie([]);
    } else {
        search_pie();
    }


    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship5Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var table_height = $(document).height() - oddheight - document.getElementById("echartdiv").offsetHeight;
    //alert(table_height);
    var defaultColunms = Ship5.initColumn();
    var table = new BSTable(Ship5.id, "/ship/list_ship5D", CustomizeParameters.formatGlobalTableColumn(defaultColunms), table_height);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    table.queryParams = queryData;
    table.setPaginationType("client");
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship5.table = table.init();

    init_time();
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

