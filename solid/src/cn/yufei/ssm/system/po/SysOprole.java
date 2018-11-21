package cn.yufei.ssm.system.po;

import java.math.BigDecimal;

public class SysOprole {
    private String sid;

    private String sname;

    private String scode;

    private String scatalog;

    private String srolekind;

    private String sparentnames;

    private String sdescription;

    private BigDecimal ssequence;

    private BigDecimal svalidstate;

    private BigDecimal version;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getScatalog() {
        return scatalog;
    }

    public void setScatalog(String scatalog) {
        this.scatalog = scatalog == null ? null : scatalog.trim();
    }

    public String getSrolekind() {
        return srolekind;
    }

    public void setSrolekind(String srolekind) {
        this.srolekind = srolekind == null ? null : srolekind.trim();
    }

    public String getSparentnames() {
        return sparentnames;
    }

    public void setSparentnames(String sparentnames) {
        this.sparentnames = sparentnames == null ? null : sparentnames.trim();
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription == null ? null : sdescription.trim();
    }

    public BigDecimal getSsequence() {
        return ssequence;
    }

    public void setSsequence(BigDecimal ssequence) {
        this.ssequence = ssequence;
    }

    public BigDecimal getSvalidstate() {
        return svalidstate;
    }

    public void setSvalidstate(BigDecimal svalidstate) {
        this.svalidstate = svalidstate;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }
}