package com.company;

/***
 *      plus 5 char only odd
 *      example abcd -> hbjd
 */
public class En8 extends Encrypt {
    public En8(String code) {
        super(code);

    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {

            if (super.code.charAt(i) >= 32 && super.code.charAt(i) <= 126 && i % 2 == 0) {

                super.pass += (char) ((super.code.charAt(i) - 32 + 7) % 95 + 32);

            } else {
                pass += super.code.charAt(i);
            }

        }

        return pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {

            if (super.code.charAt(i) >= 32 && super.code.charAt(i) <= 126 && i % 2 == 0) {

                super.pass += (char) ((super.code.charAt(i) - 126 - 7) % 95 + 126);

            } else {
                pass += super.code.charAt(i);
            }

        }
        return super.pass;
    }
}



