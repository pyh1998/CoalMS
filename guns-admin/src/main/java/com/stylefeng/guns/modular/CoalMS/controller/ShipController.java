package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.service.ShipService;
import com.stylefeng.guns.modular.CoalMS.warpper.ShipWarpper;
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
@RequestMapping("/ship")
public class ShipController extends BaseController {

    private static String PREFIX = "/CoalMS/ship/";

    @Autowired
    private ShipService ShipService;

    @RequestMapping(value="/ship1")
    public String ship1() {
        return PREFIX + "ship1.html";
    }

    @RequestMapping(value="/ship2")
    public String ship2() {
        return PREFIX + "ship2.html";
    }

    @RequestMapping(value="/ship3")
    public String ship3() {
        return PREFIX + "ship3.html";
    }

    @RequestMapping(value="/ship4")
    public String ship4() {
        return PREFIX + "ship4.html";
    }

    @RequestMapping(value="/ship5")
    public String ship5() {
        return PREFIX + "ship5.html";
    }

    @RequestMapping(value="/ship6")
    public String ship6() {
        return PREFIX + "ship6.html";
    }

    @RequestMapping(value="/ship7")
    public String ship7() {
        return PREFIX + "ship7.html";
    }

    @RequestMapping(value="/ship8")
    public String ship8() {
        return PREFIX + "ship8.html";
    }
    /**
     * 皮带秤功能3：误差合格分析
     */
    @RequestMapping(value = "/list_ship3")
    @ResponseBody
    public Object list_ship3(String str_company,String dt_start,String dt_end) {

        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+str_company);
        List<Map<String, Object>> list = this.ShipService.list_ship3(str_company,dt_start,dt_end);

        return super.warpObject(new ShipWarpper(list));


    }
    @RequestMapping(value = "/list_ship7Q")
    @ResponseBody
    public Object list_ship7(String str_company,String dt_start,String dt_end) {

        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+str_company);
        List<Map<String, Object>> list = this.ShipService.list_ship7(str_company,dt_start,dt_end);

        return super.warpObject(new ShipWarpper(list));


    }

    @RequestMapping(value = "/list_ship7")
    @ResponseBody
    public Object list_ship7_1(String str_company,String str_shipno) {

        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+str_company);
        List<Map<String, Object>> list = this.ShipService.list_ship7_1(str_company,str_shipno);

        return super.warpObject(new ShipWarpper(list));


    }

    @RequestMapping(value = "/list_ship8")
    @ResponseBody
    public Object list_ship8(String str_company,String str_shipno) {

        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+str_company);
        List<Map<String, Object>> list = this.ShipService.list_ship8(str_company,str_shipno);

        return super.warpObject(new ShipWarpper(list));


    }
}