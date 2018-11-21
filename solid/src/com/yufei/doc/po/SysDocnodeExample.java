package com.yufei.doc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysDocnodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDocnodeExample() {
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

        public Criteria andSparentidIsNull() {
            addCriterion("SPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andSparentidIsNotNull() {
            addCriterion("SPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andSparentidEqualTo(String value) {
            addCriterion("SPARENTID =", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidNotEqualTo(String value) {
            addCriterion("SPARENTID <>", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidGreaterThan(String value) {
            addCriterion("SPARENTID >", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidGreaterThanOrEqualTo(String value) {
            addCriterion("SPARENTID >=", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidLessThan(String value) {
            addCriterion("SPARENTID <", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidLessThanOrEqualTo(String value) {
            addCriterion("SPARENTID <=", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidLike(String value) {
            addCriterion("SPARENTID like", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidNotLike(String value) {
            addCriterion("SPARENTID not like", value, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidIn(List<String> values) {
            addCriterion("SPARENTID in", values, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidNotIn(List<String> values) {
            addCriterion("SPARENTID not in", values, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidBetween(String value1, String value2) {
            addCriterion("SPARENTID between", value1, value2, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSparentidNotBetween(String value1, String value2) {
            addCriterion("SPARENTID not between", value1, value2, "sparentid");
            return (Criteria) this;
        }

        public Criteria andSdocnameIsNull() {
            addCriterion("SDOCNAME is null");
            return (Criteria) this;
        }

        public Criteria andSdocnameIsNotNull() {
            addCriterion("SDOCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSdocnameEqualTo(String value) {
            addCriterion("SDOCNAME =", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameNotEqualTo(String value) {
            addCriterion("SDOCNAME <>", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameGreaterThan(String value) {
            addCriterion("SDOCNAME >", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameGreaterThanOrEqualTo(String value) {
            addCriterion("SDOCNAME >=", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameLessThan(String value) {
            addCriterion("SDOCNAME <", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameLessThanOrEqualTo(String value) {
            addCriterion("SDOCNAME <=", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameLike(String value) {
            addCriterion("SDOCNAME like", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameNotLike(String value) {
            addCriterion("SDOCNAME not like", value, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameIn(List<String> values) {
            addCriterion("SDOCNAME in", values, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameNotIn(List<String> values) {
            addCriterion("SDOCNAME not in", values, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameBetween(String value1, String value2) {
            addCriterion("SDOCNAME between", value1, value2, "sdocname");
            return (Criteria) this;
        }

        public Criteria andSdocnameNotBetween(String value1, String value2) {
            addCriterion("SDOCNAME not between", value1, value2, "sdocname");
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

        public Criteria andSsizeIsNull() {
            addCriterion("SSIZE is null");
            return (Criteria) this;
        }

        public Criteria andSsizeIsNotNull() {
            addCriterion("SSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSsizeEqualTo(Double value) {
            addCriterion("SSIZE =", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotEqualTo(Double value) {
            addCriterion("SSIZE <>", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeGreaterThan(Double value) {
            addCriterion("SSIZE >", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("SSIZE >=", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeLessThan(Double value) {
            addCriterion("SSIZE <", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeLessThanOrEqualTo(Double value) {
            addCriterion("SSIZE <=", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeIn(List<Double> values) {
            addCriterion("SSIZE in", values, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotIn(List<Double> values) {
            addCriterion("SSIZE not in", values, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeBetween(Double value1, Double value2) {
            addCriterion("SSIZE between", value1, value2, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotBetween(Double value1, Double value2) {
            addCriterion("SSIZE not between", value1, value2, "ssize");
            return (Criteria) this;
        }

        public Criteria andSkindIsNull() {
            addCriterion("SKIND is null");
            return (Criteria) this;
        }

        public Criteria andSkindIsNotNull() {
            addCriterion("SKIND is not null");
            return (Criteria) this;
        }

        public Criteria andSkindEqualTo(String value) {
            addCriterion("SKIND =", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindNotEqualTo(String value) {
            addCriterion("SKIND <>", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindGreaterThan(String value) {
            addCriterion("SKIND >", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindGreaterThanOrEqualTo(String value) {
            addCriterion("SKIND >=", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindLessThan(String value) {
            addCriterion("SKIND <", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindLessThanOrEqualTo(String value) {
            addCriterion("SKIND <=", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindLike(String value) {
            addCriterion("SKIND like", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindNotLike(String value) {
            addCriterion("SKIND not like", value, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindIn(List<String> values) {
            addCriterion("SKIND in", values, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindNotIn(List<String> values) {
            addCriterion("SKIND not in", values, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindBetween(String value1, String value2) {
            addCriterion("SKIND between", value1, value2, "skind");
            return (Criteria) this;
        }

        public Criteria andSkindNotBetween(String value1, String value2) {
            addCriterion("SKIND not between", value1, value2, "skind");
            return (Criteria) this;
        }

        public Criteria andSdocpathIsNull() {
            addCriterion("SDOCPATH is null");
            return (Criteria) this;
        }

        public Criteria andSdocpathIsNotNull() {
            addCriterion("SDOCPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSdocpathEqualTo(String value) {
            addCriterion("SDOCPATH =", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathNotEqualTo(String value) {
            addCriterion("SDOCPATH <>", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathGreaterThan(String value) {
            addCriterion("SDOCPATH >", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathGreaterThanOrEqualTo(String value) {
            addCriterion("SDOCPATH >=", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathLessThan(String value) {
            addCriterion("SDOCPATH <", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathLessThanOrEqualTo(String value) {
            addCriterion("SDOCPATH <=", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathLike(String value) {
            addCriterion("SDOCPATH like", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathNotLike(String value) {
            addCriterion("SDOCPATH not like", value, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathIn(List<String> values) {
            addCriterion("SDOCPATH in", values, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathNotIn(List<String> values) {
            addCriterion("SDOCPATH not in", values, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathBetween(String value1, String value2) {
            addCriterion("SDOCPATH between", value1, value2, "sdocpath");
            return (Criteria) this;
        }

        public Criteria andSdocpathNotBetween(String value1, String value2) {
            addCriterion("SDOCPATH not between", value1, value2, "sdocpath");
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

        public Criteria andScreatordeptnameIsNull() {
            addCriterion("SCREATORDEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameIsNotNull() {
            addCriterion("SCREATORDEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameEqualTo(String value) {
            addCriterion("SCREATORDEPTNAME =", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameNotEqualTo(String value) {
            addCriterion("SCREATORDEPTNAME <>", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameGreaterThan(String value) {
            addCriterion("SCREATORDEPTNAME >", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("SCREATORDEPTNAME >=", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameLessThan(String value) {
            addCriterion("SCREATORDEPTNAME <", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameLessThanOrEqualTo(String value) {
            addCriterion("SCREATORDEPTNAME <=", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameLike(String value) {
            addCriterion("SCREATORDEPTNAME like", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameNotLike(String value) {
            addCriterion("SCREATORDEPTNAME not like", value, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameIn(List<String> values) {
            addCriterion("SCREATORDEPTNAME in", values, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameNotIn(List<String> values) {
            addCriterion("SCREATORDEPTNAME not in", values, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameBetween(String value1, String value2) {
            addCriterion("SCREATORDEPTNAME between", value1, value2, "screatordeptname");
            return (Criteria) this;
        }

        public Criteria andScreatordeptnameNotBetween(String value1, String value2) {
            addCriterion("SCREATORDEPTNAME not between", value1, value2, "screatordeptname");
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

        public Criteria andSeditorfidIsNull() {
            addCriterion("SEDITORFID is null");
            return (Criteria) this;
        }

        public Criteria andSeditorfidIsNotNull() {
            addCriterion("SEDITORFID is not null");
            return (Criteria) this;
        }

        public Criteria andSeditorfidEqualTo(String value) {
            addCriterion("SEDITORFID =", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidNotEqualTo(String value) {
            addCriterion("SEDITORFID <>", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidGreaterThan(String value) {
            addCriterion("SEDITORFID >", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidGreaterThanOrEqualTo(String value) {
            addCriterion("SEDITORFID >=", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidLessThan(String value) {
            addCriterion("SEDITORFID <", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidLessThanOrEqualTo(String value) {
            addCriterion("SEDITORFID <=", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidLike(String value) {
            addCriterion("SEDITORFID like", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidNotLike(String value) {
            addCriterion("SEDITORFID not like", value, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidIn(List<String> values) {
            addCriterion("SEDITORFID in", values, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidNotIn(List<String> values) {
            addCriterion("SEDITORFID not in", values, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidBetween(String value1, String value2) {
            addCriterion("SEDITORFID between", value1, value2, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditorfidNotBetween(String value1, String value2) {
            addCriterion("SEDITORFID not between", value1, value2, "seditorfid");
            return (Criteria) this;
        }

        public Criteria andSeditornameIsNull() {
            addCriterion("SEDITORNAME is null");
            return (Criteria) this;
        }

        public Criteria andSeditornameIsNotNull() {
            addCriterion("SEDITORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeditornameEqualTo(String value) {
            addCriterion("SEDITORNAME =", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameNotEqualTo(String value) {
            addCriterion("SEDITORNAME <>", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameGreaterThan(String value) {
            addCriterion("SEDITORNAME >", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameGreaterThanOrEqualTo(String value) {
            addCriterion("SEDITORNAME >=", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameLessThan(String value) {
            addCriterion("SEDITORNAME <", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameLessThanOrEqualTo(String value) {
            addCriterion("SEDITORNAME <=", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameLike(String value) {
            addCriterion("SEDITORNAME like", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameNotLike(String value) {
            addCriterion("SEDITORNAME not like", value, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameIn(List<String> values) {
            addCriterion("SEDITORNAME in", values, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameNotIn(List<String> values) {
            addCriterion("SEDITORNAME not in", values, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameBetween(String value1, String value2) {
            addCriterion("SEDITORNAME between", value1, value2, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditornameNotBetween(String value1, String value2) {
            addCriterion("SEDITORNAME not between", value1, value2, "seditorname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameIsNull() {
            addCriterion("SEDITORDEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameIsNotNull() {
            addCriterion("SEDITORDEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameEqualTo(String value) {
            addCriterion("SEDITORDEPTNAME =", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameNotEqualTo(String value) {
            addCriterion("SEDITORDEPTNAME <>", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameGreaterThan(String value) {
            addCriterion("SEDITORDEPTNAME >", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("SEDITORDEPTNAME >=", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameLessThan(String value) {
            addCriterion("SEDITORDEPTNAME <", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameLessThanOrEqualTo(String value) {
            addCriterion("SEDITORDEPTNAME <=", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameLike(String value) {
            addCriterion("SEDITORDEPTNAME like", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameNotLike(String value) {
            addCriterion("SEDITORDEPTNAME not like", value, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameIn(List<String> values) {
            addCriterion("SEDITORDEPTNAME in", values, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameNotIn(List<String> values) {
            addCriterion("SEDITORDEPTNAME not in", values, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameBetween(String value1, String value2) {
            addCriterion("SEDITORDEPTNAME between", value1, value2, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSeditordeptnameNotBetween(String value1, String value2) {
            addCriterion("SEDITORDEPTNAME not between", value1, value2, "seditordeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidIsNull() {
            addCriterion("SLASTWRITERFID is null");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidIsNotNull() {
            addCriterion("SLASTWRITERFID is not null");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidEqualTo(String value) {
            addCriterion("SLASTWRITERFID =", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidNotEqualTo(String value) {
            addCriterion("SLASTWRITERFID <>", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidGreaterThan(String value) {
            addCriterion("SLASTWRITERFID >", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidGreaterThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERFID >=", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidLessThan(String value) {
            addCriterion("SLASTWRITERFID <", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidLessThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERFID <=", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidLike(String value) {
            addCriterion("SLASTWRITERFID like", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidNotLike(String value) {
            addCriterion("SLASTWRITERFID not like", value, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidIn(List<String> values) {
            addCriterion("SLASTWRITERFID in", values, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidNotIn(List<String> values) {
            addCriterion("SLASTWRITERFID not in", values, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidBetween(String value1, String value2) {
            addCriterion("SLASTWRITERFID between", value1, value2, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriterfidNotBetween(String value1, String value2) {
            addCriterion("SLASTWRITERFID not between", value1, value2, "slastwriterfid");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameIsNull() {
            addCriterion("SLASTWRITERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameIsNotNull() {
            addCriterion("SLASTWRITERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameEqualTo(String value) {
            addCriterion("SLASTWRITERNAME =", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameNotEqualTo(String value) {
            addCriterion("SLASTWRITERNAME <>", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameGreaterThan(String value) {
            addCriterion("SLASTWRITERNAME >", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameGreaterThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERNAME >=", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameLessThan(String value) {
            addCriterion("SLASTWRITERNAME <", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameLessThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERNAME <=", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameLike(String value) {
            addCriterion("SLASTWRITERNAME like", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameNotLike(String value) {
            addCriterion("SLASTWRITERNAME not like", value, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameIn(List<String> values) {
            addCriterion("SLASTWRITERNAME in", values, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameNotIn(List<String> values) {
            addCriterion("SLASTWRITERNAME not in", values, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameBetween(String value1, String value2) {
            addCriterion("SLASTWRITERNAME between", value1, value2, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriternameNotBetween(String value1, String value2) {
            addCriterion("SLASTWRITERNAME not between", value1, value2, "slastwritername");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameIsNull() {
            addCriterion("SLASTWRITERDEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameIsNotNull() {
            addCriterion("SLASTWRITERDEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameEqualTo(String value) {
            addCriterion("SLASTWRITERDEPTNAME =", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameNotEqualTo(String value) {
            addCriterion("SLASTWRITERDEPTNAME <>", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameGreaterThan(String value) {
            addCriterion("SLASTWRITERDEPTNAME >", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERDEPTNAME >=", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameLessThan(String value) {
            addCriterion("SLASTWRITERDEPTNAME <", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameLessThanOrEqualTo(String value) {
            addCriterion("SLASTWRITERDEPTNAME <=", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameLike(String value) {
            addCriterion("SLASTWRITERDEPTNAME like", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameNotLike(String value) {
            addCriterion("SLASTWRITERDEPTNAME not like", value, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameIn(List<String> values) {
            addCriterion("SLASTWRITERDEPTNAME in", values, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameNotIn(List<String> values) {
            addCriterion("SLASTWRITERDEPTNAME not in", values, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameBetween(String value1, String value2) {
            addCriterion("SLASTWRITERDEPTNAME between", value1, value2, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwriterdeptnameNotBetween(String value1, String value2) {
            addCriterion("SLASTWRITERDEPTNAME not between", value1, value2, "slastwriterdeptname");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeIsNull() {
            addCriterion("SLASTWRITETIME is null");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeIsNotNull() {
            addCriterion("SLASTWRITETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeEqualTo(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME =", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME <>", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME >", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME >=", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeLessThan(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME <", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SLASTWRITETIME <=", value, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeIn(List<Date> values) {
            addCriterionForJDBCDate("SLASTWRITETIME in", values, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SLASTWRITETIME not in", values, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SLASTWRITETIME between", value1, value2, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSlastwritetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SLASTWRITETIME not between", value1, value2, "slastwritetime");
            return (Criteria) this;
        }

        public Criteria andSfileidIsNull() {
            addCriterion("SFILEID is null");
            return (Criteria) this;
        }

        public Criteria andSfileidIsNotNull() {
            addCriterion("SFILEID is not null");
            return (Criteria) this;
        }

        public Criteria andSfileidEqualTo(String value) {
            addCriterion("SFILEID =", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidNotEqualTo(String value) {
            addCriterion("SFILEID <>", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidGreaterThan(String value) {
            addCriterion("SFILEID >", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidGreaterThanOrEqualTo(String value) {
            addCriterion("SFILEID >=", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidLessThan(String value) {
            addCriterion("SFILEID <", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidLessThanOrEqualTo(String value) {
            addCriterion("SFILEID <=", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidLike(String value) {
            addCriterion("SFILEID like", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidNotLike(String value) {
            addCriterion("SFILEID not like", value, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidIn(List<String> values) {
            addCriterion("SFILEID in", values, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidNotIn(List<String> values) {
            addCriterion("SFILEID not in", values, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidBetween(String value1, String value2) {
            addCriterion("SFILEID between", value1, value2, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSfileidNotBetween(String value1, String value2) {
            addCriterion("SFILEID not between", value1, value2, "sfileid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidIsNull() {
            addCriterion("SDOCLIVEVERSIONID is null");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidIsNotNull() {
            addCriterion("SDOCLIVEVERSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidEqualTo(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID =", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidNotEqualTo(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID <>", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidGreaterThan(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID >", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID >=", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidLessThan(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID <", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDOCLIVEVERSIONID <=", value, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidIn(List<BigDecimal> values) {
            addCriterion("SDOCLIVEVERSIONID in", values, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidNotIn(List<BigDecimal> values) {
            addCriterion("SDOCLIVEVERSIONID not in", values, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDOCLIVEVERSIONID between", value1, value2, "sdocliveversionid");
            return (Criteria) this;
        }

        public Criteria andSdocliveversionidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDOCLIVEVERSIONID not between", value1, value2, "sdocliveversionid");
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

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSclassificationIsNull() {
            addCriterion("SCLASSIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSclassificationIsNotNull() {
            addCriterion("SCLASSIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSclassificationEqualTo(String value) {
            addCriterion("SCLASSIFICATION =", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationNotEqualTo(String value) {
            addCriterion("SCLASSIFICATION <>", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationGreaterThan(String value) {
            addCriterion("SCLASSIFICATION >", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationGreaterThanOrEqualTo(String value) {
            addCriterion("SCLASSIFICATION >=", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationLessThan(String value) {
            addCriterion("SCLASSIFICATION <", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationLessThanOrEqualTo(String value) {
            addCriterion("SCLASSIFICATION <=", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationLike(String value) {
            addCriterion("SCLASSIFICATION like", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationNotLike(String value) {
            addCriterion("SCLASSIFICATION not like", value, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationIn(List<String> values) {
            addCriterion("SCLASSIFICATION in", values, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationNotIn(List<String> values) {
            addCriterion("SCLASSIFICATION not in", values, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationBetween(String value1, String value2) {
            addCriterion("SCLASSIFICATION between", value1, value2, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSclassificationNotBetween(String value1, String value2) {
            addCriterion("SCLASSIFICATION not between", value1, value2, "sclassification");
            return (Criteria) this;
        }

        public Criteria andSkeywordsIsNull() {
            addCriterion("SKEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andSkeywordsIsNotNull() {
            addCriterion("SKEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andSkeywordsEqualTo(String value) {
            addCriterion("SKEYWORDS =", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsNotEqualTo(String value) {
            addCriterion("SKEYWORDS <>", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsGreaterThan(String value) {
            addCriterion("SKEYWORDS >", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("SKEYWORDS >=", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsLessThan(String value) {
            addCriterion("SKEYWORDS <", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsLessThanOrEqualTo(String value) {
            addCriterion("SKEYWORDS <=", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsLike(String value) {
            addCriterion("SKEYWORDS like", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsNotLike(String value) {
            addCriterion("SKEYWORDS not like", value, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsIn(List<String> values) {
            addCriterion("SKEYWORDS in", values, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsNotIn(List<String> values) {
            addCriterion("SKEYWORDS not in", values, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsBetween(String value1, String value2) {
            addCriterion("SKEYWORDS between", value1, value2, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSkeywordsNotBetween(String value1, String value2) {
            addCriterion("SKEYWORDS not between", value1, value2, "skeywords");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberIsNull() {
            addCriterion("SDOCSERIALNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberIsNotNull() {
            addCriterion("SDOCSERIALNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberEqualTo(String value) {
            addCriterion("SDOCSERIALNUMBER =", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberNotEqualTo(String value) {
            addCriterion("SDOCSERIALNUMBER <>", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberGreaterThan(String value) {
            addCriterion("SDOCSERIALNUMBER >", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SDOCSERIALNUMBER >=", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberLessThan(String value) {
            addCriterion("SDOCSERIALNUMBER <", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberLessThanOrEqualTo(String value) {
            addCriterion("SDOCSERIALNUMBER <=", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberLike(String value) {
            addCriterion("SDOCSERIALNUMBER like", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberNotLike(String value) {
            addCriterion("SDOCSERIALNUMBER not like", value, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberIn(List<String> values) {
            addCriterion("SDOCSERIALNUMBER in", values, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberNotIn(List<String> values) {
            addCriterion("SDOCSERIALNUMBER not in", values, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberBetween(String value1, String value2) {
            addCriterion("SDOCSERIALNUMBER between", value1, value2, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSdocserialnumberNotBetween(String value1, String value2) {
            addCriterion("SDOCSERIALNUMBER not between", value1, value2, "sdocserialnumber");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeIsNull() {
            addCriterion("SFINISHTIME is null");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeIsNotNull() {
            addCriterion("SFINISHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SFINISHTIME =", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SFINISHTIME <>", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SFINISHTIME >", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SFINISHTIME >=", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeLessThan(Date value) {
            addCriterionForJDBCDate("SFINISHTIME <", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SFINISHTIME <=", value, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SFINISHTIME in", values, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SFINISHTIME not in", values, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SFINISHTIME between", value1, value2, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSfinishtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SFINISHTIME not between", value1, value2, "sfinishtime");
            return (Criteria) this;
        }

        public Criteria andSnamespaceIsNull() {
            addCriterion("SNAMESPACE is null");
            return (Criteria) this;
        }

        public Criteria andSnamespaceIsNotNull() {
            addCriterion("SNAMESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andSnamespaceEqualTo(String value) {
            addCriterion("SNAMESPACE =", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceNotEqualTo(String value) {
            addCriterion("SNAMESPACE <>", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceGreaterThan(String value) {
            addCriterion("SNAMESPACE >", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("SNAMESPACE >=", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceLessThan(String value) {
            addCriterion("SNAMESPACE <", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceLessThanOrEqualTo(String value) {
            addCriterion("SNAMESPACE <=", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceLike(String value) {
            addCriterion("SNAMESPACE like", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceNotLike(String value) {
            addCriterion("SNAMESPACE not like", value, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceIn(List<String> values) {
            addCriterion("SNAMESPACE in", values, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceNotIn(List<String> values) {
            addCriterion("SNAMESPACE not in", values, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceBetween(String value1, String value2) {
            addCriterion("SNAMESPACE between", value1, value2, "snamespace");
            return (Criteria) this;
        }

        public Criteria andSnamespaceNotBetween(String value1, String value2) {
            addCriterion("SNAMESPACE not between", value1, value2, "snamespace");
            return (Criteria) this;
        }

        public Criteria andScachenameIsNull() {
            addCriterion("SCACHENAME is null");
            return (Criteria) this;
        }

        public Criteria andScachenameIsNotNull() {
            addCriterion("SCACHENAME is not null");
            return (Criteria) this;
        }

        public Criteria andScachenameEqualTo(String value) {
            addCriterion("SCACHENAME =", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameNotEqualTo(String value) {
            addCriterion("SCACHENAME <>", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameGreaterThan(String value) {
            addCriterion("SCACHENAME >", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameGreaterThanOrEqualTo(String value) {
            addCriterion("SCACHENAME >=", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameLessThan(String value) {
            addCriterion("SCACHENAME <", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameLessThanOrEqualTo(String value) {
            addCriterion("SCACHENAME <=", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameLike(String value) {
            addCriterion("SCACHENAME like", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameNotLike(String value) {
            addCriterion("SCACHENAME not like", value, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameIn(List<String> values) {
            addCriterion("SCACHENAME in", values, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameNotIn(List<String> values) {
            addCriterion("SCACHENAME not in", values, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameBetween(String value1, String value2) {
            addCriterion("SCACHENAME between", value1, value2, "scachename");
            return (Criteria) this;
        }

        public Criteria andScachenameNotBetween(String value1, String value2) {
            addCriterion("SCACHENAME not between", value1, value2, "scachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameIsNull() {
            addCriterion("SREVISIONCACHENAME is null");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameIsNotNull() {
            addCriterion("SREVISIONCACHENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameEqualTo(String value) {
            addCriterion("SREVISIONCACHENAME =", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameNotEqualTo(String value) {
            addCriterion("SREVISIONCACHENAME <>", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameGreaterThan(String value) {
            addCriterion("SREVISIONCACHENAME >", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameGreaterThanOrEqualTo(String value) {
            addCriterion("SREVISIONCACHENAME >=", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameLessThan(String value) {
            addCriterion("SREVISIONCACHENAME <", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameLessThanOrEqualTo(String value) {
            addCriterion("SREVISIONCACHENAME <=", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameLike(String value) {
            addCriterion("SREVISIONCACHENAME like", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameNotLike(String value) {
            addCriterion("SREVISIONCACHENAME not like", value, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameIn(List<String> values) {
            addCriterion("SREVISIONCACHENAME in", values, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameNotIn(List<String> values) {
            addCriterion("SREVISIONCACHENAME not in", values, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameBetween(String value1, String value2) {
            addCriterion("SREVISIONCACHENAME between", value1, value2, "srevisioncachename");
            return (Criteria) this;
        }

        public Criteria andSrevisioncachenameNotBetween(String value1, String value2) {
            addCriterion("SREVISIONCACHENAME not between", value1, value2, "srevisioncachename");
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

        public Criteria andSflagEqualTo(BigDecimal value) {
            addCriterion("SFLAG =", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotEqualTo(BigDecimal value) {
            addCriterion("SFLAG <>", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagGreaterThan(BigDecimal value) {
            addCriterion("SFLAG >", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SFLAG >=", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagLessThan(BigDecimal value) {
            addCriterion("SFLAG <", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SFLAG <=", value, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagIn(List<BigDecimal> values) {
            addCriterion("SFLAG in", values, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotIn(List<BigDecimal> values) {
            addCriterion("SFLAG not in", values, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SFLAG between", value1, value2, "sflag");
            return (Criteria) this;
        }

        public Criteria andSflagNotBetween(BigDecimal value1, BigDecimal value2) {
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