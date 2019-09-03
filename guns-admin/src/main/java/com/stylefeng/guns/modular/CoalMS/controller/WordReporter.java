package com.stylefeng.guns.modular.CoalMS.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
//package com.sdut.PoiDemo;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;


public class WordReporter {

    private String tempLocalPath;
    private XWPFDocument xwpfDocument = null;
    private FileInputStream inputStream = null;
    private OutputStream outputStream = null;

    public WordReporter(){

    }
    public WordReporter(String tempLocalPath){
        this.tempLocalPath = tempLocalPath;
    }

    /**
     *  设置模板路径
     * @param tempLocalPath
     */
    public void setTempLocalPath(String tempLocalPath) {
        this.tempLocalPath = tempLocalPath;
    }

    /**
     *  初始化
     * @throws IOException
     */
    public void init() throws IOException{
        inputStream = new FileInputStream(new File(this.tempLocalPath));
        xwpfDocument = new XWPFDocument(inputStream);
    }

    /**
     * @Description:自定义下载文件名方法
     * @param response
     * @param fileName
     * @param filePath
     * @throws IOException
     */
    public void download(HttpServletResponse response, String fileName, String filePath) throws Exception{
        File file = new File(filePath);
        if(file.isFile()){
            long fileLength = file.length();
            //浏览器下载中文名文件兼容性处理
            String filaname = new String(fileName.getBytes("gb2312"),"ISO8859-1");
            // 清空response
            response.reset();
            //octet-stream 自动匹配文件类型
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition","attachment;filename=\"" + filaname + "\"");
            response.setHeader("Content-Length", String.valueOf(fileLength));
            InputStream is = new FileInputStream(file);
            OutputStream os = response.getOutputStream();
            byte[] b = new byte[2048];
            while (is.read(b) != -1) {
                os.write(b);
            }
            is.close();
            os.flush();
            os.close();
        }else{
            throw new Exception("下载类型不是文件或不存在！");
        }
    }

    /**
     *  导出方法
     * @param params
     * @param tableIndex
     * @return
     * @throws Exception
     */
    public boolean export(List<Map<String,String>> params, int tableIndex) throws Exception{
        this.insertValueToTable(xwpfDocument,params,tableIndex);
        return true;
    }

    /**
     * 循环填充表格内容
     * @param xwpfDocument
     * @param params
     * @param tableIndex
     * @throws Exception
     */
    private   void insertValueToTable(XWPFDocument xwpfDocument, List<Map<String,String>> params, int tableIndex) throws Exception {
        List<XWPFTable> tableList = xwpfDocument.getTables();
        if(tableList.size()<=tableIndex){
            throw new Exception("tableIndex对应的表格不存在");
        }
        XWPFTable table = tableList.get(tableIndex);
        List<XWPFTableRow> rows = table.getRows();
        if(rows.size()<2){
            throw new Exception("tableIndex对应表格应该为2行");
        }
        //模板的那一行
        XWPFTableRow tmpRow = rows.get(1);
        List<XWPFTableCell> tmpCells = null;
        List<XWPFTableCell> cells = null;
        XWPFTableCell tmpCell = null;
        tmpCells = tmpRow.getTableCells();


        String cellText = null;
        String cellTextKey = null;
        Map<String,Object> totalMap = null;
        for (int i = 0, len = params.size(); i < len; i++) {
            Map<String,String> map = params.get(i);
            // 创建新的一行
            XWPFTableRow row = table.createRow();
            // 获取模板的行高 设置为新一行的行高
            row.setHeight(tmpRow.getHeight());
            cells = row.getTableCells();
            for (int k = 0, klen = cells.size(); k < klen; k++) {
                tmpCell = tmpCells.get(k);
                XWPFTableCell cell = cells.get(k);
                cellText = tmpCell.getText();
                if (StringUtils.isNotBlank(cellText)) {
                    //转换为mapkey对应的字段
                    cellTextKey = cellText.replace("$", "").replace("{", "").replace("}", "");
                    if (map.containsKey(cellTextKey)) {
                        // 填充内容 并且复制模板行的属性
                        setCellText(tmpCell,cell,map.get(cellTextKey));
                    }
                }
            }

        }
        // 删除模版行
        table.removeRow(1);
    }

    /**
     *  复制模板行的属性
     * @param tmpCell
     * @param cell
     * @param text
     * @throws Exception
     */
    private void setCellText(XWPFTableCell tmpCell, XWPFTableCell cell,String text) throws Exception {

        CTTc cttc2 = tmpCell.getCTTc();
        CTTcPr ctPr2 = cttc2.getTcPr();
        CTTc cttc = cell.getCTTc();
        CTTcPr ctPr = cttc.addNewTcPr();
        if (ctPr2.getTcW() != null) {
            ctPr.addNewTcW().setW(ctPr2.getTcW().getW());
        }
        if (ctPr2.getVAlign() != null) {
            ctPr.addNewVAlign().setVal(ctPr2.getVAlign().getVal());
        }
        if (cttc2.getPList().size() > 0) {
            CTP ctp = cttc2.getPList().get(0);
            if (ctp.getPPr() != null) {
                if (ctp.getPPr().getJc() != null) {
                    cttc.getPList().get(0).addNewPPr().addNewJc()
                            .setVal(ctp.getPPr().getJc().getVal());
                }
            }
        }
        if (ctPr2.getTcBorders() != null) {
            ctPr.setTcBorders(ctPr2.getTcBorders());
        }

        XWPFParagraph tmpP = tmpCell.getParagraphs().get(0);
        XWPFParagraph cellP = cell.getParagraphs().get(0);
        XWPFRun tmpR = null;
        if (tmpP.getRuns() != null && tmpP.getRuns().size() > 0) {
            tmpR = tmpP.getRuns().get(0);
        }
        XWPFRun cellR = cellP.createRun();
        cellR.setText(text);
        // 复制字体信息
        if (tmpR != null) {
            if(!cellR.isBold()){
                cellR.setBold(tmpR.isBold());
            }
            cellR.setItalic(tmpR.isItalic());
            cellR.setUnderline(tmpR.getUnderline());
            cellR.setColor(tmpR.getColor());
            cellR.setTextPosition(tmpR.getTextPosition());
            if (tmpR.getFontSize() != -1) {
                cellR.setFontSize(tmpR.getFontSize());
            }
            if (tmpR.getFontFamily() != null) {
                cellR.setFontFamily(tmpR.getFontFamily());
            }
            if (tmpR.getCTR() != null) {
                if (tmpR.getCTR().isSetRPr()) {
                    CTRPr tmpRPr = tmpR.getCTR().getRPr();
                    if (tmpRPr.isSetRFonts()) {
                        CTFonts tmpFonts = tmpRPr.getRFonts();
                        CTRPr cellRPr = cellR.getCTR().isSetRPr() ? cellR
                                .getCTR().getRPr() : cellR.getCTR().addNewRPr();
                        CTFonts cellFonts = cellRPr.isSetRFonts() ? cellRPr
                                .getRFonts() : cellRPr.addNewRFonts();
                        cellFonts.setAscii(tmpFonts.getAscii());
                        cellFonts.setAsciiTheme(tmpFonts.getAsciiTheme());
                        cellFonts.setCs(tmpFonts.getCs());
                        cellFonts.setCstheme(tmpFonts.getCstheme());
                        cellFonts.setEastAsia(tmpFonts.getEastAsia());
                        cellFonts.setEastAsiaTheme(tmpFonts.getEastAsiaTheme());
                        cellFonts.setHAnsi(tmpFonts.getHAnsi());
                        cellFonts.setHAnsiTheme(tmpFonts.getHAnsiTheme());
                    }
                }
            }

        }
        // 复制段落信息
        cellP.setAlignment(tmpP.getAlignment());
        cellP.setVerticalAlignment(tmpP.getVerticalAlignment());
        cellP.setBorderBetween(tmpP.getBorderBetween());
        cellP.setBorderBottom(tmpP.getBorderBottom());
        cellP.setBorderLeft(tmpP.getBorderLeft());
        cellP.setBorderRight(tmpP.getBorderRight());
        cellP.setBorderTop(tmpP.getBorderTop());
        cellP.setPageBreak(tmpP.isPageBreak());
        if (tmpP.getCTP() != null) {
            if (tmpP.getCTP().getPPr() != null) {
                CTPPr tmpPPr = tmpP.getCTP().getPPr();
                CTPPr cellPPr = cellP.getCTP().getPPr() != null ? cellP
                        .getCTP().getPPr() : cellP.getCTP().addNewPPr();
                // 复制段落间距信息
                CTSpacing tmpSpacing = tmpPPr.getSpacing();
                if (tmpSpacing != null) {
                    CTSpacing cellSpacing = cellPPr.getSpacing() != null ? cellPPr
                            .getSpacing() : cellPPr.addNewSpacing();
                    if (tmpSpacing.getAfter() != null) {
                        cellSpacing.setAfter(tmpSpacing.getAfter());
                    }
                    if (tmpSpacing.getAfterAutospacing() != null) {
                        cellSpacing.setAfterAutospacing(tmpSpacing
                                .getAfterAutospacing());
                    }
                    if (tmpSpacing.getAfterLines() != null) {
                        cellSpacing.setAfterLines(tmpSpacing.getAfterLines());
                    }
                    if (tmpSpacing.getBefore() != null) {
                        cellSpacing.setBefore(tmpSpacing.getBefore());
                    }
                    if (tmpSpacing.getBeforeAutospacing() != null) {
                        cellSpacing.setBeforeAutospacing(tmpSpacing
                                .getBeforeAutospacing());
                    }
                    if (tmpSpacing.getBeforeLines() != null) {
                        cellSpacing.setBeforeLines(tmpSpacing.getBeforeLines());
                    }
                    if (tmpSpacing.getLine() != null) {
                        cellSpacing.setLine(tmpSpacing.getLine());
                    }
                    if (tmpSpacing.getLineRule() != null) {
                        cellSpacing.setLineRule(tmpSpacing.getLineRule());
                    }
                }
                // 复制段落缩进信息
                CTInd tmpInd = tmpPPr.getInd();
                if (tmpInd != null) {
                    CTInd cellInd = cellPPr.getInd() != null ? cellPPr.getInd()
                            : cellPPr.addNewInd();
                    if (tmpInd.getFirstLine() != null) {
                        cellInd.setFirstLine(tmpInd.getFirstLine());
                    }
                    if (tmpInd.getFirstLineChars() != null) {
                        cellInd.setFirstLineChars(tmpInd.getFirstLineChars());
                    }
                    if (tmpInd.getHanging() != null) {
                        cellInd.setHanging(tmpInd.getHanging());
                    }
                    if (tmpInd.getHangingChars() != null) {
                        cellInd.setHangingChars(tmpInd.getHangingChars());
                    }
                    if (tmpInd.getLeft() != null) {
                        cellInd.setLeft(tmpInd.getLeft());
                    }
                    if (tmpInd.getLeftChars() != null) {
                        cellInd.setLeftChars(tmpInd.getLeftChars());
                    }
                    if (tmpInd.getRight() != null) {
                        cellInd.setRight(tmpInd.getRight());
                    }
                    if (tmpInd.getRightChars() != null) {
                        cellInd.setRightChars(tmpInd.getRightChars());
                    }
                }
            }
        }
    }

    /**
     *  收尾方法
     * @param outDocPath
     * @return
     * @throws IOException
     */
    public boolean generate(String outDocPath) throws IOException{
        outputStream = new FileOutputStream(outDocPath);
        xwpfDocument.write(outputStream);
        this.close(outputStream);
        this.close(inputStream);
        return true;
    }

    /**
     *  关闭输入流
     * @param is
     */
    private void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *  关闭输出流
     * @param os
     */
    private void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

