package cn.yufei.ssm.system.po;

import java.util.Date;

public class TUser {
    private String fid;

    private String fusername;

    private Date fbirthday;

    private String fsex;

    private String faddress;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername == null ? null : fusername.trim();
    }

    public Date getFbirthday() {
        return fbirthday;
    }

    public void setFbirthday(Date fbirthday) {
        this.fbirthday = fbirthday;
    }

    public String getFsex() {
        return fsex;
    }

    public void setFsex(String fsex) {
        this.fsex = fsex == null ? null : fsex.trim();
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
    }
}