package com.stylefeng.guns.modular.CoalMS.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TVShipmainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVShipmainExample() {
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

        public Criteria andFshipyearnumvcrIsNull() {
            addCriterion("FSHIPYEARNUMVCR is null");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrIsNotNull() {
            addCriterion("FSHIPYEARNUMVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrEqualTo(String value) {
            addCriterion("FSHIPYEARNUMVCR =", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrNotEqualTo(String value) {
            addCriterion("FSHIPYEARNUMVCR <>", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrGreaterThan(String value) {
            addCriterion("FSHIPYEARNUMVCR >", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrGreaterThanOrEqualTo(String value) {
            addCriterion("FSHIPYEARNUMVCR >=", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrLessThan(String value) {
            addCriterion("FSHIPYEARNUMVCR <", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrLessThanOrEqualTo(String value) {
            addCriterion("FSHIPYEARNUMVCR <=", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrLike(String value) {
            addCriterion("FSHIPYEARNUMVCR like", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrNotLike(String value) {
            addCriterion("FSHIPYEARNUMVCR not like", value, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrIn(List<String> values) {
            addCriterion("FSHIPYEARNUMVCR in", values, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrNotIn(List<String> values) {
            addCriterion("FSHIPYEARNUMVCR not in", values, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrBetween(String value1, String value2) {
            addCriterion("FSHIPYEARNUMVCR between", value1, value2, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipyearnumvcrNotBetween(String value1, String value2) {
            addCriterion("FSHIPYEARNUMVCR not between", value1, value2, "fshipyearnumvcr");
            return (Criteria) this;
        }

        public Criteria andFshipordernumIsNull() {
            addCriterion("FSHIPORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andFshipordernumIsNotNull() {
            addCriterion("FSHIPORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFshipordernumEqualTo(Long value) {
            addCriterion("FSHIPORDERNUM =", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumNotEqualTo(Long value) {
            addCriterion("FSHIPORDERNUM <>", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumGreaterThan(Long value) {
            addCriterion("FSHIPORDERNUM >", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumGreaterThanOrEqualTo(Long value) {
            addCriterion("FSHIPORDERNUM >=", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumLessThan(Long value) {
            addCriterion("FSHIPORDERNUM <", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumLessThanOrEqualTo(Long value) {
            addCriterion("FSHIPORDERNUM <=", value, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumIn(List<Long> values) {
            addCriterion("FSHIPORDERNUM in", values, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumNotIn(List<Long> values) {
            addCriterion("FSHIPORDERNUM not in", values, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumBetween(Long value1, Long value2) {
            addCriterion("FSHIPORDERNUM between", value1, value2, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFshipordernumNotBetween(Long value1, Long value2) {
            addCriterion("FSHIPORDERNUM not between", value1, value2, "fshipordernum");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmIsNull() {
            addCriterion("FARRIVETIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmIsNotNull() {
            addCriterion("FARRIVETIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM =", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM <>", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM >", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM >=", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM <", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FARRIVETIMEDTM <=", value, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FARRIVETIMEDTM in", values, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FARRIVETIMEDTM not in", values, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FARRIVETIMEDTM between", value1, value2, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFarrivetimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FARRIVETIMEDTM not between", value1, value2, "farrivetimedtm");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumIsNull() {
            addCriterion("FSHIPCODENUM is null");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumIsNotNull() {
            addCriterion("FSHIPCODENUM is not null");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumEqualTo(Integer value) {
            addCriterion("FSHIPCODENUM =", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumNotEqualTo(Integer value) {
            addCriterion("FSHIPCODENUM <>", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumGreaterThan(Integer value) {
            addCriterion("FSHIPCODENUM >", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSHIPCODENUM >=", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumLessThan(Integer value) {
            addCriterion("FSHIPCODENUM <", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumLessThanOrEqualTo(Integer value) {
            addCriterion("FSHIPCODENUM <=", value, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumIn(List<Integer> values) {
            addCriterion("FSHIPCODENUM in", values, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumNotIn(List<Integer> values) {
            addCriterion("FSHIPCODENUM not in", values, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumBetween(Integer value1, Integer value2) {
            addCriterion("FSHIPCODENUM between", value1, value2, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipcodenumNotBetween(Integer value1, Integer value2) {
            addCriterion("FSHIPCODENUM not between", value1, value2, "fshipcodenum");
            return (Criteria) this;
        }

        public Criteria andFshipnameIsNull() {
            addCriterion("FSHIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andFshipnameIsNotNull() {
            addCriterion("FSHIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFshipnameEqualTo(String value) {
            addCriterion("FSHIPNAME =", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameNotEqualTo(String value) {
            addCriterion("FSHIPNAME <>", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameGreaterThan(String value) {
            addCriterion("FSHIPNAME >", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameGreaterThanOrEqualTo(String value) {
            addCriterion("FSHIPNAME >=", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameLessThan(String value) {
            addCriterion("FSHIPNAME <", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameLessThanOrEqualTo(String value) {
            addCriterion("FSHIPNAME <=", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameLike(String value) {
            addCriterion("FSHIPNAME like", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameNotLike(String value) {
            addCriterion("FSHIPNAME not like", value, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameIn(List<String> values) {
            addCriterion("FSHIPNAME in", values, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameNotIn(List<String> values) {
            addCriterion("FSHIPNAME not in", values, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameBetween(String value1, String value2) {
            addCriterion("FSHIPNAME between", value1, value2, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFshipnameNotBetween(String value1, String value2) {
            addCriterion("FSHIPNAME not between", value1, value2, "fshipname");
            return (Criteria) this;
        }

        public Criteria andFberthnumIsNull() {
            addCriterion("FBERTHNUM is null");
            return (Criteria) this;
        }

        public Criteria andFberthnumIsNotNull() {
            addCriterion("FBERTHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFberthnumEqualTo(Integer value) {
            addCriterion("FBERTHNUM =", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumNotEqualTo(Integer value) {
            addCriterion("FBERTHNUM <>", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumGreaterThan(Integer value) {
            addCriterion("FBERTHNUM >", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBERTHNUM >=", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumLessThan(Integer value) {
            addCriterion("FBERTHNUM <", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumLessThanOrEqualTo(Integer value) {
            addCriterion("FBERTHNUM <=", value, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumIn(List<Integer> values) {
            addCriterion("FBERTHNUM in", values, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumNotIn(List<Integer> values) {
            addCriterion("FBERTHNUM not in", values, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumBetween(Integer value1, Integer value2) {
            addCriterion("FBERTHNUM between", value1, value2, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FBERTHNUM not between", value1, value2, "fberthnum");
            return (Criteria) this;
        }

        public Criteria andFberthnameIsNull() {
            addCriterion("FBERTHNAME is null");
            return (Criteria) this;
        }

        public Criteria andFberthnameIsNotNull() {
            addCriterion("FBERTHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFberthnameEqualTo(String value) {
            addCriterion("FBERTHNAME =", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameNotEqualTo(String value) {
            addCriterion("FBERTHNAME <>", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameGreaterThan(String value) {
            addCriterion("FBERTHNAME >", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameGreaterThanOrEqualTo(String value) {
            addCriterion("FBERTHNAME >=", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameLessThan(String value) {
            addCriterion("FBERTHNAME <", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameLessThanOrEqualTo(String value) {
            addCriterion("FBERTHNAME <=", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameLike(String value) {
            addCriterion("FBERTHNAME like", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameNotLike(String value) {
            addCriterion("FBERTHNAME not like", value, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameIn(List<String> values) {
            addCriterion("FBERTHNAME in", values, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameNotIn(List<String> values) {
            addCriterion("FBERTHNAME not in", values, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameBetween(String value1, String value2) {
            addCriterion("FBERTHNAME between", value1, value2, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFberthnameNotBetween(String value1, String value2) {
            addCriterion("FBERTHNAME not between", value1, value2, "fberthname");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumIsNull() {
            addCriterion("FSIGNTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumIsNotNull() {
            addCriterion("FSIGNTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumEqualTo(Long value) {
            addCriterion("FSIGNTONNUM =", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumNotEqualTo(Long value) {
            addCriterion("FSIGNTONNUM <>", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumGreaterThan(Long value) {
            addCriterion("FSIGNTONNUM >", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FSIGNTONNUM >=", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumLessThan(Long value) {
            addCriterion("FSIGNTONNUM <", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumLessThanOrEqualTo(Long value) {
            addCriterion("FSIGNTONNUM <=", value, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumIn(List<Long> values) {
            addCriterion("FSIGNTONNUM in", values, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumNotIn(List<Long> values) {
            addCriterion("FSIGNTONNUM not in", values, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumBetween(Long value1, Long value2) {
            addCriterion("FSIGNTONNUM between", value1, value2, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFsigntonnumNotBetween(Long value1, Long value2) {
            addCriterion("FSIGNTONNUM not between", value1, value2, "fsigntonnum");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrIsNull() {
            addCriterion("FSHIPSTATEVCR is null");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrIsNotNull() {
            addCriterion("FSHIPSTATEVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrEqualTo(String value) {
            addCriterion("FSHIPSTATEVCR =", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrNotEqualTo(String value) {
            addCriterion("FSHIPSTATEVCR <>", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrGreaterThan(String value) {
            addCriterion("FSHIPSTATEVCR >", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrGreaterThanOrEqualTo(String value) {
            addCriterion("FSHIPSTATEVCR >=", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrLessThan(String value) {
            addCriterion("FSHIPSTATEVCR <", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrLessThanOrEqualTo(String value) {
            addCriterion("FSHIPSTATEVCR <=", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrLike(String value) {
            addCriterion("FSHIPSTATEVCR like", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrNotLike(String value) {
            addCriterion("FSHIPSTATEVCR not like", value, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrIn(List<String> values) {
            addCriterion("FSHIPSTATEVCR in", values, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrNotIn(List<String> values) {
            addCriterion("FSHIPSTATEVCR not in", values, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrBetween(String value1, String value2) {
            addCriterion("FSHIPSTATEVCR between", value1, value2, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFshipstatevcrNotBetween(String value1, String value2) {
            addCriterion("FSHIPSTATEVCR not between", value1, value2, "fshipstatevcr");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmIsNull() {
            addCriterion("FCOUNTTIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmIsNotNull() {
            addCriterion("FCOUNTTIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM =", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM <>", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM >", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM >=", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM <", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM <=", value, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM in", values, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM not in", values, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM between", value1, value2, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcounttimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FCOUNTTIMEDTM not between", value1, value2, "fcounttimedtm");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumIsNull() {
            addCriterion("FCABINNUMNUM is null");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumIsNotNull() {
            addCriterion("FCABINNUMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumEqualTo(Short value) {
            addCriterion("FCABINNUMNUM =", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumNotEqualTo(Short value) {
            addCriterion("FCABINNUMNUM <>", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumGreaterThan(Short value) {
            addCriterion("FCABINNUMNUM >", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumGreaterThanOrEqualTo(Short value) {
            addCriterion("FCABINNUMNUM >=", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumLessThan(Short value) {
            addCriterion("FCABINNUMNUM <", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumLessThanOrEqualTo(Short value) {
            addCriterion("FCABINNUMNUM <=", value, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumIn(List<Short> values) {
            addCriterion("FCABINNUMNUM in", values, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumNotIn(List<Short> values) {
            addCriterion("FCABINNUMNUM not in", values, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumBetween(Short value1, Short value2) {
            addCriterion("FCABINNUMNUM between", value1, value2, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumNotBetween(Short value1, Short value2) {
            addCriterion("FCABINNUMNUM not between", value1, value2, "fcabinnumnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumIsNull() {
            addCriterion("FMAXWEIGHNUM is null");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumIsNotNull() {
            addCriterion("FMAXWEIGHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumEqualTo(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM =", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumNotEqualTo(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM <>", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumGreaterThan(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM >", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM >=", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumLessThan(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM <", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FMAXWEIGHNUM <=", value, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumIn(List<BigDecimal> values) {
            addCriterion("FMAXWEIGHNUM in", values, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumNotIn(List<BigDecimal> values) {
            addCriterion("FMAXWEIGHNUM not in", values, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FMAXWEIGHNUM between", value1, value2, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFmaxweighnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FMAXWEIGHNUM not between", value1, value2, "fmaxweighnum");
            return (Criteria) this;
        }

        public Criteria andFrton1numIsNull() {
            addCriterion("FRTON1NUM is null");
            return (Criteria) this;
        }

        public Criteria andFrton1numIsNotNull() {
            addCriterion("FRTON1NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFrton1numEqualTo(Long value) {
            addCriterion("FRTON1NUM =", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotEqualTo(Long value) {
            addCriterion("FRTON1NUM <>", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numGreaterThan(Long value) {
            addCriterion("FRTON1NUM >", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numGreaterThanOrEqualTo(Long value) {
            addCriterion("FRTON1NUM >=", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numLessThan(Long value) {
            addCriterion("FRTON1NUM <", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numLessThanOrEqualTo(Long value) {
            addCriterion("FRTON1NUM <=", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numIn(List<Long> values) {
            addCriterion("FRTON1NUM in", values, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotIn(List<Long> values) {
            addCriterion("FRTON1NUM not in", values, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numBetween(Long value1, Long value2) {
            addCriterion("FRTON1NUM between", value1, value2, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotBetween(Long value1, Long value2) {
            addCriterion("FRTON1NUM not between", value1, value2, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numIsNull() {
            addCriterion("FBQTON1NUM is null");
            return (Criteria) this;
        }

        public Criteria andFbqton1numIsNotNull() {
            addCriterion("FBQTON1NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFbqton1numEqualTo(Long value) {
            addCriterion("FBQTON1NUM =", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotEqualTo(Long value) {
            addCriterion("FBQTON1NUM <>", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numGreaterThan(Long value) {
            addCriterion("FBQTON1NUM >", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numGreaterThanOrEqualTo(Long value) {
            addCriterion("FBQTON1NUM >=", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numLessThan(Long value) {
            addCriterion("FBQTON1NUM <", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numLessThanOrEqualTo(Long value) {
            addCriterion("FBQTON1NUM <=", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numIn(List<Long> values) {
            addCriterion("FBQTON1NUM in", values, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotIn(List<Long> values) {
            addCriterion("FBQTON1NUM not in", values, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numBetween(Long value1, Long value2) {
            addCriterion("FBQTON1NUM between", value1, value2, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotBetween(Long value1, Long value2) {
            addCriterion("FBQTON1NUM not between", value1, value2, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFrton2numIsNull() {
            addCriterion("FRTON2NUM is null");
            return (Criteria) this;
        }

        public Criteria andFrton2numIsNotNull() {
            addCriterion("FRTON2NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFrton2numEqualTo(Long value) {
            addCriterion("FRTON2NUM =", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotEqualTo(Long value) {
            addCriterion("FRTON2NUM <>", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numGreaterThan(Long value) {
            addCriterion("FRTON2NUM >", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numGreaterThanOrEqualTo(Long value) {
            addCriterion("FRTON2NUM >=", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numLessThan(Long value) {
            addCriterion("FRTON2NUM <", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numLessThanOrEqualTo(Long value) {
            addCriterion("FRTON2NUM <=", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numIn(List<Long> values) {
            addCriterion("FRTON2NUM in", values, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotIn(List<Long> values) {
            addCriterion("FRTON2NUM not in", values, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numBetween(Long value1, Long value2) {
            addCriterion("FRTON2NUM between", value1, value2, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotBetween(Long value1, Long value2) {
            addCriterion("FRTON2NUM not between", value1, value2, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numIsNull() {
            addCriterion("FBQBTON2NUM is null");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numIsNotNull() {
            addCriterion("FBQBTON2NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numEqualTo(Long value) {
            addCriterion("FBQBTON2NUM =", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotEqualTo(Long value) {
            addCriterion("FBQBTON2NUM <>", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numGreaterThan(Long value) {
            addCriterion("FBQBTON2NUM >", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numGreaterThanOrEqualTo(Long value) {
            addCriterion("FBQBTON2NUM >=", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numLessThan(Long value) {
            addCriterion("FBQBTON2NUM <", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numLessThanOrEqualTo(Long value) {
            addCriterion("FBQBTON2NUM <=", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numIn(List<Long> values) {
            addCriterion("FBQBTON2NUM in", values, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotIn(List<Long> values) {
            addCriterion("FBQBTON2NUM not in", values, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numBetween(Long value1, Long value2) {
            addCriterion("FBQBTON2NUM between", value1, value2, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotBetween(Long value1, Long value2) {
            addCriterion("FBQBTON2NUM not between", value1, value2, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumIsNull() {
            addCriterion("FBMTONNUM is null");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumIsNotNull() {
            addCriterion("FBMTONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumEqualTo(Long value) {
            addCriterion("FBMTONNUM =", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotEqualTo(Long value) {
            addCriterion("FBMTONNUM <>", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumGreaterThan(Long value) {
            addCriterion("FBMTONNUM >", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FBMTONNUM >=", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumLessThan(Long value) {
            addCriterion("FBMTONNUM <", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumLessThanOrEqualTo(Long value) {
            addCriterion("FBMTONNUM <=", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumIn(List<Long> values) {
            addCriterion("FBMTONNUM in", values, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotIn(List<Long> values) {
            addCriterion("FBMTONNUM not in", values, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumBetween(Long value1, Long value2) {
            addCriterion("FBMTONNUM between", value1, value2, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotBetween(Long value1, Long value2) {
            addCriterion("FBMTONNUM not between", value1, value2, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1IsNull() {
            addCriterion("FBJTONNUM1 is null");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1IsNotNull() {
            addCriterion("FBJTONNUM1 is not null");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1EqualTo(Long value) {
            addCriterion("FBJTONNUM1 =", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1NotEqualTo(Long value) {
            addCriterion("FBJTONNUM1 <>", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1GreaterThan(Long value) {
            addCriterion("FBJTONNUM1 >", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1GreaterThanOrEqualTo(Long value) {
            addCriterion("FBJTONNUM1 >=", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1LessThan(Long value) {
            addCriterion("FBJTONNUM1 <", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1LessThanOrEqualTo(Long value) {
            addCriterion("FBJTONNUM1 <=", value, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1In(List<Long> values) {
            addCriterion("FBJTONNUM1 in", values, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1NotIn(List<Long> values) {
            addCriterion("FBJTONNUM1 not in", values, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1Between(Long value1, Long value2) {
            addCriterion("FBJTONNUM1 between", value1, value2, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum1NotBetween(Long value1, Long value2) {
            addCriterion("FBJTONNUM1 not between", value1, value2, "fbjtonnum1");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2IsNull() {
            addCriterion("FBJTONNUM2 is null");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2IsNotNull() {
            addCriterion("FBJTONNUM2 is not null");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2EqualTo(Long value) {
            addCriterion("FBJTONNUM2 =", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2NotEqualTo(Long value) {
            addCriterion("FBJTONNUM2 <>", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2GreaterThan(Long value) {
            addCriterion("FBJTONNUM2 >", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2GreaterThanOrEqualTo(Long value) {
            addCriterion("FBJTONNUM2 >=", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2LessThan(Long value) {
            addCriterion("FBJTONNUM2 <", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2LessThanOrEqualTo(Long value) {
            addCriterion("FBJTONNUM2 <=", value, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2In(List<Long> values) {
            addCriterion("FBJTONNUM2 in", values, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2NotIn(List<Long> values) {
            addCriterion("FBJTONNUM2 not in", values, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2Between(Long value1, Long value2) {
            addCriterion("FBJTONNUM2 between", value1, value2, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andFbjtonnum2NotBetween(Long value1, Long value2) {
            addCriterion("FBJTONNUM2 not between", value1, value2, "fbjtonnum2");
            return (Criteria) this;
        }

        public Criteria andLineresultIsNull() {
            addCriterion("LINERESULT is null");
            return (Criteria) this;
        }

        public Criteria andLineresultIsNotNull() {
            addCriterion("LINERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andLineresultEqualTo(String value) {
            addCriterion("LINERESULT =", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultNotEqualTo(String value) {
            addCriterion("LINERESULT <>", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultGreaterThan(String value) {
            addCriterion("LINERESULT >", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultGreaterThanOrEqualTo(String value) {
            addCriterion("LINERESULT >=", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultLessThan(String value) {
            addCriterion("LINERESULT <", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultLessThanOrEqualTo(String value) {
            addCriterion("LINERESULT <=", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultLike(String value) {
            addCriterion("LINERESULT like", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultNotLike(String value) {
            addCriterion("LINERESULT not like", value, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultIn(List<String> values) {
            addCriterion("LINERESULT in", values, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultNotIn(List<String> values) {
            addCriterion("LINERESULT not in", values, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultBetween(String value1, String value2) {
            addCriterion("LINERESULT between", value1, value2, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLineresultNotBetween(String value1, String value2) {
            addCriterion("LINERESULT not between", value1, value2, "lineresult");
            return (Criteria) this;
        }

        public Criteria andLinestateIsNull() {
            addCriterion("LINESTATE is null");
            return (Criteria) this;
        }

        public Criteria andLinestateIsNotNull() {
            addCriterion("LINESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andLinestateEqualTo(String value) {
            addCriterion("LINESTATE =", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotEqualTo(String value) {
            addCriterion("LINESTATE <>", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateGreaterThan(String value) {
            addCriterion("LINESTATE >", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateGreaterThanOrEqualTo(String value) {
            addCriterion("LINESTATE >=", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateLessThan(String value) {
            addCriterion("LINESTATE <", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateLessThanOrEqualTo(String value) {
            addCriterion("LINESTATE <=", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateLike(String value) {
            addCriterion("LINESTATE like", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotLike(String value) {
            addCriterion("LINESTATE not like", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateIn(List<String> values) {
            addCriterion("LINESTATE in", values, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotIn(List<String> values) {
            addCriterion("LINESTATE not in", values, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateBetween(String value1, String value2) {
            addCriterion("LINESTATE between", value1, value2, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotBetween(String value1, String value2) {
            addCriterion("LINESTATE not between", value1, value2, "linestate");
            return (Criteria) this;
        }

        public Criteria andRtonIsNull() {
            addCriterion("RTON is null");
            return (Criteria) this;
        }

        public Criteria andRtonIsNotNull() {
            addCriterion("RTON is not null");
            return (Criteria) this;
        }

        public Criteria andRtonEqualTo(Long value) {
            addCriterion("RTON =", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonNotEqualTo(Long value) {
            addCriterion("RTON <>", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonGreaterThan(Long value) {
            addCriterion("RTON >", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonGreaterThanOrEqualTo(Long value) {
            addCriterion("RTON >=", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonLessThan(Long value) {
            addCriterion("RTON <", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonLessThanOrEqualTo(Long value) {
            addCriterion("RTON <=", value, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonIn(List<Long> values) {
            addCriterion("RTON in", values, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonNotIn(List<Long> values) {
            addCriterion("RTON not in", values, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonBetween(Long value1, Long value2) {
            addCriterion("RTON between", value1, value2, "rton");
            return (Criteria) this;
        }

        public Criteria andRtonNotBetween(Long value1, Long value2) {
            addCriterion("RTON not between", value1, value2, "rton");
            return (Criteria) this;
        }

        public Criteria andBmtonIsNull() {
            addCriterion("BMTON is null");
            return (Criteria) this;
        }

        public Criteria andBmtonIsNotNull() {
            addCriterion("BMTON is not null");
            return (Criteria) this;
        }

        public Criteria andBmtonEqualTo(Long value) {
            addCriterion("BMTON =", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonNotEqualTo(Long value) {
            addCriterion("BMTON <>", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonGreaterThan(Long value) {
            addCriterion("BMTON >", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonGreaterThanOrEqualTo(Long value) {
            addCriterion("BMTON >=", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonLessThan(Long value) {
            addCriterion("BMTON <", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonLessThanOrEqualTo(Long value) {
            addCriterion("BMTON <=", value, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonIn(List<Long> values) {
            addCriterion("BMTON in", values, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonNotIn(List<Long> values) {
            addCriterion("BMTON not in", values, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonBetween(Long value1, Long value2) {
            addCriterion("BMTON between", value1, value2, "bmton");
            return (Criteria) this;
        }

        public Criteria andBmtonNotBetween(Long value1, Long value2) {
            addCriterion("BMTON not between", value1, value2, "bmton");
            return (Criteria) this;
        }

        public Criteria andBqtonIsNull() {
            addCriterion("BQTON is null");
            return (Criteria) this;
        }

        public Criteria andBqtonIsNotNull() {
            addCriterion("BQTON is not null");
            return (Criteria) this;
        }

        public Criteria andBqtonEqualTo(Long value) {
            addCriterion("BQTON =", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonNotEqualTo(Long value) {
            addCriterion("BQTON <>", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonGreaterThan(Long value) {
            addCriterion("BQTON >", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonGreaterThanOrEqualTo(Long value) {
            addCriterion("BQTON >=", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonLessThan(Long value) {
            addCriterion("BQTON <", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonLessThanOrEqualTo(Long value) {
            addCriterion("BQTON <=", value, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonIn(List<Long> values) {
            addCriterion("BQTON in", values, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonNotIn(List<Long> values) {
            addCriterion("BQTON not in", values, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonBetween(Long value1, Long value2) {
            addCriterion("BQTON between", value1, value2, "bqton");
            return (Criteria) this;
        }

        public Criteria andBqtonNotBetween(Long value1, Long value2) {
            addCriterion("BQTON not between", value1, value2, "bqton");
            return (Criteria) this;
        }

        public Criteria andBjtonIsNull() {
            addCriterion("BJTON is null");
            return (Criteria) this;
        }

        public Criteria andBjtonIsNotNull() {
            addCriterion("BJTON is not null");
            return (Criteria) this;
        }

        public Criteria andBjtonEqualTo(Long value) {
            addCriterion("BJTON =", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonNotEqualTo(Long value) {
            addCriterion("BJTON <>", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonGreaterThan(Long value) {
            addCriterion("BJTON >", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonGreaterThanOrEqualTo(Long value) {
            addCriterion("BJTON >=", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonLessThan(Long value) {
            addCriterion("BJTON <", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonLessThanOrEqualTo(Long value) {
            addCriterion("BJTON <=", value, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonIn(List<Long> values) {
            addCriterion("BJTON in", values, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonNotIn(List<Long> values) {
            addCriterion("BJTON not in", values, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonBetween(Long value1, Long value2) {
            addCriterion("BJTON between", value1, value2, "bjton");
            return (Criteria) this;
        }

        public Criteria andBjtonNotBetween(Long value1, Long value2) {
            addCriterion("BJTON not between", value1, value2, "bjton");
            return (Criteria) this;
        }

        public Criteria andMaxtonIsNull() {
            addCriterion("MAXTON is null");
            return (Criteria) this;
        }

        public Criteria andMaxtonIsNotNull() {
            addCriterion("MAXTON is not null");
            return (Criteria) this;
        }

        public Criteria andMaxtonEqualTo(Long value) {
            addCriterion("MAXTON =", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonNotEqualTo(Long value) {
            addCriterion("MAXTON <>", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonGreaterThan(Long value) {
            addCriterion("MAXTON >", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXTON >=", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonLessThan(Long value) {
            addCriterion("MAXTON <", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonLessThanOrEqualTo(Long value) {
            addCriterion("MAXTON <=", value, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonIn(List<Long> values) {
            addCriterion("MAXTON in", values, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonNotIn(List<Long> values) {
            addCriterion("MAXTON not in", values, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonBetween(Long value1, Long value2) {
            addCriterion("MAXTON between", value1, value2, "maxton");
            return (Criteria) this;
        }

        public Criteria andMaxtonNotBetween(Long value1, Long value2) {
            addCriterion("MAXTON not between", value1, value2, "maxton");
            return (Criteria) this;
        }

        public Criteria andMintonIsNull() {
            addCriterion("MINTON is null");
            return (Criteria) this;
        }

        public Criteria andMintonIsNotNull() {
            addCriterion("MINTON is not null");
            return (Criteria) this;
        }

        public Criteria andMintonEqualTo(Long value) {
            addCriterion("MINTON =", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonNotEqualTo(Long value) {
            addCriterion("MINTON <>", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonGreaterThan(Long value) {
            addCriterion("MINTON >", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonGreaterThanOrEqualTo(Long value) {
            addCriterion("MINTON >=", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonLessThan(Long value) {
            addCriterion("MINTON <", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonLessThanOrEqualTo(Long value) {
            addCriterion("MINTON <=", value, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonIn(List<Long> values) {
            addCriterion("MINTON in", values, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonNotIn(List<Long> values) {
            addCriterion("MINTON not in", values, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonBetween(Long value1, Long value2) {
            addCriterion("MINTON between", value1, value2, "minton");
            return (Criteria) this;
        }

        public Criteria andMintonNotBetween(Long value1, Long value2) {
            addCriterion("MINTON not between", value1, value2, "minton");
            return (Criteria) this;
        }

        public Criteria andRrateIsNull() {
            addCriterion("RRATE is null");
            return (Criteria) this;
        }

        public Criteria andRrateIsNotNull() {
            addCriterion("RRATE is not null");
            return (Criteria) this;
        }

        public Criteria andRrateEqualTo(BigDecimal value) {
            addCriterion("RRATE =", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateNotEqualTo(BigDecimal value) {
            addCriterion("RRATE <>", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateGreaterThan(BigDecimal value) {
            addCriterion("RRATE >", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RRATE >=", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateLessThan(BigDecimal value) {
            addCriterion("RRATE <", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RRATE <=", value, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateIn(List<BigDecimal> values) {
            addCriterion("RRATE in", values, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateNotIn(List<BigDecimal> values) {
            addCriterion("RRATE not in", values, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RRATE between", value1, value2, "rrate");
            return (Criteria) this;
        }

        public Criteria andRrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RRATE not between", value1, value2, "rrate");
            return (Criteria) this;
        }

        public Criteria andBmrateIsNull() {
            addCriterion("BMRATE is null");
            return (Criteria) this;
        }

        public Criteria andBmrateIsNotNull() {
            addCriterion("BMRATE is not null");
            return (Criteria) this;
        }

        public Criteria andBmrateEqualTo(BigDecimal value) {
            addCriterion("BMRATE =", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateNotEqualTo(BigDecimal value) {
            addCriterion("BMRATE <>", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateGreaterThan(BigDecimal value) {
            addCriterion("BMRATE >", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BMRATE >=", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateLessThan(BigDecimal value) {
            addCriterion("BMRATE <", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BMRATE <=", value, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateIn(List<BigDecimal> values) {
            addCriterion("BMRATE in", values, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateNotIn(List<BigDecimal> values) {
            addCriterion("BMRATE not in", values, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMRATE between", value1, value2, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBmrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMRATE not between", value1, value2, "bmrate");
            return (Criteria) this;
        }

        public Criteria andBqrateIsNull() {
            addCriterion("BQRATE is null");
            return (Criteria) this;
        }

        public Criteria andBqrateIsNotNull() {
            addCriterion("BQRATE is not null");
            return (Criteria) this;
        }

        public Criteria andBqrateEqualTo(BigDecimal value) {
            addCriterion("BQRATE =", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateNotEqualTo(BigDecimal value) {
            addCriterion("BQRATE <>", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateGreaterThan(BigDecimal value) {
            addCriterion("BQRATE >", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BQRATE >=", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateLessThan(BigDecimal value) {
            addCriterion("BQRATE <", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BQRATE <=", value, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateIn(List<BigDecimal> values) {
            addCriterion("BQRATE in", values, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateNotIn(List<BigDecimal> values) {
            addCriterion("BQRATE not in", values, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BQRATE between", value1, value2, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBqrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BQRATE not between", value1, value2, "bqrate");
            return (Criteria) this;
        }

        public Criteria andBjrateIsNull() {
            addCriterion("BJRATE is null");
            return (Criteria) this;
        }

        public Criteria andBjrateIsNotNull() {
            addCriterion("BJRATE is not null");
            return (Criteria) this;
        }

        public Criteria andBjrateEqualTo(BigDecimal value) {
            addCriterion("BJRATE =", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateNotEqualTo(BigDecimal value) {
            addCriterion("BJRATE <>", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateGreaterThan(BigDecimal value) {
            addCriterion("BJRATE >", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BJRATE >=", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateLessThan(BigDecimal value) {
            addCriterion("BJRATE <", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BJRATE <=", value, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateIn(List<BigDecimal> values) {
            addCriterion("BJRATE in", values, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateNotIn(List<BigDecimal> values) {
            addCriterion("BJRATE not in", values, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BJRATE between", value1, value2, "bjrate");
            return (Criteria) this;
        }

        public Criteria andBjrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BJRATE not between", value1, value2, "bjrate");
            return (Criteria) this;
        }

        public Criteria andFcoalname1IsNull() {
            addCriterion("FCOALNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andFcoalname1IsNotNull() {
            addCriterion("FCOALNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalname1EqualTo(String value) {
            addCriterion("FCOALNAME1 =", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1NotEqualTo(String value) {
            addCriterion("FCOALNAME1 <>", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1GreaterThan(String value) {
            addCriterion("FCOALNAME1 >", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1GreaterThanOrEqualTo(String value) {
            addCriterion("FCOALNAME1 >=", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1LessThan(String value) {
            addCriterion("FCOALNAME1 <", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1LessThanOrEqualTo(String value) {
            addCriterion("FCOALNAME1 <=", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1Like(String value) {
            addCriterion("FCOALNAME1 like", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1NotLike(String value) {
            addCriterion("FCOALNAME1 not like", value, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1In(List<String> values) {
            addCriterion("FCOALNAME1 in", values, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1NotIn(List<String> values) {
            addCriterion("FCOALNAME1 not in", values, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1Between(String value1, String value2) {
            addCriterion("FCOALNAME1 between", value1, value2, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname1NotBetween(String value1, String value2) {
            addCriterion("FCOALNAME1 not between", value1, value2, "fcoalname1");
            return (Criteria) this;
        }

        public Criteria andFcoalname2IsNull() {
            addCriterion("FCOALNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andFcoalname2IsNotNull() {
            addCriterion("FCOALNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalname2EqualTo(String value) {
            addCriterion("FCOALNAME2 =", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2NotEqualTo(String value) {
            addCriterion("FCOALNAME2 <>", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2GreaterThan(String value) {
            addCriterion("FCOALNAME2 >", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2GreaterThanOrEqualTo(String value) {
            addCriterion("FCOALNAME2 >=", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2LessThan(String value) {
            addCriterion("FCOALNAME2 <", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2LessThanOrEqualTo(String value) {
            addCriterion("FCOALNAME2 <=", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2Like(String value) {
            addCriterion("FCOALNAME2 like", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2NotLike(String value) {
            addCriterion("FCOALNAME2 not like", value, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2In(List<String> values) {
            addCriterion("FCOALNAME2 in", values, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2NotIn(List<String> values) {
            addCriterion("FCOALNAME2 not in", values, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2Between(String value1, String value2) {
            addCriterion("FCOALNAME2 between", value1, value2, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andFcoalname2NotBetween(String value1, String value2) {
            addCriterion("FCOALNAME2 not between", value1, value2, "fcoalname2");
            return (Criteria) this;
        }

        public Criteria andSignresultIsNull() {
            addCriterion("SIGNRESULT is null");
            return (Criteria) this;
        }

        public Criteria andSignresultIsNotNull() {
            addCriterion("SIGNRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andSignresultEqualTo(String value) {
            addCriterion("SIGNRESULT =", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultNotEqualTo(String value) {
            addCriterion("SIGNRESULT <>", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultGreaterThan(String value) {
            addCriterion("SIGNRESULT >", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNRESULT >=", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultLessThan(String value) {
            addCriterion("SIGNRESULT <", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultLessThanOrEqualTo(String value) {
            addCriterion("SIGNRESULT <=", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultLike(String value) {
            addCriterion("SIGNRESULT like", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultNotLike(String value) {
            addCriterion("SIGNRESULT not like", value, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultIn(List<String> values) {
            addCriterion("SIGNRESULT in", values, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultNotIn(List<String> values) {
            addCriterion("SIGNRESULT not in", values, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultBetween(String value1, String value2) {
            addCriterion("SIGNRESULT between", value1, value2, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignresultNotBetween(String value1, String value2) {
            addCriterion("SIGNRESULT not between", value1, value2, "signresult");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNull() {
            addCriterion("SIGNSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNotNull() {
            addCriterion("SIGNSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignstateEqualTo(String value) {
            addCriterion("SIGNSTATE =", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotEqualTo(String value) {
            addCriterion("SIGNSTATE <>", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThan(String value) {
            addCriterion("SIGNSTATE >", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNSTATE >=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThan(String value) {
            addCriterion("SIGNSTATE <", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThanOrEqualTo(String value) {
            addCriterion("SIGNSTATE <=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLike(String value) {
            addCriterion("SIGNSTATE like", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotLike(String value) {
            addCriterion("SIGNSTATE not like", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateIn(List<String> values) {
            addCriterion("SIGNSTATE in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotIn(List<String> values) {
            addCriterion("SIGNSTATE not in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateBetween(String value1, String value2) {
            addCriterion("SIGNSTATE between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotBetween(String value1, String value2) {
            addCriterion("SIGNSTATE not between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignrrateIsNull() {
            addCriterion("SIGNRRATE is null");
            return (Criteria) this;
        }

        public Criteria andSignrrateIsNotNull() {
            addCriterion("SIGNRRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignrrateEqualTo(BigDecimal value) {
            addCriterion("SIGNRRATE =", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateNotEqualTo(BigDecimal value) {
            addCriterion("SIGNRRATE <>", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateGreaterThan(BigDecimal value) {
            addCriterion("SIGNRRATE >", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNRRATE >=", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateLessThan(BigDecimal value) {
            addCriterion("SIGNRRATE <", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNRRATE <=", value, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateIn(List<BigDecimal> values) {
            addCriterion("SIGNRRATE in", values, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateNotIn(List<BigDecimal> values) {
            addCriterion("SIGNRRATE not in", values, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNRRATE between", value1, value2, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignrrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNRRATE not between", value1, value2, "signrrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateIsNull() {
            addCriterion("SIGNBMRATE is null");
            return (Criteria) this;
        }

        public Criteria andSignbmrateIsNotNull() {
            addCriterion("SIGNBMRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignbmrateEqualTo(BigDecimal value) {
            addCriterion("SIGNBMRATE =", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateNotEqualTo(BigDecimal value) {
            addCriterion("SIGNBMRATE <>", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateGreaterThan(BigDecimal value) {
            addCriterion("SIGNBMRATE >", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBMRATE >=", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateLessThan(BigDecimal value) {
            addCriterion("SIGNBMRATE <", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBMRATE <=", value, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateIn(List<BigDecimal> values) {
            addCriterion("SIGNBMRATE in", values, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateNotIn(List<BigDecimal> values) {
            addCriterion("SIGNBMRATE not in", values, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBMRATE between", value1, value2, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbmrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBMRATE not between", value1, value2, "signbmrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateIsNull() {
            addCriterion("SIGNBQRATE is null");
            return (Criteria) this;
        }

        public Criteria andSignbqrateIsNotNull() {
            addCriterion("SIGNBQRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignbqrateEqualTo(BigDecimal value) {
            addCriterion("SIGNBQRATE =", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateNotEqualTo(BigDecimal value) {
            addCriterion("SIGNBQRATE <>", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateGreaterThan(BigDecimal value) {
            addCriterion("SIGNBQRATE >", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBQRATE >=", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateLessThan(BigDecimal value) {
            addCriterion("SIGNBQRATE <", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBQRATE <=", value, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateIn(List<BigDecimal> values) {
            addCriterion("SIGNBQRATE in", values, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateNotIn(List<BigDecimal> values) {
            addCriterion("SIGNBQRATE not in", values, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBQRATE between", value1, value2, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbqrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBQRATE not between", value1, value2, "signbqrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateIsNull() {
            addCriterion("SIGNBJRATE is null");
            return (Criteria) this;
        }

        public Criteria andSignbjrateIsNotNull() {
            addCriterion("SIGNBJRATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignbjrateEqualTo(BigDecimal value) {
            addCriterion("SIGNBJRATE =", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateNotEqualTo(BigDecimal value) {
            addCriterion("SIGNBJRATE <>", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateGreaterThan(BigDecimal value) {
            addCriterion("SIGNBJRATE >", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBJRATE >=", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateLessThan(BigDecimal value) {
            addCriterion("SIGNBJRATE <", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNBJRATE <=", value, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateIn(List<BigDecimal> values) {
            addCriterion("SIGNBJRATE in", values, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateNotIn(List<BigDecimal> values) {
            addCriterion("SIGNBJRATE not in", values, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBJRATE between", value1, value2, "signbjrate");
            return (Criteria) this;
        }

        public Criteria andSignbjrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNBJRATE not between", value1, value2, "signbjrate");
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