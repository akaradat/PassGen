package com.company;

/***
 *      plus 13 char only a-z
 *      example A -> N
 */
public class En6 extends Encrypt {
    public En6(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z'){
                super.pass += (char) (super.code.charAt(i) - 32);
            }

            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z'){
                super.pass += (char) (super.code.charAt(i) + 32);
            }

            else{
                super.pass += super.code.charAt(i);
            }

        }
        return super.pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z'){
                super.pass += (char) (super.code.charAt(i) - 32);
            }

            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z'){
                super.pass += (char) (super.code.charAt(i) + 32);
            }

            else{
                super.pass += super.code.charAt(i);
            }
        }
        return super.pass;
    }
}
