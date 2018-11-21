package com.yufei.doc.po;

public class SysDocnodeWithBLOBs extends SysDocnode {
    private String sdocdisplaypath;

    private String sdescription;

    public String getSdocdisplaypath() {
        return sdocdisplaypath;
    }

    public void setSdocdisplaypath(String sdocdisplaypath) {
        this.sdocdisplaypath = sdocdisplaypath == null ? null : sdocdisplaypath.trim();
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription == null ? null : sdescription.trim();
    }
}