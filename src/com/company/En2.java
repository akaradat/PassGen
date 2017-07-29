package com.company;

public class En2 extends Encrypt{
    public En2(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
            pass+=(char)(159-super.code.charAt(i));
        }

        return pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            pass+=(char)(159-super.code.charAt(i));
        }

        return pass;
    }
}
