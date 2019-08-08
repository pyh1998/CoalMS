package com.stylefeng.guns.modular.CoalMS.model;


import java.util.Date;

public class TVTrainmain {
    private String company;

    private String ftraincodevcr;

    private String ftrainordervcr;

    private Date farriveporttimedtm;

    private String ftrainnumnum;

    private Short funloadflagnum;

    private Short fisweightnum;

    private Date fweightdtm;

    private String fweightflag;

    private Date fbelongdatetimedtm;

    private Long isvalid;

    private Long fheavytonnum;

    private Long femptytonnum;

    private Long fweighttonnum;

    private Long fchecktonnum;

    private Long traincount;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getFtraincodevcr() {
        return ftraincodevcr;
    }

    public void setFtraincodevcr(String ftraincodevcr) {
        this.ftraincodevcr = ftraincodevcr == null ? null : ftraincodevcr.trim();
    }

    public String getFtrainordervcr() {
        return ftrainordervcr;
    }

    public void setFtrainordervcr(String ftrainordervcr) {
        this.ftrainordervcr = ftrainordervcr == null ? null : ftrainordervcr.trim();
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
        this.ftrainnumnum = ftrainnumnum == null ? null : ftrainnumnum.trim();
    }

    public Short getFunloadflagnum() {
        return funloadflagnum;
    }

    public void setFunloadflagnum(Short funloadflagnum) {
        this.funloadflagnum = funloadflagnum;
    }

    public Short getFisweightnum() {
        return fisweightnum;
    }

    public void setFisweightnum(Short fisweightnum) {
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
        this.fweightflag = fweightflag == null ? null : fweightflag.trim();
    }

    public Date getFbelongdatetimedtm() {
        return fbelongdatetimedtm;
    }

    public void setFbelongdatetimedtm(Date fbelongdatetimedtm) {
        this.fbelongdatetimedtm = fbelongdatetimedtm;
    }

    public Long getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Long isvalid) {
        this.isvalid = isvalid;
    }

    public Long getFheavytonnum() {
        return fheavytonnum;
    }

    public void setFheavytonnum(Long fheavytonnum) {
        this.fheavytonnum = fheavytonnum;
    }

    public Long getFemptytonnum() {
        return femptytonnum;
    }

    public void setFemptytonnum(Long femptytonnum) {
        this.femptytonnum = femptytonnum;
    }

    public Long getFweighttonnum() {
        return fweighttonnum;
    }

    public void setFweighttonnum(Long fweighttonnum) {
        this.fweighttonnum = fweighttonnum;
    }

    public Long getFchecktonnum() {
        return fchecktonnum;
    }

    public void setFchecktonnum(Long fchecktonnum) {
        this.fchecktonnum = fchecktonnum;
    }

    public Long getTraincount() {
        return traincount;
    }

    public void setTraincount(Long traincount) {
        this.traincount = traincount;
    }
}