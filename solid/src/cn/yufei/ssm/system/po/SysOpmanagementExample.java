package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysOpmanagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOpmanagementExample() {
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

        public Criteria andSorgidIsNull() {
            addCriterion("SORGID is null");
            return (Criteria) this;
        }

        public Criteria andSorgidIsNotNull() {
            addCriterion("SORGID is not null");
            return (Criteria) this;
        }

        public Criteria andSorgidEqualTo(String value) {
            addCriterion("SORGID =", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidNotEqualTo(String value) {
            addCriterion("SORGID <>", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidGreaterThan(String value) {
            addCriterion("SORGID >", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidGreaterThanOrEqualTo(String value) {
            addCriterion("SORGID >=", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidLessThan(String value) {
            addCriterion("SORGID <", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidLessThanOrEqualTo(String value) {
            addCriterion("SORGID <=", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidLike(String value) {
            addCriterion("SORGID like", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidNotLike(String value) {
            addCriterion("SORGID not like", value, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidIn(List<String> values) {
            addCriterion("SORGID in", values, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidNotIn(List<String> values) {
            addCriterion("SORGID not in", values, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidBetween(String value1, String value2) {
            addCriterion("SORGID between", value1, value2, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgidNotBetween(String value1, String value2) {
            addCriterion("SORGID not between", value1, value2, "sorgid");
            return (Criteria) this;
        }

        public Criteria andSorgnameIsNull() {
            addCriterion("SORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andSorgnameIsNotNull() {
            addCriterion("SORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSorgnameEqualTo(String value) {
            addCriterion("SORGNAME =", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameNotEqualTo(String value) {
            addCriterion("SORGNAME <>", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameGreaterThan(String value) {
            addCriterion("SORGNAME >", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("SORGNAME >=", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameLessThan(String value) {
            addCriterion("SORGNAME <", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameLessThanOrEqualTo(String value) {
            addCriterion("SORGNAME <=", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameLike(String value) {
            addCriterion("SORGNAME like", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameNotLike(String value) {
            addCriterion("SORGNAME not like", value, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameIn(List<String> values) {
            addCriterion("SORGNAME in", values, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameNotIn(List<String> values) {
            addCriterion("SORGNAME not in", values, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameBetween(String value1, String value2) {
            addCriterion("SORGNAME between", value1, value2, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgnameNotBetween(String value1, String value2) {
            addCriterion("SORGNAME not between", value1, value2, "sorgname");
            return (Criteria) this;
        }

        public Criteria andSorgfidIsNull() {
            addCriterion("SORGFID is null");
            return (Criteria) this;
        }

        public Criteria andSorgfidIsNotNull() {
            addCriterion("SORGFID is not null");
            return (Criteria) this;
        }

        public Criteria andSorgfidEqualTo(String value) {
            addCriterion("SORGFID =", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidNotEqualTo(String value) {
            addCriterion("SORGFID <>", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidGreaterThan(String value) {
            addCriterion("SORGFID >", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidGreaterThanOrEqualTo(String value) {
            addCriterion("SORGFID >=", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidLessThan(String value) {
            addCriterion("SORGFID <", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidLessThanOrEqualTo(String value) {
            addCriterion("SORGFID <=", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidLike(String value) {
            addCriterion("SORGFID like", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidNotLike(String value) {
            addCriterion("SORGFID not like", value, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidIn(List<String> values) {
            addCriterion("SORGFID in", values, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidNotIn(List<String> values) {
            addCriterion("SORGFID not in", values, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidBetween(String value1, String value2) {
            addCriterion("SORGFID between", value1, value2, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfidNotBetween(String value1, String value2) {
            addCriterion("SORGFID not between", value1, value2, "sorgfid");
            return (Criteria) this;
        }

        public Criteria andSorgfnameIsNull() {
            addCriterion("SORGFNAME is null");
            return (Criteria) this;
        }

        public Criteria andSorgfnameIsNotNull() {
            addCriterion("SORGFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSorgfnameEqualTo(String value) {
            addCriterion("SORGFNAME =", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameNotEqualTo(String value) {
            addCriterion("SORGFNAME <>", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameGreaterThan(String value) {
            addCriterion("SORGFNAME >", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SORGFNAME >=", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameLessThan(String value) {
            addCriterion("SORGFNAME <", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameLessThanOrEqualTo(String value) {
            addCriterion("SORGFNAME <=", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameLike(String value) {
            addCriterion("SORGFNAME like", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameNotLike(String value) {
            addCriterion("SORGFNAME not like", value, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameIn(List<String> values) {
            addCriterion("SORGFNAME in", values, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameNotIn(List<String> values) {
            addCriterion("SORGFNAME not in", values, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameBetween(String value1, String value2) {
            addCriterion("SORGFNAME between", value1, value2, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSorgfnameNotBetween(String value1, String value2) {
            addCriterion("SORGFNAME not between", value1, value2, "sorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidIsNull() {
            addCriterion("SMANAGEORGID is null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidIsNotNull() {
            addCriterion("SMANAGEORGID is not null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidEqualTo(String value) {
            addCriterion("SMANAGEORGID =", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidNotEqualTo(String value) {
            addCriterion("SMANAGEORGID <>", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidGreaterThan(String value) {
            addCriterion("SMANAGEORGID >", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGID >=", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidLessThan(String value) {
            addCriterion("SMANAGEORGID <", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidLessThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGID <=", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidLike(String value) {
            addCriterion("SMANAGEORGID like", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidNotLike(String value) {
            addCriterion("SMANAGEORGID not like", value, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidIn(List<String> values) {
            addCriterion("SMANAGEORGID in", values, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidNotIn(List<String> values) {
            addCriterion("SMANAGEORGID not in", values, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidBetween(String value1, String value2) {
            addCriterion("SMANAGEORGID between", value1, value2, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgidNotBetween(String value1, String value2) {
            addCriterion("SMANAGEORGID not between", value1, value2, "smanageorgid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameIsNull() {
            addCriterion("SMANAGEORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameIsNotNull() {
            addCriterion("SMANAGEORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameEqualTo(String value) {
            addCriterion("SMANAGEORGNAME =", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameNotEqualTo(String value) {
            addCriterion("SMANAGEORGNAME <>", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameGreaterThan(String value) {
            addCriterion("SMANAGEORGNAME >", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGNAME >=", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameLessThan(String value) {
            addCriterion("SMANAGEORGNAME <", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameLessThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGNAME <=", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameLike(String value) {
            addCriterion("SMANAGEORGNAME like", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameNotLike(String value) {
            addCriterion("SMANAGEORGNAME not like", value, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameIn(List<String> values) {
            addCriterion("SMANAGEORGNAME in", values, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameNotIn(List<String> values) {
            addCriterion("SMANAGEORGNAME not in", values, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameBetween(String value1, String value2) {
            addCriterion("SMANAGEORGNAME between", value1, value2, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgnameNotBetween(String value1, String value2) {
            addCriterion("SMANAGEORGNAME not between", value1, value2, "smanageorgname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidIsNull() {
            addCriterion("SMANAGEORGFID is null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidIsNotNull() {
            addCriterion("SMANAGEORGFID is not null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidEqualTo(String value) {
            addCriterion("SMANAGEORGFID =", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidNotEqualTo(String value) {
            addCriterion("SMANAGEORGFID <>", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidGreaterThan(String value) {
            addCriterion("SMANAGEORGFID >", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGFID >=", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidLessThan(String value) {
            addCriterion("SMANAGEORGFID <", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidLessThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGFID <=", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidLike(String value) {
            addCriterion("SMANAGEORGFID like", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidNotLike(String value) {
            addCriterion("SMANAGEORGFID not like", value, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidIn(List<String> values) {
            addCriterion("SMANAGEORGFID in", values, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidNotIn(List<String> values) {
            addCriterion("SMANAGEORGFID not in", values, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidBetween(String value1, String value2) {
            addCriterion("SMANAGEORGFID between", value1, value2, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfidNotBetween(String value1, String value2) {
            addCriterion("SMANAGEORGFID not between", value1, value2, "smanageorgfid");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameIsNull() {
            addCriterion("SMANAGEORGFNAME is null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameIsNotNull() {
            addCriterion("SMANAGEORGFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameEqualTo(String value) {
            addCriterion("SMANAGEORGFNAME =", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameNotEqualTo(String value) {
            addCriterion("SMANAGEORGFNAME <>", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameGreaterThan(String value) {
            addCriterion("SMANAGEORGFNAME >", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGFNAME >=", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameLessThan(String value) {
            addCriterion("SMANAGEORGFNAME <", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameLessThanOrEqualTo(String value) {
            addCriterion("SMANAGEORGFNAME <=", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameLike(String value) {
            addCriterion("SMANAGEORGFNAME like", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameNotLike(String value) {
            addCriterion("SMANAGEORGFNAME not like", value, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameIn(List<String> values) {
            addCriterion("SMANAGEORGFNAME in", values, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameNotIn(List<String> values) {
            addCriterion("SMANAGEORGFNAME not in", values, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameBetween(String value1, String value2) {
            addCriterion("SMANAGEORGFNAME between", value1, value2, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanageorgfnameNotBetween(String value1, String value2) {
            addCriterion("SMANAGEORGFNAME not between", value1, value2, "smanageorgfname");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidIsNull() {
            addCriterion("SMANAGETYPEID is null");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidIsNotNull() {
            addCriterion("SMANAGETYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidEqualTo(String value) {
            addCriterion("SMANAGETYPEID =", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidNotEqualTo(String value) {
            addCriterion("SMANAGETYPEID <>", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidGreaterThan(String value) {
            addCriterion("SMANAGETYPEID >", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGETYPEID >=", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidLessThan(String value) {
            addCriterion("SMANAGETYPEID <", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidLessThanOrEqualTo(String value) {
            addCriterion("SMANAGETYPEID <=", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidLike(String value) {
            addCriterion("SMANAGETYPEID like", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidNotLike(String value) {
            addCriterion("SMANAGETYPEID not like", value, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidIn(List<String> values) {
            addCriterion("SMANAGETYPEID in", values, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidNotIn(List<String> values) {
            addCriterion("SMANAGETYPEID not in", values, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidBetween(String value1, String value2) {
            addCriterion("SMANAGETYPEID between", value1, value2, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andSmanagetypeidNotBetween(String value1, String value2) {
            addCriterion("SMANAGETYPEID not between", value1, value2, "smanagetypeid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidIsNull() {
            addCriterion("SCREATORFID is null");
            return (Criteria) this;
        }

        public Criteria andScreatorfidIsNotNull() {
            addCriterion("SCREATORFID is not null");
            return (Criteria) this;
        }

        public Criteria andScreatorfidEqualTo(String value) {
            addCriterion("SCREATORFID =", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidNotEqualTo(String value) {
            addCriterion("SCREATORFID <>", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidGreaterThan(String value) {
            addCriterion("SCREATORFID >", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidGreaterThanOrEqualTo(String value) {
            addCriterion("SCREATORFID >=", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidLessThan(String value) {
            addCriterion("SCREATORFID <", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidLessThanOrEqualTo(String value) {
            addCriterion("SCREATORFID <=", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidLike(String value) {
            addCriterion("SCREATORFID like", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidNotLike(String value) {
            addCriterion("SCREATORFID not like", value, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidIn(List<String> values) {
            addCriterion("SCREATORFID in", values, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidNotIn(List<String> values) {
            addCriterion("SCREATORFID not in", values, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidBetween(String value1, String value2) {
            addCriterion("SCREATORFID between", value1, value2, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfidNotBetween(String value1, String value2) {
            addCriterion("SCREATORFID not between", value1, value2, "screatorfid");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameIsNull() {
            addCriterion("SCREATORFNAME is null");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameIsNotNull() {
            addCriterion("SCREATORFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameEqualTo(String value) {
            addCriterion("SCREATORFNAME =", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameNotEqualTo(String value) {
            addCriterion("SCREATORFNAME <>", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameGreaterThan(String value) {
            addCriterion("SCREATORFNAME >", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SCREATORFNAME >=", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameLessThan(String value) {
            addCriterion("SCREATORFNAME <", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameLessThanOrEqualTo(String value) {
            addCriterion("SCREATORFNAME <=", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameLike(String value) {
            addCriterion("SCREATORFNAME like", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameNotLike(String value) {
            addCriterion("SCREATORFNAME not like", value, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameIn(List<String> values) {
            addCriterion("SCREATORFNAME in", values, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameNotIn(List<String> values) {
            addCriterion("SCREATORFNAME not in", values, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameBetween(String value1, String value2) {
            addCriterion("SCREATORFNAME between", value1, value2, "screatorfname");
            return (Criteria) this;
        }

        public Criteria andScreatorfnameNotBetween(String value1, String value2) {
            addCriterion("SCREATORFNAME not between", value1, value2, "screatorfname");
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

        public Criteria andSmanagetypenameIsNull() {
            addCriterion("SMANAGETYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameIsNotNull() {
            addCriterion("SMANAGETYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameEqualTo(String value) {
            addCriterion("SMANAGETYPENAME =", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameNotEqualTo(String value) {
            addCriterion("SMANAGETYPENAME <>", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameGreaterThan(String value) {
            addCriterion("SMANAGETYPENAME >", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("SMANAGETYPENAME >=", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameLessThan(String value) {
            addCriterion("SMANAGETYPENAME <", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameLessThanOrEqualTo(String value) {
            addCriterion("SMANAGETYPENAME <=", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameLike(String value) {
            addCriterion("SMANAGETYPENAME like", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameNotLike(String value) {
            addCriterion("SMANAGETYPENAME not like", value, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameIn(List<String> values) {
            addCriterion("SMANAGETYPENAME in", values, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameNotIn(List<String> values) {
            addCriterion("SMANAGETYPENAME not in", values, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameBetween(String value1, String value2) {
            addCriterion("SMANAGETYPENAME between", value1, value2, "smanagetypename");
            return (Criteria) this;
        }

        public Criteria andSmanagetypenameNotBetween(String value1, String value2) {
            addCriterion("SMANAGETYPENAME not between", value1, value2, "smanagetypename");
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