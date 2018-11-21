package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.Date;

public class SysBasecode {
    private String sid;

    private String stype;

    private String scode;

    private String sname;

    private BigDecimal sisvalid;

    private String screatorcode;

    private String screatorname;

    private Date stimecreated;

    private BigDecimal version;

    private String stypecode;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public BigDecimal getSisvalid() {
        return sisvalid;
    }

    public void setSisvalid(BigDecimal sisvalid) {
        this.sisvalid = sisvalid;
    }

    public String getScreatorcode() {
        return screatorcode;
    }

    public void setScreatorcode(String screatorcode) {
        this.screatorcode = screatorcode == null ? null : screatorcode.trim();
    }

    public String getScreatorname() {
        return screatorname;
    }

    public void setScreatorname(String screatorname) {
        this.screatorname = screatorname == null ? null : screatorname.trim();
    }

    public Date getStimecreated() {
        return stimecreated;
    }

    public void setStimecreated(Date stimecreated) {
        this.stimecreated = stimecreated;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getStypecode() {
        return stypecode;
    }

    public void setStypecode(String stypecode) {
        this.stypecode = stypecode == null ? null : stypecode.trim();
    }
}