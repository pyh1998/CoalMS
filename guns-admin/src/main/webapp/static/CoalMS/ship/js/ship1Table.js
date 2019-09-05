var Ship1Table = {};
Ship1Table.initColumn = function () {
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
            title: '公司', field: 'COMPANY', align: 'center', valign: 'middle', width: '6%'
        },
        {title: '所属日期', field: 'FCOUNTTIMEDTM', align: 'center', valign: 'middle', width: '7%'},
        {
            title: '船舶年序号',
            field: 'FSHIPYEARNUMVCR',
            align: 'center',
            valign: 'middle',
            width: '7%',
            formatter: function (value, row, index) {
                return "<a href='#'>" + value + "</a>";
            }
        },
        {title: '船舶名称', field: 'FSHIPNAME', align: 'center', valign: 'middle', width: '7%'},
        {title: '泊位', field: 'FBERTHNAME', align: 'center', valign: 'middle', width: '6%'},
        {title: '煤种', field: 'FCOALNAME1', align: 'center', valign: 'middle', width: '15%'},
        {
            title: '船舶签数', field: 'FSIGNTONNUM', align: 'center', valign: 'middle', width: '6%',
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
            title: '取料机秤数', field: 'RTON', align: 'center', valign: 'middle', width: '6%',
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
            title: 'BM秤数', field: 'BMTON', align: 'center', valign: 'middle', width: '6%',
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
            title: 'BQ秤数', field: 'BQTON', align: 'center', valign: 'middle', width: '6%',
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
            title: 'BJ秤数', field: 'BJTON', align: 'center', valign: 'middle', width: '6%',
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
            title: '偏差率α1%', field: 'RATE1', align: 'center', valign: 'middle', width: '7%', sortable: true,
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["RATE1"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return ""
            }
        },
        {
            title: '偏差率α2%', field: 'RATE2', align: 'center', valign: 'middle', width: '7%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["RATE2"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return ""
            }
        },
        {
            title: '偏差率β%', field: 'RATE3', align: 'center', valign: 'middle', width: '7%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["RATE3"]);
                    if (!Number.isNaN(number))
                        count += number;
                }
                // return count.toFixed(2);
                return ""
            }
        },
        {
            title: '误差合格分析',
            field: 'STATE',
            align: 'center',
            valign: 'middle',
            width: '7%',
            cellStyle: Ship1Table.cellformat
        }
    ];
};

Ship1Table.cellformat = function (value, row, index) {
    if (value == '不合格') {
        return {css: {"color": "red"}}
    } else {
        return {css: {}};
    }
};