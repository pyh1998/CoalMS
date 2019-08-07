package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.core.base.tips.Tip;
import com.stylefeng.guns.core.cache.CacheKit;
import com.stylefeng.guns.core.common.annotion.BussinessLog;
import com.stylefeng.guns.core.common.annotion.Permission;
import com.stylefeng.guns.core.common.constant.Const;
import com.stylefeng.guns.core.common.constant.cache.Cache;
import com.stylefeng.guns.core.common.constant.dictmap.RoleDict;
import com.stylefeng.guns.core.common.constant.factory.ConstantFactory;
import com.stylefeng.guns.core.common.exception.BizExceptionEnum;
import com.stylefeng.guns.core.exception.GunsException;
import com.stylefeng.guns.core.log.LogObjectHolder;
import com.stylefeng.guns.core.node.ZTreeNode;
import com.stylefeng.guns.core.util.Convert;
import com.stylefeng.guns.core.util.ToolUtil;
import com.stylefeng.guns.modular.system.model.Role;
import com.stylefeng.guns.modular.system.model.User;
import com.stylefeng.guns.modular.system.service.IRoleService;
import com.stylefeng.guns.modular.system.service.IUserService;
import com.stylefeng.guns.modular.system.service.TrainService;
import com.stylefeng.guns.modular.system.warpper.RoleWarpper;
import com.stylefeng.guns.modular.system.warpper.TrainWarpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
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

    @Autowired
    private TrainService TrainService;

    /**
     * 轨道衡功能1：列车过衡数据汇总
     */
    @RequestMapping(value = "/search1")
    @ResponseBody
    public Object list(String str_company,String dt_start,String dt_end) {
        List<Map<String, Object>> list = this.TrainService.list(str_company,dt_start,dt_end);
            return super.warpObject(new TrainWarpper(list));

    }



}
