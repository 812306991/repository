package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andFpriceIsNull() {
            addCriterion("FPRICE is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("FPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(BigDecimal value) {
            addCriterion("FPRICE =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(BigDecimal value) {
            addCriterion("FPRICE <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(BigDecimal value) {
            addCriterion("FPRICE >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPRICE >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(BigDecimal value) {
            addCriterion("FPRICE <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPRICE <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<BigDecimal> values) {
            addCriterion("FPRICE in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<BigDecimal> values) {
            addCriterion("FPRICE not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPRICE between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPRICE not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFdetailIsNull() {
            addCriterion("FDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andFdetailIsNotNull() {
            addCriterion("FDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andFdetailEqualTo(String value) {
            addCriterion("FDETAIL =", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailNotEqualTo(String value) {
            addCriterion("FDETAIL <>", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailGreaterThan(String value) {
            addCriterion("FDETAIL >", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailGreaterThanOrEqualTo(String value) {
            addCriterion("FDETAIL >=", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailLessThan(String value) {
            addCriterion("FDETAIL <", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailLessThanOrEqualTo(String value) {
            addCriterion("FDETAIL <=", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailLike(String value) {
            addCriterion("FDETAIL like", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailNotLike(String value) {
            addCriterion("FDETAIL not like", value, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailIn(List<String> values) {
            addCriterion("FDETAIL in", values, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailNotIn(List<String> values) {
            addCriterion("FDETAIL not in", values, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailBetween(String value1, String value2) {
            addCriterion("FDETAIL between", value1, value2, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFdetailNotBetween(String value1, String value2) {
            addCriterion("FDETAIL not between", value1, value2, "fdetail");
            return (Criteria) this;
        }

        public Criteria andFpicIsNull() {
            addCriterion("FPIC is null");
            return (Criteria) this;
        }

        public Criteria andFpicIsNotNull() {
            addCriterion("FPIC is not null");
            return (Criteria) this;
        }

        public Criteria andFpicEqualTo(String value) {
            addCriterion("FPIC =", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotEqualTo(String value) {
            addCriterion("FPIC <>", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicGreaterThan(String value) {
            addCriterion("FPIC >", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicGreaterThanOrEqualTo(String value) {
            addCriterion("FPIC >=", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLessThan(String value) {
            addCriterion("FPIC <", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLessThanOrEqualTo(String value) {
            addCriterion("FPIC <=", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicLike(String value) {
            addCriterion("FPIC like", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotLike(String value) {
            addCriterion("FPIC not like", value, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicIn(List<String> values) {
            addCriterion("FPIC in", values, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotIn(List<String> values) {
            addCriterion("FPIC not in", values, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicBetween(String value1, String value2) {
            addCriterion("FPIC between", value1, value2, "fpic");
            return (Criteria) this;
        }

        public Criteria andFpicNotBetween(String value1, String value2) {
            addCriterion("FPIC not between", value1, value2, "fpic");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNull() {
            addCriterion("FCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNotNull() {
            addCriterion("FCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("FCREATETIME =", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FCREATETIME <>", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FCREATETIME >", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FCREATETIME >=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("FCREATETIME <", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FCREATETIME <=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("FCREATETIME in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FCREATETIME not in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FCREATETIME between", value1, value2, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FCREATETIME not between", value1, value2, "fcreatetime");
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