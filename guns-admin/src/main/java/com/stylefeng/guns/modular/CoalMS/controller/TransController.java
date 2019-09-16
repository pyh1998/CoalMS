package com.stylefeng.guns.modular.CoalMS.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.service.TransService;
import io.swagger.models.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/trans")
public class TransController extends BaseController{

    @RequestMapping(value="/trans")
    public String trans() {
        return "/CoalMS/trans/trans.html";
    }

    @Autowired
    private TransService transService;

    @RequestMapping(value = "/hhh")
    @ResponseBody
    public String SSS()
    {
        return "asdasd";
    }
    @RequestMapping(value = "/transTrain")
    @ResponseBody
    public void transTrain() {
//        TVTrain tvTrain =new TVTrain();
//        tvTrain.setCompany(company);
//        tvTrain.setFbelongdatetimedtm(fbelongdatetimedtm);
//        tvTrain.setFarriveporttimedtm(farriveporttimedtm);
//        tvTrain.setFchecktonnum(fchecktonnum);
//        tvTrain.setFcoalcodevcr(fcoalcodevcr);
//        tvTrain.setFcoalname(fcoalname);
//        tvTrain.setFconsignername(fconsignername);
//        tvTrain.setFconsignernum(fconsignernum);
//        tvTrain.setFdisbuttcodevcr(fdisbuttcodevcr);
//        tvTrain.setFdisbuttname(fdisbuttname);

    }

    @RequestMapping(value = "/transShip")
    @ResponseBody
    public List<TVShipmain> transShip(){
        String selectURL = "http://localhost:8081/data/select";
        HttpMethod method = HttpMethod.POST;
        List<TVShipmain> list = this.transService.listClient(selectURL,method);
        this.transService.insert(list);
        return list;
    }

    @RequestMapping(value = "/deleteShip")
    @ResponseBody
    public Integer deleteShip() {
        String selectURL = "http://localhost:8081/data/delete";
        HttpMethod method = HttpMethod.GET;
        return this.transService.intClient(selectURL,method);
    }
}
