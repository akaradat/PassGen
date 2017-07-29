package com.company;

/***
 *      plus 5 char
 *      example A -> F
 */
public class En1 extends Encrypt {
    public En1(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {

            if (super.code.charAt(i) >= 32 && super.code.charAt(i) <= 126) {

                super.pass += (char) ((super.code.charAt(i) - 32 + 5) % 95 + 32);
            } else {

                super.pass += super.code.charAt(i);
            }

        }
//        System.out.println(super.pass.length());
        return super.pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>=32&&super.code.charAt(i)<=126)
                super.pass += (char) ((super.code.charAt(i)-126-5)%95 + 126);
            else{

                super.pass += super.code.charAt(i);

            }

        }
        return super.pass;
    }
}



