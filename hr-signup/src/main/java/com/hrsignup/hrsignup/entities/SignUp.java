package com.hrsignup.hrsignup.entities;

import java.io.Serializable;

public class SignUp implements Serializable {

    private long id;
    private String fullName;
    private String email;
    private String password;

    public SignUp() {
    }

    public SignUp(long id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
