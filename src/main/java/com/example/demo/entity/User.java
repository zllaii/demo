package com.example.demo.entity;

public class User {

    private String uid;
    private String uname;

    public User(String uid, String uname){
        this.uid = uid;
        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
