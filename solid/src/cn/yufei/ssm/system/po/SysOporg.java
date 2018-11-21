package cn.yufei.ssm.system.po;

import java.math.BigDecimal;
import java.util.List;

import cn.yufei.ssm.system.dal.object.Entity;

public class SysOporg implements Entity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sid;

    private String sname;

    private String scode;

    private String slongname;

    private String sfname;

    private String sfcode;

    private String sfid;

    private String sorgkindid;

    private String ssequence;

    private BigDecimal svalidstate;

    private String sparent;

    private BigDecimal slevel;

    private String sphone;

    private String sfax;

    private String saddress;

    private String szip;

    private String sdescription;

    private String spersonid;

    private String snodekind;

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

    public String getSlongname() {
        return slongname;
    }

    public void setSlongname(String slongname) {
        this.slongname = slongname == null ? null : slongname.trim();
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname == null ? null : sfname.trim();
    }

    public String getSfcode() {
        return sfcode;
    }

    public void setSfcode(String sfcode) {
        this.sfcode = sfcode == null ? null : sfcode.trim();
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public String getSorgkindid() {
        return sorgkindid;
    }

    public void setSorgkindid(String sorgkindid) {
        this.sorgkindid = sorgkindid == null ? null : sorgkindid.trim();
    }

    public String getSsequence() {
        return ssequence;
    }

    public void setSsequence(String ssequence) {
        this.ssequence = ssequence == null ? null : ssequence.trim();
    }

    public BigDecimal getSvalidstate() {
        return svalidstate;
    }

    public void setSvalidstate(BigDecimal svalidstate) {
        this.svalidstate = svalidstate;
    }

    public String getSparent() {
        return sparent;
    }

    public void setSparent(String sparent) {
        this.sparent = sparent == null ? null : sparent.trim();
    }

    public BigDecimal getSlevel() {
        return slevel;
    }

    public void setSlevel(BigDecimal slevel) {
        this.slevel = slevel;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    public String getSfax() {
        return sfax;
    }

    public void setSfax(String sfax) {
        this.sfax = sfax == null ? null : sfax.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getSzip() {
        return szip;
    }

    public void setSzip(String szip) {
        this.szip = szip == null ? null : szip.trim();
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription == null ? null : sdescription.trim();
    }

    public String getSpersonid() {
        return spersonid;
    }

    public void setSpersonid(String spersonid) {
        this.spersonid = spersonid == null ? null : spersonid.trim();
    }

    public String getSnodekind() {
        return snodekind;
    }

    public void setSnodekind(String snodekind) {
        this.snodekind = snodekind == null ? null : snodekind.trim();
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    
    
}