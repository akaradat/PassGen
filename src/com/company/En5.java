package com.company;

/***
 *      swap
 *      example ABC -> CBA
 */
public class En5 extends Encrypt {
    public En5(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = super.code.length()-1; i >= 0; i--) {
            super.pass += super.code.charAt(i);
        }

        return super.pass;
    }

    @Override
    public String DePass() {
        for (int i = super.code.length()-1; i >= 0; i--) {
            super.pass += super.code.charAt(i);
        }
        return super.pass;
    }
}



