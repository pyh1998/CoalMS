package com.stylefeng.guns.modular.system.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TVTrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVTrainExample() {
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

        public Criteria andFtrainordernumIsNull() {
            addCriterion("FTRAINORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumIsNotNull() {
            addCriterion("FTRAINORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumEqualTo(Short value) {
            addCriterion("FTRAINORDERNUM =", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumNotEqualTo(Short value) {
            addCriterion("FTRAINORDERNUM <>", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumGreaterThan(Short value) {
            addCriterion("FTRAINORDERNUM >", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumGreaterThanOrEqualTo(Short value) {
            addCriterion("FTRAINORDERNUM >=", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumLessThan(Short value) {
            addCriterion("FTRAINORDERNUM <", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumLessThanOrEqualTo(Short value) {
            addCriterion("FTRAINORDERNUM <=", value, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumIn(List<Short> values) {
            addCriterion("FTRAINORDERNUM in", values, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumNotIn(List<Short> values) {
            addCriterion("FTRAINORDERNUM not in", values, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumBetween(Short value1, Short value2) {
            addCriterion("FTRAINORDERNUM between", value1, value2, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainordernumNotBetween(Short value1, Short value2) {
            addCriterion("FTRAINORDERNUM not between", value1, value2, "ftrainordernum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumIsNull() {
            addCriterion("FTRAINNONUM is null");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumIsNotNull() {
            addCriterion("FTRAINNONUM is not null");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumEqualTo(String value) {
            addCriterion("FTRAINNONUM =", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumNotEqualTo(String value) {
            addCriterion("FTRAINNONUM <>", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumGreaterThan(String value) {
            addCriterion("FTRAINNONUM >", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumGreaterThanOrEqualTo(String value) {
            addCriterion("FTRAINNONUM >=", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumLessThan(String value) {
            addCriterion("FTRAINNONUM <", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumLessThanOrEqualTo(String value) {
            addCriterion("FTRAINNONUM <=", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumLike(String value) {
            addCriterion("FTRAINNONUM like", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumNotLike(String value) {
            addCriterion("FTRAINNONUM not like", value, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumIn(List<String> values) {
            addCriterion("FTRAINNONUM in", values, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumNotIn(List<String> values) {
            addCriterion("FTRAINNONUM not in", values, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumBetween(String value1, String value2) {
            addCriterion("FTRAINNONUM between", value1, value2, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFtrainnonumNotBetween(String value1, String value2) {
            addCriterion("FTRAINNONUM not between", value1, value2, "ftrainnonum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumIsNull() {
            addCriterion("FSTATSTASTIONCODENUM is null");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumIsNotNull() {
            addCriterion("FSTATSTASTIONCODENUM is not null");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumEqualTo(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM =", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumNotEqualTo(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM <>", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumGreaterThan(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM >", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM >=", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumLessThan(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM <", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumLessThanOrEqualTo(Integer value) {
            addCriterion("FSTATSTASTIONCODENUM <=", value, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumIn(List<Integer> values) {
            addCriterion("FSTATSTASTIONCODENUM in", values, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumNotIn(List<Integer> values) {
            addCriterion("FSTATSTASTIONCODENUM not in", values, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumBetween(Integer value1, Integer value2) {
            addCriterion("FSTATSTASTIONCODENUM between", value1, value2, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastioncodenumNotBetween(Integer value1, Integer value2) {
            addCriterion("FSTATSTASTIONCODENUM not between", value1, value2, "fstatstastioncodenum");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameIsNull() {
            addCriterion("FSTATSTASTIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameIsNotNull() {
            addCriterion("FSTATSTASTIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameEqualTo(String value) {
            addCriterion("FSTATSTASTIONNAME =", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameNotEqualTo(String value) {
            addCriterion("FSTATSTASTIONNAME <>", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameGreaterThan(String value) {
            addCriterion("FSTATSTASTIONNAME >", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FSTATSTASTIONNAME >=", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameLessThan(String value) {
            addCriterion("FSTATSTASTIONNAME <", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameLessThanOrEqualTo(String value) {
            addCriterion("FSTATSTASTIONNAME <=", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameLike(String value) {
            addCriterion("FSTATSTASTIONNAME like", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameNotLike(String value) {
            addCriterion("FSTATSTASTIONNAME not like", value, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameIn(List<String> values) {
            addCriterion("FSTATSTASTIONNAME in", values, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameNotIn(List<String> values) {
            addCriterion("FSTATSTASTIONNAME not in", values, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameBetween(String value1, String value2) {
            addCriterion("FSTATSTASTIONNAME between", value1, value2, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFstatstastionnameNotBetween(String value1, String value2) {
            addCriterion("FSTATSTASTIONNAME not between", value1, value2, "fstatstastionname");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrIsNull() {
            addCriterion("FCOALCODEVCR is null");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrIsNotNull() {
            addCriterion("FCOALCODEVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrEqualTo(String value) {
            addCriterion("FCOALCODEVCR =", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrNotEqualTo(String value) {
            addCriterion("FCOALCODEVCR <>", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrGreaterThan(String value) {
            addCriterion("FCOALCODEVCR >", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrGreaterThanOrEqualTo(String value) {
            addCriterion("FCOALCODEVCR >=", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrLessThan(String value) {
            addCriterion("FCOALCODEVCR <", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrLessThanOrEqualTo(String value) {
            addCriterion("FCOALCODEVCR <=", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrLike(String value) {
            addCriterion("FCOALCODEVCR like", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrNotLike(String value) {
            addCriterion("FCOALCODEVCR not like", value, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrIn(List<String> values) {
            addCriterion("FCOALCODEVCR in", values, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrNotIn(List<String> values) {
            addCriterion("FCOALCODEVCR not in", values, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrBetween(String value1, String value2) {
            addCriterion("FCOALCODEVCR between", value1, value2, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcodevcrNotBetween(String value1, String value2) {
            addCriterion("FCOALCODEVCR not between", value1, value2, "fcoalcodevcr");
            return (Criteria) this;
        }

        public Criteria andFcoalnameIsNull() {
            addCriterion("FCOALNAME is null");
            return (Criteria) this;
        }

        public Criteria andFcoalnameIsNotNull() {
            addCriterion("FCOALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalnameEqualTo(String value) {
            addCriterion("FCOALNAME =", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameNotEqualTo(String value) {
            addCriterion("FCOALNAME <>", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameGreaterThan(String value) {
            addCriterion("FCOALNAME >", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameGreaterThanOrEqualTo(String value) {
            addCriterion("FCOALNAME >=", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameLessThan(String value) {
            addCriterion("FCOALNAME <", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameLessThanOrEqualTo(String value) {
            addCriterion("FCOALNAME <=", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameLike(String value) {
            addCriterion("FCOALNAME like", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameNotLike(String value) {
            addCriterion("FCOALNAME not like", value, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameIn(List<String> values) {
            addCriterion("FCOALNAME in", values, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameNotIn(List<String> values) {
            addCriterion("FCOALNAME not in", values, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameBetween(String value1, String value2) {
            addCriterion("FCOALNAME between", value1, value2, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFcoalnameNotBetween(String value1, String value2) {
            addCriterion("FCOALNAME not between", value1, value2, "fcoalname");
            return (Criteria) this;
        }

        public Criteria andFconsignernumIsNull() {
            addCriterion("FCONSIGNERNUM is null");
            return (Criteria) this;
        }

        public Criteria andFconsignernumIsNotNull() {
            addCriterion("FCONSIGNERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFconsignernumEqualTo(Integer value) {
            addCriterion("FCONSIGNERNUM =", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumNotEqualTo(Integer value) {
            addCriterion("FCONSIGNERNUM <>", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumGreaterThan(Integer value) {
            addCriterion("FCONSIGNERNUM >", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCONSIGNERNUM >=", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumLessThan(Integer value) {
            addCriterion("FCONSIGNERNUM <", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumLessThanOrEqualTo(Integer value) {
            addCriterion("FCONSIGNERNUM <=", value, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumIn(List<Integer> values) {
            addCriterion("FCONSIGNERNUM in", values, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumNotIn(List<Integer> values) {
            addCriterion("FCONSIGNERNUM not in", values, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumBetween(Integer value1, Integer value2) {
            addCriterion("FCONSIGNERNUM between", value1, value2, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernumNotBetween(Integer value1, Integer value2) {
            addCriterion("FCONSIGNERNUM not between", value1, value2, "fconsignernum");
            return (Criteria) this;
        }

        public Criteria andFconsignernameIsNull() {
            addCriterion("FCONSIGNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andFconsignernameIsNotNull() {
            addCriterion("FCONSIGNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFconsignernameEqualTo(String value) {
            addCriterion("FCONSIGNERNAME =", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameNotEqualTo(String value) {
            addCriterion("FCONSIGNERNAME <>", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameGreaterThan(String value) {
            addCriterion("FCONSIGNERNAME >", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameGreaterThanOrEqualTo(String value) {
            addCriterion("FCONSIGNERNAME >=", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameLessThan(String value) {
            addCriterion("FCONSIGNERNAME <", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameLessThanOrEqualTo(String value) {
            addCriterion("FCONSIGNERNAME <=", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameLike(String value) {
            addCriterion("FCONSIGNERNAME like", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameNotLike(String value) {
            addCriterion("FCONSIGNERNAME not like", value, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameIn(List<String> values) {
            addCriterion("FCONSIGNERNAME in", values, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameNotIn(List<String> values) {
            addCriterion("FCONSIGNERNAME not in", values, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameBetween(String value1, String value2) {
            addCriterion("FCONSIGNERNAME between", value1, value2, "fconsignername");
            return (Criteria) this;
        }

        public Criteria andFconsignernameNotBetween(String value1, String value2) {
            addCriterion("FCONSIGNERNAME not between", value1, value2, "fconsignername");
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

        public Criteria andFchecktonnumEqualTo(BigDecimal value) {
            addCriterion("FCHECKTONNUM =", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotEqualTo(BigDecimal value) {
            addCriterion("FCHECKTONNUM <>", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumGreaterThan(BigDecimal value) {
            addCriterion("FCHECKTONNUM >", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FCHECKTONNUM >=", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumLessThan(BigDecimal value) {
            addCriterion("FCHECKTONNUM <", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FCHECKTONNUM <=", value, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumIn(List<BigDecimal> values) {
            addCriterion("FCHECKTONNUM in", values, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotIn(List<BigDecimal> values) {
            addCriterion("FCHECKTONNUM not in", values, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCHECKTONNUM between", value1, value2, "fchecktonnum");
            return (Criteria) this;
        }

        public Criteria andFchecktonnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCHECKTONNUM not between", value1, value2, "fchecktonnum");
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

        public Criteria andFweighttonnumEqualTo(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM =", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotEqualTo(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM <>", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumGreaterThan(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM >", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM >=", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumLessThan(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM <", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FWEIGHTTONNUM <=", value, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumIn(List<BigDecimal> values) {
            addCriterion("FWEIGHTTONNUM in", values, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotIn(List<BigDecimal> values) {
            addCriterion("FWEIGHTTONNUM not in", values, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWEIGHTTONNUM between", value1, value2, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFweighttonnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWEIGHTTONNUM not between", value1, value2, "fweighttonnum");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdIsNull() {
            addCriterion("FISWEIGHTNUMD is null");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdIsNotNull() {
            addCriterion("FISWEIGHTNUMD is not null");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdEqualTo(Short value) {
            addCriterion("FISWEIGHTNUMD =", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdNotEqualTo(Short value) {
            addCriterion("FISWEIGHTNUMD <>", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdGreaterThan(Short value) {
            addCriterion("FISWEIGHTNUMD >", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdGreaterThanOrEqualTo(Short value) {
            addCriterion("FISWEIGHTNUMD >=", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdLessThan(Short value) {
            addCriterion("FISWEIGHTNUMD <", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdLessThanOrEqualTo(Short value) {
            addCriterion("FISWEIGHTNUMD <=", value, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdIn(List<Short> values) {
            addCriterion("FISWEIGHTNUMD in", values, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdNotIn(List<Short> values) {
            addCriterion("FISWEIGHTNUMD not in", values, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdBetween(Short value1, Short value2) {
            addCriterion("FISWEIGHTNUMD between", value1, value2, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFisweightnumdNotBetween(Short value1, Short value2) {
            addCriterion("FISWEIGHTNUMD not between", value1, value2, "fisweightnumd");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrIsNull() {
            addCriterion("FDISBUTTCODEVCR is null");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrIsNotNull() {
            addCriterion("FDISBUTTCODEVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrEqualTo(String value) {
            addCriterion("FDISBUTTCODEVCR =", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrNotEqualTo(String value) {
            addCriterion("FDISBUTTCODEVCR <>", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrGreaterThan(String value) {
            addCriterion("FDISBUTTCODEVCR >", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrGreaterThanOrEqualTo(String value) {
            addCriterion("FDISBUTTCODEVCR >=", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrLessThan(String value) {
            addCriterion("FDISBUTTCODEVCR <", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrLessThanOrEqualTo(String value) {
            addCriterion("FDISBUTTCODEVCR <=", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrLike(String value) {
            addCriterion("FDISBUTTCODEVCR like", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrNotLike(String value) {
            addCriterion("FDISBUTTCODEVCR not like", value, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrIn(List<String> values) {
            addCriterion("FDISBUTTCODEVCR in", values, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrNotIn(List<String> values) {
            addCriterion("FDISBUTTCODEVCR not in", values, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrBetween(String value1, String value2) {
            addCriterion("FDISBUTTCODEVCR between", value1, value2, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttcodevcrNotBetween(String value1, String value2) {
            addCriterion("FDISBUTTCODEVCR not between", value1, value2, "fdisbuttcodevcr");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameIsNull() {
            addCriterion("FDISBUTTNAME is null");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameIsNotNull() {
            addCriterion("FDISBUTTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameEqualTo(String value) {
            addCriterion("FDISBUTTNAME =", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameNotEqualTo(String value) {
            addCriterion("FDISBUTTNAME <>", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameGreaterThan(String value) {
            addCriterion("FDISBUTTNAME >", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameGreaterThanOrEqualTo(String value) {
            addCriterion("FDISBUTTNAME >=", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameLessThan(String value) {
            addCriterion("FDISBUTTNAME <", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameLessThanOrEqualTo(String value) {
            addCriterion("FDISBUTTNAME <=", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameLike(String value) {
            addCriterion("FDISBUTTNAME like", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameNotLike(String value) {
            addCriterion("FDISBUTTNAME not like", value, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameIn(List<String> values) {
            addCriterion("FDISBUTTNAME in", values, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameNotIn(List<String> values) {
            addCriterion("FDISBUTTNAME not in", values, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameBetween(String value1, String value2) {
            addCriterion("FDISBUTTNAME between", value1, value2, "fdisbuttname");
            return (Criteria) this;
        }

        public Criteria andFdisbuttnameNotBetween(String value1, String value2) {
            addCriterion("FDISBUTTNAME not between", value1, value2, "fdisbuttname");
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

        public Criteria andFheavytonnumEqualTo(BigDecimal value) {
            addCriterion("FHEAVYTONNUM =", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotEqualTo(BigDecimal value) {
            addCriterion("FHEAVYTONNUM <>", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumGreaterThan(BigDecimal value) {
            addCriterion("FHEAVYTONNUM >", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FHEAVYTONNUM >=", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumLessThan(BigDecimal value) {
            addCriterion("FHEAVYTONNUM <", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FHEAVYTONNUM <=", value, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumIn(List<BigDecimal> values) {
            addCriterion("FHEAVYTONNUM in", values, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotIn(List<BigDecimal> values) {
            addCriterion("FHEAVYTONNUM not in", values, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FHEAVYTONNUM between", value1, value2, "fheavytonnum");
            return (Criteria) this;
        }

        public Criteria andFheavytonnumNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFemptytonnumEqualTo(BigDecimal value) {
            addCriterion("FEMPTYTONNUM =", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotEqualTo(BigDecimal value) {
            addCriterion("FEMPTYTONNUM <>", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumGreaterThan(BigDecimal value) {
            addCriterion("FEMPTYTONNUM >", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEMPTYTONNUM >=", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumLessThan(BigDecimal value) {
            addCriterion("FEMPTYTONNUM <", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEMPTYTONNUM <=", value, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumIn(List<BigDecimal> values) {
            addCriterion("FEMPTYTONNUM in", values, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotIn(List<BigDecimal> values) {
            addCriterion("FEMPTYTONNUM not in", values, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEMPTYTONNUM between", value1, value2, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytonnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEMPTYTONNUM not between", value1, value2, "femptytonnum");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmIsNull() {
            addCriterion("FEMPTYTIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmIsNotNull() {
            addCriterion("FEMPTYTIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM =", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM <>", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM >", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM >=", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM <", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM <=", value, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM in", values, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM not in", values, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM between", value1, value2, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andFemptytimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FEMPTYTIMEDTM not between", value1, value2, "femptytimedtm");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNull() {
            addCriterion("TICKET_NO is null");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNotNull() {
            addCriterion("TICKET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNoEqualTo(String value) {
            addCriterion("TICKET_NO =", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotEqualTo(String value) {
            addCriterion("TICKET_NO <>", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThan(String value) {
            addCriterion("TICKET_NO >", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_NO >=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThan(String value) {
            addCriterion("TICKET_NO <", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThanOrEqualTo(String value) {
            addCriterion("TICKET_NO <=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLike(String value) {
            addCriterion("TICKET_NO like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotLike(String value) {
            addCriterion("TICKET_NO not like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoIn(List<String> values) {
            addCriterion("TICKET_NO in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotIn(List<String> values) {
            addCriterion("TICKET_NO not in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoBetween(String value1, String value2) {
            addCriterion("TICKET_NO between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotBetween(String value1, String value2) {
            addCriterion("TICKET_NO not between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2IsNull() {
            addCriterion("FTRAINNONUM2 is null");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2IsNotNull() {
            addCriterion("FTRAINNONUM2 is not null");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2EqualTo(String value) {
            addCriterion("FTRAINNONUM2 =", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2NotEqualTo(String value) {
            addCriterion("FTRAINNONUM2 <>", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2GreaterThan(String value) {
            addCriterion("FTRAINNONUM2 >", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2GreaterThanOrEqualTo(String value) {
            addCriterion("FTRAINNONUM2 >=", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2LessThan(String value) {
            addCriterion("FTRAINNONUM2 <", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2LessThanOrEqualTo(String value) {
            addCriterion("FTRAINNONUM2 <=", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2Like(String value) {
            addCriterion("FTRAINNONUM2 like", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2NotLike(String value) {
            addCriterion("FTRAINNONUM2 not like", value, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2In(List<String> values) {
            addCriterion("FTRAINNONUM2 in", values, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2NotIn(List<String> values) {
            addCriterion("FTRAINNONUM2 not in", values, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2Between(String value1, String value2) {
            addCriterion("FTRAINNONUM2 between", value1, value2, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFtrainnonum2NotBetween(String value1, String value2) {
            addCriterion("FTRAINNONUM2 not between", value1, value2, "ftrainnonum2");
            return (Criteria) this;
        }

        public Criteria andFvolumeIsNull() {
            addCriterion("FVOLUME is null");
            return (Criteria) this;
        }

        public Criteria andFvolumeIsNotNull() {
            addCriterion("FVOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andFvolumeEqualTo(Long value) {
            addCriterion("FVOLUME =", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeNotEqualTo(Long value) {
            addCriterion("FVOLUME <>", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeGreaterThan(Long value) {
            addCriterion("FVOLUME >", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("FVOLUME >=", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeLessThan(Long value) {
            addCriterion("FVOLUME <", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeLessThanOrEqualTo(Long value) {
            addCriterion("FVOLUME <=", value, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeIn(List<Long> values) {
            addCriterion("FVOLUME in", values, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeNotIn(List<Long> values) {
            addCriterion("FVOLUME not in", values, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeBetween(Long value1, Long value2) {
            addCriterion("FVOLUME between", value1, value2, "fvolume");
            return (Criteria) this;
        }

        public Criteria andFvolumeNotBetween(Long value1, Long value2) {
            addCriterion("FVOLUME not between", value1, value2, "fvolume");
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