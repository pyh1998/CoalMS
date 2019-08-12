package com.stylefeng.guns.modular.CoalMS.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.core.util.ToolUtil;
import com.stylefeng.guns.modular.CoalMS.service.TrainService;
import com.stylefeng.guns.modular.CoalMS.warpper.TrainWarpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/train")
public class TrainController extends BaseController {

    private static String PREFIX = "/CoalMS/train/";

    @Autowired
    private TrainService TrainService;

    @RequestMapping(value="/test")
    public String test() {
        return PREFIX + "test.html";
    }

    @RequestMapping(value="/train1")
    public String train1() {
        return PREFIX + "train1.html";
    }

    @RequestMapping(value="/train2")
    public String train2() {
        return PREFIX + "train2.html";
    }

    @RequestMapping(value="/train3")
    public String train3() {
        return PREFIX + "train3.html";
    }

    @RequestMapping(value="/train4")
    public String train4() {
        return PREFIX + "train4.html";
    }

    @RequestMapping(value="/train5")
    public String train5() {
        return PREFIX + "train5.html";
    }

    @RequestMapping(value="/train6")
    public String train6() {
        return PREFIX + "train6.html";
    }

    @RequestMapping(value="/train7")
    public String train7() {
        return PREFIX + "train7.html";
    }


    /**
     * 轨道衡功能1：列车过衡数据汇总
     */
    @RequestMapping(value = "/search1")
    @ResponseBody
    public Object search1(String time, String str_company, String dt_start, String dt_end) {
//        ^\d{4}\d{2}$
//        ToolUtil.isEmpty()
//        TrainService.selectList(new EntityWrapper<>());

        System.out.println("aaaaaaaaaaaaaa");
        List<Map<String, Object>> list = this.TrainService.search1(str_company,dt_start,dt_end);

        return super.warpObject(new TrainWarpper(list));

    }
    @RequestMapping(value = "/search4")
    @ResponseBody
    public Object search4(String str_company,String dt_start,String dt_end,String str_ftraincodevcr) {
        List<Map<String, Object>> list = this.TrainService.search4(str_company,dt_start,dt_end,str_ftraincodevcr);

        return super.warpObject(new TrainWarpper(list));

    }
    @RequestMapping(value = "/search6")
    @ResponseBody
    public Object search6(String str_company,String dt_start,String dt_end,String str_station,String str_first,String str_coalname) {
        List<Map<String, Object>> list = this.TrainService.search6(str_company,dt_start,dt_end,str_station,str_first,str_coalname);

        return super.warpObject(new TrainWarpper(list));

    }
    @RequestMapping(value = "/Train5D")
    @ResponseBody
    public Object Train5D(String str_company,String dt_start,String dt_end,String str_trainno) {
        List<Map<String, Object>> list = this.TrainService.Train5D(str_company,dt_start,dt_end,str_trainno);

        return super.warpObject(new TrainWarpper(list));

    }

}
