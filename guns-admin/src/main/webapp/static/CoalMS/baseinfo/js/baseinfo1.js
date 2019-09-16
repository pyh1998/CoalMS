var Baseinfo1 = {
    id: "Baseinfo1Table",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1,
    bootstrapTableUrl: Feng.ctxPath + "/baseinfo/list_basetrain"
};

Baseinfo1.initColumn = function () {
    var me = this;
    return [
        {field: 'selectItem', checkbox: true, visible: true},
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
        // {title: '公司', field: '', align: 'center', valign: 'middle'},
        {title: '列车编号', field: 'FTRAINCODEVCR', align: 'center', valign: 'middle'},
        {title: '车次', field: 'FTRAINORDERVCR', align: 'center', valign: 'middle'},
        {title: '抵港时间', field: 'FARRIVEPORTTIMEDTM', align: 'center', valign: 'middle'},
        {title: '所属时间', field: 'FBELONGDATETIMEDTM', align: 'center', valign: 'middle'},
        {title: '车厢数', field: 'FTRAINNUMNUM', align: 'center', valign: 'middle'},
        // {title: '卸车标志', field: 'FUNLOADFLAGNUM', align: 'center', valign: 'middle'},
        // {title: '是否过衡', field: 'FISWEIGHTNUM', align: 'center', valign: 'middle'},
        // {title: '过衡确认', field: 'FWEIGHTFLAG', align: 'center', valign: 'middle'},
        {title: '是否有效', field: 'ISVALID', align: 'center', valign: 'middle'}
    ];
};

Baseinfo1.search = function () {

    if ($("#str_company").val() == "1" || $("#str_company").val() == null || $("#str_company").val() == '') {
        Feng.alert("请选择分公司");
        return;
    }

    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_status'] = $("#str_status").val();
    queryData['str_trainno'] = $("#str_trainno").val();
    queryData['str_first'] = "1";

    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        Baseinfo1.table.refresh({
            query: queryData,
            url: Baseinfo1.bootstrapTableUrl
        });
    } else {
        Baseinfo1.table.refresh({query: queryData});
    }
    this.table.formatNoMatches_displaywords = CustomizeParameters.formatNoMatches_displaywords;
    $("#Baseinfo1Table").bootstrapTable('selectPage', 1);
};


Baseinfo1.batchCheck = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if (selected.length == 0) {
        Feng.info("请先选中表格中的某一记录！");
        return false;
    } else {
        Baseinfo1.seItem = selected;
        return true;
    }
};

Baseinfo1.save = function () {

    if ($("#str_company").val() == null || $("#str_company").val() == '') {
        Feng.alert("请选择分公司");
        return;
    }

    if (this.batchCheck()) {

        /**
         *
         * 功能: 无效有效控制器
         *
         * @作者 Andy
         * @时间 2019/4/8 16:31
         * @return
         *
         */
        var url = Feng.ctxPath + "/baseinfo/batchSave";
        var tips = "无效";

        var len = this.seItem.length;
        var ids = new Array();
        var seItem = this.seItem;

        if (seItem[0]["ISVALID"] === "有效") {

        } else {
            url = Feng.ctxPath + "/baseinfo/batchDel";
            tips = "有效";
        }

        for (var i = 0; i < len; i++) {
            ids.push(seItem[i].FTRAINCODEVCR.replace(/\s+/g, ""));
        }
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + url, function (data) {
                Feng.success("保存成功!");
                Baseinfo1.table.refresh();
            }, function (data) {
                Feng.error("保存失败!" + data.responseJSON.message + "!");
            });
            ajax.set("str_company", $("#str_company").val());
            ajax.set("trainnos", JSON.stringify(ids));
            ajax.start();
        };
        Feng.confirm(ids + "<br/>是否将所选记录置为" + tips + "？", operation);
    }
};

$(function () {
    var bodyheight = ($(document).height() - 20) + 'px';
    document.getElementById("Baseinfo1Dbody").style.height = bodyheight;

    var oddheight = document.getElementById("qdiv").offsetHeight + 36;
    var tableheight = $(document).height() - oddheight;
    var defaultColunms = Baseinfo1.initColumn();
    var table = new BSTable(Baseinfo1.id, Baseinfo1.bootstrapTableUrl, CustomizeParameters.formatGlobalTableColumn(defaultColunms), tableheight);
    var queryData = {};
    queryData['str_company'] = $("#str_company").val();
    queryData['dt_start'] = $("#dt_start").val();
    queryData['dt_end'] = $("#dt_end").val();
    queryData['str_status'] = $("#str_status").val();
    queryData['str_first'] = "1";
    table.queryParams = queryData;
    table.setPaginationType("client");
    //控制自动查询
    if (!CustomizeParameters.autoSearch_switch) {
        table.url = "";
    }
    table.formatNoMatches_displaywords = CustomizeParameters.autoSearch_switch ? CustomizeParameters.formatNoMatches_displaywords : CustomizeParameters.formatNoMatches_nosearch_displaywords;
    Baseinfo1.table = table.init();

});


