package com.example.demo.entity;

public class Device {

    private String did;
    private String dname;

    public Device(String did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
