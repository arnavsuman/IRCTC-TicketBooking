package com.trainbooking.user.model;

public class User{
    private String userId;
    private String password;
    private String email;

    public User(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        this.email = email;
    }
    public String getuserId() {
        return userId;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}