package com.stylefeng.guns.modular.CoalMS.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TVShipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVShipExample() {
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

        public Criteria andFberthcodenumIsNull() {
            addCriterion("FBERTHCODENUM is null");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumIsNotNull() {
            addCriterion("FBERTHCODENUM is not null");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumEqualTo(Long value) {
            addCriterion("FBERTHCODENUM =", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumNotEqualTo(Long value) {
            addCriterion("FBERTHCODENUM <>", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumGreaterThan(Long value) {
            addCriterion("FBERTHCODENUM >", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumGreaterThanOrEqualTo(Long value) {
            addCriterion("FBERTHCODENUM >=", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumLessThan(Long value) {
            addCriterion("FBERTHCODENUM <", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumLessThanOrEqualTo(Long value) {
            addCriterion("FBERTHCODENUM <=", value, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumIn(List<Long> values) {
            addCriterion("FBERTHCODENUM in", values, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumNotIn(List<Long> values) {
            addCriterion("FBERTHCODENUM not in", values, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumBetween(Long value1, Long value2) {
            addCriterion("FBERTHCODENUM between", value1, value2, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFberthcodenumNotBetween(Long value1, Long value2) {
            addCriterion("FBERTHCODENUM not between", value1, value2, "fberthcodenum");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmIsNull() {
            addCriterion("FSTARTTIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmIsNotNull() {
            addCriterion("FSTARTTIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM =", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM <>", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM >", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM >=", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM <", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FSTARTTIMEDTM <=", value, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FSTARTTIMEDTM in", values, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FSTARTTIMEDTM not in", values, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FSTARTTIMEDTM between", value1, value2, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstarttimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FSTARTTIMEDTM not between", value1, value2, "fstarttimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmIsNull() {
            addCriterion("FSTOPTIMEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmIsNotNull() {
            addCriterion("FSTOPTIMEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM =", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM <>", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM >", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM >=", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmLessThan(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM <", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FSTOPTIMEDTM <=", value, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FSTOPTIMEDTM in", values, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FSTOPTIMEDTM not in", values, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FSTOPTIMEDTM between", value1, value2, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFstoptimedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FSTOPTIMEDTM not between", value1, value2, "fstoptimedtm");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrIsNull() {
            addCriterion("FFLOWCODEVCR is null");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrIsNotNull() {
            addCriterion("FFLOWCODEVCR is not null");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrEqualTo(String value) {
            addCriterion("FFLOWCODEVCR =", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrNotEqualTo(String value) {
            addCriterion("FFLOWCODEVCR <>", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrGreaterThan(String value) {
            addCriterion("FFLOWCODEVCR >", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrGreaterThanOrEqualTo(String value) {
            addCriterion("FFLOWCODEVCR >=", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrLessThan(String value) {
            addCriterion("FFLOWCODEVCR <", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrLessThanOrEqualTo(String value) {
            addCriterion("FFLOWCODEVCR <=", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrLike(String value) {
            addCriterion("FFLOWCODEVCR like", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrNotLike(String value) {
            addCriterion("FFLOWCODEVCR not like", value, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrIn(List<String> values) {
            addCriterion("FFLOWCODEVCR in", values, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrNotIn(List<String> values) {
            addCriterion("FFLOWCODEVCR not in", values, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrBetween(String value1, String value2) {
            addCriterion("FFLOWCODEVCR between", value1, value2, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflowcodevcrNotBetween(String value1, String value2) {
            addCriterion("FFLOWCODEVCR not between", value1, value2, "fflowcodevcr");
            return (Criteria) this;
        }

        public Criteria andFflownameIsNull() {
            addCriterion("FFLOWNAME is null");
            return (Criteria) this;
        }

        public Criteria andFflownameIsNotNull() {
            addCriterion("FFLOWNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFflownameEqualTo(String value) {
            addCriterion("FFLOWNAME =", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameNotEqualTo(String value) {
            addCriterion("FFLOWNAME <>", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameGreaterThan(String value) {
            addCriterion("FFLOWNAME >", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameGreaterThanOrEqualTo(String value) {
            addCriterion("FFLOWNAME >=", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameLessThan(String value) {
            addCriterion("FFLOWNAME <", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameLessThanOrEqualTo(String value) {
            addCriterion("FFLOWNAME <=", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameLike(String value) {
            addCriterion("FFLOWNAME like", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameNotLike(String value) {
            addCriterion("FFLOWNAME not like", value, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameIn(List<String> values) {
            addCriterion("FFLOWNAME in", values, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameNotIn(List<String> values) {
            addCriterion("FFLOWNAME not in", values, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameBetween(String value1, String value2) {
            addCriterion("FFLOWNAME between", value1, value2, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFflownameNotBetween(String value1, String value2) {
            addCriterion("FFLOWNAME not between", value1, value2, "fflowname");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoIsNull() {
            addCriterion("FCABINNUMNUMNO is null");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoIsNotNull() {
            addCriterion("FCABINNUMNUMNO is not null");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoEqualTo(Short value) {
            addCriterion("FCABINNUMNUMNO =", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoNotEqualTo(Short value) {
            addCriterion("FCABINNUMNUMNO <>", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoGreaterThan(Short value) {
            addCriterion("FCABINNUMNUMNO >", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoGreaterThanOrEqualTo(Short value) {
            addCriterion("FCABINNUMNUMNO >=", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoLessThan(Short value) {
            addCriterion("FCABINNUMNUMNO <", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoLessThanOrEqualTo(Short value) {
            addCriterion("FCABINNUMNUMNO <=", value, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoIn(List<Short> values) {
            addCriterion("FCABINNUMNUMNO in", values, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoNotIn(List<Short> values) {
            addCriterion("FCABINNUMNUMNO not in", values, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoBetween(Short value1, Short value2) {
            addCriterion("FCABINNUMNUMNO between", value1, value2, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcabinnumnumnoNotBetween(Short value1, Short value2) {
            addCriterion("FCABINNUMNUMNO not between", value1, value2, "fcabinnumnumno");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrIsNull() {
            addCriterion("FCOALCODE1VCR is null");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrIsNotNull() {
            addCriterion("FCOALCODE1VCR is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrEqualTo(String value) {
            addCriterion("FCOALCODE1VCR =", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrNotEqualTo(String value) {
            addCriterion("FCOALCODE1VCR <>", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrGreaterThan(String value) {
            addCriterion("FCOALCODE1VCR >", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrGreaterThanOrEqualTo(String value) {
            addCriterion("FCOALCODE1VCR >=", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrLessThan(String value) {
            addCriterion("FCOALCODE1VCR <", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrLessThanOrEqualTo(String value) {
            addCriterion("FCOALCODE1VCR <=", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrLike(String value) {
            addCriterion("FCOALCODE1VCR like", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrNotLike(String value) {
            addCriterion("FCOALCODE1VCR not like", value, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrIn(List<String> values) {
            addCriterion("FCOALCODE1VCR in", values, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrNotIn(List<String> values) {
            addCriterion("FCOALCODE1VCR not in", values, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrBetween(String value1, String value2) {
            addCriterion("FCOALCODE1VCR between", value1, value2, "fcoalcode1vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode1vcrNotBetween(String value1, String value2) {
            addCriterion("FCOALCODE1VCR not between", value1, value2, "fcoalcode1vcr");
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

        public Criteria andFbattlements1vcrIsNull() {
            addCriterion("FBATTLEMENTS1VCR is null");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrIsNotNull() {
            addCriterion("FBATTLEMENTS1VCR is not null");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrEqualTo(String value) {
            addCriterion("FBATTLEMENTS1VCR =", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrNotEqualTo(String value) {
            addCriterion("FBATTLEMENTS1VCR <>", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrGreaterThan(String value) {
            addCriterion("FBATTLEMENTS1VCR >", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrGreaterThanOrEqualTo(String value) {
            addCriterion("FBATTLEMENTS1VCR >=", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrLessThan(String value) {
            addCriterion("FBATTLEMENTS1VCR <", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrLessThanOrEqualTo(String value) {
            addCriterion("FBATTLEMENTS1VCR <=", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrLike(String value) {
            addCriterion("FBATTLEMENTS1VCR like", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrNotLike(String value) {
            addCriterion("FBATTLEMENTS1VCR not like", value, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrIn(List<String> values) {
            addCriterion("FBATTLEMENTS1VCR in", values, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrNotIn(List<String> values) {
            addCriterion("FBATTLEMENTS1VCR not in", values, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrBetween(String value1, String value2) {
            addCriterion("FBATTLEMENTS1VCR between", value1, value2, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements1vcrNotBetween(String value1, String value2) {
            addCriterion("FBATTLEMENTS1VCR not between", value1, value2, "fbattlements1vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlename1IsNull() {
            addCriterion("FBATTLENAME1 is null");
            return (Criteria) this;
        }

        public Criteria andFbattlename1IsNotNull() {
            addCriterion("FBATTLENAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andFbattlename1EqualTo(String value) {
            addCriterion("FBATTLENAME1 =", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1NotEqualTo(String value) {
            addCriterion("FBATTLENAME1 <>", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1GreaterThan(String value) {
            addCriterion("FBATTLENAME1 >", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1GreaterThanOrEqualTo(String value) {
            addCriterion("FBATTLENAME1 >=", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1LessThan(String value) {
            addCriterion("FBATTLENAME1 <", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1LessThanOrEqualTo(String value) {
            addCriterion("FBATTLENAME1 <=", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1Like(String value) {
            addCriterion("FBATTLENAME1 like", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1NotLike(String value) {
            addCriterion("FBATTLENAME1 not like", value, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1In(List<String> values) {
            addCriterion("FBATTLENAME1 in", values, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1NotIn(List<String> values) {
            addCriterion("FBATTLENAME1 not in", values, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1Between(String value1, String value2) {
            addCriterion("FBATTLENAME1 between", value1, value2, "fbattlename1");
            return (Criteria) this;
        }

        public Criteria andFbattlename1NotBetween(String value1, String value2) {
            addCriterion("FBATTLENAME1 not between", value1, value2, "fbattlename1");
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

        public Criteria andFrton1numEqualTo(BigDecimal value) {
            addCriterion("FRTON1NUM =", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotEqualTo(BigDecimal value) {
            addCriterion("FRTON1NUM <>", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numGreaterThan(BigDecimal value) {
            addCriterion("FRTON1NUM >", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRTON1NUM >=", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numLessThan(BigDecimal value) {
            addCriterion("FRTON1NUM <", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRTON1NUM <=", value, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numIn(List<BigDecimal> values) {
            addCriterion("FRTON1NUM in", values, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotIn(List<BigDecimal> values) {
            addCriterion("FRTON1NUM not in", values, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRTON1NUM between", value1, value2, "frton1num");
            return (Criteria) this;
        }

        public Criteria andFrton1numNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFbqton1numEqualTo(BigDecimal value) {
            addCriterion("FBQTON1NUM =", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotEqualTo(BigDecimal value) {
            addCriterion("FBQTON1NUM <>", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numGreaterThan(BigDecimal value) {
            addCriterion("FBQTON1NUM >", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBQTON1NUM >=", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numLessThan(BigDecimal value) {
            addCriterion("FBQTON1NUM <", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBQTON1NUM <=", value, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numIn(List<BigDecimal> values) {
            addCriterion("FBQTON1NUM in", values, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotIn(List<BigDecimal> values) {
            addCriterion("FBQTON1NUM not in", values, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBQTON1NUM between", value1, value2, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFbqton1numNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBQTON1NUM not between", value1, value2, "fbqton1num");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrIsNull() {
            addCriterion("FCOALCODE2VCR is null");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrIsNotNull() {
            addCriterion("FCOALCODE2VCR is not null");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrEqualTo(String value) {
            addCriterion("FCOALCODE2VCR =", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrNotEqualTo(String value) {
            addCriterion("FCOALCODE2VCR <>", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrGreaterThan(String value) {
            addCriterion("FCOALCODE2VCR >", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrGreaterThanOrEqualTo(String value) {
            addCriterion("FCOALCODE2VCR >=", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrLessThan(String value) {
            addCriterion("FCOALCODE2VCR <", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrLessThanOrEqualTo(String value) {
            addCriterion("FCOALCODE2VCR <=", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrLike(String value) {
            addCriterion("FCOALCODE2VCR like", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrNotLike(String value) {
            addCriterion("FCOALCODE2VCR not like", value, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrIn(List<String> values) {
            addCriterion("FCOALCODE2VCR in", values, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrNotIn(List<String> values) {
            addCriterion("FCOALCODE2VCR not in", values, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrBetween(String value1, String value2) {
            addCriterion("FCOALCODE2VCR between", value1, value2, "fcoalcode2vcr");
            return (Criteria) this;
        }

        public Criteria andFcoalcode2vcrNotBetween(String value1, String value2) {
            addCriterion("FCOALCODE2VCR not between", value1, value2, "fcoalcode2vcr");
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

        public Criteria andFbattlements2vcrIsNull() {
            addCriterion("FBATTLEMENTS2VCR is null");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrIsNotNull() {
            addCriterion("FBATTLEMENTS2VCR is not null");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrEqualTo(String value) {
            addCriterion("FBATTLEMENTS2VCR =", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrNotEqualTo(String value) {
            addCriterion("FBATTLEMENTS2VCR <>", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrGreaterThan(String value) {
            addCriterion("FBATTLEMENTS2VCR >", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrGreaterThanOrEqualTo(String value) {
            addCriterion("FBATTLEMENTS2VCR >=", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrLessThan(String value) {
            addCriterion("FBATTLEMENTS2VCR <", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrLessThanOrEqualTo(String value) {
            addCriterion("FBATTLEMENTS2VCR <=", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrLike(String value) {
            addCriterion("FBATTLEMENTS2VCR like", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrNotLike(String value) {
            addCriterion("FBATTLEMENTS2VCR not like", value, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrIn(List<String> values) {
            addCriterion("FBATTLEMENTS2VCR in", values, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrNotIn(List<String> values) {
            addCriterion("FBATTLEMENTS2VCR not in", values, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrBetween(String value1, String value2) {
            addCriterion("FBATTLEMENTS2VCR between", value1, value2, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlements2vcrNotBetween(String value1, String value2) {
            addCriterion("FBATTLEMENTS2VCR not between", value1, value2, "fbattlements2vcr");
            return (Criteria) this;
        }

        public Criteria andFbattlename2IsNull() {
            addCriterion("FBATTLENAME2 is null");
            return (Criteria) this;
        }

        public Criteria andFbattlename2IsNotNull() {
            addCriterion("FBATTLENAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andFbattlename2EqualTo(String value) {
            addCriterion("FBATTLENAME2 =", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2NotEqualTo(String value) {
            addCriterion("FBATTLENAME2 <>", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2GreaterThan(String value) {
            addCriterion("FBATTLENAME2 >", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2GreaterThanOrEqualTo(String value) {
            addCriterion("FBATTLENAME2 >=", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2LessThan(String value) {
            addCriterion("FBATTLENAME2 <", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2LessThanOrEqualTo(String value) {
            addCriterion("FBATTLENAME2 <=", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2Like(String value) {
            addCriterion("FBATTLENAME2 like", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2NotLike(String value) {
            addCriterion("FBATTLENAME2 not like", value, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2In(List<String> values) {
            addCriterion("FBATTLENAME2 in", values, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2NotIn(List<String> values) {
            addCriterion("FBATTLENAME2 not in", values, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2Between(String value1, String value2) {
            addCriterion("FBATTLENAME2 between", value1, value2, "fbattlename2");
            return (Criteria) this;
        }

        public Criteria andFbattlename2NotBetween(String value1, String value2) {
            addCriterion("FBATTLENAME2 not between", value1, value2, "fbattlename2");
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

        public Criteria andFrton2numEqualTo(BigDecimal value) {
            addCriterion("FRTON2NUM =", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotEqualTo(BigDecimal value) {
            addCriterion("FRTON2NUM <>", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numGreaterThan(BigDecimal value) {
            addCriterion("FRTON2NUM >", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRTON2NUM >=", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numLessThan(BigDecimal value) {
            addCriterion("FRTON2NUM <", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRTON2NUM <=", value, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numIn(List<BigDecimal> values) {
            addCriterion("FRTON2NUM in", values, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotIn(List<BigDecimal> values) {
            addCriterion("FRTON2NUM not in", values, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRTON2NUM between", value1, value2, "frton2num");
            return (Criteria) this;
        }

        public Criteria andFrton2numNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFbqbton2numEqualTo(BigDecimal value) {
            addCriterion("FBQBTON2NUM =", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotEqualTo(BigDecimal value) {
            addCriterion("FBQBTON2NUM <>", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numGreaterThan(BigDecimal value) {
            addCriterion("FBQBTON2NUM >", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBQBTON2NUM >=", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numLessThan(BigDecimal value) {
            addCriterion("FBQBTON2NUM <", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBQBTON2NUM <=", value, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numIn(List<BigDecimal> values) {
            addCriterion("FBQBTON2NUM in", values, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotIn(List<BigDecimal> values) {
            addCriterion("FBQBTON2NUM not in", values, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBQBTON2NUM between", value1, value2, "fbqbton2num");
            return (Criteria) this;
        }

        public Criteria andFbqbton2numNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFbmtonnumEqualTo(BigDecimal value) {
            addCriterion("FBMTONNUM =", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotEqualTo(BigDecimal value) {
            addCriterion("FBMTONNUM <>", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumGreaterThan(BigDecimal value) {
            addCriterion("FBMTONNUM >", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBMTONNUM >=", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumLessThan(BigDecimal value) {
            addCriterion("FBMTONNUM <", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBMTONNUM <=", value, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumIn(List<BigDecimal> values) {
            addCriterion("FBMTONNUM in", values, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotIn(List<BigDecimal> values) {
            addCriterion("FBMTONNUM not in", values, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBMTONNUM between", value1, value2, "fbmtonnum");
            return (Criteria) this;
        }

        public Criteria andFbmtonnumNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFdatedtmIsNull() {
            addCriterion("FDATEDTM is null");
            return (Criteria) this;
        }

        public Criteria andFdatedtmIsNotNull() {
            addCriterion("FDATEDTM is not null");
            return (Criteria) this;
        }

        public Criteria andFdatedtmEqualTo(Date value) {
            addCriterionForJDBCDate("FDATEDTM =", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmNotEqualTo(Date value) {
            addCriterionForJDBCDate("FDATEDTM <>", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmGreaterThan(Date value) {
            addCriterionForJDBCDate("FDATEDTM >", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FDATEDTM >=", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmLessThan(Date value) {
            addCriterionForJDBCDate("FDATEDTM <", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FDATEDTM <=", value, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmIn(List<Date> values) {
            addCriterionForJDBCDate("FDATEDTM in", values, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmNotIn(List<Date> values) {
            addCriterionForJDBCDate("FDATEDTM not in", values, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FDATEDTM between", value1, value2, "fdatedtm");
            return (Criteria) this;
        }

        public Criteria andFdatedtmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FDATEDTM not between", value1, value2, "fdatedtm");
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