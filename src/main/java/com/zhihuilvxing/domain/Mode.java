package com.zhihuilvxing.domain;

public class Mode {
    private Integer modeid;
    private String mode;

    public Mode(Integer modeid, String mode) {
        this.modeid = modeid;
        this.mode = mode;
    }

    public Mode() {
    }

    public Integer getModeid() {
        return modeid;
    }

    public void setModeid(Integer modeid) {
        this.modeid = modeid;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
