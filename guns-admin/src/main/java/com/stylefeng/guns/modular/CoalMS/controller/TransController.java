package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.dao.TransMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.model.TVTrain;
import com.stylefeng.guns.modular.CoalMS.service.TransService;
import com.stylefeng.guns.modular.CoalMS.warpper.TransWarpper;
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

    @RequestMapping(value = "/transTrain")
    @ResponseBody
    public void transTrain(String company,String ftraincodevcr,String ftrainordervcr,Date farriveporttimedtm,String ftrainnumnum,BigDecimal funloadflagnum,BigDecimal fisweightnum,Date fweightdtm,String fweightflag,Date fbelongdatetimedtm,BigDecimal isvalid,BigDecimal ftrainordernum,String ftrainnonum,BigDecimal fstatstastioncodenum,String fstatstastionname,String fcoalcodevcr,String fcoalname,BigDecimal fconsignernum,String fconsignername,BigDecimal fchecktonnum,BigDecimal fweighttonnum,BigDecimal fisweightnumd,String fdisbuttcodevcr,String fdisbuttname,BigDecimal fheavytonnum,BigDecimal femptytonnum,Date femptytimedtm,String ticketNo,String ftrainnonum2,BigDecimal fvolume,BigDecimal traincount) {
        TVTrain tvTrain =new TVTrain();
        tvTrain.setCompany(company);
        tvTrain.setFbelongdatetimedtm(fbelongdatetimedtm);
        tvTrain.setFarriveporttimedtm(farriveporttimedtm);
        tvTrain.setFchecktonnum(fchecktonnum);
        tvTrain.setFcoalcodevcr(fcoalcodevcr);
        tvTrain.setFcoalname(fcoalname);
        tvTrain.setFconsignername(fconsignername);
        tvTrain.setFconsignernum(fconsignernum);
        tvTrain.setFdisbuttcodevcr(fdisbuttcodevcr);
        tvTrain.setFdisbuttname(fdisbuttname);

    }

    @RequestMapping(value = "/transShip")
    @ResponseBody
    public List<Map<String, Object>> transShip(){
        String selectURL = "http://localhost:8081/data/select";
        HttpMethod method = HttpMethod.GET;
        List<Map<String, Object>> list = new ArrayList<>();
        list = this.transService.client(selectURL,method,list);

//        List<Map<String, Object>> l = new ArrayList<>();
//        Map<String, Object>m=new HashMap<>();
//        m.put("COMPANY","02");
//        m.put("FSHIPYEARNUMVCR","03234");
//        l.add(m);

//        TVShipmain tvShipmain = new TVShipmain();
//        tvShipmain.setCompany("02");
//        tvShipmain.setCompany(company);
//        tvShipmain.setFshipyearnumvcr(fshipyearnumvcr);
//        tvShipmain.setFshipordernum(fshipordernum);
//        tvShipmain.setFarrivetimedtm(farrivetimedtm);
//        tvShipmain.setFshipcodenum(fshipcodenum);
//        tvShipmain.setFshipname(fshipname);
//        tvShipmain.setFberthnum(fberthnum);
//        tvShipmain.setFberthname(fberthname);
//        tvShipmain.setFsigntonnum2(fsigntonnum2);
//        tvShipmain.setFsigntonnum(fsigntonnum);
//        tvShipmain.setFshipstatevcr(fshipstatevcr);
//        tvShipmain.setFcounttimedtm(fcounttimedtm);
//        tvShipmain.setFcabinnumnum(fcabinnumnum);
//        tvShipmain.setFmaxweighnum(fmaxweighnum);
//        tvShipmain.setFrton1num(frton1num);
//        tvShipmain.setFbqton1num(fbqton1num);
//        tvShipmain.setFrton2num(frton2num);
//        tvShipmain.setFbqbton2num(fbqbton2num);
//        tvShipmain.setFbmtonnum(fbmtonnum);
//        tvShipmain.setFbjtonnum1(fbjtonnum1);
//        tvShipmain.setFbjtonnum2(fbjtonnum2);
//        tvShipmain.setLineresult(lineresult);
//        tvShipmain.setLinestate(linestate);
//        tvShipmain.setRton(rton);
//        tvShipmain.setBmton(bmton);
//        tvShipmain.setBqton(bqton);
//        tvShipmain.setBjton(bjton);;
//        tvShipmain.setMaxton(maxton);
//        tvShipmain.setMinton(minton);
//        tvShipmain.setRrate(rrate);
//        tvShipmain.setBmrate(bmrate);
//        tvShipmain.setBqrate(bqrate);
//        tvShipmain.setBjrate(bjrate);
//        tvShipmain.setFcoalname1(fcoalname1);
//        tvShipmain.setFcoalname2(fcoalname2);
//        tvShipmain.setSignresult(signresult);
//        tvShipmain.setSignstate(signstate);
//        tvShipmain.setSignrrate(signrrate);
//        tvShipmain.setSignbmrate(signbmrate);
//        tvShipmain.setSignbqrate(signbqrate);
//        tvShipmain.setSignbjrate(signbjrate);
//        tvShipmain.setFstarttimedtm(fstarttimedtm);
//        tvShipmain.setFstoptimedtm(fstoptimedtm);
//        tvShipmain.setFbattlename(fbattlename);
//        tvShipmain.setFflowname(fflowname);
//        tvShipmain.setFcabinnumnumno(fcabinnumnumno);
//        this.TransService.insert(list.get(0));
        for (int i = 0; i < list.size(); i++)
        this.transService.insert(list.get(i));
        return list;
    }

    @RequestMapping(value = "/deleteShip")
    @ResponseBody
    public Integer deleteShip() {
        String selectURL = "http://localhost:8081/data/delete";
        HttpMethod method = HttpMethod.GET;
        return this.transService.client(selectURL,method);
    }
}
