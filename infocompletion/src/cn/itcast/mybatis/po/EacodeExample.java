package cn.itcast.mybatis.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EacodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EacodeExample() {
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

        public Criteria andFieldIsNull() {
            addCriterion("FIELD is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(String value) {
            addCriterion("FIELD =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(String value) {
            addCriterion("FIELD <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(String value) {
            addCriterion("FIELD >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(String value) {
            addCriterion("FIELD <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(String value) {
            addCriterion("FIELD <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLike(String value) {
            addCriterion("FIELD like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotLike(String value) {
            addCriterion("FIELD not like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<String> values) {
            addCriterion("FIELD in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<String> values) {
            addCriterion("FIELD not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(String value1, String value2) {
            addCriterion("FIELD between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(String value1, String value2) {
            addCriterion("FIELD not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNull() {
            addCriterion("FIELDNAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("FIELDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("FIELDNAME =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("FIELDNAME <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("FIELDNAME >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELDNAME >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("FIELDNAME <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("FIELDNAME <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("FIELDNAME like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("FIELDNAME not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("FIELDNAME in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("FIELDNAME not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("FIELDNAME between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("FIELDNAME not between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNull() {
            addCriterion("CODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNotNull() {
            addCriterion("CODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCodedescEqualTo(String value) {
            addCriterion("CODEDESC =", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotEqualTo(String value) {
            addCriterion("CODEDESC <>", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThan(String value) {
            addCriterion("CODEDESC >", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CODEDESC >=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThan(String value) {
            addCriterion("CODEDESC <", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThanOrEqualTo(String value) {
            addCriterion("CODEDESC <=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLike(String value) {
            addCriterion("CODEDESC like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotLike(String value) {
            addCriterion("CODEDESC not like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescIn(List<String> values) {
            addCriterion("CODEDESC in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotIn(List<String> values) {
            addCriterion("CODEDESC not in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescBetween(String value1, String value2) {
            addCriterion("CODEDESC between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotBetween(String value1, String value2) {
            addCriterion("CODEDESC not between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEditmodeIsNull() {
            addCriterion("EDITMODE is null");
            return (Criteria) this;
        }

        public Criteria andEditmodeIsNotNull() {
            addCriterion("EDITMODE is not null");
            return (Criteria) this;
        }

        public Criteria andEditmodeEqualTo(String value) {
            addCriterion("EDITMODE =", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeNotEqualTo(String value) {
            addCriterion("EDITMODE <>", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeGreaterThan(String value) {
            addCriterion("EDITMODE >", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeGreaterThanOrEqualTo(String value) {
            addCriterion("EDITMODE >=", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeLessThan(String value) {
            addCriterion("EDITMODE <", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeLessThanOrEqualTo(String value) {
            addCriterion("EDITMODE <=", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeLike(String value) {
            addCriterion("EDITMODE like", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeNotLike(String value) {
            addCriterion("EDITMODE not like", value, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeIn(List<String> values) {
            addCriterion("EDITMODE in", values, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeNotIn(List<String> values) {
            addCriterion("EDITMODE not in", values, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeBetween(String value1, String value2) {
            addCriterion("EDITMODE between", value1, value2, "editmode");
            return (Criteria) this;
        }

        public Criteria andEditmodeNotBetween(String value1, String value2) {
            addCriterion("EDITMODE not between", value1, value2, "editmode");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("SORTNO is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Short value) {
            addCriterion("SORTNO =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Short value) {
            addCriterion("SORTNO <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Short value) {
            addCriterion("SORTNO >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Short value) {
            addCriterion("SORTNO >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Short value) {
            addCriterion("SORTNO <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Short value) {
            addCriterion("SORTNO <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Short> values) {
            addCriterion("SORTNO in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Short> values) {
            addCriterion("SORTNO not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Short value1, Short value2) {
            addCriterion("SORTNO between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Short value1, Short value2) {
            addCriterion("SORTNO not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNull() {
            addCriterion("CODEID is null");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNotNull() {
            addCriterion("CODEID is not null");
            return (Criteria) this;
        }

        public Criteria andCodeidEqualTo(String value) {
            addCriterion("CODEID =", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotEqualTo(String value) {
            addCriterion("CODEID <>", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThan(String value) {
            addCriterion("CODEID >", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThanOrEqualTo(String value) {
            addCriterion("CODEID >=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThan(String value) {
            addCriterion("CODEID <", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThanOrEqualTo(String value) {
            addCriterion("CODEID <=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLike(String value) {
            addCriterion("CODEID like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotLike(String value) {
            addCriterion("CODEID not like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidIn(List<String> values) {
            addCriterion("CODEID in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotIn(List<String> values) {
            addCriterion("CODEID not in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidBetween(String value1, String value2) {
            addCriterion("CODEID between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotBetween(String value1, String value2) {
            addCriterion("CODEID not between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andSTransmitIsNull() {
            addCriterion("S_TRANSMIT is null");
            return (Criteria) this;
        }

        public Criteria andSTransmitIsNotNull() {
            addCriterion("S_TRANSMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSTransmitEqualTo(BigDecimal value) {
            addCriterion("S_TRANSMIT =", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitNotEqualTo(BigDecimal value) {
            addCriterion("S_TRANSMIT <>", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitGreaterThan(BigDecimal value) {
            addCriterion("S_TRANSMIT >", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_TRANSMIT >=", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitLessThan(BigDecimal value) {
            addCriterion("S_TRANSMIT <", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_TRANSMIT <=", value, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitIn(List<BigDecimal> values) {
            addCriterion("S_TRANSMIT in", values, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitNotIn(List<BigDecimal> values) {
            addCriterion("S_TRANSMIT not in", values, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_TRANSMIT between", value1, value2, "sTransmit");
            return (Criteria) this;
        }

        public Criteria andSTransmitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_TRANSMIT not between", value1, value2, "sTransmit");
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