package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.service.ShipService;
import com.stylefeng.guns.modular.CoalMS.warpper.ShipWarpper;
import javax.servlet.http.HttpServlet;
import com.stylefeng.guns.modular.CoalMS.warpper.TrainWarpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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

    @RequestMapping(value="/add")
    public String ship9() {
        return PREFIX + "add.html";
    }

    @RequestMapping(value="/edit")
    public String ship10() {
        return PREFIX + "edit.html";
    }

    private List<Map<String, Object>> listDetail=new ArrayList<>();


    /**
     * 皮带秤1：合格率查询
     */
    @RequestMapping(value = "/list_ship1")
    @ResponseBody
    public Object list_ship1(String dt_start,String dt_end) {

        System.out.printf("************"+dt_start+"***"+dt_end+"*************");
        List<Map<String, Object>> list = this.ShipService.list_ship1(dt_start,dt_end);

        return super.warpObject(new ShipWarpper(list));
    }

    /**
     * 皮带秤功能2：误差合格分析
     */
    @RequestMapping(value = "/list_ship2")
    @ResponseBody
    public Object list_ship2(String str_company,String dt_start,String dt_end) {
        List<Map<String, Object>> list = this.ShipService.list_ship2(str_company, dt_start,dt_end);
        return super.warpObject(new ShipWarpper(list));
    }

    /**
     * 皮带秤功能3：误差合格分析
     */
    @RequestMapping(value = "/list_ship3")
    @ResponseBody
    public Object list_ship3(String str_company,String dt_start,String dt_end) {
        List<Map<String, Object>> list  = this.ShipService.list_ship3(str_company,dt_start,dt_end);
        listDetail =list;
        return super.warpObject(new ShipWarpper(list));
    }


    @RequestMapping(value = "/list_ship4")
    @ResponseBody
    public Object list_ship4(String str_company,String dt_start,String dt_end) {
        List<Map<String, Object>> list = this.ShipService.list_ship4(str_company,dt_start,dt_end);
        listDetail=list;
        return super.warpObject(new ShipWarpper(list));
    }

    @RequestMapping(value = "/list_ship5")
    @ResponseBody
    public Object list_ship5(String str_company,String dt_start,String dt_end) {
        List<Map<String, Object>> list = this.ShipService.list_ship5(str_company,dt_start,dt_end);
        return super.warpObject(new ShipWarpper(list));
    }
    @RequestMapping(value = "/list_ship5D")
    @ResponseBody
    public Object list_ship5D(String str_company,String dt_start,String dt_end,String str_state) {
        List<Map<String, Object>> list = this.ShipService.list_ship5D(str_company,dt_start,dt_end,str_state);
        listDetail=list;
        return super.warpObject(new ShipWarpper(list));
    }

    @RequestMapping(value = "/list_ship6")
    @ResponseBody
    public Object list_ship6(String str_company,String dt_year) {
        List<Map<String, Object>> list = this.ShipService.list_ship6(str_company,dt_year);
        return super.warpObject(new ShipWarpper(list));
    }

    @RequestMapping(value = "/list_ship7Q")
    @ResponseBody
    public Object list_ship7(String str_company,String str_fshipyearnumvcr,String dt_start,String dt_end) {

        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+str_company);
        List<Map<String, Object>> list = this.ShipService.list_ship7(str_company,str_fshipyearnumvcr,dt_start,dt_end);

        return super.warpObject(new ShipWarpper(list));


    }


    @RequestMapping(value = "/list_ship7")
    @ResponseBody
    public Object list_ship7_1(String str_company,String str_shipno) {

        List<Map<String, Object>> list = this.ShipService.list_ship7_1(str_company,str_shipno);
        listDetail=list;
        return super.warpObject(new ShipWarpper(list));


    }

    @RequestMapping(value = "/list_ship8")
    @ResponseBody
    public Object list_ship8(String str_company,String str_shipno) {

        List<Map<String, Object>> list = this.ShipService.list_ship8(str_company,str_shipno);
        listDetail=list;
        return super.warpObject(new ShipWarpper(list));



    }




    @RequestMapping(value = "/list_ship_word")
    //@ResponseBody
    public void export1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        int a=1;
        for (Map<String, Object> m : listDetail)
        {
            Map<String,String> map = new HashMap<>();
            for (String k : m.keySet())
            {
                //System.out.println(m.get("FARRIVEPORTTIMEDTM").toString());
                map.put("index",Integer.toString(a));
                map.put("company", m.get("COMPANY").toString());
                map.put("fcounttimedtm", m.get("FCOUNTTIMEDTM").toString());
                map.put("fshipyearnumvcr", m.get("FSHIPYEARNUMVCR").toString());
                map.put("fshipname", m.get("FSHIPNAME").toString());
                map.put("fberthname", m.get("FBERTHNAME").toString());
                map.put("fcoalname1", m.get("FCOALNAME1").toString());
                map.put("fsigntonnum", m.get("FSIGNTONNUM").toString());
                map.put("rton", m.get("RTON").toString());
                map.put("bmton", m.get("BMTON").toString());
                map.put("bqton", m.get("BQTON").toString());
                map.put("bjton", m.get("BJTON").toString());
                map.put("rate1", m.get("RATE1").toString());
                map.put("rate2", m.get("RATE2").toString());
                map.put("rate3", m.get("RATE3").toString());
                map.put("state", m.get("STATE").toString());
            }
            a=a+1;
            list.add(map);
        }
        System.out.println(list);


        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为guns-admin/src/main/resources/wordTemplate/export.docx，则可以如下获取：
        File upload = new File("guns-admin/src/main/resources/wordTemplate/export2.docx");
        //if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());

        String filePath = upload.getAbsolutePath();
        String outPath = "D:/demo1.docx";


        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);
        wordReporter.download(response,"皮带秤明细表.docx",outPath);


        listDetail = new ArrayList<>();

    }
    @RequestMapping(value = "/list_shipSignature_word")
    //@ResponseBody
    public void export2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        int a=1;
        for (Map<String, Object> m : listDetail)
        {
            System.out.println(m);
            Map<String,String> map = new HashMap<>();
            for (String k : m.keySet())
            {
//                System.out.println(m.get("COMPANY").toString());
//                System.out.println(m.get("FCOUNTTIMEDTM").toString());
//                System.out.println(m.get("FSHIPYEARNUMVCR").toString());
//                System.out.println(m.get("FSHIPNAME").toString());
//                System.out.println(m.get("FBERTHNAME").toString());
//                System.out.println(m.get("FCOALNAME1").toString());
//                System.out.println(m.get("FSIGNTONNUM").toString());
//                System.out.println(m.get("RTON").toString());
//                System.out.println(m.get("BMTON").toString());
//                System.out.println(m.get("BQTON").toString());
//                System.out.println(m.get("BJTON").toString());
//                System.out.println(m.get("RATE1").toString());
//                System.out.println(m.get("RATE2").toString());
//                System.out.println(m.get("RATE3").toString());
//                System.out.println(m.get("STATE").toString());


                //System.out.println(m.get("FARRIVEPORTTIMEDTM").toString());
                map.put("index",Integer.toString(a));
                map.put("company", m.get("COMPANY").toString());
                map.put("fcounttimedtm", m.get("FCOUNTTIMEDTM").toString());
                map.put("fshipyearnumvcr", m.get("FSHIPYEARNUMVCR").toString());
                map.put("fshipname", m.get("FSHIPNAME").toString());
                map.put("fberthname", m.get("FBERTHNAME").toString());
                map.put("fcoalname1", m.get("FCOALNAME1").toString());
                map.put("fsigntonnum", m.get("FSIGNTONNUM").toString());
                map.put("rton", m.get("RTON").toString());
                map.put("bmton", m.get("BMTON").toString());
                map.put("bqton", m.get("BQTON").toString());
                map.put("bjton", m.get("BJTON").toString());
                map.put("rrate", m.get("RRATE").toString());
                map.put("rate1", m.get("BMRATE").toString());
                map.put("rate2", m.get("BQRATE").toString());
                map.put("rate3", m.get("BJRATE").toString());
                map.put("state", m.get("STATE").toString());
            }
            a=a+1;
            list.add(map);
        }
        System.out.println(list);


        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为guns-admin/src/main/resources/wordTemplate/export.docx，则可以如下获取：
        File upload = new File("guns-admin/src/main/resources/wordTemplate/export4.docx");
        //if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());

        String filePath = upload.getAbsolutePath();
        String outPath = "D:/demo1.docx";


        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);
        wordReporter.download(response,"皮带秤签数对照.docx",outPath);


        listDetail = new ArrayList<>();

    }

    @RequestMapping(value = "/list_shipstatistics_word")
    //@ResponseBody
    public void export5(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        int a=1;
        for (Map<String, Object> m : listDetail)
        {
            System.out.println(m);
            Map<String,String> map = new HashMap<>();
            for (String k : m.keySet())
            {
//                System.out.println(m.get("COMPANY").toString());
//                System.out.println(m.get("FCOUNTTIMEDTM").toString());
//                System.out.println(m.get("FSHIPYEARNUMVCR").toString());
//                System.out.println(m.get("FSHIPNAME").toString());
//                System.out.println(m.get("FBERTHNAME").toString());
//                System.out.println(m.get("FCOALNAME1").toString());
//                System.out.println(m.get("FSIGNTONNUM").toString());
//                System.out.println(m.get("RTON").toString());
//                System.out.println(m.get("BMTON").toString());
//                System.out.println(m.get("BQTON").toString());
//                System.out.println(m.get("BJTON").toString());
//                System.out.println(m.get("RATE1").toString());
//                System.out.println(m.get("RATE2").toString());
//                System.out.println(m.get("RATE3").toString());
//                System.out.println(m.get("STATE").toString());


                //System.out.println(m.get("FARRIVEPORTTIMEDTM").toString());
                map.put("index",Integer.toString(a));
                map.put("company", m.get("COMPANY").toString());
                map.put("fshipyearnumvcr", m.get("FSHIPYEARNUMVCR").toString());
                map.put("fshipname", m.get("FSHIPNAME").toString());
                map.put("fberthname", m.get("FBERTHNAME").toString());
                map.put("fsigntonnum", m.get("FSIGNTONNUM").toString());
                map.put("rton", m.get("RTON").toString());
                map.put("bmton", m.get("BMTON").toString());
                map.put("bqton", m.get("BQTON").toString());
                map.put("bjton", m.get("BJTON").toString());
                map.put("rrate", m.get("RRATE").toString());
                map.put("rate1", m.get("BMRATE").toString());
                map.put("rate2", m.get("BQRATE").toString());
                map.put("rate3", m.get("BJRATE").toString());
                map.put("state", m.get("STATE").toString());
            }
            a=a+1;
            list.add(map);
        }
        System.out.println(list);


        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为guns-admin/src/main/resources/wordTemplate/export.docx，则可以如下获取：
        File upload = new File("guns-admin/src/main/resources/wordTemplate/export5.docx");
        //if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());

        String filePath = upload.getAbsolutePath();
        String outPath = "D:/demo1.docx";


        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);
        wordReporter.download(response,"皮带秤签数分析.docx",outPath);


        listDetail = new ArrayList<>();

    }


    @RequestMapping(value = "/list_shipdetail_word")
    //@ResponseBody
    public void export8(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        int a=1;
        for (Map<String, Object> m : listDetail)
        {
            System.out.println(m);
            Map<String,String> map = new HashMap<>();
            for (String k : m.keySet())
            {
//                System.out.println(m.get("COMPANY").toString());
//                System.out.println(m.get("FCOUNTTIMEDTM").toString());
//                System.out.println(m.get("FSHIPYEARNUMVCR").toString());
//                System.out.println(m.get("FSHIPNAME").toString());
//                System.out.println(m.get("FBERTHNAME").toString());
//                System.out.println(m.get("FCOALNAME1").toString());
//                System.out.println(m.get("FSIGNTONNUM").toString());
//                System.out.println(m.get("RTON").toString());
//                System.out.println(m.get("BMTON").toString());
//                System.out.println(m.get("BQTON").toString());
//                System.out.println(m.get("BJTON").toString());
//                System.out.println(m.get("RATE1").toString());
//                System.out.println(m.get("RATE2").toString());
//                System.out.println(m.get("RATE3").toString());
//                System.out.println(m.get("STATE").toString());


                //System.out.println(m.get("FARRIVEPORTTIMEDTM").toString());
                map.put("index",Integer.toString(a));
                map.put("fshipyearnumvcr", m.get("FSHIPYEARNUMVCR").toString());
                map.put("fstarttimedtm", m.get("FSTARTTIMEDTM").toString());
                map.put("fstoptimedtm", m.get("FSTOPTIMEDTM").toString());
                map.put("fflowname", m.get("FFLOWNAME").toString());
                map.put("fcabinnumnumno", m.get("FCABINNUMNUMNO").toString());
                map.put("fbattlename", m.get("FBATTLENAME").toString());
                map.put("fcoalname1", m.get("FCOALNAME1").toString());
                map.put("rton", m.get("RTON").toString());
                map.put("bmton", m.get("BMTON").toString());
                map.put("bqton", m.get("BQTON").toString());
                map.put("bjton", m.get("BJTON").toString());
            }
            a=a+1;
            list.add(map);
        }
        System.out.println(list);


        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为guns-admin/src/main/resources/wordTemplate/export.docx，则可以如下获取：
        File upload = new File("guns-admin/src/main/resources/wordTemplate/export8.docx");
        //if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());

        String filePath = upload.getAbsolutePath();
        String outPath = "D:/demo1.docx";


        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);
        wordReporter.download(response,"皮带秤数据明细.docx",outPath);


        listDetail = new ArrayList<>();

    }


    @RequestMapping(value = "/list_Statistics_word")
    //@ResponseBody
    public void export7(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        int a=1;
        for (Map<String, Object> m : listDetail)
        {
            System.out.println(m);
            Map<String,String> map = new HashMap<>();
            for (String k : m.keySet())
            {
//                System.out.println(m.get("FSHIPYEARNUMVCR").toString());
//                System.out.println(m.get("FSHIPNAME").toString());
//                System.out.println(m.get("RTON").toString());
//                System.out.println(m.get("RRATE").toString());
//                System.out.println(m.get("SIGNRRATE").toString());
//                System.out.println(m.get("BMTON").toString());
//                System.out.println(m.get("BMRATE").toString());
//                System.out.println(m.get("SIGNBMRATE").toString());
//                System.out.println(m.get("BQTON").toString());
//                System.out.println(m.get("BQRATE").toString());
//                System.out.println(m.get("SIGNBQRATE").toString());
//                System.out.println(m.get("BJTON").toString());
//                System.out.println(m.get("BJRATE").toString());
//                System.out.println(m.get("SIGNBJRATE").toString());
//                System.out.println(m.get("SIGNRRATE").toString());


                //System.out.println(m.get("FARRIVEPORTTIMEDTM").toString());
                map.put("fshipyearnumvcr", m.get("FSHIPYEARNUMVCR").toString());
                map.put("fshipname", m.get("FSHIPNAME").toString());
                map.put("ftonnum", m.get("RTON").toString());
                map.put("fsignton1", m.get("FSIGNTONNUM").toString());
                map.put("fsignton2", m.get("FSIGNTONNUM2").toString());
                map.put("rton", m.get("RTON").toString());
                map.put("rrate1", m.get("RRATE").toString());
                map.put("rrate2", m.get("SIGNRRATE").toString());
                map.put("bmton", m.get("BMTON").toString());
                map.put("bmrate1", m.get("BMRATE").toString());
                map.put("bmrate2", m.get("SIGNBMRATE").toString());
                map.put("bqton", m.get("BQTON").toString());
                map.put("bqrate1", m.get("BQRATE").toString());
                map.put("bqrate2", m.get("SIGNBQRATE").toString());
                map.put("bjton", m.get("BJTON").toString());
                map.put("bjrate1", m.get("BJRATE").toString());
                map.put("bjrate2", m.get("SIGNBJRATE").toString());
                map.put("signrate", m.get("SIGNRRATE").toString());



            }
            a=a+1;
            list.add(map);
        }
        System.out.println(list);


        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为guns-admin/src/main/resources/wordTemplate/export.docx，则可以如下获取：
        File upload = new File("guns-admin/src/main/resources/wordTemplate/export10.docx");
        //if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url:"+upload.getAbsolutePath());

        String filePath = upload.getAbsolutePath();
        String outPath = "D:/demo1.docx";


        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);
        wordReporter.download(response,"皮带秤数据统计.docx",outPath);


        listDetail = new ArrayList<>();

    }




}