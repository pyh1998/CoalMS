var gd_company = "";
var gd_month = "";
var Ship1 = {
    id: "Ship1Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: Feng.ctxPath + "/ship/list_ship1"
};

Ship1.initColumn = function () {
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
        {title: '月份', field: 'FBELONGMONTH', align: 'center', valign: 'middle'},
        {title: '二公司', field: 'COMPANY2', align: 'center', valign: 'middle', formatter: opendetail2},
        {title: '六公司', field: 'COMPANY6', align: 'center', valign: 'middle', formatter: opendetail6},
        {title: '七公司', field: 'COMPANY7', align: 'center', valign: 'middle', formatter: opendetail7},
        {title: '九公司', field: 'COMPANY9', align: 'center', valign: 'middle', formatter: opendetail9}
    ];
};

var Ship1D = {
    id: "Ship1DTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

Ship1D.initColumn = Ship1Table.initColumn;

function opendetail2(value, row, index) {
    if (value === "--") return value;
    var funurl = "openInfoDetail('02'.toString(),'" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function opendetail6(value, row, index) {
    if (value === "--") return value;
    var funurl = "openInfoDetail('06'.toString(),'" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function opendetail7(value, row, index) {
    if (value === "--") return value;
    var funurl = "openInfoDetail('07'.toString(),'" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function opendetail9(value, row, index) {
    if (value === "--") return value;
    var funurl = "openInfoDetail('09'.toString(),'" + row.FBELONGMONTH + "')";
    var url = "<a href='#' onclick=" + funurl + ">" + value + "</a>";
    return url;
}

function openInfoDetail(company, month) {
    /**
     *
     * 功能: 计算一个月有多少天
     *
     * @作者 Andy
     * @时间 2019/5/9 14:22
     * @return
     *
     */
    var y = parseInt(month.replace(/-\d{2}$/, ""));
    var m = parseInt(month.replace(/^\d{4}-/, ""));
    var curDate = new Date();
    curDate.setFullYear(y);
    curDate.setMonth(m);
    curDate.setDate(0);

    var queryData = {};
    queryData['str_company'] = company;
    queryData['dt_start'] = month + "-01";
    queryData['dt_end'] = month + "-" + curDate.getDate();
    queryData['str_first'] = "1";
    console.log(queryData);
    gd_company = company;
    gd_month = month;

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship1D.table.refresh({
            query: queryData,
            url:  Feng.ctxPath + "/ship/list_ship3"
        });
    } else {
        Ship1D.table.refresh({query: queryData});
    }
    Ship1D.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship1DTable").bootstrapTable('selectPage', 1);
}


Ship1.search = function () {
    var queryData = {};
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship1.table.refresh({
            query: queryData,
            url: Ship1.bootstrapTableUrl
        });
    } else {
        Ship1.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship1Table").bootstrapTable('selectPage', 1);
};

Ship1.export = function () {

    if (CustomizeParameters.isEmpty(gd_month)) {
        Feng.alert("导出前请选择详细月份及公司！", 7);
        return;
    }
    Feng.confirm("是否按现查询条件导出word?", function () {
        window.location.href = Feng.ctxPath + "/ship/list_ship_word" ;
    });
};


$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship1Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tables_height = $(document).height() - oddheight;
    var table1 = tables_height * 1 / 3;
    var table2 = tables_height - table1;

    var defaultColunms = Ship1.initColumn();
    var table = new BSTable(Ship1.id, Ship1.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), table1);
    var queryData = {};
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Ship1.table = table.init();

    var defaultColunmsD = Ship1D.initColumn();
    var tableD = new BSTable(Ship1D.id, Feng.ctxPath + "/ship/list_ship3", CustomizeParameters.formatGlobalTableColumn(defaultColunmsD), table2);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";
    tableD.queryParams = queryData;
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        tableD.url = "";
    }
    tableD.setPaginationType("client");
    tableD.showFooter = CustomizeParameters.bootstrap_table_footerFormatter_switch;
    tableD.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    tableD.onClickCell = function (field, value, row, $element) {
        if (field !== "FSHIPYEARNUMVCR") {
            return;
        }
        var url = Feng.ctxPath + "/ship/ship8";
        var title = "单船皮带秤明细";
        $(window.parent.document).find('.J_menuTabs .page-tabs-content ').find(".J_menuTab.active").removeClass("active");
        $(window.parent.document).find('.J_mainContent').find("iframe").css("display", "none");
        var iframe = '<iframe class="J_iframe" name="iframe10000" cid="' + row.COMPANY + '" fid="' + value + '" ftime="' + row["FCOUNTTIMEDTM"] + '" width="100%" height="100%" src="' + url + '" frameborder="0" data-id="' + url + '" seamless="" style="display: inline;"></iframe>';
        $(window.parent.document).find('.J_mainContent').append(iframe);
        // 判断是否已存在标签
        var flag = true;
        $(".J_menuTab", parent.document).each(function () {
            //选项卡菜单已存在
            if ($(this).data('id') == url) {
                //效果:当前页面切换
                // flag = false;
                //移除重复标签和页面,排除最后一个页面
                $(this).remove();
                $("iframe[name='iframe10000']:not(:last)", parent.document).remove();
            }
        });
        if (flag) {
            $(window.parent.document).find('.J_menuTabs .page-tabs-content ').append(' <a href="javascript:;" class="J_menuTab active" data-id="' + url + '">' + title + ' <i class="fa fa-times-circle"></i></a>');
        }
    };
    Ship1D.table = tableD.init();

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
