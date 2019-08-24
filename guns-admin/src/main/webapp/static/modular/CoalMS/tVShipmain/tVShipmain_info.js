/**
 * 初始化详情对话框
 */
var TVShipmainInfoDlg = {
    tVShipmainInfoData : {}
};

/**
 * 清除数据
 */
TVShipmainInfoDlg.clearData = function() {
    this.tVShipmainInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TVShipmainInfoDlg.set = function(key, val) {
    this.tVShipmainInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TVShipmainInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TVShipmainInfoDlg.close = function() {
    parent.layer.close(window.parent.TVShipmain.layerIndex);
}

/**
 * 收集数据
 */
TVShipmainInfoDlg.collectData = function() {
    this
    .set('company')
    .set('fshipyearnumvcr')
    .set('fshipordernum')
    .set('farrivetimedtm')
    .set('fshipcodenum')
    .set('fshipname')
    .set('fberthnum')
    .set('fberthname')
    .set('fsigntonnum2')
    .set('fsigntonnum')
    .set('fshipstatevcr')
    .set('fcounttimedtm')
    .set('fcabinnumnum')
    .set('fmaxweighnum')
    .set('frton1num')
    .set('fbqton1num')
    .set('frton2num')
    .set('fbqbton2num')
    .set('fbmtonnum')
    .set('fbjtonnum1')
    .set('fbjtonnum2')
    .set('lineresult')
    .set('linestate')
    .set('rton')
    .set('bmton')
    .set('bqton')
    .set('bjton')
    .set('maxton')
    .set('minton')
    .set('rrate')
    .set('bmrate')
    .set('bqrate')
    .set('bjrate')
    .set('fcoalname1')
    .set('fcoalname2')
    .set('signresult')
    .set('signstate')
    .set('signrrate')
    .set('signbmrate')
    .set('signbqrate')
    .set('signbjrate')
    .set('fstarttimedtm')
    .set('fstoptimedtm')
    .set('fbattlename')
    .set('fflowname')
    .set('fcabinnumnumno');
}

/**
 * 提交添加
 */
TVShipmainInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tVShipmain/add", function(data){
        Feng.success("添加成功!");
        window.parent.TVShipmain.table.refresh();
        TVShipmainInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tVShipmainInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TVShipmainInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tVShipmain/update", function(data){
        Feng.success("修改成功!");
        window.parent.TVShipmain.table.refresh();
        TVShipmainInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tVShipmainInfoData);
    ajax.start();
}

$(function() {

});
