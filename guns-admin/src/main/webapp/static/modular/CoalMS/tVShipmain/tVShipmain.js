/**
 * 管理初始化
 */
var TVShipmain = {
    id: "TVShipmainTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TVShipmain.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '公司', field: 'company', visible: true, align: 'center', valign: 'middle'},
            {title: '船舶年序号', field: 'fshipyearnumvcr', visible: true, align: 'center', valign: 'middle'},
            {title: '航次', field: 'fshipordernum', visible: true, align: 'center', valign: 'middle'},
            {title: '抵达时间', field: 'farrivetimedtm', visible: true, align: 'center', valign: 'middle'},
            {title: '船舶代码', field: 'fshipcodenum', visible: true, align: 'center', valign: 'middle'},
            {title: '船舶名称', field: 'fshipname', visible: true, align: 'center', valign: 'middle'},
            {title: '泊位代码', field: 'fberthnum', visible: true, align: 'center', valign: 'middle'},
            {title: '泊位名称', field: 'fberthname', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fsigntonnum2', visible: true, align: 'center', valign: 'middle'},
            {title: '签数吨', field: 'fsigntonnum', visible: true, align: 'center', valign: 'middle'},
            {title: '装船状态', field: 'fshipstatevcr', visible: true, align: 'center', valign: 'middle'},
            {title: '统计年月 月份 所属日期', field: 'fcounttimedtm', visible: true, align: 'center', valign: 'middle'},
            {title: '舱数', field: 'fcabinnumnum', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fmaxweighnum', visible: true, align: 'center', valign: 'middle'},
            {title: 'R吨数1', field: 'frton1num', visible: true, align: 'center', valign: 'middle'},
            {title: 'BQ吨数1', field: 'fbqton1num', visible: true, align: 'center', valign: 'middle'},
            {title: 'R吨数2', field: 'frton2num', visible: true, align: 'center', valign: 'middle'},
            {title: 'BQ吨数2', field: 'fbqbton2num', visible: true, align: 'center', valign: 'middle'},
            {title: 'BM吨数', field: 'fbmtonnum', visible: true, align: 'center', valign: 'middle'},
            {title: 'BJ吨数1', field: 'fbjtonnum1', visible: true, align: 'center', valign: 'middle'},
            {title: 'BJ吨数2', field: 'fbjtonnum2', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'lineresult', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'linestate', visible: true, align: 'center', valign: 'middle'},
            {title: 'R吨数', field: 'rton', visible: true, align: 'center', valign: 'middle'},
            {title: 'BM吨数', field: 'bmton', visible: true, align: 'center', valign: 'middle'},
            {title: 'BQ吨数', field: 'bqton', visible: true, align: 'center', valign: 'middle'},
            {title: 'BJ吨数', field: 'bjton', visible: true, align: 'center', valign: 'middle'},
            {title: '最大吨数', field: 'maxton', visible: true, align: 'center', valign: 'middle'},
            {title: '最小吨数', field: 'minton', visible: true, align: 'center', valign: 'middle'},
            {title: 'R吨偏差率', field: 'rrate', visible: true, align: 'center', valign: 'middle'},
            {title: 'BM吨偏差率', field: 'bmrate', visible: true, align: 'center', valign: 'middle'},
            {title: 'BQ吨偏差率', field: 'bqrate', visible: true, align: 'center', valign: 'middle'},
            {title: 'BJ吨偏差率', field: 'bjrate', visible: true, align: 'center', valign: 'middle'},
            {title: '煤种名称1', field: 'fcoalname1', visible: true, align: 'center', valign: 'middle'},
            {title: '煤种名称2', field: 'fcoalname2', visible: true, align: 'center', valign: 'middle'},
            {title: '签数结果', field: 'signresult', visible: true, align: 'center', valign: 'middle'},
            {title: '签数状态', field: 'signstate', visible: true, align: 'center', valign: 'middle'},
            {title: '签数率', field: 'signrrate', visible: true, align: 'center', valign: 'middle'},
            {title: '签数BM率', field: 'signbmrate', visible: true, align: 'center', valign: 'middle'},
            {title: '签数BQ率', field: 'signbqrate', visible: true, align: 'center', valign: 'middle'},
            {title: '签数BJ率', field: 'signbjrate', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fstarttimedtm', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fstoptimedtm', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fbattlename', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fflowname', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'fcabinnumnumno', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
TVShipmain.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TVShipmain.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
TVShipmain.openAddTVShipmain = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tVShipmain/tVShipmain_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
TVShipmain.openTVShipmainDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tVShipmain/tVShipmain_update/' + TVShipmain.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
TVShipmain.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tVShipmain/delete", function (data) {
            Feng.success("删除成功!");
            TVShipmain.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tVShipmainId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
TVShipmain.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TVShipmain.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TVShipmain.initColumn();
    var table = new BSTable(TVShipmain.id, "/tVShipmain/list", defaultColunms);
    table.setPaginationType("client");
    TVShipmain.table = table.init();
});
