package com.company;

/***
 *      plus 2 character +3 and +5
 *      example A -> DF
 */
public class En4 extends Encrypt{
    public En4(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>=32&&super.code.charAt(i)<=127){
                super.pass += (char) ((super.code.charAt(i) - 32 + 3) % 96 + 32);
                super.pass += (char) ((super.code.charAt(i) - 32 + 5) % 96 + 32);
            }

            else{
                System.out.println("fuckfuck");
                super.pass += super.code.charAt(i);
                super.pass += super.code.charAt(i);
            }

        }
//        System.out.println(super.pass.length());
        return pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i+=2) {
//            System.out.println(i);
//            if (super.code.charAt(i)>=32&&super.code.charAt(i)<=127){
                super.pass += (char) ((super.code.charAt(i) - 126 - 3) % 96 + 126);
//            }
//            else{
//                super.pass += super.code.charAt(i);
//            }

        }


        return pass;
    }
}