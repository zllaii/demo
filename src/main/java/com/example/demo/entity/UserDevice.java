package com.example.demo.entity;

public class UserDevice {

    private String uuid;
    private String uid;
    private String did;

    public UserDevice(String uid, String did) {
        this.uid = uid;
        this.did = did;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}
