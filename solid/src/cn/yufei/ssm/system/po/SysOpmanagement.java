package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.Date;

public class SysOpmanagement {
    private String sid;

    private String sorgid;

    private String sorgname;

    private String sorgfid;

    private String sorgfname;

    private String smanageorgid;

    private String smanageorgname;

    private String smanageorgfid;

    private String smanageorgfname;

    private String smanagetypeid;

    private String screatorfid;

    private String screatorfname;

    private Date screatetime;

    private BigDecimal version;

    private String smanagetypename;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSorgid() {
        return sorgid;
    }

    public void setSorgid(String sorgid) {
        this.sorgid = sorgid == null ? null : sorgid.trim();
    }

    public String getSorgname() {
        return sorgname;
    }

    public void setSorgname(String sorgname) {
        this.sorgname = sorgname == null ? null : sorgname.trim();
    }

    public String getSorgfid() {
        return sorgfid;
    }

    public void setSorgfid(String sorgfid) {
        this.sorgfid = sorgfid == null ? null : sorgfid.trim();
    }

    public String getSorgfname() {
        return sorgfname;
    }

    public void setSorgfname(String sorgfname) {
        this.sorgfname = sorgfname == null ? null : sorgfname.trim();
    }

    public String getSmanageorgid() {
        return smanageorgid;
    }

    public void setSmanageorgid(String smanageorgid) {
        this.smanageorgid = smanageorgid == null ? null : smanageorgid.trim();
    }

    public String getSmanageorgname() {
        return smanageorgname;
    }

    public void setSmanageorgname(String smanageorgname) {
        this.smanageorgname = smanageorgname == null ? null : smanageorgname.trim();
    }

    public String getSmanageorgfid() {
        return smanageorgfid;
    }

    public void setSmanageorgfid(String smanageorgfid) {
        this.smanageorgfid = smanageorgfid == null ? null : smanageorgfid.trim();
    }

    public String getSmanageorgfname() {
        return smanageorgfname;
    }

    public void setSmanageorgfname(String smanageorgfname) {
        this.smanageorgfname = smanageorgfname == null ? null : smanageorgfname.trim();
    }

    public String getSmanagetypeid() {
        return smanagetypeid;
    }

    public void setSmanagetypeid(String smanagetypeid) {
        this.smanagetypeid = smanagetypeid == null ? null : smanagetypeid.trim();
    }

    public String getScreatorfid() {
        return screatorfid;
    }

    public void setScreatorfid(String screatorfid) {
        this.screatorfid = screatorfid == null ? null : screatorfid.trim();
    }

    public String getScreatorfname() {
        return screatorfname;
    }

    public void setScreatorfname(String screatorfname) {
        this.screatorfname = screatorfname == null ? null : screatorfname.trim();
    }

    public Date getScreatetime() {
        return screatetime;
    }

    public void setScreatetime(Date screatetime) {
        this.screatetime = screatetime;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getSmanagetypename() {
        return smanagetypename;
    }

    public void setSmanagetypename(String smanagetypename) {
        this.smanagetypename = smanagetypename == null ? null : smanagetypename.trim();
    }
}