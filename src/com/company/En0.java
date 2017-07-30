package com.company;

/***
 *      plus 3 character +2, *7 and +10
 *      example A -> eK
 */
public class En0 extends Encrypt{
    public En0(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {

            super.pass += (char) (((super.code.charAt(i) - 32) +2 ) % 96 + 32);
            super.pass += (char) (((super.code.charAt(i) - 32) * 7) % 96 + 32);
            super.pass += (char) ((super.code.charAt(i) - 32 + 10) % 96 + 32);


        }
        return pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i+=3) {

            super.pass += (char) ((super.code.charAt(i) - 126 - 2) % 96 + 126);

        }


        return pass;
    }
}
