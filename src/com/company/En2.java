package com.company;

public class En2 extends Encrypt{
    public En2(String code) {
        super(code);
    }

    @Override
    public String GenPass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z'){
                pass+=(char)('z'+'a'-super.code.charAt(i));
//                System.out.println("in a");
            }

            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z'){
                pass+=(char)('Z'+'A'-super.code.charAt(i));
//                System.out.println("in A");
            }

            else{
                pass+=super.code.charAt(i);
            }

        }

        return pass;
    }
}
