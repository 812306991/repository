package cn.yufei.ssm.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andFusernameIsNull() {
            addCriterion("FUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andFusernameIsNotNull() {
            addCriterion("FUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFusernameEqualTo(String value) {
            addCriterion("FUSERNAME =", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotEqualTo(String value) {
            addCriterion("FUSERNAME <>", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThan(String value) {
            addCriterion("FUSERNAME >", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThanOrEqualTo(String value) {
            addCriterion("FUSERNAME >=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThan(String value) {
            addCriterion("FUSERNAME <", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThanOrEqualTo(String value) {
            addCriterion("FUSERNAME <=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLike(String value) {
            addCriterion("FUSERNAME like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotLike(String value) {
            addCriterion("FUSERNAME not like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameIn(List<String> values) {
            addCriterion("FUSERNAME in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotIn(List<String> values) {
            addCriterion("FUSERNAME not in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameBetween(String value1, String value2) {
            addCriterion("FUSERNAME between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotBetween(String value1, String value2) {
            addCriterion("FUSERNAME not between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFbirthdayIsNull() {
            addCriterion("FBIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andFbirthdayIsNotNull() {
            addCriterion("FBIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andFbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY =", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY <>", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY >", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY >=", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY <", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FBIRTHDAY <=", value, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("FBIRTHDAY in", values, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("FBIRTHDAY not in", values, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBIRTHDAY between", value1, value2, "fbirthday");
            return (Criteria) this;
        }

        public Criteria andFbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FBIRTHDAY not between", value1, value2, "fbirthday");
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