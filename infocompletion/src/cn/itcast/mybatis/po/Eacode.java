package cn.itcast.mybatis.po;

import java.math.BigDecimal;

public class Eacode {
    private String field;

    private String fieldname;

    private String code;

    private String codedesc;

    private String enabled;

    private String editmode;

    private Short sortno;

    private String remark;

    private String codeid;

    private BigDecimal sTransmit;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodedesc() {
        return codedesc;
    }

    public void setCodedesc(String codedesc) {
        this.codedesc = codedesc == null ? null : codedesc.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getEditmode() {
        return editmode;
    }

    public void setEditmode(String editmode) {
        this.editmode = editmode == null ? null : editmode.trim();
    }

    public Short getSortno() {
        return sortno;
    }

    public void setSortno(Short sortno) {
        this.sortno = sortno;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCodeid() {
        return codeid;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid == null ? null : codeid.trim();
    }

    public BigDecimal getsTransmit() {
        return sTransmit;
    }

    public void setsTransmit(BigDecimal sTransmit) {
        this.sTransmit = sTransmit;
    }
}