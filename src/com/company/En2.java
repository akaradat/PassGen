package com.company;

/***
 *      swap char
 *      example A -> Z
 */
public class En2 extends Encrypt{
    public En2(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
//            System.out.println(i+"     "+super.pass.length());
            if (super.code.charAt(i) >= 32 && super.code.charAt(i) <= 126) {
                pass += (char) (126 + 32 - super.code.charAt(i));
            } else {
                pass += super.code.charAt(i);
            }
        }
        return pass;

    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i) >= 32 && super.code.charAt(i) <= 126) {
                pass += (char) (126 + 32 - super.code.charAt(i));
            }
            else {
                pass += super.code.charAt(i);
            }
        }

        return pass;
    }
}
