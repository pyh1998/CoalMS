package com.stylefeng.guns.modular.CoalMS.model;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Elliot
 * @since 2019-08-22
 */
@TableName("T_V_TRAIN")
public class TVTrain extends Model<TVTrain> {

    private static final long serialVersionUID = 1L;

    /**
     * 
公司
     */
    @TableField("COMPANY")
    private String company;
    /**
     * 列车编号
     */
    @TableField("FTRAINCODEVCR")
    private String ftraincodevcr;
    /**
     * 车次
     */
    @TableField("FTRAINORDERVCR")
    private String ftrainordervcr;
    /**
     * 抵港时间
     */
    @TableField("FARRIVEPORTTIMEDTM")
    private Date farriveporttimedtm;
    /**
     * 车数
     */
    @TableField("FTRAINNUMNUM")
    private String ftrainnumnum;
    /**
     * 卸车标志
     */
    @TableField("FUNLOADFLAGNUM")
    private BigDecimal funloadflagnum;
    /**
     * 是否过衡
     */
    @TableField("FISWEIGHTNUM")
    private BigDecimal fisweightnum;
    /**
     * 过衡时间
     */
    @TableField("FWEIGHTDTM")
    private Date fweightdtm;
    /**
     * 过衡标志
     */
    @TableField("FWEIGHTFLAG")
    private String fweightflag;
    /**
     * 所属时间
     */
    @TableField("FBELONGDATETIMEDTM")
    private Date fbelongdatetimedtm;
    /**
     * 是否有效
     */
    @TableField("ISVALID")
    private BigDecimal isvalid;
    @TableField("FTRAINORDERNUM")
    private BigDecimal ftrainordernum;
    /**
     * 车号
     */
    @TableField("FTRAINNONUM")
    private String ftrainnonum;
    /**
     * 发展代码
     */
    @TableField("FSTATSTASTIONCODENUM")
    private BigDecimal fstatstastioncodenum;
    /**
     * 发站
     */
    @TableField("FSTATSTASTIONNAME")
    private String fstatstastionname;
    /**
     * 煤种code
     */
    @TableField("FCOALCODEVCR")
    private String fcoalcodevcr;
    /**
     * 煤种
     */
    @TableField("FCOALNAME")
    private String fcoalname;
    @TableField("FCONSIGNERNUM")
    private BigDecimal fconsignernum;
    /**
     * 发货人
     */
    @TableField("FCONSIGNERNAME")
    private String fconsignername;
    /**
     * 货票吨
     */
    @TableField("FCHECKTONNUM")
    private BigDecimal fchecktonnum;
    /**
     * 过衡吨
     */
    @TableField("FWEIGHTTONNUM")
    private BigDecimal fweighttonnum;
    /**
     * 是否过衡
     */
    @TableField("FISWEIGHTNUMD")
    private BigDecimal fisweightnumd;
    /**
     * 分垛代码
     */
    @TableField("FDISBUTTCODEVCR")
    private String fdisbuttcodevcr;
    /**
     * 垛位
     */
    @TableField("FDISBUTTNAME")
    private String fdisbuttname;
    /**
     * 重车吨
     */
    @TableField("FHEAVYTONNUM")
    private BigDecimal fheavytonnum;
    /**
     * 空车吨
     */
    @TableField("FEMPTYTONNUM")
    private BigDecimal femptytonnum;
    /**
     * 空车时间
     */
    @TableField("FEMPTYTIMEDTM")
    private Date femptytimedtm;
    /**
     * 翻车机
     */
    @TableField("TICKET_NO")
    private String ticketNo;
    /**
     * 二次车号
     */
    @TableField("FTRAINNONUM2")
    private String ftrainnonum2;
    /**
     * 空车扫描体积
     */
    @TableField("FVOLUME")
    private BigDecimal fvolume;
    /**
     * 车厢数
     */
    @TableField("TRAINCOUNT")
    private BigDecimal traincount;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFtraincodevcr() {
        return ftraincodevcr;
    }

    public void setFtraincodevcr(String ftraincodevcr) {
        this.ftraincodevcr = ftraincodevcr;
    }

    public String getFtrainordervcr() {
        return ftrainordervcr;
    }

    public void setFtrainordervcr(String ftrainordervcr) {
        this.ftrainordervcr = ftrainordervcr;
    }

    public Date getFarriveporttimedtm() {
        return farriveporttimedtm;
    }

    public void setFarriveporttimedtm(Date farriveporttimedtm) {
        this.farriveporttimedtm = farriveporttimedtm;
    }

    public String getFtrainnumnum() {
        return ftrainnumnum;
    }

    public void setFtrainnumnum(String ftrainnumnum) {
        this.ftrainnumnum = ftrainnumnum;
    }

    public BigDecimal getFunloadflagnum() {
        return funloadflagnum;
    }

    public void setFunloadflagnum(BigDecimal funloadflagnum) {
        this.funloadflagnum = funloadflagnum;
    }

    public BigDecimal getFisweightnum() {
        return fisweightnum;
    }

    public void setFisweightnum(BigDecimal fisweightnum) {
        this.fisweightnum = fisweightnum;
    }

    public Date getFweightdtm() {
        return fweightdtm;
    }

    public void setFweightdtm(Date fweightdtm) {
        this.fweightdtm = fweightdtm;
    }

    public String getFweightflag() {
        return fweightflag;
    }

    public void setFweightflag(String fweightflag) {
        this.fweightflag = fweightflag;
    }

    public Date getFbelongdatetimedtm() {
        return fbelongdatetimedtm;
    }

    public void setFbelongdatetimedtm(Date fbelongdatetimedtm) {
        this.fbelongdatetimedtm = fbelongdatetimedtm;
    }

    public BigDecimal getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(BigDecimal isvalid) {
        this.isvalid = isvalid;
    }

    public BigDecimal getFtrainordernum() {
        return ftrainordernum;
    }

    public void setFtrainordernum(BigDecimal ftrainordernum) {
        this.ftrainordernum = ftrainordernum;
    }

    public String getFtrainnonum() {
        return ftrainnonum;
    }

    public void setFtrainnonum(String ftrainnonum) {
        this.ftrainnonum = ftrainnonum;
    }

    public BigDecimal getFstatstastioncodenum() {
        return fstatstastioncodenum;
    }

    public void setFstatstastioncodenum(BigDecimal fstatstastioncodenum) {
        this.fstatstastioncodenum = fstatstastioncodenum;
    }

    public String getFstatstastionname() {
        return fstatstastionname;
    }

    public void setFstatstastionname(String fstatstastionname) {
        this.fstatstastionname = fstatstastionname;
    }

    public String getFcoalcodevcr() {
        return fcoalcodevcr;
    }

    public void setFcoalcodevcr(String fcoalcodevcr) {
        this.fcoalcodevcr = fcoalcodevcr;
    }

    public String getFcoalname() {
        return fcoalname;
    }

    public void setFcoalname(String fcoalname) {
        this.fcoalname = fcoalname;
    }

    public BigDecimal getFconsignernum() {
        return fconsignernum;
    }

    public void setFconsignernum(BigDecimal fconsignernum) {
        this.fconsignernum = fconsignernum;
    }

    public String getFconsignername() {
        return fconsignername;
    }

    public void setFconsignername(String fconsignername) {
        this.fconsignername = fconsignername;
    }

    public BigDecimal getFchecktonnum() {
        return fchecktonnum;
    }

    public void setFchecktonnum(BigDecimal fchecktonnum) {
        this.fchecktonnum = fchecktonnum;
    }

    public BigDecimal getFweighttonnum() {
        return fweighttonnum;
    }

    public void setFweighttonnum(BigDecimal fweighttonnum) {
        this.fweighttonnum = fweighttonnum;
    }

    public BigDecimal getFisweightnumd() {
        return fisweightnumd;
    }

    public void setFisweightnumd(BigDecimal fisweightnumd) {
        this.fisweightnumd = fisweightnumd;
    }

    public String getFdisbuttcodevcr() {
        return fdisbuttcodevcr;
    }

    public void setFdisbuttcodevcr(String fdisbuttcodevcr) {
        this.fdisbuttcodevcr = fdisbuttcodevcr;
    }

    public String getFdisbuttname() {
        return fdisbuttname;
    }

    public void setFdisbuttname(String fdisbuttname) {
        this.fdisbuttname = fdisbuttname;
    }

    public BigDecimal getFheavytonnum() {
        return fheavytonnum;
    }

    public void setFheavytonnum(BigDecimal fheavytonnum) {
        this.fheavytonnum = fheavytonnum;
    }

    public BigDecimal getFemptytonnum() {
        return femptytonnum;
    }

    public void setFemptytonnum(BigDecimal femptytonnum) {
        this.femptytonnum = femptytonnum;
    }

    public Date getFemptytimedtm() {
        return femptytimedtm;
    }

    public void setFemptytimedtm(Date femptytimedtm) {
        this.femptytimedtm = femptytimedtm;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getFtrainnonum2() {
        return ftrainnonum2;
    }

    public void setFtrainnonum2(String ftrainnonum2) {
        this.ftrainnonum2 = ftrainnonum2;
    }

    public BigDecimal getFvolume() {
        return fvolume;
    }

    public void setFvolume(BigDecimal fvolume) {
        this.fvolume = fvolume;
    }

    public BigDecimal getTraincount() {
        return traincount;
    }

    public void setTraincount(BigDecimal traincount) {
        this.traincount = traincount;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TVTrain{" +
        "company=" + company +
        ", ftraincodevcr=" + ftraincodevcr +
        ", ftrainordervcr=" + ftrainordervcr +
        ", farriveporttimedtm=" + farriveporttimedtm +
        ", ftrainnumnum=" + ftrainnumnum +
        ", funloadflagnum=" + funloadflagnum +
        ", fisweightnum=" + fisweightnum +
        ", fweightdtm=" + fweightdtm +
        ", fweightflag=" + fweightflag +
        ", fbelongdatetimedtm=" + fbelongdatetimedtm +
        ", isvalid=" + isvalid +
        ", ftrainordernum=" + ftrainordernum +
        ", ftrainnonum=" + ftrainnonum +
        ", fstatstastioncodenum=" + fstatstastioncodenum +
        ", fstatstastionname=" + fstatstastionname +
        ", fcoalcodevcr=" + fcoalcodevcr +
        ", fcoalname=" + fcoalname +
        ", fconsignernum=" + fconsignernum +
        ", fconsignername=" + fconsignername +
        ", fchecktonnum=" + fchecktonnum +
        ", fweighttonnum=" + fweighttonnum +
        ", fisweightnumd=" + fisweightnumd +
        ", fdisbuttcodevcr=" + fdisbuttcodevcr +
        ", fdisbuttname=" + fdisbuttname +
        ", fheavytonnum=" + fheavytonnum +
        ", femptytonnum=" + femptytonnum +
        ", femptytimedtm=" + femptytimedtm +
        ", ticketNo=" + ticketNo +
        ", ftrainnonum2=" + ftrainnonum2 +
        ", fvolume=" + fvolume +
        ", traincount=" + traincount +
        "}";
    }
}
