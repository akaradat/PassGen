package com.company;

/***
 *      plus 2 character *5 and +10
 *      example A -> eK
 */
public class En7 extends Encrypt{
    public En7(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {

            super.pass += (char) (((super.code.charAt(i) - 32) * 5) % 96 + 32);
            super.pass += (char) ((super.code.charAt(i) - 32 + 10) % 96 + 32);


        }
        return pass;
    }

    @Override
    public String DePass() {
        for (int i = 1; i < super.code.length(); i+=2) {

            super.pass += (char) ((super.code.charAt(i) - 126 - 10) % 96 + 126);

        }


        return pass;
    }
}
