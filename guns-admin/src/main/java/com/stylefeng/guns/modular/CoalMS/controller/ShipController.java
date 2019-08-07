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
import com.stylefeng.guns.modular.system.warpper.RoleWarpper;
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
@RequestMapping("/ship")
public class ShipController extends BaseController {

    private static String PREFIX = "/CoalMS/ship/";

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

}