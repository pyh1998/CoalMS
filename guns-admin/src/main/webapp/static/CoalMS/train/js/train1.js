var Train1 = {
    id: "Train1Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl:"/train/search1"
};

Train1.initColumn = function () {
    //绑定this对象
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
                    //server服务端分页
                    //通过表的#id 可以得到每页多少条
                    var pageSize = $('#' + Train1.id).bootstrapTable('getOptions').pageSize;
                    //通过表的#id 可以得到当前第几页
                    var pageNumber = $('#' + Train1.id).bootstrapTable('getOptions').pageNumber;
                    //返回每条的序号： 每页条数 * （当前页 - 1 ）+ 序号
                    return pageSize * (pageNumber - 1) + index + 1;
                } else {
                    //client客户端分页
                    // 序号正序排序从1开始
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
            title: '公司',
            field: 'COMPANY',
            align: 'center',
            valign: 'middle',
            width: '5%'
        },
        {title: '所属时间', field: 'FBELONGDATETIMEDTM', align: 'center', valign: 'middle', width: '7%'},
        {title: '抵港时间', field: 'FARRIVEPORTTIMEDTM', align: 'center', valign: 'middle', width: '7%'},
        {
            title: '列车编号',
            field: 'FTRAINCODEVCR',
            align: 'center',
            valign: 'middle',
            width: '8%',
            formatter: function (value, row, index) {
                return "<a href='#'>" + value + "</a>";
            }
        },
        {title: '车次', field: 'FTRAINORDERVCR', align: 'center', valign: 'middle', width: '5%'},
        {title: '发站', field: 'FSTATSTASTIONNAME', align: 'center', valign: 'middle', width: '5%'},
        {title: '煤种', field: 'FCOALNAME', align: 'center', valign: 'middle', width: '8%'},
        {title: '垛位', field: 'FDISBUTTNAME', align: 'center', valign: 'middle', width: '5%'},
        {title: '发货人', field: 'FCONSIGNERNAME', align: 'center', valign: 'middle', width: '15%'},
        {
            title: '翻车机',
            field: 'TICKET_NO',
            align: 'center',
            valign: 'middle',
            width: '5%'
        },
        {
            title: '车厢数', field: 'TRAINCOUNT', align: 'center', valign: 'middle', width: '5%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["TRAINCOUNT"]);
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
            title: '过衡吨', field: 'FWEIGHTTONNUM', align: 'center', valign: 'middle', width: '10%',
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
            title: '货票吨', field: 'FCHECKTONNUM', align: 'center', valign: 'middle', width: '6%',
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
            title: '盈亏吨', field: 'PROFITNUM', align: 'center', valign: 'middle', width: '6%',
            footerFormatter: function (value, row, index) {
                if (!value) return;
                var count = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["PROFITNUM"]);
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
            title: '盈亏率%', field: 'DEVIARATE', align: 'center', valign: 'middle', sortable: true,
            footerFormatter: function (value, row, index) {
                if (!value) return;

                //过衡吨
                var FWEIGHTTONNUM = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseFloat(value[i]["FWEIGHTTONNUM"]);
                    if (!Number.isNaN(number))
                        FWEIGHTTONNUM += number;
                }
                //货票吨
                var FCHECKTONNUM = 0;
                for (var i = 0; i < value.length; i++) {
                    var number = parseInt(value[i]["FCHECKTONNUM"]);
                    if (!Number.isNaN(number))
                        FCHECKTONNUM += number;
                }

                //盈亏率%
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
        // {
        //     title: '翻净率%', field: 'EMPTYRATE', align: 'center', valign: 'middle', width: '10%',
        //     footerFormatter: function (value, row, index) {
        //         if (!value) return;
        //         var count = 0;
        //         for (var i = 0; i < value.length; i++) {
        //             var number = parseInt(value[i]["EMPTYRATE"]);
        //             if (!Number.isNaN(number))
        //                 count += number;
        //         }
        //          return count;
        //
        //     }
        // }
    ];
};

Train1.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    console.log(queryData);
    console.log("按钮点击489856494966497895");
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Train1.table.refresh({
            query: queryData,
            url: Train1.bootstrapTableUrl
        });
    } else {
        Train1.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Train1Table").bootstrapTable('selectPage', 1);
};

Train1.export = function () {
    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        window.location.href =  "/train/list_train1_excel?str_company=" + str_company + "&dt_start=" + dt_start + "&dt_end=" + dt_end;
    });

};

//临时修改了table url 别忘了
$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Train1Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var defaultColunms = Train1.initColumn();
    var table = new BSTable(Train1.id, Train1.bootstrapTableUrl,defaultColunms);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    table.setPaginationType("client");
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = Train1.bootstrapTableUrl;
    }

    //页面跳转
    table.onClickCell = function (field, value, row, $element) {
        //自定义函数 Cell点击触发
        if (field !== "FTRAINCODEVCR") {
            return;
        }
        var url =  "/train/train4";
        var title = "单车过衡数据分析";
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').find(".J_menuTab.active").removeClass("active");
        $(window.parent.document).find('.J_mainContent').find("iframe").css("display", "none");
        var iframe = '<iframe class="J_iframe" name="iframe10000" cid="' + row.COMPANY + '" fid="' + value + '" ftime="' + row["FBELONGDATETIMEDTM"] + '" width="100%" height="100%" src="' + url + '" frameborder="0" data-id="' + url + '" seamless="" style="display: inline;"></iframe>';
        $(window.parent.document).find('.J_mainContent').append(iframe);
        $(".J_menuTab", parent.document).each(function () {
            //选项卡菜单已存在
            if ($(this).data('id') == url) {
                $(this).remove();
                $("iframe[name='iframe10000']:not(:last)", parent.document).remove();
            }
        });
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').append(' <a href="javascript:;" class="J_menuTab active" data-id="' + url + '">' + title + ' <i class="fa fa-times-circle"></i></a>');
    };
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Train1.table = table.init();

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

