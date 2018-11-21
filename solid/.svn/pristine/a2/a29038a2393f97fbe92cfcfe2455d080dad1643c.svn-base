package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysDatabackupsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDatabackupsExample() {
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

        public Criteria andSbackupnameIsNull() {
            addCriterion("SBACKUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andSbackupnameIsNotNull() {
            addCriterion("SBACKUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSbackupnameEqualTo(String value) {
            addCriterion("SBACKUPNAME =", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameNotEqualTo(String value) {
            addCriterion("SBACKUPNAME <>", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameGreaterThan(String value) {
            addCriterion("SBACKUPNAME >", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameGreaterThanOrEqualTo(String value) {
            addCriterion("SBACKUPNAME >=", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameLessThan(String value) {
            addCriterion("SBACKUPNAME <", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameLessThanOrEqualTo(String value) {
            addCriterion("SBACKUPNAME <=", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameLike(String value) {
            addCriterion("SBACKUPNAME like", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameNotLike(String value) {
            addCriterion("SBACKUPNAME not like", value, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameIn(List<String> values) {
            addCriterion("SBACKUPNAME in", values, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameNotIn(List<String> values) {
            addCriterion("SBACKUPNAME not in", values, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameBetween(String value1, String value2) {
            addCriterion("SBACKUPNAME between", value1, value2, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackupnameNotBetween(String value1, String value2) {
            addCriterion("SBACKUPNAME not between", value1, value2, "sbackupname");
            return (Criteria) this;
        }

        public Criteria andSbackuppathIsNull() {
            addCriterion("SBACKUPPATH is null");
            return (Criteria) this;
        }

        public Criteria andSbackuppathIsNotNull() {
            addCriterion("SBACKUPPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSbackuppathEqualTo(String value) {
            addCriterion("SBACKUPPATH =", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathNotEqualTo(String value) {
            addCriterion("SBACKUPPATH <>", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathGreaterThan(String value) {
            addCriterion("SBACKUPPATH >", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathGreaterThanOrEqualTo(String value) {
            addCriterion("SBACKUPPATH >=", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathLessThan(String value) {
            addCriterion("SBACKUPPATH <", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathLessThanOrEqualTo(String value) {
            addCriterion("SBACKUPPATH <=", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathLike(String value) {
            addCriterion("SBACKUPPATH like", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathNotLike(String value) {
            addCriterion("SBACKUPPATH not like", value, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathIn(List<String> values) {
            addCriterion("SBACKUPPATH in", values, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathNotIn(List<String> values) {
            addCriterion("SBACKUPPATH not in", values, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathBetween(String value1, String value2) {
            addCriterion("SBACKUPPATH between", value1, value2, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackuppathNotBetween(String value1, String value2) {
            addCriterion("SBACKUPPATH not between", value1, value2, "sbackuppath");
            return (Criteria) this;
        }

        public Criteria andSbackupdataIsNull() {
            addCriterion("SBACKUPDATA is null");
            return (Criteria) this;
        }

        public Criteria andSbackupdataIsNotNull() {
            addCriterion("SBACKUPDATA is not null");
            return (Criteria) this;
        }

        public Criteria andSbackupdataEqualTo(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA =", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataNotEqualTo(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA <>", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataGreaterThan(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA >", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA >=", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataLessThan(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA <", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SBACKUPDATA <=", value, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataIn(List<Date> values) {
            addCriterionForJDBCDate("SBACKUPDATA in", values, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataNotIn(List<Date> values) {
            addCriterionForJDBCDate("SBACKUPDATA not in", values, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SBACKUPDATA between", value1, value2, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andSbackupdataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SBACKUPDATA not between", value1, value2, "sbackupdata");
            return (Criteria) this;
        }

        public Criteria andScreatornameIsNull() {
            addCriterion("SCREATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andScreatornameIsNotNull() {
            addCriterion("SCREATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andScreatornameEqualTo(String value) {
            addCriterion("SCREATORNAME =", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameNotEqualTo(String value) {
            addCriterion("SCREATORNAME <>", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameGreaterThan(String value) {
            addCriterion("SCREATORNAME >", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("SCREATORNAME >=", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameLessThan(String value) {
            addCriterion("SCREATORNAME <", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameLessThanOrEqualTo(String value) {
            addCriterion("SCREATORNAME <=", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameLike(String value) {
            addCriterion("SCREATORNAME like", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameNotLike(String value) {
            addCriterion("SCREATORNAME not like", value, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameIn(List<String> values) {
            addCriterion("SCREATORNAME in", values, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameNotIn(List<String> values) {
            addCriterion("SCREATORNAME not in", values, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameBetween(String value1, String value2) {
            addCriterion("SCREATORNAME between", value1, value2, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatornameNotBetween(String value1, String value2) {
            addCriterion("SCREATORNAME not between", value1, value2, "screatorname");
            return (Criteria) this;
        }

        public Criteria andScreatoridIsNull() {
            addCriterion("SCREATORID is null");
            return (Criteria) this;
        }

        public Criteria andScreatoridIsNotNull() {
            addCriterion("SCREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andScreatoridEqualTo(String value) {
            addCriterion("SCREATORID =", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridNotEqualTo(String value) {
            addCriterion("SCREATORID <>", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridGreaterThan(String value) {
            addCriterion("SCREATORID >", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("SCREATORID >=", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridLessThan(String value) {
            addCriterion("SCREATORID <", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridLessThanOrEqualTo(String value) {
            addCriterion("SCREATORID <=", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridLike(String value) {
            addCriterion("SCREATORID like", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridNotLike(String value) {
            addCriterion("SCREATORID not like", value, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridIn(List<String> values) {
            addCriterion("SCREATORID in", values, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridNotIn(List<String> values) {
            addCriterion("SCREATORID not in", values, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridBetween(String value1, String value2) {
            addCriterion("SCREATORID between", value1, value2, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatoridNotBetween(String value1, String value2) {
            addCriterion("SCREATORID not between", value1, value2, "screatorid");
            return (Criteria) this;
        }

        public Criteria andScreatortimeIsNull() {
            addCriterion("SCREATORTIME is null");
            return (Criteria) this;
        }

        public Criteria andScreatortimeIsNotNull() {
            addCriterion("SCREATORTIME is not null");
            return (Criteria) this;
        }

        public Criteria andScreatortimeEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATORTIME =", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATORTIME <>", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SCREATORTIME >", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATORTIME >=", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeLessThan(Date value) {
            addCriterionForJDBCDate("SCREATORTIME <", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCREATORTIME <=", value, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeIn(List<Date> values) {
            addCriterionForJDBCDate("SCREATORTIME in", values, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCREATORTIME not in", values, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCREATORTIME between", value1, value2, "screatortime");
            return (Criteria) this;
        }

        public Criteria andScreatortimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCREATORTIME not between", value1, value2, "screatortime");
            return (Criteria) this;
        }

        public Criteria andSflagIsNull() {
            addCriterion("SFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSflagIsNotNull() {
            addCriterion("SFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSflagEqualTo(String value) {
            addCriterion("SFLAG =", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotEqualTo(String value) {
            addCriterion("SFLAG <>", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagGreaterThan(String value) {
            addCriterion("SFLAG >", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagGreaterThanOrEqualTo(String value) {
            addCriterion("SFLAG >=", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagLessThan(String value) {
            addCriterion("SFLAG <", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagLessThanOrEqualTo(String value) {
            addCriterion("SFLAG <=", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagLike(String value) {
            addCriterion("SFLAG like", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotLike(String value) {
            addCriterion("SFLAG not like", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagIn(List<String> values) {
            addCriterion("SFLAG in", values, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotIn(List<String> values) {
            addCriterion("SFLAG not in", values, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagBetween(String value1, String value2) {
            addCriterion("SFLAG between", value1, value2, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotBetween(String value1, String value2) {
            addCriterion("SFLAG not between", value1, value2, "sflag");
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