package com.yufei.doc.po;

import java.math.BigDecimal;
import java.util.Date;

import cn.yufei.ssm.system.dal.object.Entity;

public class SysDocnode implements Entity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sid;

    private String sparentid;

    private String sdocname;

    private String ssequence;

    private Double ssize;

    private String skind;

    private String sdocpath;

    private String screatorfid;

    private String screatorname;

    private String screatordeptname;

    private Date screatetime;

    private String seditorfid;

    private String seditorname;

    private String seditordeptname;

    private String slastwriterfid;

    private String slastwritername;

    private String slastwriterdeptname;

    private Date slastwritetime;

    private String sfileid;

    private BigDecimal sdocliveversionid;

    private Long version;

    private String sclassification;

    private String skeywords;

    private String sdocserialnumber;

    private Date sfinishtime;

    private String snamespace;

    private String scachename;

    private String srevisioncachename;

    private BigDecimal sflag;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSparentid() {
        return sparentid;
    }

    public void setSparentid(String sparentid) {
        this.sparentid = sparentid == null ? null : sparentid.trim();
    }

    public String getSdocname() {
        return sdocname;
    }

    public void setSdocname(String sdocname) {
        this.sdocname = sdocname == null ? null : sdocname.trim();
    }

    public String getSsequence() {
        return ssequence;
    }

    public void setSsequence(String ssequence) {
        this.ssequence = ssequence == null ? null : ssequence.trim();
    }

    public Double getSsize() {
        return ssize;
    }

    public void setSsize(Double ssize) {
        this.ssize = ssize;
    }

    public String getSkind() {
        return skind;
    }

    public void setSkind(String skind) {
        this.skind = skind == null ? null : skind.trim();
    }

    public String getSdocpath() {
        return sdocpath;
    }

    public void setSdocpath(String sdocpath) {
        this.sdocpath = sdocpath == null ? null : sdocpath.trim();
    }

    public String getScreatorfid() {
        return screatorfid;
    }

    public void setScreatorfid(String screatorfid) {
        this.screatorfid = screatorfid == null ? null : screatorfid.trim();
    }

    public String getScreatorname() {
        return screatorname;
    }

    public void setScreatorname(String screatorname) {
        this.screatorname = screatorname == null ? null : screatorname.trim();
    }

    public String getScreatordeptname() {
        return screatordeptname;
    }

    public void setScreatordeptname(String screatordeptname) {
        this.screatordeptname = screatordeptname == null ? null : screatordeptname.trim();
    }

    public Date getScreatetime() {
        return screatetime;
    }

    public void setScreatetime(Date screatetime) {
        this.screatetime = screatetime;
    }

    public String getSeditorfid() {
        return seditorfid;
    }

    public void setSeditorfid(String seditorfid) {
        this.seditorfid = seditorfid == null ? null : seditorfid.trim();
    }

    public String getSeditorname() {
        return seditorname;
    }

    public void setSeditorname(String seditorname) {
        this.seditorname = seditorname == null ? null : seditorname.trim();
    }

    public String getSeditordeptname() {
        return seditordeptname;
    }

    public void setSeditordeptname(String seditordeptname) {
        this.seditordeptname = seditordeptname == null ? null : seditordeptname.trim();
    }

    public String getSlastwriterfid() {
        return slastwriterfid;
    }

    public void setSlastwriterfid(String slastwriterfid) {
        this.slastwriterfid = slastwriterfid == null ? null : slastwriterfid.trim();
    }

    public String getSlastwritername() {
        return slastwritername;
    }

    public void setSlastwritername(String slastwritername) {
        this.slastwritername = slastwritername == null ? null : slastwritername.trim();
    }

    public String getSlastwriterdeptname() {
        return slastwriterdeptname;
    }

    public void setSlastwriterdeptname(String slastwriterdeptname) {
        this.slastwriterdeptname = slastwriterdeptname == null ? null : slastwriterdeptname.trim();
    }

    public Date getSlastwritetime() {
        return slastwritetime;
    }

    public void setSlastwritetime(Date slastwritetime) {
        this.slastwritetime = slastwritetime;
    }

    public String getSfileid() {
        return sfileid;
    }

    public void setSfileid(String sfileid) {
        this.sfileid = sfileid == null ? null : sfileid.trim();
    }

    public BigDecimal getSdocliveversionid() {
        return sdocliveversionid;
    }

    public void setSdocliveversionid(BigDecimal sdocliveversionid) {
        this.sdocliveversionid = sdocliveversionid;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getSclassification() {
        return sclassification;
    }

    public void setSclassification(String sclassification) {
        this.sclassification = sclassification == null ? null : sclassification.trim();
    }

    public String getSkeywords() {
        return skeywords;
    }

    public void setSkeywords(String skeywords) {
        this.skeywords = skeywords == null ? null : skeywords.trim();
    }

    public String getSdocserialnumber() {
        return sdocserialnumber;
    }

    public void setSdocserialnumber(String sdocserialnumber) {
        this.sdocserialnumber = sdocserialnumber == null ? null : sdocserialnumber.trim();
    }

    public Date getSfinishtime() {
        return sfinishtime;
    }

    public void setSfinishtime(Date sfinishtime) {
        this.sfinishtime = sfinishtime;
    }

    public String getSnamespace() {
        return snamespace;
    }

    public void setSnamespace(String snamespace) {
        this.snamespace = snamespace == null ? null : snamespace.trim();
    }

    public String getScachename() {
        return scachename;
    }

    public void setScachename(String scachename) {
        this.scachename = scachename == null ? null : scachename.trim();
    }

    public String getSrevisioncachename() {
        return srevisioncachename;
    }

    public void setSrevisioncachename(String srevisioncachename) {
        this.srevisioncachename = srevisioncachename == null ? null : srevisioncachename.trim();
    }

    public BigDecimal getSflag() {
        return sflag;
    }

    public void setSflag(BigDecimal sflag) {
        this.sflag = sflag;
    }
}