var Ship3 = {
    id: "Ship3Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    tableData:null,
    layerIndex: -1,
    bootstrapTableUrl: "/ship/list_ship3"
};

Ship3.initColumn = Ship1Table.initColumn;

Ship3.check = function () {
    console.log(this);

    // var selected = $('#' + this.id).bootstrapTable('getSelections');
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if (selected.length == 0) {
        Feng.info("请先选中表格中的某一记录！");
        return false;
    } else {
        Ship3.seItem = selected[0];
        Ship3.tableData = selected;
        return true;
    }
};


Ship3.search = function () {
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Ship3.table.refresh({
            query: queryData,
            url: Ship3.bootstrapTableUrl
        });
    } else {
        Ship3.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Ship3Table").bootstrapTable('selectPage', 1);
};

Ship3.export = function () {
    if (this.check()) {
        console.log("**************tableData*************");
        console.log(tableData);
    }
    return;

    Feng.confirm("是否按现查询条件导出excel?", function () {
        var str_company = $("#str_company").val();
        var dt_start = $("#dt_start").val();
        var dt_end = $("#dt_end").val();
        window.location.href = "/ship/list_ship3_excel?str_company=" + str_company + "&dt_start=" + dt_start + "&dt_end=" + dt_end;
    });
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Ship3Dbody").style.height = bodyheight;
    console.log(Ship3.bootstrapTableUrl);
    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var defaultColunms = Ship3.initColumn();
    var table = new BSTable(Ship3.id, Ship3.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight);
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
    table.onClickCell = function (field, value, row, $element) {
        if (field !== "FSHIPYEARNUMVCR") {
            return;
        }
        var url =  "/ship/ship8";
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
    Ship3.table = table.init();

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

