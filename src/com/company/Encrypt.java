package com.company;

public class Encrypt {
    protected String code;
    protected String pass;

    public Encrypt(String code) {
        this.code = code;
        pass = "";
    }

    public String GenPass(){
        return pass;
    }
}
