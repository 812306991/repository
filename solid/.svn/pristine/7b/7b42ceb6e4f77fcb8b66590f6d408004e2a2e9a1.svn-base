package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("SID like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("SID not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("SID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSipIsNull() {
            addCriterion("SIP is null");
            return (Criteria) this;
        }

        public Criteria andSipIsNotNull() {
            addCriterion("SIP is not null");
            return (Criteria) this;
        }

        public Criteria andSipEqualTo(String value) {
            addCriterion("SIP =", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipNotEqualTo(String value) {
            addCriterion("SIP <>", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipGreaterThan(String value) {
            addCriterion("SIP >", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipGreaterThanOrEqualTo(String value) {
            addCriterion("SIP >=", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipLessThan(String value) {
            addCriterion("SIP <", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipLessThanOrEqualTo(String value) {
            addCriterion("SIP <=", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipLike(String value) {
            addCriterion("SIP like", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipNotLike(String value) {
            addCriterion("SIP not like", value, "sip");
            return (Criteria) this;
        }

        public Criteria andSipIn(List<String> values) {
            addCriterion("SIP in", values, "sip");
            return (Criteria) this;
        }

        public Criteria andSipNotIn(List<String> values) {
            addCriterion("SIP not in", values, "sip");
            return (Criteria) this;
        }

        public Criteria andSipBetween(String value1, String value2) {
            addCriterion("SIP between", value1, value2, "sip");
            return (Criteria) this;
        }

        public Criteria andSipNotBetween(String value1, String value2) {
            addCriterion("SIP not between", value1, value2, "sip");
            return (Criteria) this;
        }

        public Criteria andSfunctionIsNull() {
            addCriterion("SFUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andSfunctionIsNotNull() {
            addCriterion("SFUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andSfunctionEqualTo(String value) {
            addCriterion("SFUNCTION =", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionNotEqualTo(String value) {
            addCriterion("SFUNCTION <>", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionGreaterThan(String value) {
            addCriterion("SFUNCTION >", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionGreaterThanOrEqualTo(String value) {
            addCriterion("SFUNCTION >=", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionLessThan(String value) {
            addCriterion("SFUNCTION <", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionLessThanOrEqualTo(String value) {
            addCriterion("SFUNCTION <=", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionLike(String value) {
            addCriterion("SFUNCTION like", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionNotLike(String value) {
            addCriterion("SFUNCTION not like", value, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionIn(List<String> values) {
            addCriterion("SFUNCTION in", values, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionNotIn(List<String> values) {
            addCriterion("SFUNCTION not in", values, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionBetween(String value1, String value2) {
            addCriterion("SFUNCTION between", value1, value2, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSfunctionNotBetween(String value1, String value2) {
            addCriterion("SFUNCTION not between", value1, value2, "sfunction");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNull() {
            addCriterion("SUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNotNull() {
            addCriterion("SUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSusernameEqualTo(String value) {
            addCriterion("SUSERNAME =", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotEqualTo(String value) {
            addCriterion("SUSERNAME <>", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThan(String value) {
            addCriterion("SUSERNAME >", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThanOrEqualTo(String value) {
            addCriterion("SUSERNAME >=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThan(String value) {
            addCriterion("SUSERNAME <", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThanOrEqualTo(String value) {
            addCriterion("SUSERNAME <=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLike(String value) {
            addCriterion("SUSERNAME like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotLike(String value) {
            addCriterion("SUSERNAME not like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameIn(List<String> values) {
            addCriterion("SUSERNAME in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotIn(List<String> values) {
            addCriterion("SUSERNAME not in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameBetween(String value1, String value2) {
            addCriterion("SUSERNAME between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotBetween(String value1, String value2) {
            addCriterion("SUSERNAME not between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSuseridIsNull() {
            addCriterion("SUSERID is null");
            return (Criteria) this;
        }

        public Criteria andSuseridIsNotNull() {
            addCriterion("SUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andSuseridEqualTo(String value) {
            addCriterion("SUSERID =", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridNotEqualTo(String value) {
            addCriterion("SUSERID <>", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridGreaterThan(String value) {
            addCriterion("SUSERID >", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SUSERID >=", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridLessThan(String value) {
            addCriterion("SUSERID <", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridLessThanOrEqualTo(String value) {
            addCriterion("SUSERID <=", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridLike(String value) {
            addCriterion("SUSERID like", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridNotLike(String value) {
            addCriterion("SUSERID not like", value, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridIn(List<String> values) {
            addCriterion("SUSERID in", values, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridNotIn(List<String> values) {
            addCriterion("SUSERID not in", values, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridBetween(String value1, String value2) {
            addCriterion("SUSERID between", value1, value2, "suserid");
            return (Criteria) this;
        }

        public Criteria andSuseridNotBetween(String value1, String value2) {
            addCriterion("SUSERID not between", value1, value2, "suserid");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIsNull() {
            addCriterion("SCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIsNotNull() {
            addCriterion("SCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andScreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATETIME =", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATETIME <>", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SCREATETIME >", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATETIME >=", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("SCREATETIME <", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATETIME <=", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("SCREATETIME in", values, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCREATETIME not in", values, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCREATETIME between", value1, value2, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCREATETIME not between", value1, value2, "screatetime");
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

        public Criteria andSdescriptionIsNull() {
            addCriterion("SDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andSdescriptionIsNotNull() {
            addCriterion("SDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andSdescriptionEqualTo(String value) {
            addCriterion("SDESCRIPTION =", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionNotEqualTo(String value) {
            addCriterion("SDESCRIPTION <>", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionGreaterThan(String value) {
            addCriterion("SDESCRIPTION >", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SDESCRIPTION >=", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionLessThan(String value) {
            addCriterion("SDESCRIPTION <", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionLessThanOrEqualTo(String value) {
            addCriterion("SDESCRIPTION <=", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionLike(String value) {
            addCriterion("SDESCRIPTION like", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionNotLike(String value) {
            addCriterion("SDESCRIPTION not like", value, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionIn(List<String> values) {
            addCriterion("SDESCRIPTION in", values, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionNotIn(List<String> values) {
            addCriterion("SDESCRIPTION not in", values, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionBetween(String value1, String value2) {
            addCriterion("SDESCRIPTION between", value1, value2, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSdescriptionNotBetween(String value1, String value2) {
            addCriterion("SDESCRIPTION not between", value1, value2, "sdescription");
            return (Criteria) this;
        }

        public Criteria andSexceptionIsNull() {
            addCriterion("SEXCEPTION is null");
            return (Criteria) this;
        }

        public Criteria andSexceptionIsNotNull() {
            addCriterion("SEXCEPTION is not null");
            return (Criteria) this;
        }

        public Criteria andSexceptionEqualTo(String value) {
            addCriterion("SEXCEPTION =", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionNotEqualTo(String value) {
            addCriterion("SEXCEPTION <>", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionGreaterThan(String value) {
            addCriterion("SEXCEPTION >", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionGreaterThanOrEqualTo(String value) {
            addCriterion("SEXCEPTION >=", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionLessThan(String value) {
            addCriterion("SEXCEPTION <", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionLessThanOrEqualTo(String value) {
            addCriterion("SEXCEPTION <=", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionLike(String value) {
            addCriterion("SEXCEPTION like", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionNotLike(String value) {
            addCriterion("SEXCEPTION not like", value, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionIn(List<String> values) {
            addCriterion("SEXCEPTION in", values, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionNotIn(List<String> values) {
            addCriterion("SEXCEPTION not in", values, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionBetween(String value1, String value2) {
            addCriterion("SEXCEPTION between", value1, value2, "sexception");
            return (Criteria) this;
        }

        public Criteria andSexceptionNotBetween(String value1, String value2) {
            addCriterion("SEXCEPTION not between", value1, value2, "sexception");
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