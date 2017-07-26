package com.company;

public class En1 extends Encrypt {
    public En1(String code) {
        super(code);
    }

    @Override
    public String GenPass() {
        for (int i = 0; i < super.code.length(); i++) {
            pass+=(char)(super.code.charAt(i)+2);
        }
//        System.out.println(pass);
//        System.out.println();
//        System.out.println();
        return pass;
    }
}
