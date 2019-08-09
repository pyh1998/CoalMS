/**
 *
 * 功能: 自定义参数功能
 *
 * @作者 Andy
 * @时间 2019/4/9 16:40
 * @return
 *
 */

var CustomizeParameters = {
    //统计列开关
    bootstrap_table_footerFormatter_switch: true,
    //自动查询开关
    autoSearch_switch: false,
    // //查询必须选择公司开关(目前不启用)
    // noSearch_noCompany_switch: true,
    //没有匹配的结果显示的文字
    formatNoMatches_displaywords: "没有找到匹配的记录",
    //未查询显示文字
    formatNoMatches_nosearch_displaywords: "",
    //单选赋值
    radioValue: 1,
    setRadioValue: function (value) {
        this.radioValue = value;
    },
    /**
     *
     * 功能: 格式化全局表格列
     *
     * @作者 Andy
     * @时间 2019/5/6 14:17
     * @return
     *
     */
    formatGlobalTableColumn: function (defaultColunms) {
        if (this.isEmpty(defaultColunms)) {
            return defaultColunms;
        }

        for (var i = 0, len = defaultColunms.length; i < len; i++) {
            if (!this.isEmpty(defaultColunms[i]["field"]) && defaultColunms[i]["field"] !== "selectItem" && defaultColunms[i]["field"] !== "index") {
                //如果参数已设置,则使用自定义设置,否则更改默认
                if (this.isEmpty(defaultColunms[i]["sortable"])) {
                    defaultColunms[i]["sortable"] = "true";
                }
            }
        }
        return defaultColunms;
    },
    //判断变量是否为空
    isEmpty: function (v) {
        switch (typeof v) {
            case 'undefined':
                return true;
            case 'string':
                if (v.replace(/(^[ \t\n\r]*)|([ \t\n\r]*$)/g, '').length == 0) return true;
                break;
            case 'boolean':
                if (!v) return true;
                break;
            case 'number':
                if (0 === v || isNaN(v)) return true;
                break;
            case 'object':
                if (null === v || v.length === 0) return true;
                for (var i in v) {
                    return false;
                }
                return true;
        }
        return false;
    },

    //判断变量类型
    getType: function (obj) {
        var type = Object.prototype.toString.call(obj).match(/^\[object (.*)\]$/)[1].toLowerCase();
        if (type === 'string' && typeof obj === 'object') return 'object'; // Let "new String('')" return 'object'
        if (obj === null) return 'null'; // PhantomJS has type "DOMWindow" for null
        if (obj === undefined) return 'undefined'; // PhantomJS has type "DOMWindow" for undefined
        return type;
    },

    /**
     *
     * 功能: 流下载
     *
     * 作者 Andy
     * 签名 834E30FE1AC723A3C96C3EEB17575DA774372830
     * 时间 2019/7/3 9:16
     *
     */
    response4Download: function (url, data) {
        var me = this;
        $.ajax({
            url: Feng.ctxPath + "/poi/downloadAjax",
            type: "POST",
            dataType: "json",
            success: function (response, status, request) {
                var form = $('<form method="POST" action="' + Feng.ctxPath + url + '"> hidden="hidden"');

                //类型判断
                if (me.getType(data) === "map") {

                    //遍历Map
                    data.forEach(function (value, key) {
                        // console.log(key + " = " + value);
                        form.append($('<input type="hidden" name="' + key + '" value="' + value + '">'));
                    }, data)

                }

                $('body').append(form);
                form.submit().remove();
            },
            error: function (data) {
                Feng.error("下载失败!");
            }
        });
    }
};