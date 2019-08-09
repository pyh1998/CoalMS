$(function () {
    var ajax = new $ax(Feng.ctxPath + "/perm/ini_perm", function (data) {
        if (data == null || data.length == 0) {
        } else {
            ini_con(data);
        }
    }, function (data) {
        //Feng.error("查询失败!" + data.responseJSON.message + "!");
    });
    ajax.start();
});

function ini_con(data) {
    if (data) {
        var options = "";

        if (data.ucomany == '1') {
            // options += "<option value='1'>--请选择--</option>";
            options += "<option value='09'>" + "九公司" + "</option>";
            options += "<option value='07'>" + "七公司" + "</option>";
            options += "<option value='06'>" + "六公司" + "</option>";
            options += "<option value='02'>" + "二公司" + "</option>";
        } else if (data.ucomany == '02') {
            options += "<option value='02'>" + "二公司" + "</option>";
        } else if (data.ucomany == '06') {
            options += "<option value='06'>" + "六公司" + "</option>";
        } else if (data.ucomany == '07') {
            options += "<option value='07'>" + "七公司" + "</option>";
        } else if (data.ucomany == '09') {
            options += "<option value='09'>" + "九公司" + "</option>";
        }

        if ($("#str_company").length > 0) {
            $("#str_company").append(options);
        }

        /**
         *
         * 功能: 默认时间改成当前月份
         *
         * @作者 Andy
         * @时间 2019/3/22 16:21
         * @return
         *
         */
        var date = new Date();
        var month = 0;
        var day = 0;
        if(date.getMonth()>8){
            month = date.getMonth() + 1;
        } else {
            month = date.getMonth() + 1;
            month = "0"+ month;
        }
        if(date.getDate()>9){
            day = date.getDate();
        } else {
            day = date.getDate();
            day = "0"+ day;
        }

        var datasrt1 = date.getFullYear() + "-" + month + "-" + "01";
        var datasrt2 = date.getFullYear() + "-" + month + "-" + day;
        if($("#dt_start").length>0){
            $("#dt_start").val(datasrt1);
        }
        if($("#dt_end").length>0){
            $("#dt_end").val(datasrt2);
        }

        /*
                //将时间段设置为一天
                if($("#dt_start").length>0){
                    $("#dt_start").val(data.ustartdate);
                }
                if($("#dt_end").length>0){
                    $("#dt_end").val(data.ustartdate);
                }

                //给隐藏控件赋值，用来控制时间段的选择
                if($("#dt_min").length>0){
                    $("#dt_min").val(data.ustartdate);
                }
                if($("#dt_max").length>0){
                    $("#dt_max").val(data.uenddate);
                }

                */


    }
}