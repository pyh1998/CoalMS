package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.warpper.TrainWarpper;
import com.stylefeng.guns.modular.CoalMS.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * 菜单控制器
 *
 * @author fengshuonan
 * @Date 2017年2月12日21:59:14
 */
@Controller
@RequestMapping("/baseinfo")
public class BaseinfoController extends BaseController {

    private static String PREFIX = "/CoalMS/baseinfo/";

    @Autowired
    private TrainService TrainService;

    @RequestMapping(value="/baseinfo1")
    public String train1() {
        return PREFIX + "baseinfo1.html";
    }


    @RequestMapping(value = "/list_basetrain")
    @ResponseBody
    public Object search77(String str_company, String dt_start, String dt_end,String str_ftraincodevcr,String str_status,String str_trainno) {
        List<Map<String, Object>> list = this.TrainService.search77(str_company,dt_start,dt_end,str_ftraincodevcr,str_status,str_trainno);
        return super.warpObject(new TrainWarpper(list));
    }
}
