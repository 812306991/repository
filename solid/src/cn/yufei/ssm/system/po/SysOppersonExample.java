package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysOppersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOppersonExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("SNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("SNAME =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("SNAME <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("SNAME >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("SNAME >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("SNAME <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("SNAME <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("SNAME like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("SNAME not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("SNAME in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("SNAME not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("SNAME between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("SNAME not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andScodeIsNull() {
            addCriterion("SCODE is null");
            return (Criteria) this;
        }

        public Criteria andScodeIsNotNull() {
            addCriterion("SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andScodeEqualTo(String value) {
            addCriterion("SCODE =", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotEqualTo(String value) {
            addCriterion("SCODE <>", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThan(String value) {
            addCriterion("SCODE >", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCODE >=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThan(String value) {
            addCriterion("SCODE <", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThanOrEqualTo(String value) {
            addCriterion("SCODE <=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLike(String value) {
            addCriterion("SCODE like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotLike(String value) {
            addCriterion("SCODE not like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeIn(List<String> values) {
            addCriterion("SCODE in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotIn(List<String> values) {
            addCriterion("SCODE not in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeBetween(String value1, String value2) {
            addCriterion("SCODE between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotBetween(String value1, String value2) {
            addCriterion("SCODE not between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNull() {
            addCriterion("SIDCARD is null");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNotNull() {
            addCriterion("SIDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andSidcardEqualTo(String value) {
            addCriterion("SIDCARD =", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotEqualTo(String value) {
            addCriterion("SIDCARD <>", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThan(String value) {
            addCriterion("SIDCARD >", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThanOrEqualTo(String value) {
            addCriterion("SIDCARD >=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThan(String value) {
            addCriterion("SIDCARD <", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThanOrEqualTo(String value) {
            addCriterion("SIDCARD <=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLike(String value) {
            addCriterion("SIDCARD like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotLike(String value) {
            addCriterion("SIDCARD not like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardIn(List<String> values) {
            addCriterion("SIDCARD in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotIn(List<String> values) {
            addCriterion("SIDCARD not in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardBetween(String value1, String value2) {
            addCriterion("SIDCARD between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotBetween(String value1, String value2) {
            addCriterion("SIDCARD not between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSnumbIsNull() {
            addCriterion("SNUMB is null");
            return (Criteria) this;
        }

        public Criteria andSnumbIsNotNull() {
            addCriterion("SNUMB is not null");
            return (Criteria) this;
        }

        public Criteria andSnumbEqualTo(BigDecimal value) {
            addCriterion("SNUMB =", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbNotEqualTo(BigDecimal value) {
            addCriterion("SNUMB <>", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbGreaterThan(BigDecimal value) {
            addCriterion("SNUMB >", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SNUMB >=", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbLessThan(BigDecimal value) {
            addCriterion("SNUMB <", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SNUMB <=", value, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbIn(List<BigDecimal> values) {
            addCriterion("SNUMB in", values, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbNotIn(List<BigDecimal> values) {
            addCriterion("SNUMB not in", values, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SNUMB between", value1, value2, "snumb");
            return (Criteria) this;
        }

        public Criteria andSnumbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SNUMB not between", value1, value2, "snumb");
            return (Criteria) this;
        }

        public Criteria andSloginnameIsNull() {
            addCriterion("SLOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andSloginnameIsNotNull() {
            addCriterion("SLOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSloginnameEqualTo(String value) {
            addCriterion("SLOGINNAME =", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameNotEqualTo(String value) {
            addCriterion("SLOGINNAME <>", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameGreaterThan(String value) {
            addCriterion("SLOGINNAME >", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("SLOGINNAME >=", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameLessThan(String value) {
            addCriterion("SLOGINNAME <", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameLessThanOrEqualTo(String value) {
            addCriterion("SLOGINNAME <=", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameLike(String value) {
            addCriterion("SLOGINNAME like", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameNotLike(String value) {
            addCriterion("SLOGINNAME not like", value, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameIn(List<String> values) {
            addCriterion("SLOGINNAME in", values, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameNotIn(List<String> values) {
            addCriterion("SLOGINNAME not in", values, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameBetween(String value1, String value2) {
            addCriterion("SLOGINNAME between", value1, value2, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSloginnameNotBetween(String value1, String value2) {
            addCriterion("SLOGINNAME not between", value1, value2, "sloginname");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("SPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("SPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("SPASSWORD =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("SPASSWORD <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("SPASSWORD >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("SPASSWORD >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("SPASSWORD <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("SPASSWORD <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("SPASSWORD like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("SPASSWORD not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("SPASSWORD in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("SPASSWORD not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("SPASSWORD between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("SPASSWORD not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitIsNull() {
            addCriterion("SPASSWORDTIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitIsNotNull() {
            addCriterion("SPASSWORDTIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitEqualTo(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT =", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitNotEqualTo(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT <>", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitGreaterThan(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT >", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT >=", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitLessThan(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT <", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPASSWORDTIMELIMIT <=", value, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitIn(List<BigDecimal> values) {
            addCriterion("SPASSWORDTIMELIMIT in", values, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitNotIn(List<BigDecimal> values) {
            addCriterion("SPASSWORDTIMELIMIT not in", values, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPASSWORDTIMELIMIT between", value1, value2, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordtimelimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPASSWORDTIMELIMIT not between", value1, value2, "spasswordtimelimit");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeIsNull() {
            addCriterion("SPASSWORDMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeIsNotNull() {
            addCriterion("SPASSWORDMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeEqualTo(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME =", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME <>", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME >", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME >=", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeLessThan(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME <", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME <=", value, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeIn(List<Date> values) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME in", values, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME not in", values, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME between", value1, value2, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSpasswordmodifytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SPASSWORDMODIFYTIME not between", value1, value2, "spasswordmodifytime");
            return (Criteria) this;
        }

        public Criteria andSmainorgidIsNull() {
            addCriterion("SMAINORGID is null");
            return (Criteria) this;
        }

        public Criteria andSmainorgidIsNotNull() {
            addCriterion("SMAINORGID is not null");
            return (Criteria) this;
        }

        public Criteria andSmainorgidEqualTo(String value) {
            addCriterion("SMAINORGID =", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidNotEqualTo(String value) {
            addCriterion("SMAINORGID <>", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidGreaterThan(String value) {
            addCriterion("SMAINORGID >", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidGreaterThanOrEqualTo(String value) {
            addCriterion("SMAINORGID >=", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidLessThan(String value) {
            addCriterion("SMAINORGID <", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidLessThanOrEqualTo(String value) {
            addCriterion("SMAINORGID <=", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidLike(String value) {
            addCriterion("SMAINORGID like", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidNotLike(String value) {
            addCriterion("SMAINORGID not like", value, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidIn(List<String> values) {
            addCriterion("SMAINORGID in", values, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidNotIn(List<String> values) {
            addCriterion("SMAINORGID not in", values, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidBetween(String value1, String value2) {
            addCriterion("SMAINORGID between", value1, value2, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSmainorgidNotBetween(String value1, String value2) {
            addCriterion("SMAINORGID not between", value1, value2, "smainorgid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidIsNull() {
            addCriterion("SSAFELEVELID is null");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidIsNotNull() {
            addCriterion("SSAFELEVELID is not null");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidEqualTo(String value) {
            addCriterion("SSAFELEVELID =", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidNotEqualTo(String value) {
            addCriterion("SSAFELEVELID <>", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidGreaterThan(String value) {
            addCriterion("SSAFELEVELID >", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidGreaterThanOrEqualTo(String value) {
            addCriterion("SSAFELEVELID >=", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidLessThan(String value) {
            addCriterion("SSAFELEVELID <", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidLessThanOrEqualTo(String value) {
            addCriterion("SSAFELEVELID <=", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidLike(String value) {
            addCriterion("SSAFELEVELID like", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidNotLike(String value) {
            addCriterion("SSAFELEVELID not like", value, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidIn(List<String> values) {
            addCriterion("SSAFELEVELID in", values, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidNotIn(List<String> values) {
            addCriterion("SSAFELEVELID not in", values, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidBetween(String value1, String value2) {
            addCriterion("SSAFELEVELID between", value1, value2, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsafelevelidNotBetween(String value1, String value2) {
            addCriterion("SSAFELEVELID not between", value1, value2, "ssafelevelid");
            return (Criteria) this;
        }

        public Criteria andSsequenceIsNull() {
            addCriterion("SSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andSsequenceIsNotNull() {
            addCriterion("SSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andSsequenceEqualTo(BigDecimal value) {
            addCriterion("SSEQUENCE =", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotEqualTo(BigDecimal value) {
            addCriterion("SSEQUENCE <>", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceGreaterThan(BigDecimal value) {
            addCriterion("SSEQUENCE >", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SSEQUENCE >=", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceLessThan(BigDecimal value) {
            addCriterion("SSEQUENCE <", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SSEQUENCE <=", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceIn(List<BigDecimal> values) {
            addCriterion("SSEQUENCE in", values, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotIn(List<BigDecimal> values) {
            addCriterion("SSEQUENCE not in", values, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSEQUENCE between", value1, value2, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSEQUENCE not between", value1, value2, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSvalidstateIsNull() {
            addCriterion("SVALIDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSvalidstateIsNotNull() {
            addCriterion("SVALIDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSvalidstateEqualTo(BigDecimal value) {
            addCriterion("SVALIDSTATE =", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateNotEqualTo(BigDecimal value) {
            addCriterion("SVALIDSTATE <>", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateGreaterThan(BigDecimal value) {
            addCriterion("SVALIDSTATE >", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVALIDSTATE >=", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateLessThan(BigDecimal value) {
            addCriterion("SVALIDSTATE <", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVALIDSTATE <=", value, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateIn(List<BigDecimal> values) {
            addCriterion("SVALIDSTATE in", values, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateNotIn(List<BigDecimal> values) {
            addCriterion("SVALIDSTATE not in", values, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVALIDSTATE between", value1, value2, "svalidstate");
            return (Criteria) this;
        }

        public Criteria andSvalidstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVALIDSTATE not between", value1, value2, "svalidstate");
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

        public Criteria andSsexIsNull() {
            addCriterion("SSEX is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("SSEX is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("SSEX =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("SSEX <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("SSEX >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("SSEX >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("SSEX <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("SSEX <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("SSEX like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("SSEX not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("SSEX in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("SSEX not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("SSEX between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("SSEX not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNull() {
            addCriterion("SBIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNotNull() {
            addCriterion("SBIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY =", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY <>", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY >", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY >=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY <", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SBIRTHDAY <=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("SBIRTHDAY in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("SBIRTHDAY not in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SBIRTHDAY between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SBIRTHDAY not between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSjoindateIsNull() {
            addCriterion("SJOINDATE is null");
            return (Criteria) this;
        }

        public Criteria andSjoindateIsNotNull() {
            addCriterion("SJOINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSjoindateEqualTo(Date value) {
            addCriterionForJDBCDate("SJOINDATE =", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SJOINDATE <>", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("SJOINDATE >", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJOINDATE >=", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateLessThan(Date value) {
            addCriterionForJDBCDate("SJOINDATE <", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJOINDATE <=", value, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateIn(List<Date> values) {
            addCriterionForJDBCDate("SJOINDATE in", values, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SJOINDATE not in", values, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJOINDATE between", value1, value2, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andSjoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJOINDATE not between", value1, value2, "sjoindate");
            return (Criteria) this;
        }

        public Criteria andShomeplaceIsNull() {
            addCriterion("SHOMEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andShomeplaceIsNotNull() {
            addCriterion("SHOMEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andShomeplaceEqualTo(String value) {
            addCriterion("SHOMEPLACE =", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceNotEqualTo(String value) {
            addCriterion("SHOMEPLACE <>", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceGreaterThan(String value) {
            addCriterion("SHOMEPLACE >", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("SHOMEPLACE >=", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceLessThan(String value) {
            addCriterion("SHOMEPLACE <", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceLessThanOrEqualTo(String value) {
            addCriterion("SHOMEPLACE <=", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceLike(String value) {
            addCriterion("SHOMEPLACE like", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceNotLike(String value) {
            addCriterion("SHOMEPLACE not like", value, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceIn(List<String> values) {
            addCriterion("SHOMEPLACE in", values, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceNotIn(List<String> values) {
            addCriterion("SHOMEPLACE not in", values, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceBetween(String value1, String value2) {
            addCriterion("SHOMEPLACE between", value1, value2, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andShomeplaceNotBetween(String value1, String value2) {
            addCriterion("SHOMEPLACE not between", value1, value2, "shomeplace");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNull() {
            addCriterion("SDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNotNull() {
            addCriterion("SDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andSdegreeEqualTo(String value) {
            addCriterion("SDEGREE =", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotEqualTo(String value) {
            addCriterion("SDEGREE <>", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThan(String value) {
            addCriterion("SDEGREE >", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("SDEGREE >=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThan(String value) {
            addCriterion("SDEGREE <", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThanOrEqualTo(String value) {
            addCriterion("SDEGREE <=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLike(String value) {
            addCriterion("SDEGREE like", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotLike(String value) {
            addCriterion("SDEGREE not like", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeIn(List<String> values) {
            addCriterion("SDEGREE in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotIn(List<String> values) {
            addCriterion("SDEGREE not in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeBetween(String value1, String value2) {
            addCriterion("SDEGREE between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotBetween(String value1, String value2) {
            addCriterion("SDEGREE not between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolIsNull() {
            addCriterion("SGRADUATESCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolIsNotNull() {
            addCriterion("SGRADUATESCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolEqualTo(String value) {
            addCriterion("SGRADUATESCHOOL =", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolNotEqualTo(String value) {
            addCriterion("SGRADUATESCHOOL <>", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolGreaterThan(String value) {
            addCriterion("SGRADUATESCHOOL >", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("SGRADUATESCHOOL >=", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolLessThan(String value) {
            addCriterion("SGRADUATESCHOOL <", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("SGRADUATESCHOOL <=", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolLike(String value) {
            addCriterion("SGRADUATESCHOOL like", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolNotLike(String value) {
            addCriterion("SGRADUATESCHOOL not like", value, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolIn(List<String> values) {
            addCriterion("SGRADUATESCHOOL in", values, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolNotIn(List<String> values) {
            addCriterion("SGRADUATESCHOOL not in", values, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolBetween(String value1, String value2) {
            addCriterion("SGRADUATESCHOOL between", value1, value2, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSgraduateschoolNotBetween(String value1, String value2) {
            addCriterion("SGRADUATESCHOOL not between", value1, value2, "sgraduateschool");
            return (Criteria) this;
        }

        public Criteria andSspecialityIsNull() {
            addCriterion("SSPECIALITY is null");
            return (Criteria) this;
        }

        public Criteria andSspecialityIsNotNull() {
            addCriterion("SSPECIALITY is not null");
            return (Criteria) this;
        }

        public Criteria andSspecialityEqualTo(String value) {
            addCriterion("SSPECIALITY =", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityNotEqualTo(String value) {
            addCriterion("SSPECIALITY <>", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityGreaterThan(String value) {
            addCriterion("SSPECIALITY >", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityGreaterThanOrEqualTo(String value) {
            addCriterion("SSPECIALITY >=", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityLessThan(String value) {
            addCriterion("SSPECIALITY <", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityLessThanOrEqualTo(String value) {
            addCriterion("SSPECIALITY <=", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityLike(String value) {
            addCriterion("SSPECIALITY like", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityNotLike(String value) {
            addCriterion("SSPECIALITY not like", value, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityIn(List<String> values) {
            addCriterion("SSPECIALITY in", values, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityNotIn(List<String> values) {
            addCriterion("SSPECIALITY not in", values, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityBetween(String value1, String value2) {
            addCriterion("SSPECIALITY between", value1, value2, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSspecialityNotBetween(String value1, String value2) {
            addCriterion("SSPECIALITY not between", value1, value2, "sspeciality");
            return (Criteria) this;
        }

        public Criteria andSschoollengthIsNull() {
            addCriterion("SSCHOOLLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andSschoollengthIsNotNull() {
            addCriterion("SSCHOOLLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andSschoollengthEqualTo(String value) {
            addCriterion("SSCHOOLLENGTH =", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthNotEqualTo(String value) {
            addCriterion("SSCHOOLLENGTH <>", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthGreaterThan(String value) {
            addCriterion("SSCHOOLLENGTH >", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthGreaterThanOrEqualTo(String value) {
            addCriterion("SSCHOOLLENGTH >=", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthLessThan(String value) {
            addCriterion("SSCHOOLLENGTH <", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthLessThanOrEqualTo(String value) {
            addCriterion("SSCHOOLLENGTH <=", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthLike(String value) {
            addCriterion("SSCHOOLLENGTH like", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthNotLike(String value) {
            addCriterion("SSCHOOLLENGTH not like", value, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthIn(List<String> values) {
            addCriterion("SSCHOOLLENGTH in", values, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthNotIn(List<String> values) {
            addCriterion("SSCHOOLLENGTH not in", values, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthBetween(String value1, String value2) {
            addCriterion("SSCHOOLLENGTH between", value1, value2, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andSschoollengthNotBetween(String value1, String value2) {
            addCriterion("SSCHOOLLENGTH not between", value1, value2, "sschoollength");
            return (Criteria) this;
        }

        public Criteria andStitleIsNull() {
            addCriterion("STITLE is null");
            return (Criteria) this;
        }

        public Criteria andStitleIsNotNull() {
            addCriterion("STITLE is not null");
            return (Criteria) this;
        }

        public Criteria andStitleEqualTo(String value) {
            addCriterion("STITLE =", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleNotEqualTo(String value) {
            addCriterion("STITLE <>", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleGreaterThan(String value) {
            addCriterion("STITLE >", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleGreaterThanOrEqualTo(String value) {
            addCriterion("STITLE >=", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleLessThan(String value) {
            addCriterion("STITLE <", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleLessThanOrEqualTo(String value) {
            addCriterion("STITLE <=", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleLike(String value) {
            addCriterion("STITLE like", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleNotLike(String value) {
            addCriterion("STITLE not like", value, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleIn(List<String> values) {
            addCriterion("STITLE in", values, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleNotIn(List<String> values) {
            addCriterion("STITLE not in", values, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleBetween(String value1, String value2) {
            addCriterion("STITLE between", value1, value2, "stitle");
            return (Criteria) this;
        }

        public Criteria andStitleNotBetween(String value1, String value2) {
            addCriterion("STITLE not between", value1, value2, "stitle");
            return (Criteria) this;
        }

        public Criteria andSmarriageIsNull() {
            addCriterion("SMARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andSmarriageIsNotNull() {
            addCriterion("SMARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSmarriageEqualTo(String value) {
            addCriterion("SMARRIAGE =", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotEqualTo(String value) {
            addCriterion("SMARRIAGE <>", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageGreaterThan(String value) {
            addCriterion("SMARRIAGE >", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageGreaterThanOrEqualTo(String value) {
            addCriterion("SMARRIAGE >=", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLessThan(String value) {
            addCriterion("SMARRIAGE <", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLessThanOrEqualTo(String value) {
            addCriterion("SMARRIAGE <=", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLike(String value) {
            addCriterion("SMARRIAGE like", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotLike(String value) {
            addCriterion("SMARRIAGE not like", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageIn(List<String> values) {
            addCriterion("SMARRIAGE in", values, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotIn(List<String> values) {
            addCriterion("SMARRIAGE not in", values, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageBetween(String value1, String value2) {
            addCriterion("SMARRIAGE between", value1, value2, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotBetween(String value1, String value2) {
            addCriterion("SMARRIAGE not between", value1, value2, "smarriage");
            return (Criteria) this;
        }

        public Criteria andScardnoIsNull() {
            addCriterion("SCARDNO is null");
            return (Criteria) this;
        }

        public Criteria andScardnoIsNotNull() {
            addCriterion("SCARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andScardnoEqualTo(String value) {
            addCriterion("SCARDNO =", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoNotEqualTo(String value) {
            addCriterion("SCARDNO <>", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoGreaterThan(String value) {
            addCriterion("SCARDNO >", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoGreaterThanOrEqualTo(String value) {
            addCriterion("SCARDNO >=", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoLessThan(String value) {
            addCriterion("SCARDNO <", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoLessThanOrEqualTo(String value) {
            addCriterion("SCARDNO <=", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoLike(String value) {
            addCriterion("SCARDNO like", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoNotLike(String value) {
            addCriterion("SCARDNO not like", value, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoIn(List<String> values) {
            addCriterion("SCARDNO in", values, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoNotIn(List<String> values) {
            addCriterion("SCARDNO not in", values, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoBetween(String value1, String value2) {
            addCriterion("SCARDNO between", value1, value2, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardnoNotBetween(String value1, String value2) {
            addCriterion("SCARDNO not between", value1, value2, "scardno");
            return (Criteria) this;
        }

        public Criteria andScardkindIsNull() {
            addCriterion("SCARDKIND is null");
            return (Criteria) this;
        }

        public Criteria andScardkindIsNotNull() {
            addCriterion("SCARDKIND is not null");
            return (Criteria) this;
        }

        public Criteria andScardkindEqualTo(String value) {
            addCriterion("SCARDKIND =", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindNotEqualTo(String value) {
            addCriterion("SCARDKIND <>", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindGreaterThan(String value) {
            addCriterion("SCARDKIND >", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindGreaterThanOrEqualTo(String value) {
            addCriterion("SCARDKIND >=", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindLessThan(String value) {
            addCriterion("SCARDKIND <", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindLessThanOrEqualTo(String value) {
            addCriterion("SCARDKIND <=", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindLike(String value) {
            addCriterion("SCARDKIND like", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindNotLike(String value) {
            addCriterion("SCARDKIND not like", value, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindIn(List<String> values) {
            addCriterion("SCARDKIND in", values, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindNotIn(List<String> values) {
            addCriterion("SCARDKIND not in", values, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindBetween(String value1, String value2) {
            addCriterion("SCARDKIND between", value1, value2, "scardkind");
            return (Criteria) this;
        }

        public Criteria andScardkindNotBetween(String value1, String value2) {
            addCriterion("SCARDKIND not between", value1, value2, "scardkind");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressIsNull() {
            addCriterion("SFAMILYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressIsNotNull() {
            addCriterion("SFAMILYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressEqualTo(String value) {
            addCriterion("SFAMILYADDRESS =", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressNotEqualTo(String value) {
            addCriterion("SFAMILYADDRESS <>", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressGreaterThan(String value) {
            addCriterion("SFAMILYADDRESS >", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SFAMILYADDRESS >=", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressLessThan(String value) {
            addCriterion("SFAMILYADDRESS <", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressLessThanOrEqualTo(String value) {
            addCriterion("SFAMILYADDRESS <=", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressLike(String value) {
            addCriterion("SFAMILYADDRESS like", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressNotLike(String value) {
            addCriterion("SFAMILYADDRESS not like", value, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressIn(List<String> values) {
            addCriterion("SFAMILYADDRESS in", values, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressNotIn(List<String> values) {
            addCriterion("SFAMILYADDRESS not in", values, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressBetween(String value1, String value2) {
            addCriterion("SFAMILYADDRESS between", value1, value2, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSfamilyaddressNotBetween(String value1, String value2) {
            addCriterion("SFAMILYADDRESS not between", value1, value2, "sfamilyaddress");
            return (Criteria) this;
        }

        public Criteria andSzipIsNull() {
            addCriterion("SZIP is null");
            return (Criteria) this;
        }

        public Criteria andSzipIsNotNull() {
            addCriterion("SZIP is not null");
            return (Criteria) this;
        }

        public Criteria andSzipEqualTo(String value) {
            addCriterion("SZIP =", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipNotEqualTo(String value) {
            addCriterion("SZIP <>", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipGreaterThan(String value) {
            addCriterion("SZIP >", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipGreaterThanOrEqualTo(String value) {
            addCriterion("SZIP >=", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipLessThan(String value) {
            addCriterion("SZIP <", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipLessThanOrEqualTo(String value) {
            addCriterion("SZIP <=", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipLike(String value) {
            addCriterion("SZIP like", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipNotLike(String value) {
            addCriterion("SZIP not like", value, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipIn(List<String> values) {
            addCriterion("SZIP in", values, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipNotIn(List<String> values) {
            addCriterion("SZIP not in", values, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipBetween(String value1, String value2) {
            addCriterion("SZIP between", value1, value2, "szip");
            return (Criteria) this;
        }

        public Criteria andSzipNotBetween(String value1, String value2) {
            addCriterion("SZIP not between", value1, value2, "szip");
            return (Criteria) this;
        }

        public Criteria andSmsnIsNull() {
            addCriterion("SMSN is null");
            return (Criteria) this;
        }

        public Criteria andSmsnIsNotNull() {
            addCriterion("SMSN is not null");
            return (Criteria) this;
        }

        public Criteria andSmsnEqualTo(String value) {
            addCriterion("SMSN =", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnNotEqualTo(String value) {
            addCriterion("SMSN <>", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnGreaterThan(String value) {
            addCriterion("SMSN >", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnGreaterThanOrEqualTo(String value) {
            addCriterion("SMSN >=", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnLessThan(String value) {
            addCriterion("SMSN <", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnLessThanOrEqualTo(String value) {
            addCriterion("SMSN <=", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnLike(String value) {
            addCriterion("SMSN like", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnNotLike(String value) {
            addCriterion("SMSN not like", value, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnIn(List<String> values) {
            addCriterion("SMSN in", values, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnNotIn(List<String> values) {
            addCriterion("SMSN not in", values, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnBetween(String value1, String value2) {
            addCriterion("SMSN between", value1, value2, "smsn");
            return (Criteria) this;
        }

        public Criteria andSmsnNotBetween(String value1, String value2) {
            addCriterion("SMSN not between", value1, value2, "smsn");
            return (Criteria) this;
        }

        public Criteria andSqqIsNull() {
            addCriterion("SQQ is null");
            return (Criteria) this;
        }

        public Criteria andSqqIsNotNull() {
            addCriterion("SQQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqqEqualTo(String value) {
            addCriterion("SQQ =", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotEqualTo(String value) {
            addCriterion("SQQ <>", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqGreaterThan(String value) {
            addCriterion("SQQ >", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqGreaterThanOrEqualTo(String value) {
            addCriterion("SQQ >=", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLessThan(String value) {
            addCriterion("SQQ <", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLessThanOrEqualTo(String value) {
            addCriterion("SQQ <=", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLike(String value) {
            addCriterion("SQQ like", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotLike(String value) {
            addCriterion("SQQ not like", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqIn(List<String> values) {
            addCriterion("SQQ in", values, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotIn(List<String> values) {
            addCriterion("SQQ not in", values, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqBetween(String value1, String value2) {
            addCriterion("SQQ between", value1, value2, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotBetween(String value1, String value2) {
            addCriterion("SQQ not between", value1, value2, "sqq");
            return (Criteria) this;
        }

        public Criteria andSmailIsNull() {
            addCriterion("SMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSmailIsNotNull() {
            addCriterion("SMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSmailEqualTo(String value) {
            addCriterion("SMAIL =", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailNotEqualTo(String value) {
            addCriterion("SMAIL <>", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailGreaterThan(String value) {
            addCriterion("SMAIL >", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailGreaterThanOrEqualTo(String value) {
            addCriterion("SMAIL >=", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailLessThan(String value) {
            addCriterion("SMAIL <", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailLessThanOrEqualTo(String value) {
            addCriterion("SMAIL <=", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailLike(String value) {
            addCriterion("SMAIL like", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailNotLike(String value) {
            addCriterion("SMAIL not like", value, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailIn(List<String> values) {
            addCriterion("SMAIL in", values, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailNotIn(List<String> values) {
            addCriterion("SMAIL not in", values, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailBetween(String value1, String value2) {
            addCriterion("SMAIL between", value1, value2, "smail");
            return (Criteria) this;
        }

        public Criteria andSmailNotBetween(String value1, String value2) {
            addCriterion("SMAIL not between", value1, value2, "smail");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneIsNull() {
            addCriterion("SMOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneIsNotNull() {
            addCriterion("SMOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneEqualTo(String value) {
            addCriterion("SMOBILEPHONE =", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneNotEqualTo(String value) {
            addCriterion("SMOBILEPHONE <>", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneGreaterThan(String value) {
            addCriterion("SMOBILEPHONE >", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SMOBILEPHONE >=", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneLessThan(String value) {
            addCriterion("SMOBILEPHONE <", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("SMOBILEPHONE <=", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneLike(String value) {
            addCriterion("SMOBILEPHONE like", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneNotLike(String value) {
            addCriterion("SMOBILEPHONE not like", value, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneIn(List<String> values) {
            addCriterion("SMOBILEPHONE in", values, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneNotIn(List<String> values) {
            addCriterion("SMOBILEPHONE not in", values, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneBetween(String value1, String value2) {
            addCriterion("SMOBILEPHONE between", value1, value2, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSmobilephoneNotBetween(String value1, String value2) {
            addCriterion("SMOBILEPHONE not between", value1, value2, "smobilephone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneIsNull() {
            addCriterion("SFAMILYPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneIsNotNull() {
            addCriterion("SFAMILYPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneEqualTo(String value) {
            addCriterion("SFAMILYPHONE =", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneNotEqualTo(String value) {
            addCriterion("SFAMILYPHONE <>", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneGreaterThan(String value) {
            addCriterion("SFAMILYPHONE >", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SFAMILYPHONE >=", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneLessThan(String value) {
            addCriterion("SFAMILYPHONE <", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneLessThanOrEqualTo(String value) {
            addCriterion("SFAMILYPHONE <=", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneLike(String value) {
            addCriterion("SFAMILYPHONE like", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneNotLike(String value) {
            addCriterion("SFAMILYPHONE not like", value, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneIn(List<String> values) {
            addCriterion("SFAMILYPHONE in", values, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneNotIn(List<String> values) {
            addCriterion("SFAMILYPHONE not in", values, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneBetween(String value1, String value2) {
            addCriterion("SFAMILYPHONE between", value1, value2, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSfamilyphoneNotBetween(String value1, String value2) {
            addCriterion("SFAMILYPHONE not between", value1, value2, "sfamilyphone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneIsNull() {
            addCriterion("SOFFICEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSofficephoneIsNotNull() {
            addCriterion("SOFFICEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSofficephoneEqualTo(String value) {
            addCriterion("SOFFICEPHONE =", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneNotEqualTo(String value) {
            addCriterion("SOFFICEPHONE <>", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneGreaterThan(String value) {
            addCriterion("SOFFICEPHONE >", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SOFFICEPHONE >=", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneLessThan(String value) {
            addCriterion("SOFFICEPHONE <", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneLessThanOrEqualTo(String value) {
            addCriterion("SOFFICEPHONE <=", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneLike(String value) {
            addCriterion("SOFFICEPHONE like", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneNotLike(String value) {
            addCriterion("SOFFICEPHONE not like", value, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneIn(List<String> values) {
            addCriterion("SOFFICEPHONE in", values, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneNotIn(List<String> values) {
            addCriterion("SOFFICEPHONE not in", values, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneBetween(String value1, String value2) {
            addCriterion("SOFFICEPHONE between", value1, value2, "sofficephone");
            return (Criteria) this;
        }

        public Criteria andSofficephoneNotBetween(String value1, String value2) {
            addCriterion("SOFFICEPHONE not between", value1, value2, "sofficephone");
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

        public Criteria andScountryIsNull() {
            addCriterion("SCOUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andScountryIsNotNull() {
            addCriterion("SCOUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andScountryEqualTo(String value) {
            addCriterion("SCOUNTRY =", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotEqualTo(String value) {
            addCriterion("SCOUNTRY <>", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryGreaterThan(String value) {
            addCriterion("SCOUNTRY >", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryGreaterThanOrEqualTo(String value) {
            addCriterion("SCOUNTRY >=", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLessThan(String value) {
            addCriterion("SCOUNTRY <", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLessThanOrEqualTo(String value) {
            addCriterion("SCOUNTRY <=", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLike(String value) {
            addCriterion("SCOUNTRY like", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotLike(String value) {
            addCriterion("SCOUNTRY not like", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryIn(List<String> values) {
            addCriterion("SCOUNTRY in", values, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotIn(List<String> values) {
            addCriterion("SCOUNTRY not in", values, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryBetween(String value1, String value2) {
            addCriterion("SCOUNTRY between", value1, value2, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotBetween(String value1, String value2) {
            addCriterion("SCOUNTRY not between", value1, value2, "scountry");
            return (Criteria) this;
        }

        public Criteria andSprovinceIsNull() {
            addCriterion("SPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andSprovinceIsNotNull() {
            addCriterion("SPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andSprovinceEqualTo(String value) {
            addCriterion("SPROVINCE =", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotEqualTo(String value) {
            addCriterion("SPROVINCE <>", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceGreaterThan(String value) {
            addCriterion("SPROVINCE >", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("SPROVINCE >=", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceLessThan(String value) {
            addCriterion("SPROVINCE <", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceLessThanOrEqualTo(String value) {
            addCriterion("SPROVINCE <=", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceLike(String value) {
            addCriterion("SPROVINCE like", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotLike(String value) {
            addCriterion("SPROVINCE not like", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceIn(List<String> values) {
            addCriterion("SPROVINCE in", values, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotIn(List<String> values) {
            addCriterion("SPROVINCE not in", values, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceBetween(String value1, String value2) {
            addCriterion("SPROVINCE between", value1, value2, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotBetween(String value1, String value2) {
            addCriterion("SPROVINCE not between", value1, value2, "sprovince");
            return (Criteria) this;
        }

        public Criteria andScityIsNull() {
            addCriterion("SCITY is null");
            return (Criteria) this;
        }

        public Criteria andScityIsNotNull() {
            addCriterion("SCITY is not null");
            return (Criteria) this;
        }

        public Criteria andScityEqualTo(String value) {
            addCriterion("SCITY =", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotEqualTo(String value) {
            addCriterion("SCITY <>", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThan(String value) {
            addCriterion("SCITY >", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThanOrEqualTo(String value) {
            addCriterion("SCITY >=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThan(String value) {
            addCriterion("SCITY <", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThanOrEqualTo(String value) {
            addCriterion("SCITY <=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLike(String value) {
            addCriterion("SCITY like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotLike(String value) {
            addCriterion("SCITY not like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityIn(List<String> values) {
            addCriterion("SCITY in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotIn(List<String> values) {
            addCriterion("SCITY not in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityBetween(String value1, String value2) {
            addCriterion("SCITY between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotBetween(String value1, String value2) {
            addCriterion("SCITY not between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andSpositionsIsNull() {
            addCriterion("SPOSITIONS is null");
            return (Criteria) this;
        }

        public Criteria andSpositionsIsNotNull() {
            addCriterion("SPOSITIONS is not null");
            return (Criteria) this;
        }

        public Criteria andSpositionsEqualTo(String value) {
            addCriterion("SPOSITIONS =", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsNotEqualTo(String value) {
            addCriterion("SPOSITIONS <>", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsGreaterThan(String value) {
            addCriterion("SPOSITIONS >", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsGreaterThanOrEqualTo(String value) {
            addCriterion("SPOSITIONS >=", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsLessThan(String value) {
            addCriterion("SPOSITIONS <", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsLessThanOrEqualTo(String value) {
            addCriterion("SPOSITIONS <=", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsLike(String value) {
            addCriterion("SPOSITIONS like", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsNotLike(String value) {
            addCriterion("SPOSITIONS not like", value, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsIn(List<String> values) {
            addCriterion("SPOSITIONS in", values, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsNotIn(List<String> values) {
            addCriterion("SPOSITIONS not in", values, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsBetween(String value1, String value2) {
            addCriterion("SPOSITIONS between", value1, value2, "spositions");
            return (Criteria) this;
        }

        public Criteria andSpositionsNotBetween(String value1, String value2) {
            addCriterion("SPOSITIONS not between", value1, value2, "spositions");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNull() {
            addCriterion("SSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNotNull() {
            addCriterion("SSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSschoolEqualTo(String value) {
            addCriterion("SSCHOOL =", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotEqualTo(String value) {
            addCriterion("SSCHOOL <>", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThan(String value) {
            addCriterion("SSCHOOL >", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThanOrEqualTo(String value) {
            addCriterion("SSCHOOL >=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThan(String value) {
            addCriterion("SSCHOOL <", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThanOrEqualTo(String value) {
            addCriterion("SSCHOOL <=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLike(String value) {
            addCriterion("SSCHOOL like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotLike(String value) {
            addCriterion("SSCHOOL not like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolIn(List<String> values) {
            addCriterion("SSCHOOL in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotIn(List<String> values) {
            addCriterion("SSCHOOL not in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolBetween(String value1, String value2) {
            addCriterion("SSCHOOL between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotBetween(String value1, String value2) {
            addCriterion("SSCHOOL not between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSstudyIsNull() {
            addCriterion("SSTUDY is null");
            return (Criteria) this;
        }

        public Criteria andSstudyIsNotNull() {
            addCriterion("SSTUDY is not null");
            return (Criteria) this;
        }

        public Criteria andSstudyEqualTo(String value) {
            addCriterion("SSTUDY =", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyNotEqualTo(String value) {
            addCriterion("SSTUDY <>", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyGreaterThan(String value) {
            addCriterion("SSTUDY >", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyGreaterThanOrEqualTo(String value) {
            addCriterion("SSTUDY >=", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyLessThan(String value) {
            addCriterion("SSTUDY <", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyLessThanOrEqualTo(String value) {
            addCriterion("SSTUDY <=", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyLike(String value) {
            addCriterion("SSTUDY like", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyNotLike(String value) {
            addCriterion("SSTUDY not like", value, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyIn(List<String> values) {
            addCriterion("SSTUDY in", values, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyNotIn(List<String> values) {
            addCriterion("SSTUDY not in", values, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyBetween(String value1, String value2) {
            addCriterion("SSTUDY between", value1, value2, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSstudyNotBetween(String value1, String value2) {
            addCriterion("SSTUDY not between", value1, value2, "sstudy");
            return (Criteria) this;
        }

        public Criteria andSenglishnameIsNull() {
            addCriterion("SENGLISHNAME is null");
            return (Criteria) this;
        }

        public Criteria andSenglishnameIsNotNull() {
            addCriterion("SENGLISHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSenglishnameEqualTo(String value) {
            addCriterion("SENGLISHNAME =", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameNotEqualTo(String value) {
            addCriterion("SENGLISHNAME <>", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameGreaterThan(String value) {
            addCriterion("SENGLISHNAME >", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("SENGLISHNAME >=", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameLessThan(String value) {
            addCriterion("SENGLISHNAME <", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameLessThanOrEqualTo(String value) {
            addCriterion("SENGLISHNAME <=", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameLike(String value) {
            addCriterion("SENGLISHNAME like", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameNotLike(String value) {
            addCriterion("SENGLISHNAME not like", value, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameIn(List<String> values) {
            addCriterion("SENGLISHNAME in", values, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameNotIn(List<String> values) {
            addCriterion("SENGLISHNAME not in", values, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameBetween(String value1, String value2) {
            addCriterion("SENGLISHNAME between", value1, value2, "senglishname");
            return (Criteria) this;
        }

        public Criteria andSenglishnameNotBetween(String value1, String value2) {
            addCriterion("SENGLISHNAME not between", value1, value2, "senglishname");
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