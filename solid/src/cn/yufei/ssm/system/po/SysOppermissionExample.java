package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysOppermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOppermissionExample() {
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

        public Criteria andSpermissionroleidIsNull() {
            addCriterion("SPERMISSIONROLEID is null");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidIsNotNull() {
            addCriterion("SPERMISSIONROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidEqualTo(String value) {
            addCriterion("SPERMISSIONROLEID =", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidNotEqualTo(String value) {
            addCriterion("SPERMISSIONROLEID <>", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidGreaterThan(String value) {
            addCriterion("SPERMISSIONROLEID >", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidGreaterThanOrEqualTo(String value) {
            addCriterion("SPERMISSIONROLEID >=", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidLessThan(String value) {
            addCriterion("SPERMISSIONROLEID <", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidLessThanOrEqualTo(String value) {
            addCriterion("SPERMISSIONROLEID <=", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidLike(String value) {
            addCriterion("SPERMISSIONROLEID like", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidNotLike(String value) {
            addCriterion("SPERMISSIONROLEID not like", value, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidIn(List<String> values) {
            addCriterion("SPERMISSIONROLEID in", values, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidNotIn(List<String> values) {
            addCriterion("SPERMISSIONROLEID not in", values, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidBetween(String value1, String value2) {
            addCriterion("SPERMISSIONROLEID between", value1, value2, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSpermissionroleidNotBetween(String value1, String value2) {
            addCriterion("SPERMISSIONROLEID not between", value1, value2, "spermissionroleid");
            return (Criteria) this;
        }

        public Criteria andSprocessIsNull() {
            addCriterion("SPROCESS is null");
            return (Criteria) this;
        }

        public Criteria andSprocessIsNotNull() {
            addCriterion("SPROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andSprocessEqualTo(String value) {
            addCriterion("SPROCESS =", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessNotEqualTo(String value) {
            addCriterion("SPROCESS <>", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessGreaterThan(String value) {
            addCriterion("SPROCESS >", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessGreaterThanOrEqualTo(String value) {
            addCriterion("SPROCESS >=", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessLessThan(String value) {
            addCriterion("SPROCESS <", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessLessThanOrEqualTo(String value) {
            addCriterion("SPROCESS <=", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessLike(String value) {
            addCriterion("SPROCESS like", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessNotLike(String value) {
            addCriterion("SPROCESS not like", value, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessIn(List<String> values) {
            addCriterion("SPROCESS in", values, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessNotIn(List<String> values) {
            addCriterion("SPROCESS not in", values, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessBetween(String value1, String value2) {
            addCriterion("SPROCESS between", value1, value2, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSprocessNotBetween(String value1, String value2) {
            addCriterion("SPROCESS not between", value1, value2, "sprocess");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameIsNull() {
            addCriterion("SACTIVITYFNAME is null");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameIsNotNull() {
            addCriterion("SACTIVITYFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameEqualTo(String value) {
            addCriterion("SACTIVITYFNAME =", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameNotEqualTo(String value) {
            addCriterion("SACTIVITYFNAME <>", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameGreaterThan(String value) {
            addCriterion("SACTIVITYFNAME >", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SACTIVITYFNAME >=", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameLessThan(String value) {
            addCriterion("SACTIVITYFNAME <", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameLessThanOrEqualTo(String value) {
            addCriterion("SACTIVITYFNAME <=", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameLike(String value) {
            addCriterion("SACTIVITYFNAME like", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameNotLike(String value) {
            addCriterion("SACTIVITYFNAME not like", value, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameIn(List<String> values) {
            addCriterion("SACTIVITYFNAME in", values, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameNotIn(List<String> values) {
            addCriterion("SACTIVITYFNAME not in", values, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameBetween(String value1, String value2) {
            addCriterion("SACTIVITYFNAME between", value1, value2, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityfnameNotBetween(String value1, String value2) {
            addCriterion("SACTIVITYFNAME not between", value1, value2, "sactivityfname");
            return (Criteria) this;
        }

        public Criteria andSactivityIsNull() {
            addCriterion("SACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andSactivityIsNotNull() {
            addCriterion("SACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andSactivityEqualTo(String value) {
            addCriterion("SACTIVITY =", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityNotEqualTo(String value) {
            addCriterion("SACTIVITY <>", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityGreaterThan(String value) {
            addCriterion("SACTIVITY >", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityGreaterThanOrEqualTo(String value) {
            addCriterion("SACTIVITY >=", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityLessThan(String value) {
            addCriterion("SACTIVITY <", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityLessThanOrEqualTo(String value) {
            addCriterion("SACTIVITY <=", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityLike(String value) {
            addCriterion("SACTIVITY like", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityNotLike(String value) {
            addCriterion("SACTIVITY not like", value, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityIn(List<String> values) {
            addCriterion("SACTIVITY in", values, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityNotIn(List<String> values) {
            addCriterion("SACTIVITY not in", values, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityBetween(String value1, String value2) {
            addCriterion("SACTIVITY between", value1, value2, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactivityNotBetween(String value1, String value2) {
            addCriterion("SACTIVITY not between", value1, value2, "sactivity");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesIsNull() {
            addCriterion("SACTIONSNAMES is null");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesIsNotNull() {
            addCriterion("SACTIONSNAMES is not null");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesEqualTo(String value) {
            addCriterion("SACTIONSNAMES =", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesNotEqualTo(String value) {
            addCriterion("SACTIONSNAMES <>", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesGreaterThan(String value) {
            addCriterion("SACTIONSNAMES >", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesGreaterThanOrEqualTo(String value) {
            addCriterion("SACTIONSNAMES >=", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesLessThan(String value) {
            addCriterion("SACTIONSNAMES <", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesLessThanOrEqualTo(String value) {
            addCriterion("SACTIONSNAMES <=", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesLike(String value) {
            addCriterion("SACTIONSNAMES like", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesNotLike(String value) {
            addCriterion("SACTIONSNAMES not like", value, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesIn(List<String> values) {
            addCriterion("SACTIONSNAMES in", values, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesNotIn(List<String> values) {
            addCriterion("SACTIONSNAMES not in", values, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesBetween(String value1, String value2) {
            addCriterion("SACTIONSNAMES between", value1, value2, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsnamesNotBetween(String value1, String value2) {
            addCriterion("SACTIONSNAMES not between", value1, value2, "sactionsnames");
            return (Criteria) this;
        }

        public Criteria andSactionsIsNull() {
            addCriterion("SACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andSactionsIsNotNull() {
            addCriterion("SACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andSactionsEqualTo(String value) {
            addCriterion("SACTIONS =", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsNotEqualTo(String value) {
            addCriterion("SACTIONS <>", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsGreaterThan(String value) {
            addCriterion("SACTIONS >", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsGreaterThanOrEqualTo(String value) {
            addCriterion("SACTIONS >=", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsLessThan(String value) {
            addCriterion("SACTIONS <", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsLessThanOrEqualTo(String value) {
            addCriterion("SACTIONS <=", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsLike(String value) {
            addCriterion("SACTIONS like", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsNotLike(String value) {
            addCriterion("SACTIONS not like", value, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsIn(List<String> values) {
            addCriterion("SACTIONS in", values, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsNotIn(List<String> values) {
            addCriterion("SACTIONS not in", values, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsBetween(String value1, String value2) {
            addCriterion("SACTIONS between", value1, value2, "sactions");
            return (Criteria) this;
        }

        public Criteria andSactionsNotBetween(String value1, String value2) {
            addCriterion("SACTIONS not between", value1, value2, "sactions");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpIsNull() {
            addCriterion("SSEMANTICDP is null");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpIsNotNull() {
            addCriterion("SSEMANTICDP is not null");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpEqualTo(String value) {
            addCriterion("SSEMANTICDP =", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpNotEqualTo(String value) {
            addCriterion("SSEMANTICDP <>", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpGreaterThan(String value) {
            addCriterion("SSEMANTICDP >", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpGreaterThanOrEqualTo(String value) {
            addCriterion("SSEMANTICDP >=", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpLessThan(String value) {
            addCriterion("SSEMANTICDP <", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpLessThanOrEqualTo(String value) {
            addCriterion("SSEMANTICDP <=", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpLike(String value) {
            addCriterion("SSEMANTICDP like", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpNotLike(String value) {
            addCriterion("SSEMANTICDP not like", value, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpIn(List<String> values) {
            addCriterion("SSEMANTICDP in", values, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpNotIn(List<String> values) {
            addCriterion("SSEMANTICDP not in", values, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpBetween(String value1, String value2) {
            addCriterion("SSEMANTICDP between", value1, value2, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSsemanticdpNotBetween(String value1, String value2) {
            addCriterion("SSEMANTICDP not between", value1, value2, "ssemanticdp");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindIsNull() {
            addCriterion("SPERMISSIONKIND is null");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindIsNotNull() {
            addCriterion("SPERMISSIONKIND is not null");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindEqualTo(BigDecimal value) {
            addCriterion("SPERMISSIONKIND =", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindNotEqualTo(BigDecimal value) {
            addCriterion("SPERMISSIONKIND <>", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindGreaterThan(BigDecimal value) {
            addCriterion("SPERMISSIONKIND >", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPERMISSIONKIND >=", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindLessThan(BigDecimal value) {
            addCriterion("SPERMISSIONKIND <", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPERMISSIONKIND <=", value, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindIn(List<BigDecimal> values) {
            addCriterion("SPERMISSIONKIND in", values, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindNotIn(List<BigDecimal> values) {
            addCriterion("SPERMISSIONKIND not in", values, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPERMISSIONKIND between", value1, value2, "spermissionkind");
            return (Criteria) this;
        }

        public Criteria andSpermissionkindNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPERMISSIONKIND not between", value1, value2, "spermissionkind");
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

        public Criteria andSurlIsNull() {
            addCriterion("SURL is null");
            return (Criteria) this;
        }

        public Criteria andSurlIsNotNull() {
            addCriterion("SURL is not null");
            return (Criteria) this;
        }

        public Criteria andSurlEqualTo(String value) {
            addCriterion("SURL =", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlNotEqualTo(String value) {
            addCriterion("SURL <>", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlGreaterThan(String value) {
            addCriterion("SURL >", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlGreaterThanOrEqualTo(String value) {
            addCriterion("SURL >=", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlLessThan(String value) {
            addCriterion("SURL <", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlLessThanOrEqualTo(String value) {
            addCriterion("SURL <=", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlLike(String value) {
            addCriterion("SURL like", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlNotLike(String value) {
            addCriterion("SURL not like", value, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlIn(List<String> values) {
            addCriterion("SURL in", values, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlNotIn(List<String> values) {
            addCriterion("SURL not in", values, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlBetween(String value1, String value2) {
            addCriterion("SURL between", value1, value2, "surl");
            return (Criteria) this;
        }

        public Criteria andSurlNotBetween(String value1, String value2) {
            addCriterion("SURL not between", value1, value2, "surl");
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

        public Criteria andSpathIsNull() {
            addCriterion("SPATH is null");
            return (Criteria) this;
        }

        public Criteria andSpathIsNotNull() {
            addCriterion("SPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSpathEqualTo(String value) {
            addCriterion("SPATH =", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotEqualTo(String value) {
            addCriterion("SPATH <>", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThan(String value) {
            addCriterion("SPATH >", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThanOrEqualTo(String value) {
            addCriterion("SPATH >=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThan(String value) {
            addCriterion("SPATH <", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThanOrEqualTo(String value) {
            addCriterion("SPATH <=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLike(String value) {
            addCriterion("SPATH like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotLike(String value) {
            addCriterion("SPATH not like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathIn(List<String> values) {
            addCriterion("SPATH in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotIn(List<String> values) {
            addCriterion("SPATH not in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathBetween(String value1, String value2) {
            addCriterion("SPATH between", value1, value2, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotBetween(String value1, String value2) {
            addCriterion("SPATH not between", value1, value2, "spath");
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