package com.company;

public class En3 extends Encrypt {
    public En3(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z')
                super.pass += (char) ((super.code.charAt(i) - 'a' + 13) % 26 + 'a');
            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z')
                super.pass += (char) ((super.code.charAt(i) - 'A' + 13) % 26 + 'A');
            else
                super.pass += super.code.charAt(i);
        }
        return super.pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z')
                super.pass += (char) ((super.code.charAt(i) - 'a' + 13) % 26 + 'a');
            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z')
                super.pass += (char) ((super.code.charAt(i) - 'A' + 13) % 26 + 'A');
            else
                super.pass += super.code.charAt(i);
        }
        return super.pass;
    }
}
