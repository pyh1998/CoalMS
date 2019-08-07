package com.stylefeng.guns.modular.CoalMS.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TVTrainmainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVTrainmainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrIsNull() {
            addCriterion("FTRAINCODEVCR is null");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrIsNotNull() {
            addCriterion("FTRAINCODEVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrEqualTo(String value) {
            addCriterion("FTRAINCODEVCR =", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrNotEqualTo(String value) {
            addCriterion("FTRAINCODEVCR <>", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrGreaterThan(String value) {
            addCriterion("FTRAINCODEVCR >", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrGreaterThanOrEqualTo(String value) {
            addCriterion("FTRAINCODEVCR >=", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrLessThan(String value) {
            addCriterion("FTRAINCODEVCR <", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrLessThanOrEqualTo(String value) {
            addCriterion("FTRAINCODEVCR <=", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrLike(String value) {
            addCriterion("FTRAINCODEVCR like", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrNotLike(String value) {
            addCriterion("FTRAINCODEVCR not like", value, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrIn(List<String> values) {
            addCriterion("FTRAINCODEVCR in", values, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrNotIn(List<String> values) {
            addCriterion("FTRAINCODEVCR not in", values, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrBetween(String value1, String value2) {
            addCriterion("FTRAINCODEVCR between", value1, value2, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtraincodevcrNotBetween(String value1, String value2) {
            addCriterion("FTRAINCODEVCR not between", value1, value2, "ftraincodevcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrIsNull() {
            addCriterion("FTRAINORDERVCR is null");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrIsNotNull() {
            addCriterion("FTRAINORDERVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrEqualTo(String value) {
            addCriterion("FTRAINORDERVCR =", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrNotEqualTo(String value) {
            addCriterion("FTRAINORDERVCR <>", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrGreaterThan(String value) {
            addCriterion("FTRAINORDERVCR >", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrGreaterThanOrEqualTo(String value) {
            addCriterion("FTRAINORDERVCR >=", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrLessThan(String value) {
            addCriterion("FTRAINORDERVCR <", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrLessThanOrEqualTo(String value) {
            addCriterion("FTRAINORDERVCR <=", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrLike(String value) {
            addCriterion("FTRAINORDERVCR like", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrNotLike(String value) {
            addCriterion("FTRAINORDERVCR not like", value, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrIn(List<String> values) {
            addCriterion("FTRAINORDERVCR in", values, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrNotIn(List<String> values) {
            addCriterion("FTRAINORDERVCR not in", values, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrBetween(String value1, String value2) {
            addCriterion("FTRAINORDERVCR between", value1, value2, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFtrainordervcrNotBetween(String value1, String value2) {
            addCriterion("FTRAINORDERVCR not between", value1, value2, "ftrainordervcr");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmIsNull() {
            addCriterion("FARRIVEPORTTIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmIsNotNull() {
            addCriterion("FARRIVEPORTTIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM =", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM <>", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM >", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM >=", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM <", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM <=", value, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM in", values, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM not in", values, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM between", value1, value2, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFarriveporttimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FARRIVEPORTTIMEDTM not between", value1, value2, "farriveporttimedtm");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumIsNull() {
            addCriterion("FTRAINNUMNUM is null");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumIsNotNull() {
            addCriterion("FTRAINNUMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumEqualTo(String value) {
            addCriterion("FTRAINNUMNUM =", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumNotEqualTo(String value) {
            addCriterion("FTRAINNUMNUM <>", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumGreaterThan(String value) {
            addCriterion("FTRAINNUMNUM >", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumGreaterThanOrEqualTo(String value) {
            addCriterion("FTRAINNUMNUM >=", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumLessThan(String value) {
            addCriterion("FTRAINNUMNUM <", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumLessThanOrEqualTo(String value) {
            addCriterion("FTRAINNUMNUM <=", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumLike(String value) {
            addCriterion("FTRAINNUMNUM like", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumNotLike(String value) {
            addCriterion("FTRAINNUMNUM not like", value, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumIn(List<String> values) {
            addCriterion("FTRAINNUMNUM in", values, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumNotIn(List<String> values) {
            addCriterion("FTRAINNUMNUM not in", values, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumBetween(String value1, String value2) {
            addCriterion("FTRAINNUMNUM between", value1, value2, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFtrainnumnumNotBetween(String value1, String value2) {
            addCriterion("FTRAINNUMNUM not between", value1, value2, "ftrainnumnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumIsNull() {
            addCriterion("FUNLOADFLAGNUM is null");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumIsNotNull() {
            addCriterion("FUNLOADFLAGNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumEqualTo(Short value) {
            addCriterion("FUNLOADFLAGNUM =", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumNotEqualTo(Short value) {
            addCriterion("FUNLOADFLAGNUM <>", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumGreaterThan(Short value) {
            addCriterion("FUNLOADFLAGNUM >", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumGreaterThanOrEqualTo(Short value) {
            addCriterion("FUNLOADFLAGNUM >=", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumLessThan(Short value) {
            addCriterion("FUNLOADFLAGNUM <", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumLessThanOrEqualTo(Short value) {
            addCriterion("FUNLOADFLAGNUM <=", value, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumIn(List<Short> values) {
            addCriterion("FUNLOADFLAGNUM in", values, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumNotIn(List<Short> values) {
            addCriterion("FUNLOADFLAGNUM not in", values, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumBetween(Short value1, Short value2) {
            addCriterion("FUNLOADFLAGNUM between", value1, value2, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFunloadflagnumNotBetween(Short value1, Short value2) {
            addCriterion("FUNLOADFLAGNUM not between", value1, value2, "funloadflagnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumIsNull() {
            addCriterion("FISWEIGHTNUM is null");
            return (Criteria) this;
        }

        public Criteria andFisweightnumIsNotNull() {
            addCriterion("FISWEIGHTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFisweightnumEqualTo(Short value) {
            addCriterion("FISWEIGHTNUM =", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumNotEqualTo(Short value) {
            addCriterion("FISWEIGHTNUM <>", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumGreaterThan(Short value) {
            addCriterion("FISWEIGHTNUM >", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumGreaterThanOrEqualTo(Short value) {
            addCriterion("FISWEIGHTNUM >=", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumLessThan(Short value) {
            addCriterion("FISWEIGHTNUM <", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumLessThanOrEqualTo(Short value) {
            addCriterion("FISWEIGHTNUM <=", value, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumIn(List<Short> values) {
            addCriterion("FISWEIGHTNUM in", values, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumNotIn(List<Short> values) {
            addCriterion("FISWEIGHTNUM not in", values, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumBetween(Short value1, Short value2) {
            addCriterion("FISWEIGHTNUM between", value1, value2, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumNotBetween(Short value1, Short value2) {
            addCriterion("FISWEIGHTNUM not between", value1, value2, "fisweightnum");
            return (Criteria) this;
        }

        public Criteria andFweightdtmIsNull() {
            addCriterion("FWEIGHTDTM is null");
            return (Criteria) this;
        }

        public Criteria andFweightdtmIsNotNull() {
            addCriterion("FWEIGHTDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFweightdtmEqualTo(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM =", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM <>", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM >", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM >=", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmLessThan(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM <", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FWEIGHTDTM <=", value, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmIn(List<Date> values) {
            addCriterionForJDBCDate("FWEIGHTDTM in", values, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FWEIGHTDTM not in", values, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FWEIGHTDTM between", value1, value2, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightdtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FWEIGHTDTM not between", value1, value2, "fweightdtm");
            return (Criteria) this;
        }

        public Criteria andFweightflagIsNull() {
            addCriterion("FWEIGHTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFweightflagIsNotNull() {
            addCriterion("FWEIGHTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFweightflagEqualTo(String value) {
            addCriterion("FWEIGHTFLAG =", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagNotEqualTo(String value) {
            addCriterion("FWEIGHTFLAG <>", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagGreaterThan(String value) {
            addCriterion("FWEIGHTFLAG >", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagGreaterThanOrEqualTo(String value) {
            addCriterion("FWEIGHTFLAG >=", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagLessThan(String value) {
            addCriterion("FWEIGHTFLAG <", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagLessThanOrEqualTo(String value) {
            addCriterion("FWEIGHTFLAG <=", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagLike(String value) {
            addCriterion("FWEIGHTFLAG like", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagNotLike(String value) {
            addCriterion("FWEIGHTFLAG not like", value, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagIn(List<String> values) {
            addCriterion("FWEIGHTFLAG in", values, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagNotIn(List<String> values) {
            addCriterion("FWEIGHTFLAG not in", values, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagBetween(String value1, String value2) {
            addCriterion("FWEIGHTFLAG between", value1, value2, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFweightflagNotBetween(String value1, String value2) {
            addCriterion("FWEIGHTFLAG not between", value1, value2, "fweightflag");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmIsNull() {
            addCriterion("FBELONGDATETIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmIsNotNull() {
            addCriterion("FBELONGDATETIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM =", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM <>", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM >", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM >=", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM <", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM <=", value, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM in", values, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM not in", values, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM between", value1, value2, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andFbelongdatetimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBELONGDATETIMEDTM not between", value1, value2, "fbelongdatetimedtm");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("ISVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("ISVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Long value) {
            addCriterion("ISVALID =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Long value) {
            addCriterion("ISVALID <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Long value) {
            addCriterion("ISVALID >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Long value) {
            addCriterion("ISVALID >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Long value) {
            addCriterion("ISVALID <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Long value) {
            addCriterion("ISVALID <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Long> values) {
            addCriterion("ISVALID in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Long> values) {
            addCriterion("ISVALID not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Long value1, Long value2) {
            addCriterion("ISVALID between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Long value1, Long value2) {
            addCriterion("ISVALID not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumIsNull() {
            addCriterion("FHEAVYTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumIsNotNull() {
            addCriterion("FHEAVYTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumEqualTo(Long value) {
            addCriterion("FHEAVYTONNUM =", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotEqualTo(Long value) {
            addCriterion("FHEAVYTONNUM <>", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumGreaterThan(Long value) {
            addCriterion("FHEAVYTONNUM >", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FHEAVYTONNUM >=", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumLessThan(Long value) {
            addCriterion("FHEAVYTONNUM <", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumLessThanOrEqualTo(Long value) {
            addCriterion("FHEAVYTONNUM <=", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumIn(List<Long> values) {
            addCriterion("FHEAVYTONNUM in", values, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotIn(List<Long> values) {
            addCriterion("FHEAVYTONNUM not in", values, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumBetween(Long value1, Long value2) {
            addCriterion("FHEAVYTONNUM between", value1, value2, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotBetween(Long value1, Long value2) {
            addCriterion("FHEAVYTONNUM not between", value1, value2, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumIsNull() {
            addCriterion("FEMPTYTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumIsNotNull() {
            addCriterion("FEMPTYTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumEqualTo(Long value) {
            addCriterion("FEMPTYTONNUM =", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotEqualTo(Long value) {
            addCriterion("FEMPTYTONNUM <>", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumGreaterThan(Long value) {
            addCriterion("FEMPTYTONNUM >", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FEMPTYTONNUM >=", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumLessThan(Long value) {
            addCriterion("FEMPTYTONNUM <", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumLessThanOrEqualTo(Long value) {
            addCriterion("FEMPTYTONNUM <=", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumIn(List<Long> values) {
            addCriterion("FEMPTYTONNUM in", values, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotIn(List<Long> values) {
            addCriterion("FEMPTYTONNUM not in", values, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumBetween(Long value1, Long value2) {
            addCriterion("FEMPTYTONNUM between", value1, value2, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotBetween(Long value1, Long value2) {
            addCriterion("FEMPTYTONNUM not between", value1, value2, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumIsNull() {
            addCriterion("FWEIGHTTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumIsNotNull() {
            addCriterion("FWEIGHTTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumEqualTo(Long value) {
            addCriterion("FWEIGHTTONNUM =", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotEqualTo(Long value) {
            addCriterion("FWEIGHTTONNUM <>", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumGreaterThan(Long value) {
            addCriterion("FWEIGHTTONNUM >", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FWEIGHTTONNUM >=", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumLessThan(Long value) {
            addCriterion("FWEIGHTTONNUM <", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumLessThanOrEqualTo(Long value) {
            addCriterion("FWEIGHTTONNUM <=", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumIn(List<Long> values) {
            addCriterion("FWEIGHTTONNUM in", values, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotIn(List<Long> values) {
            addCriterion("FWEIGHTTONNUM not in", values, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumBetween(Long value1, Long value2) {
            addCriterion("FWEIGHTTONNUM between", value1, value2, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotBetween(Long value1, Long value2) {
            addCriterion("FWEIGHTTONNUM not between", value1, value2, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumIsNull() {
            addCriterion("FCHECKTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumIsNotNull() {
            addCriterion("FCHECKTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumEqualTo(Long value) {
            addCriterion("FCHECKTONNUM =", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotEqualTo(Long value) {
            addCriterion("FCHECKTONNUM <>", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumGreaterThan(Long value) {
            addCriterion("FCHECKTONNUM >", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FCHECKTONNUM >=", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumLessThan(Long value) {
            addCriterion("FCHECKTONNUM <", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumLessThanOrEqualTo(Long value) {
            addCriterion("FCHECKTONNUM <=", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumIn(List<Long> values) {
            addCriterion("FCHECKTONNUM in", values, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotIn(List<Long> values) {
            addCriterion("FCHECKTONNUM not in", values, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumBetween(Long value1, Long value2) {
            addCriterion("FCHECKTONNUM between", value1, value2, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotBetween(Long value1, Long value2) {
            addCriterion("FCHECKTONNUM not between", value1, value2, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andTraincountIsNull() {
            addCriterion("TRAINCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTraincountIsNotNull() {
            addCriterion("TRAINCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTraincountEqualTo(Long value) {
            addCriterion("TRAINCOUNT =", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountNotEqualTo(Long value) {
            addCriterion("TRAINCOUNT <>", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountGreaterThan(Long value) {
            addCriterion("TRAINCOUNT >", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountGreaterThanOrEqualTo(Long value) {
            addCriterion("TRAINCOUNT >=", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountLessThan(Long value) {
            addCriterion("TRAINCOUNT <", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountLessThanOrEqualTo(Long value) {
            addCriterion("TRAINCOUNT <=", value, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountIn(List<Long> values) {
            addCriterion("TRAINCOUNT in", values, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountNotIn(List<Long> values) {
            addCriterion("TRAINCOUNT not in", values, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountBetween(Long value1, Long value2) {
            addCriterion("TRAINCOUNT between", value1, value2, "traincount");
            return (Criteria) this;
        }

        public Criteria andTraincountNotBetween(Long value1, Long value2) {
            addCriterion("TRAINCOUNT not between", value1, value2, "traincount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}