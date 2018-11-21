package cn.itcast.mybatis.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PoePersoninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoePersoninfoExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("FID like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("FID not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("FNAME is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("FNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("FNAME =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("FNAME <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("FNAME >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("FNAME >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("FNAME <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("FNAME <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("FNAME like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("FNAME not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("FNAME in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("FNAME not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("FNAME between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("FNAME not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFsexIsNull() {
            addCriterion("FSEX is null");
            return (Criteria) this;
        }

        public Criteria andFsexIsNotNull() {
            addCriterion("FSEX is not null");
            return (Criteria) this;
        }

        public Criteria andFsexEqualTo(String value) {
            addCriterion("FSEX =", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotEqualTo(String value) {
            addCriterion("FSEX <>", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThan(String value) {
            addCriterion("FSEX >", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThanOrEqualTo(String value) {
            addCriterion("FSEX >=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThan(String value) {
            addCriterion("FSEX <", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThanOrEqualTo(String value) {
            addCriterion("FSEX <=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLike(String value) {
            addCriterion("FSEX like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotLike(String value) {
            addCriterion("FSEX not like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexIn(List<String> values) {
            addCriterion("FSEX in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotIn(List<String> values) {
            addCriterion("FSEX not in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexBetween(String value1, String value2) {
            addCriterion("FSEX between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotBetween(String value1, String value2) {
            addCriterion("FSEX not between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFcardcodeIsNull() {
            addCriterion("FCARDCODE is null");
            return (Criteria) this;
        }

        public Criteria andFcardcodeIsNotNull() {
            addCriterion("FCARDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFcardcodeEqualTo(String value) {
            addCriterion("FCARDCODE =", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeNotEqualTo(String value) {
            addCriterion("FCARDCODE <>", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeGreaterThan(String value) {
            addCriterion("FCARDCODE >", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FCARDCODE >=", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeLessThan(String value) {
            addCriterion("FCARDCODE <", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeLessThanOrEqualTo(String value) {
            addCriterion("FCARDCODE <=", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeLike(String value) {
            addCriterion("FCARDCODE like", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeNotLike(String value) {
            addCriterion("FCARDCODE not like", value, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeIn(List<String> values) {
            addCriterion("FCARDCODE in", values, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeNotIn(List<String> values) {
            addCriterion("FCARDCODE not in", values, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeBetween(String value1, String value2) {
            addCriterion("FCARDCODE between", value1, value2, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFcardcodeNotBetween(String value1, String value2) {
            addCriterion("FCARDCODE not between", value1, value2, "fcardcode");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("FADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("FADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("FADDRESS =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("FADDRESS <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("FADDRESS >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FADDRESS >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("FADDRESS <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("FADDRESS <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("FADDRESS like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("FADDRESS not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("FADDRESS in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("FADDRESS not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("FADDRESS between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("FADDRESS not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFbrithdateIsNull() {
            addCriterion("FBRITHDATE is null");
            return (Criteria) this;
        }

        public Criteria andFbrithdateIsNotNull() {
            addCriterion("FBRITHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFbrithdateEqualTo(Date value) {
            addCriterionForJDBCDate("FBRITHDATE =", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FBRITHDATE <>", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateGreaterThan(Date value) {
            addCriterionForJDBCDate("FBRITHDATE >", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBRITHDATE >=", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateLessThan(Date value) {
            addCriterionForJDBCDate("FBRITHDATE <", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBRITHDATE <=", value, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateIn(List<Date> values) {
            addCriterionForJDBCDate("FBRITHDATE in", values, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FBRITHDATE not in", values, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBRITHDATE between", value1, value2, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFbrithdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBRITHDATE not between", value1, value2, "fbrithdate");
            return (Criteria) this;
        }

        public Criteria andFstatureIsNull() {
            addCriterion("FSTATURE is null");
            return (Criteria) this;
        }

        public Criteria andFstatureIsNotNull() {
            addCriterion("FSTATURE is not null");
            return (Criteria) this;
        }

        public Criteria andFstatureEqualTo(BigDecimal value) {
            addCriterion("FSTATURE =", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureNotEqualTo(BigDecimal value) {
            addCriterion("FSTATURE <>", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureGreaterThan(BigDecimal value) {
            addCriterion("FSTATURE >", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSTATURE >=", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureLessThan(BigDecimal value) {
            addCriterion("FSTATURE <", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSTATURE <=", value, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureIn(List<BigDecimal> values) {
            addCriterion("FSTATURE in", values, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureNotIn(List<BigDecimal> values) {
            addCriterion("FSTATURE not in", values, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSTATURE between", value1, value2, "fstature");
            return (Criteria) this;
        }

        public Criteria andFstatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSTATURE not between", value1, value2, "fstature");
            return (Criteria) this;
        }

        public Criteria andFhealthIsNull() {
            addCriterion("FHEALTH is null");
            return (Criteria) this;
        }

        public Criteria andFhealthIsNotNull() {
            addCriterion("FHEALTH is not null");
            return (Criteria) this;
        }

        public Criteria andFhealthEqualTo(String value) {
            addCriterion("FHEALTH =", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthNotEqualTo(String value) {
            addCriterion("FHEALTH <>", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthGreaterThan(String value) {
            addCriterion("FHEALTH >", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthGreaterThanOrEqualTo(String value) {
            addCriterion("FHEALTH >=", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthLessThan(String value) {
            addCriterion("FHEALTH <", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthLessThanOrEqualTo(String value) {
            addCriterion("FHEALTH <=", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthLike(String value) {
            addCriterion("FHEALTH like", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthNotLike(String value) {
            addCriterion("FHEALTH not like", value, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthIn(List<String> values) {
            addCriterion("FHEALTH in", values, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthNotIn(List<String> values) {
            addCriterion("FHEALTH not in", values, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthBetween(String value1, String value2) {
            addCriterion("FHEALTH between", value1, value2, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthNotBetween(String value1, String value2) {
            addCriterion("FHEALTH not between", value1, value2, "fhealth");
            return (Criteria) this;
        }

        public Criteria andFhealthdateIsNull() {
            addCriterion("FHEALTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andFhealthdateIsNotNull() {
            addCriterion("FHEALTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFhealthdateEqualTo(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE =", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE <>", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE >", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE >=", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateLessThan(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE <", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FHEALTHDATE <=", value, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateIn(List<Date> values) {
            addCriterionForJDBCDate("FHEALTHDATE in", values, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FHEALTHDATE not in", values, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FHEALTHDATE between", value1, value2, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFhealthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FHEALTHDATE not between", value1, value2, "fhealthdate");
            return (Criteria) this;
        }

        public Criteria andFcardtypeIsNull() {
            addCriterion("FCARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFcardtypeIsNotNull() {
            addCriterion("FCARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFcardtypeEqualTo(String value) {
            addCriterion("FCARDTYPE =", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeNotEqualTo(String value) {
            addCriterion("FCARDTYPE <>", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeGreaterThan(String value) {
            addCriterion("FCARDTYPE >", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FCARDTYPE >=", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeLessThan(String value) {
            addCriterion("FCARDTYPE <", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeLessThanOrEqualTo(String value) {
            addCriterion("FCARDTYPE <=", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeLike(String value) {
            addCriterion("FCARDTYPE like", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeNotLike(String value) {
            addCriterion("FCARDTYPE not like", value, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeIn(List<String> values) {
            addCriterion("FCARDTYPE in", values, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeNotIn(List<String> values) {
            addCriterion("FCARDTYPE not in", values, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeBetween(String value1, String value2) {
            addCriterion("FCARDTYPE between", value1, value2, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFcardtypeNotBetween(String value1, String value2) {
            addCriterion("FCARDTYPE not between", value1, value2, "fcardtype");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNull() {
            addCriterion("FPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNotNull() {
            addCriterion("FPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFphoneEqualTo(String value) {
            addCriterion("FPHONE =", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotEqualTo(String value) {
            addCriterion("FPHONE <>", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThan(String value) {
            addCriterion("FPHONE >", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("FPHONE >=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThan(String value) {
            addCriterion("FPHONE <", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThanOrEqualTo(String value) {
            addCriterion("FPHONE <=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLike(String value) {
            addCriterion("FPHONE like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotLike(String value) {
            addCriterion("FPHONE not like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneIn(List<String> values) {
            addCriterion("FPHONE in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotIn(List<String> values) {
            addCriterion("FPHONE not in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneBetween(String value1, String value2) {
            addCriterion("FPHONE between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotBetween(String value1, String value2) {
            addCriterion("FPHONE not between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFnationalityIsNull() {
            addCriterion("FNATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andFnationalityIsNotNull() {
            addCriterion("FNATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andFnationalityEqualTo(String value) {
            addCriterion("FNATIONALITY =", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityNotEqualTo(String value) {
            addCriterion("FNATIONALITY <>", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityGreaterThan(String value) {
            addCriterion("FNATIONALITY >", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityGreaterThanOrEqualTo(String value) {
            addCriterion("FNATIONALITY >=", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityLessThan(String value) {
            addCriterion("FNATIONALITY <", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityLessThanOrEqualTo(String value) {
            addCriterion("FNATIONALITY <=", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityLike(String value) {
            addCriterion("FNATIONALITY like", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityNotLike(String value) {
            addCriterion("FNATIONALITY not like", value, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityIn(List<String> values) {
            addCriterion("FNATIONALITY in", values, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityNotIn(List<String> values) {
            addCriterion("FNATIONALITY not in", values, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityBetween(String value1, String value2) {
            addCriterion("FNATIONALITY between", value1, value2, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFnationalityNotBetween(String value1, String value2) {
            addCriterion("FNATIONALITY not between", value1, value2, "fnationality");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeIsNull() {
            addCriterion("FBLOODTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeIsNotNull() {
            addCriterion("FBLOODTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeEqualTo(String value) {
            addCriterion("FBLOODTYPE =", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeNotEqualTo(String value) {
            addCriterion("FBLOODTYPE <>", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeGreaterThan(String value) {
            addCriterion("FBLOODTYPE >", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FBLOODTYPE >=", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeLessThan(String value) {
            addCriterion("FBLOODTYPE <", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeLessThanOrEqualTo(String value) {
            addCriterion("FBLOODTYPE <=", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeLike(String value) {
            addCriterion("FBLOODTYPE like", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeNotLike(String value) {
            addCriterion("FBLOODTYPE not like", value, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeIn(List<String> values) {
            addCriterion("FBLOODTYPE in", values, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeNotIn(List<String> values) {
            addCriterion("FBLOODTYPE not in", values, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeBetween(String value1, String value2) {
            addCriterion("FBLOODTYPE between", value1, value2, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFbloodtypeNotBetween(String value1, String value2) {
            addCriterion("FBLOODTYPE not between", value1, value2, "fbloodtype");
            return (Criteria) this;
        }

        public Criteria andFdeptidIsNull() {
            addCriterion("FDEPTID is null");
            return (Criteria) this;
        }

        public Criteria andFdeptidIsNotNull() {
            addCriterion("FDEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptidEqualTo(String value) {
            addCriterion("FDEPTID =", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotEqualTo(String value) {
            addCriterion("FDEPTID <>", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThan(String value) {
            addCriterion("FDEPTID >", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThanOrEqualTo(String value) {
            addCriterion("FDEPTID >=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThan(String value) {
            addCriterion("FDEPTID <", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThanOrEqualTo(String value) {
            addCriterion("FDEPTID <=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLike(String value) {
            addCriterion("FDEPTID like", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotLike(String value) {
            addCriterion("FDEPTID not like", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidIn(List<String> values) {
            addCriterion("FDEPTID in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotIn(List<String> values) {
            addCriterion("FDEPTID not in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidBetween(String value1, String value2) {
            addCriterion("FDEPTID between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotBetween(String value1, String value2) {
            addCriterion("FDEPTID not between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFnicknameIsNull() {
            addCriterion("FNICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andFnicknameIsNotNull() {
            addCriterion("FNICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFnicknameEqualTo(String value) {
            addCriterion("FNICKNAME =", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotEqualTo(String value) {
            addCriterion("FNICKNAME <>", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameGreaterThan(String value) {
            addCriterion("FNICKNAME >", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("FNICKNAME >=", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLessThan(String value) {
            addCriterion("FNICKNAME <", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLessThanOrEqualTo(String value) {
            addCriterion("FNICKNAME <=", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLike(String value) {
            addCriterion("FNICKNAME like", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotLike(String value) {
            addCriterion("FNICKNAME not like", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameIn(List<String> values) {
            addCriterion("FNICKNAME in", values, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotIn(List<String> values) {
            addCriterion("FNICKNAME not in", values, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameBetween(String value1, String value2) {
            addCriterion("FNICKNAME between", value1, value2, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotBetween(String value1, String value2) {
            addCriterion("FNICKNAME not between", value1, value2, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnationIsNull() {
            addCriterion("FNATION is null");
            return (Criteria) this;
        }

        public Criteria andFnationIsNotNull() {
            addCriterion("FNATION is not null");
            return (Criteria) this;
        }

        public Criteria andFnationEqualTo(String value) {
            addCriterion("FNATION =", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotEqualTo(String value) {
            addCriterion("FNATION <>", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationGreaterThan(String value) {
            addCriterion("FNATION >", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationGreaterThanOrEqualTo(String value) {
            addCriterion("FNATION >=", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLessThan(String value) {
            addCriterion("FNATION <", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLessThanOrEqualTo(String value) {
            addCriterion("FNATION <=", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLike(String value) {
            addCriterion("FNATION like", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotLike(String value) {
            addCriterion("FNATION not like", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationIn(List<String> values) {
            addCriterion("FNATION in", values, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotIn(List<String> values) {
            addCriterion("FNATION not in", values, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationBetween(String value1, String value2) {
            addCriterion("FNATION between", value1, value2, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotBetween(String value1, String value2) {
            addCriterion("FNATION not between", value1, value2, "fnation");
            return (Criteria) this;
        }

        public Criteria andFmarriageIsNull() {
            addCriterion("FMARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andFmarriageIsNotNull() {
            addCriterion("FMARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFmarriageEqualTo(String value) {
            addCriterion("FMARRIAGE =", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageNotEqualTo(String value) {
            addCriterion("FMARRIAGE <>", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageGreaterThan(String value) {
            addCriterion("FMARRIAGE >", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageGreaterThanOrEqualTo(String value) {
            addCriterion("FMARRIAGE >=", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageLessThan(String value) {
            addCriterion("FMARRIAGE <", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageLessThanOrEqualTo(String value) {
            addCriterion("FMARRIAGE <=", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageLike(String value) {
            addCriterion("FMARRIAGE like", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageNotLike(String value) {
            addCriterion("FMARRIAGE not like", value, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageIn(List<String> values) {
            addCriterion("FMARRIAGE in", values, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageNotIn(List<String> values) {
            addCriterion("FMARRIAGE not in", values, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageBetween(String value1, String value2) {
            addCriterion("FMARRIAGE between", value1, value2, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFmarriageNotBetween(String value1, String value2) {
            addCriterion("FMARRIAGE not between", value1, value2, "fmarriage");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressIsNull() {
            addCriterion("FTEMPORARYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressIsNotNull() {
            addCriterion("FTEMPORARYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressEqualTo(String value) {
            addCriterion("FTEMPORARYADDRESS =", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressNotEqualTo(String value) {
            addCriterion("FTEMPORARYADDRESS <>", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressGreaterThan(String value) {
            addCriterion("FTEMPORARYADDRESS >", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FTEMPORARYADDRESS >=", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressLessThan(String value) {
            addCriterion("FTEMPORARYADDRESS <", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressLessThanOrEqualTo(String value) {
            addCriterion("FTEMPORARYADDRESS <=", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressLike(String value) {
            addCriterion("FTEMPORARYADDRESS like", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressNotLike(String value) {
            addCriterion("FTEMPORARYADDRESS not like", value, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressIn(List<String> values) {
            addCriterion("FTEMPORARYADDRESS in", values, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressNotIn(List<String> values) {
            addCriterion("FTEMPORARYADDRESS not in", values, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressBetween(String value1, String value2) {
            addCriterion("FTEMPORARYADDRESS between", value1, value2, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFtemporaryaddressNotBetween(String value1, String value2) {
            addCriterion("FTEMPORARYADDRESS not between", value1, value2, "ftemporaryaddress");
            return (Criteria) this;
        }

        public Criteria andFjobstateIsNull() {
            addCriterion("FJOBSTATE is null");
            return (Criteria) this;
        }

        public Criteria andFjobstateIsNotNull() {
            addCriterion("FJOBSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andFjobstateEqualTo(String value) {
            addCriterion("FJOBSTATE =", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateNotEqualTo(String value) {
            addCriterion("FJOBSTATE <>", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateGreaterThan(String value) {
            addCriterion("FJOBSTATE >", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateGreaterThanOrEqualTo(String value) {
            addCriterion("FJOBSTATE >=", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateLessThan(String value) {
            addCriterion("FJOBSTATE <", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateLessThanOrEqualTo(String value) {
            addCriterion("FJOBSTATE <=", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateLike(String value) {
            addCriterion("FJOBSTATE like", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateNotLike(String value) {
            addCriterion("FJOBSTATE not like", value, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateIn(List<String> values) {
            addCriterion("FJOBSTATE in", values, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateNotIn(List<String> values) {
            addCriterion("FJOBSTATE not in", values, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateBetween(String value1, String value2) {
            addCriterion("FJOBSTATE between", value1, value2, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFjobstateNotBetween(String value1, String value2) {
            addCriterion("FJOBSTATE not between", value1, value2, "fjobstate");
            return (Criteria) this;
        }

        public Criteria andFposnameIsNull() {
            addCriterion("FPOSNAME is null");
            return (Criteria) this;
        }

        public Criteria andFposnameIsNotNull() {
            addCriterion("FPOSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFposnameEqualTo(String value) {
            addCriterion("FPOSNAME =", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameNotEqualTo(String value) {
            addCriterion("FPOSNAME <>", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameGreaterThan(String value) {
            addCriterion("FPOSNAME >", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameGreaterThanOrEqualTo(String value) {
            addCriterion("FPOSNAME >=", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameLessThan(String value) {
            addCriterion("FPOSNAME <", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameLessThanOrEqualTo(String value) {
            addCriterion("FPOSNAME <=", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameLike(String value) {
            addCriterion("FPOSNAME like", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameNotLike(String value) {
            addCriterion("FPOSNAME not like", value, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameIn(List<String> values) {
            addCriterion("FPOSNAME in", values, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameNotIn(List<String> values) {
            addCriterion("FPOSNAME not in", values, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameBetween(String value1, String value2) {
            addCriterion("FPOSNAME between", value1, value2, "fposname");
            return (Criteria) this;
        }

        public Criteria andFposnameNotBetween(String value1, String value2) {
            addCriterion("FPOSNAME not between", value1, value2, "fposname");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("FTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("FTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("FTYPE =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("FTYPE <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("FTYPE >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FTYPE >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("FTYPE <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("FTYPE <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("FTYPE like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("FTYPE not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("FTYPE in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("FTYPE not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("FTYPE between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("FTYPE not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFadministrativeIsNull() {
            addCriterion("FADMINISTRATIVE is null");
            return (Criteria) this;
        }

        public Criteria andFadministrativeIsNotNull() {
            addCriterion("FADMINISTRATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andFadministrativeEqualTo(String value) {
            addCriterion("FADMINISTRATIVE =", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeNotEqualTo(String value) {
            addCriterion("FADMINISTRATIVE <>", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeGreaterThan(String value) {
            addCriterion("FADMINISTRATIVE >", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeGreaterThanOrEqualTo(String value) {
            addCriterion("FADMINISTRATIVE >=", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeLessThan(String value) {
            addCriterion("FADMINISTRATIVE <", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeLessThanOrEqualTo(String value) {
            addCriterion("FADMINISTRATIVE <=", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeLike(String value) {
            addCriterion("FADMINISTRATIVE like", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeNotLike(String value) {
            addCriterion("FADMINISTRATIVE not like", value, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeIn(List<String> values) {
            addCriterion("FADMINISTRATIVE in", values, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeNotIn(List<String> values) {
            addCriterion("FADMINISTRATIVE not in", values, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeBetween(String value1, String value2) {
            addCriterion("FADMINISTRATIVE between", value1, value2, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFadministrativeNotBetween(String value1, String value2) {
            addCriterion("FADMINISTRATIVE not between", value1, value2, "fadministrative");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeIsNull() {
            addCriterion("FTEMPORARYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeIsNotNull() {
            addCriterion("FTEMPORARYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeEqualTo(String value) {
            addCriterion("FTEMPORARYCODE =", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeNotEqualTo(String value) {
            addCriterion("FTEMPORARYCODE <>", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeGreaterThan(String value) {
            addCriterion("FTEMPORARYCODE >", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FTEMPORARYCODE >=", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeLessThan(String value) {
            addCriterion("FTEMPORARYCODE <", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeLessThanOrEqualTo(String value) {
            addCriterion("FTEMPORARYCODE <=", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeLike(String value) {
            addCriterion("FTEMPORARYCODE like", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeNotLike(String value) {
            addCriterion("FTEMPORARYCODE not like", value, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeIn(List<String> values) {
            addCriterion("FTEMPORARYCODE in", values, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeNotIn(List<String> values) {
            addCriterion("FTEMPORARYCODE not in", values, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeBetween(String value1, String value2) {
            addCriterion("FTEMPORARYCODE between", value1, value2, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFtemporarycodeNotBetween(String value1, String value2) {
            addCriterion("FTEMPORARYCODE not between", value1, value2, "ftemporarycode");
            return (Criteria) this;
        }

        public Criteria andFhiredateIsNull() {
            addCriterion("FHIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andFhiredateIsNotNull() {
            addCriterion("FHIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFhiredateEqualTo(Date value) {
            addCriterionForJDBCDate("FHIREDATE =", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FHIREDATE <>", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("FHIREDATE >", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FHIREDATE >=", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateLessThan(Date value) {
            addCriterionForJDBCDate("FHIREDATE <", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FHIREDATE <=", value, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateIn(List<Date> values) {
            addCriterionForJDBCDate("FHIREDATE in", values, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FHIREDATE not in", values, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FHIREDATE between", value1, value2, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFhiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FHIREDATE not between", value1, value2, "fhiredate");
            return (Criteria) this;
        }

        public Criteria andFTransmitIsNull() {
            addCriterion("F_TRANSMIT is null");
            return (Criteria) this;
        }

        public Criteria andFTransmitIsNotNull() {
            addCriterion("F_TRANSMIT is not null");
            return (Criteria) this;
        }

        public Criteria andFTransmitEqualTo(BigDecimal value) {
            addCriterion("F_TRANSMIT =", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitNotEqualTo(BigDecimal value) {
            addCriterion("F_TRANSMIT <>", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitGreaterThan(BigDecimal value) {
            addCriterion("F_TRANSMIT >", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_TRANSMIT >=", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitLessThan(BigDecimal value) {
            addCriterion("F_TRANSMIT <", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_TRANSMIT <=", value, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitIn(List<BigDecimal> values) {
            addCriterion("F_TRANSMIT in", values, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitNotIn(List<BigDecimal> values) {
            addCriterion("F_TRANSMIT not in", values, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_TRANSMIT between", value1, value2, "fTransmit");
            return (Criteria) this;
        }

        public Criteria andFTransmitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_TRANSMIT not between", value1, value2, "fTransmit");
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