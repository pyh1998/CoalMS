package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.CoalMS.service.TrainService;
import com.stylefeng.guns.modular.CoalMS.warpper.TrainWarpper;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
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


    List<Map<String, Object>> listdetail;

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


        List<Map<String, Object>> list = this.TrainService.search1(str_company,dt_start,dt_end);
        listdetail=list;
        return super.warpObject(new TrainWarpper(list));

    }


    /**
     * 轨道衡功能2：分公司轨道衡系统有效过衡率统计表和明细表-统计表
     */
    @RequestMapping(value = "/search2")
    @ResponseBody
    public Object search2(  String dt_start, String dt_end) {


        List<Map<String, Object>> list = this.TrainService.search2(dt_start,dt_end);
        listdetail=list;
        return super.warpObject(new TrainWarpper(list));

    }

    /**
     * 轨道衡功能2：分公司轨道衡系统有效过衡率统计表和明细表-明细表
     */
    @RequestMapping(value = "/search2D")
    @ResponseBody
    public Object search2D( String str_company, String dt_date) {


        List<Map<String, Object>> list = this.TrainService.search2D(str_company, dt_date);
        listdetail = list;
        return super.warpObject(new TrainWarpper(list));

    }

    /**
     * 轨道衡功能3：列车过衡盈亏率分析
     */
    @RequestMapping(value = "/search3")
    @ResponseBody
    public Object search3(String str_company, String dt_start, String dt_end) {


        List<Map<String, Object>> list = this.TrainService.search3(str_company, dt_start, dt_end);
        return super.warpObject(new TrainWarpper(list));

    }

    /**
     * 轨道衡功能3：列车过衡盈亏率分析
     */
    @RequestMapping(value = "/search3D")
    @ResponseBody
    public Object search3D(String str_company,String dt_start,String dt_end,String str_ftraincodevcr) {
        List<Map<String, Object>> list = this.TrainService.search3D(str_company,dt_start,dt_end,str_ftraincodevcr);

        listdetail = list;

        return super.warpObject(new TrainWarpper(list));

    }


    @RequestMapping(value = "/search4")
    @ResponseBody
    public Object search4(String str_company,String dt_start,String dt_end,String str_ftraincodevcr) {
        List<Map<String, Object>> list = this.TrainService.search4(str_company,dt_start,dt_end,str_ftraincodevcr);
        listdetail = list;
        return super.warpObject(new TrainWarpper(list));

    }



    @RequestMapping(value = "/search5")
    @ResponseBody
    public Object search5(String str_company, String dt_year) {


        List<Map<String, Object>> list = this.TrainService.search5(str_company, dt_year);
        return super.warpObject(new TrainWarpper(list));
    }

    @RequestMapping(value = "/search6")
    @ResponseBody
    public Object search6(String str_company,String dt_start,String dt_end,String str_station,String str_first,String str_coalname) {
        List<Map<String, Object>> list = this.TrainService.search6(str_company,dt_start,dt_end,str_station,str_first,str_coalname);

        listdetail = list;

        return super.warpObject(new TrainWarpper(list));

    }
    @RequestMapping(value = "/search4D")
    @ResponseBody
    public Object search4D(String str_company,String dt_start,String dt_end,String str_trainno) {
        List<Map<String, Object>> list = this.TrainService.search4D(str_company,dt_start,dt_end,str_trainno);

        listdetail = list;

        return super.warpObject(new TrainWarpper(list));

    }

    @RequestMapping(value = "/search8")
    @ResponseBody
    public Object search8(String str_company,String dt_year,String str_station,String str_coalname) {
        List<Map<String, Object>> list = this.TrainService.search8(str_company,dt_year,str_station,str_coalname);

        return super.warpObject(new TrainWarpper(list));

    }

    private void createTitle1(HSSFWorkbook workbook, HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);


        cell = row.createCell(1);
        cell.setCellValue("公司");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("所属时间");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("抵港时间");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("列车编号");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("车次");
        cell.setCellStyle(style);


        cell = row.createCell(6);
        cell.setCellValue("发站");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("煤种");
        cell.setCellStyle(style);

        cell = row.createCell(8);
        cell.setCellValue("垛位");
        cell.setCellStyle(style);

        cell = row.createCell(9);
        cell.setCellValue("发货人");
        cell.setCellStyle(style);

        cell = row.createCell(10);
        cell.setCellValue("翻车机");
        cell.setCellStyle(style);

        cell = row.createCell(11);
        cell.setCellValue("车厢数");
        cell.setCellStyle(style);


        cell = row.createCell(12);
        cell.setCellValue("过衡吨");
        cell.setCellStyle(style);

        cell = row.createCell(13);
        cell.setCellValue("货票吨");
        cell.setCellStyle(style);

        cell = row.createCell(14);
        cell.setCellValue("盈亏吨");
        cell.setCellStyle(style);

        cell = row.createCell(15);
        cell.setCellValue("盈亏率%");
        cell.setCellStyle(style);
    }

    private void createTitle2D(HSSFWorkbook workbook,HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);


        cell = row.createCell(1);
        cell.setCellValue("公司");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("日期");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("列车编号");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("车厢数");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("货票吨");
        cell.setCellStyle(style);


        cell = row.createCell(6);
        cell.setCellValue("过衡吨");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("是否有效");
        cell.setCellStyle(style);
    }

    private void createTitle4D(HSSFWorkbook workbook,HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);


        cell = row.createCell(1);
        cell.setCellValue("列车编号");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("一次车号");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("二次车号");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("翻车机");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("空车吨");
        cell.setCellStyle(style);


        cell = row.createCell(6);
        cell.setCellValue("重车吨");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("空车吨极限均值");
        cell.setCellStyle(style);

        cell = row.createCell(9);
        cell.setCellValue("过衡盈亏率%");
        cell.setCellStyle(style);

        cell = row.createCell(10);
        cell.setCellValue("空车扫描体积");
        cell.setCellStyle(style);


        cell = row.createCell(11);
        cell.setCellValue("扫描极限值");
        cell.setCellStyle(style);

        cell = row.createCell(12);
        cell.setCellValue("体积偏差率%");
        cell.setCellStyle(style);
    }

    private void createTitle6(HSSFWorkbook workbook,HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("发站");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("公司");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("煤种");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("列车编号");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("车次");
        cell.setCellStyle(style);

        cell = row.createCell(6);
        cell.setCellValue("翻车机");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("车厢数");
        cell.setCellStyle(style);

        cell = row.createCell(8);
        cell.setCellValue("重车吨");
        cell.setCellStyle(style);

        cell = row.createCell(9);
        cell.setCellValue("空车吨");
        cell.setCellStyle(style);

        cell = row.createCell(10);
        cell.setCellValue("过衡吨");
        cell.setCellStyle(style);

        cell = row.createCell(11);
        cell.setCellValue("货票吨");
        cell.setCellStyle(style);

        cell = row.createCell(12);
        cell.setCellValue("过衡盈亏率%");
        cell.setCellStyle(style);
    }


    @RequestMapping(value = "/list_train1_excel")
    @ResponseBody
    public String excel1(HttpServletResponse response) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle1(workbook,sheet);
       // List<Map<String, Object>> list = this.TrainService.search1(str_company,dt_start,dt_end);

        //设置日期格式
        HSSFCellStyle style = workbook.createCellStyle();
        style.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //新增数据行，并且设置单元格数据
        int rowNum=1;
        for(int i=0;i<listdetail.size();i++){
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(rowNum);

            row.createCell(1).setCellValue(listdetail.get(i).get("COMPANY").toString());

            HSSFCell cell1 = row.createCell(2);
            cell1.setCellValue(listdetail.get(i).get("FBELONGDATETIMEDTM").toString());
            cell1.setCellStyle(style);

            HSSFCell cell2 = row.createCell(3);
            cell2.setCellValue(listdetail.get(i).get("FARRIVEPORTTIMEDTM").toString());
            cell2.setCellStyle(style);

            row.createCell(4).setCellValue(listdetail.get(i).get("FTRAINCODEVCR").toString());

            row.createCell(5).setCellValue(listdetail.get(i).get("FTRAINORDERVCR").toString());

            row.createCell(6).setCellValue(listdetail.get(i).get("FSTATSTASTIONNAME").toString());

            row.createCell(7).setCellValue(listdetail.get(i).get("FCOALNAME").toString());

            row.createCell(8).setCellValue(listdetail.get(i).get("FDISBUTTNAME").toString());

            row.createCell(9).setCellValue(listdetail.get(i).get("FCONSIGNERNAME").toString());

            row.createCell(10).setCellValue(listdetail.get(i).get("TICKET_NO").toString());

            row.createCell(11).setCellValue(listdetail.get(i).get("TRAINCOUNT").toString());

            row.createCell(12).setCellValue(listdetail.get(i).get("FWEIGHTTONNUM").toString());

            row.createCell(13).setCellValue(listdetail.get(i).get("FCHECKTONNUM").toString());

            row.createCell(14).setCellValue(listdetail.get(i).get("PROFITNUM").toString());

            row.createCell(15).setCellValue(listdetail.get(i).get("DEVIARATE").toString());

            rowNum++;
        }

        String fileName = "列车过衡数据汇总表.xls";

        //生成excel文件
        buildExcelFile(fileName, workbook);

        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);

        return "download excel";

    }


    @RequestMapping(value = "/list_train3_excel")
    @ResponseBody
    public String excel2(HttpServletResponse response) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle2D(workbook,sheet);
        //List<Map<String, Object>> list1 = this.TrainService.search2D(str_company,dt_date);

        //设置日期格式
        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //新增数据行，并且设置单元格数据
        int rowNum=1;
        for(int i=0;i<listdetail.size();i++){

            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(rowNum);

            row.createCell(1).setCellValue(listdetail.get(i).get("COMPANY").toString());
            System.out.println(listdetail.get(i).get("COMPANY"+"*******************"));

            HSSFCell cell1 = row.createCell(2);
            cell1.setCellValue(listdetail.get(i).get("FBELONGDATETIMEDTM").toString());
            System.out.println(listdetail.get(i).get("FBELONGDATETIMEDTM"+"*******************"));
            cell1.setCellStyle(style2);

            row.createCell(3).setCellValue(listdetail.get(i).get("FTRAINCODEVCR").toString());

            row.createCell(4).setCellValue(listdetail.get(i).get("FTRAINNUMNUM").toString());

            row.createCell(5).setCellValue(listdetail.get(i).get("FCHECKTONNUM").toString());

            row.createCell(6).setCellValue(listdetail.get(i).get("FWEIGHTTONNUM").toString());

            row.createCell(7).setCellValue(listdetail.get(i).get("ISVALID").toString());

            rowNum++;
        }

        String fileName = "分公司有效过衡率明细表.xls";

        //生成excel文件
        buildExcelFile(fileName, workbook);

        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);

        return "download excel";
    }


    @RequestMapping(value = "/list_train5_excel")
    @ResponseBody
    public String excel5(HttpServletResponse response) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle4D(workbook,sheet);

        System.out.println(listdetail);
        //设置日期格式
        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //新增数据行，并且设置单元格数据
        int rowNum=1;
        for(int i=0;i<listdetail.size();i++){

            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(rowNum);

            row.createCell(1).setCellValue(listdetail.get(i).get("FTRAINCODEVCR").toString());

            row.createCell(1).setCellValue(listdetail.get(i).get("FTRAINNONUM").toString());

            row.createCell(3).setCellValue(listdetail.get(i).get("FTRAINNONUM2").toString());

            row.createCell(4).setCellValue(listdetail.get(i).get("TICKET_NO").toString());

            row.createCell(5).setCellValue(listdetail.get(i).get("FEMPTYTONNUM").toString());

            row.createCell(6).setCellValue(listdetail.get(i).get("FHEAVYTONNUM").toString());

            row.createCell(7).setCellValue(listdetail.get(i).get("LIMITEMPTY").toString());

            row.createCell(9).setCellValue(listdetail.get(i).get("WEIGHTRATE").toString());

            row.createCell(10).setCellValue(listdetail.get(i).get("FVOLUME").toString());

            row.createCell(11).setCellValue(listdetail.get(i).get("LIMITVOL").toString());

            row.createCell(12).setCellValue(listdetail.get(i).get("VOLRATE").toString());

            rowNum++;
        }

        String fileName = "单车过衡数据分析表.xls";

        //生成excel文件
        buildExcelFile(fileName, workbook);

        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);

        return "download excel";
    }


    @RequestMapping(value = "/list_train7_excel")
    @ResponseBody
    public String excel6(HttpServletResponse response) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle6(workbook,sheet);

        //设置日期格式
        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //新增数据行，并且设置单元格数据
        int rowNum=1;
        for(int i=0;i<listdetail.size();i++){

            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(rowNum);

            row.createCell(1).setCellValue(listdetail.get(i).get("FSTATSTASTIONNAME").toString());

            row.createCell(1).setCellValue(listdetail.get(i).get("COMPANY").toString());

            row.createCell(3).setCellValue(listdetail.get(i).get("FCOALNAME").toString());

            row.createCell(4).setCellValue(listdetail.get(i).get("FTRAINCODEVCR").toString());

            row.createCell(5).setCellValue(listdetail.get(i).get("FTRAINORDERVCR").toString());

            row.createCell(6).setCellValue(listdetail.get(i).get("TICKET_NO").toString());

            row.createCell(7).setCellValue(listdetail.get(i).get("FTRAINNUMNUM").toString());

            row.createCell(8).setCellValue(listdetail.get(i).get("FHEAVYTONNUM").toString());

            row.createCell(9).setCellValue(listdetail.get(i).get("FEMPTYTONNUM").toString());

            row.createCell(10).setCellValue(listdetail.get(i).get("FWEIGHTTONNUM").toString());

            row.createCell(11).setCellValue(listdetail.get(i).get("FCHECKTONNUM").toString());

            row.createCell(12).setCellValue(listdetail.get(i).get("RATE").toString());

            rowNum++;
        }

        String fileName = "同一发站过衡数据分析表.xls";

        //生成excel文件
        buildExcelFile(fileName, workbook);

        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);

        return "download excel";
    }


    protected void buildExcelFile(String filename,HSSFWorkbook workbook) throws Exception{
        FileOutputStream fos = new FileOutputStream(filename);
        workbook.write(fos);
        fos.flush();
        fos.close();
    }

    //浏览器下载excel
    protected void buildExcelDocument(String filename,HSSFWorkbook workbook,HttpServletResponse response) throws Exception{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(filename, "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }
}