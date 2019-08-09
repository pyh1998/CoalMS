package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @RequestMapping(value="/baseinfo1")
    public String train1() {
        return PREFIX + "baseinfo1.html";
    }


}
