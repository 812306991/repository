package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysOporgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOporgExample() {
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

        public Criteria andSlongnameIsNull() {
            addCriterion("SLONGNAME is null");
            return (Criteria) this;
        }

        public Criteria andSlongnameIsNotNull() {
            addCriterion("SLONGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSlongnameEqualTo(String value) {
            addCriterion("SLONGNAME =", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameNotEqualTo(String value) {
            addCriterion("SLONGNAME <>", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameGreaterThan(String value) {
            addCriterion("SLONGNAME >", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameGreaterThanOrEqualTo(String value) {
            addCriterion("SLONGNAME >=", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameLessThan(String value) {
            addCriterion("SLONGNAME <", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameLessThanOrEqualTo(String value) {
            addCriterion("SLONGNAME <=", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameLike(String value) {
            addCriterion("SLONGNAME like", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameNotLike(String value) {
            addCriterion("SLONGNAME not like", value, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameIn(List<String> values) {
            addCriterion("SLONGNAME in", values, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameNotIn(List<String> values) {
            addCriterion("SLONGNAME not in", values, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameBetween(String value1, String value2) {
            addCriterion("SLONGNAME between", value1, value2, "slongname");
            return (Criteria) this;
        }

        public Criteria andSlongnameNotBetween(String value1, String value2) {
            addCriterion("SLONGNAME not between", value1, value2, "slongname");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNull() {
            addCriterion("SFNAME is null");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNotNull() {
            addCriterion("SFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSfnameEqualTo(String value) {
            addCriterion("SFNAME =", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotEqualTo(String value) {
            addCriterion("SFNAME <>", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThan(String value) {
            addCriterion("SFNAME >", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SFNAME >=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThan(String value) {
            addCriterion("SFNAME <", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThanOrEqualTo(String value) {
            addCriterion("SFNAME <=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLike(String value) {
            addCriterion("SFNAME like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotLike(String value) {
            addCriterion("SFNAME not like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameIn(List<String> values) {
            addCriterion("SFNAME in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotIn(List<String> values) {
            addCriterion("SFNAME not in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameBetween(String value1, String value2) {
            addCriterion("SFNAME between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotBetween(String value1, String value2) {
            addCriterion("SFNAME not between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfcodeIsNull() {
            addCriterion("SFCODE is null");
            return (Criteria) this;
        }

        public Criteria andSfcodeIsNotNull() {
            addCriterion("SFCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSfcodeEqualTo(String value) {
            addCriterion("SFCODE =", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeNotEqualTo(String value) {
            addCriterion("SFCODE <>", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeGreaterThan(String value) {
            addCriterion("SFCODE >", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SFCODE >=", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeLessThan(String value) {
            addCriterion("SFCODE <", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeLessThanOrEqualTo(String value) {
            addCriterion("SFCODE <=", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeLike(String value) {
            addCriterion("SFCODE like", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeNotLike(String value) {
            addCriterion("SFCODE not like", value, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeIn(List<String> values) {
            addCriterion("SFCODE in", values, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeNotIn(List<String> values) {
            addCriterion("SFCODE not in", values, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeBetween(String value1, String value2) {
            addCriterion("SFCODE between", value1, value2, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfcodeNotBetween(String value1, String value2) {
            addCriterion("SFCODE not between", value1, value2, "sfcode");
            return (Criteria) this;
        }

        public Criteria andSfidIsNull() {
            addCriterion("SFID is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("SFID is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(String value) {
            addCriterion("SFID =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(String value) {
            addCriterion("SFID <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(String value) {
            addCriterion("SFID >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(String value) {
            addCriterion("SFID >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(String value) {
            addCriterion("SFID <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(String value) {
            addCriterion("SFID <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLike(String value) {
            addCriterion("SFID like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotLike(String value) {
            addCriterion("SFID not like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<String> values) {
            addCriterion("SFID in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<String> values) {
            addCriterion("SFID not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(String value1, String value2) {
            addCriterion("SFID between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(String value1, String value2) {
            addCriterion("SFID not between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidIsNull() {
            addCriterion("SORGKINDID is null");
            return (Criteria) this;
        }

        public Criteria andSorgkindidIsNotNull() {
            addCriterion("SORGKINDID is not null");
            return (Criteria) this;
        }

        public Criteria andSorgkindidEqualTo(String value) {
            addCriterion("SORGKINDID =", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidNotEqualTo(String value) {
            addCriterion("SORGKINDID <>", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidGreaterThan(String value) {
            addCriterion("SORGKINDID >", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidGreaterThanOrEqualTo(String value) {
            addCriterion("SORGKINDID >=", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidLessThan(String value) {
            addCriterion("SORGKINDID <", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidLessThanOrEqualTo(String value) {
            addCriterion("SORGKINDID <=", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidLike(String value) {
            addCriterion("SORGKINDID like", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidNotLike(String value) {
            addCriterion("SORGKINDID not like", value, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidIn(List<String> values) {
            addCriterion("SORGKINDID in", values, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidNotIn(List<String> values) {
            addCriterion("SORGKINDID not in", values, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidBetween(String value1, String value2) {
            addCriterion("SORGKINDID between", value1, value2, "sorgkindid");
            return (Criteria) this;
        }

        public Criteria andSorgkindidNotBetween(String value1, String value2) {
            addCriterion("SORGKINDID not between", value1, value2, "sorgkindid");
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

        public Criteria andSsequenceEqualTo(String value) {
            addCriterion("SSEQUENCE =", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotEqualTo(String value) {
            addCriterion("SSEQUENCE <>", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceGreaterThan(String value) {
            addCriterion("SSEQUENCE >", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceGreaterThanOrEqualTo(String value) {
            addCriterion("SSEQUENCE >=", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceLessThan(String value) {
            addCriterion("SSEQUENCE <", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceLessThanOrEqualTo(String value) {
            addCriterion("SSEQUENCE <=", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceLike(String value) {
            addCriterion("SSEQUENCE like", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotLike(String value) {
            addCriterion("SSEQUENCE not like", value, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceIn(List<String> values) {
            addCriterion("SSEQUENCE in", values, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotIn(List<String> values) {
            addCriterion("SSEQUENCE not in", values, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceBetween(String value1, String value2) {
            addCriterion("SSEQUENCE between", value1, value2, "ssequence");
            return (Criteria) this;
        }

        public Criteria andSsequenceNotBetween(String value1, String value2) {
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

        public Criteria andSparentIsNull() {
            addCriterion("SPARENT is null");
            return (Criteria) this;
        }

        public Criteria andSparentIsNotNull() {
            addCriterion("SPARENT is not null");
            return (Criteria) this;
        }

        public Criteria andSparentEqualTo(String value) {
            addCriterion("SPARENT =", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentNotEqualTo(String value) {
            addCriterion("SPARENT <>", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentGreaterThan(String value) {
            addCriterion("SPARENT >", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentGreaterThanOrEqualTo(String value) {
            addCriterion("SPARENT >=", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentLessThan(String value) {
            addCriterion("SPARENT <", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentLessThanOrEqualTo(String value) {
            addCriterion("SPARENT <=", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentLike(String value) {
            addCriterion("SPARENT like", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentNotLike(String value) {
            addCriterion("SPARENT not like", value, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentIn(List<String> values) {
            addCriterion("SPARENT in", values, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentNotIn(List<String> values) {
            addCriterion("SPARENT not in", values, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentBetween(String value1, String value2) {
            addCriterion("SPARENT between", value1, value2, "sparent");
            return (Criteria) this;
        }

        public Criteria andSparentNotBetween(String value1, String value2) {
            addCriterion("SPARENT not between", value1, value2, "sparent");
            return (Criteria) this;
        }

        public Criteria andSlevelIsNull() {
            addCriterion("SLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSlevelIsNotNull() {
            addCriterion("SLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSlevelEqualTo(BigDecimal value) {
            addCriterion("SLEVEL =", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelNotEqualTo(BigDecimal value) {
            addCriterion("SLEVEL <>", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelGreaterThan(BigDecimal value) {
            addCriterion("SLEVEL >", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SLEVEL >=", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelLessThan(BigDecimal value) {
            addCriterion("SLEVEL <", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SLEVEL <=", value, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelIn(List<BigDecimal> values) {
            addCriterion("SLEVEL in", values, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelNotIn(List<BigDecimal> values) {
            addCriterion("SLEVEL not in", values, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SLEVEL between", value1, value2, "slevel");
            return (Criteria) this;
        }

        public Criteria andSlevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SLEVEL not between", value1, value2, "slevel");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("SPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("SPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("SPHONE =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("SPHONE <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("SPHONE >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SPHONE >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("SPHONE <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("SPHONE <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("SPHONE like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("SPHONE not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("SPHONE in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("SPHONE not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("SPHONE between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("SPHONE not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSfaxIsNull() {
            addCriterion("SFAX is null");
            return (Criteria) this;
        }

        public Criteria andSfaxIsNotNull() {
            addCriterion("SFAX is not null");
            return (Criteria) this;
        }

        public Criteria andSfaxEqualTo(String value) {
            addCriterion("SFAX =", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxNotEqualTo(String value) {
            addCriterion("SFAX <>", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxGreaterThan(String value) {
            addCriterion("SFAX >", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxGreaterThanOrEqualTo(String value) {
            addCriterion("SFAX >=", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxLessThan(String value) {
            addCriterion("SFAX <", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxLessThanOrEqualTo(String value) {
            addCriterion("SFAX <=", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxLike(String value) {
            addCriterion("SFAX like", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxNotLike(String value) {
            addCriterion("SFAX not like", value, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxIn(List<String> values) {
            addCriterion("SFAX in", values, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxNotIn(List<String> values) {
            addCriterion("SFAX not in", values, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxBetween(String value1, String value2) {
            addCriterion("SFAX between", value1, value2, "sfax");
            return (Criteria) this;
        }

        public Criteria andSfaxNotBetween(String value1, String value2) {
            addCriterion("SFAX not between", value1, value2, "sfax");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("SADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("SADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("SADDRESS =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("SADDRESS <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("SADDRESS >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SADDRESS >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("SADDRESS <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("SADDRESS <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("SADDRESS like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("SADDRESS not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("SADDRESS in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("SADDRESS not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("SADDRESS between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("SADDRESS not between", value1, value2, "saddress");
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

        public Criteria andSpersonidIsNull() {
            addCriterion("SPERSONID is null");
            return (Criteria) this;
        }

        public Criteria andSpersonidIsNotNull() {
            addCriterion("SPERSONID is not null");
            return (Criteria) this;
        }

        public Criteria andSpersonidEqualTo(String value) {
            addCriterion("SPERSONID =", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidNotEqualTo(String value) {
            addCriterion("SPERSONID <>", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidGreaterThan(String value) {
            addCriterion("SPERSONID >", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidGreaterThanOrEqualTo(String value) {
            addCriterion("SPERSONID >=", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidLessThan(String value) {
            addCriterion("SPERSONID <", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidLessThanOrEqualTo(String value) {
            addCriterion("SPERSONID <=", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidLike(String value) {
            addCriterion("SPERSONID like", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidNotLike(String value) {
            addCriterion("SPERSONID not like", value, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidIn(List<String> values) {
            addCriterion("SPERSONID in", values, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidNotIn(List<String> values) {
            addCriterion("SPERSONID not in", values, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidBetween(String value1, String value2) {
            addCriterion("SPERSONID between", value1, value2, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSpersonidNotBetween(String value1, String value2) {
            addCriterion("SPERSONID not between", value1, value2, "spersonid");
            return (Criteria) this;
        }

        public Criteria andSnodekindIsNull() {
            addCriterion("SNODEKIND is null");
            return (Criteria) this;
        }

        public Criteria andSnodekindIsNotNull() {
            addCriterion("SNODEKIND is not null");
            return (Criteria) this;
        }

        public Criteria andSnodekindEqualTo(String value) {
            addCriterion("SNODEKIND =", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindNotEqualTo(String value) {
            addCriterion("SNODEKIND <>", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindGreaterThan(String value) {
            addCriterion("SNODEKIND >", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindGreaterThanOrEqualTo(String value) {
            addCriterion("SNODEKIND >=", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindLessThan(String value) {
            addCriterion("SNODEKIND <", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindLessThanOrEqualTo(String value) {
            addCriterion("SNODEKIND <=", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindLike(String value) {
            addCriterion("SNODEKIND like", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindNotLike(String value) {
            addCriterion("SNODEKIND not like", value, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindIn(List<String> values) {
            addCriterion("SNODEKIND in", values, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindNotIn(List<String> values) {
            addCriterion("SNODEKIND not in", values, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindBetween(String value1, String value2) {
            addCriterion("SNODEKIND between", value1, value2, "snodekind");
            return (Criteria) this;
        }

        public Criteria andSnodekindNotBetween(String value1, String value2) {
            addCriterion("SNODEKIND not between", value1, value2, "snodekind");
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