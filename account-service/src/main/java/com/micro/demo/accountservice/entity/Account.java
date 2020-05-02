package com.micro.demo.accountservice.entity;

public class Account {
    private String id;
    private String userName;
    private String email;
    private String passwd;

    public Account(){
    }

    public Account(String id){
        this.id = id;
    }

    public Account(String id, String userName, String email, String passwd) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
