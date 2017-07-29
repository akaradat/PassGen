package com.company;

public class En1 extends Encrypt {
    public En1(String code) {
        super(code);
    }

    @Override
    public String EnPass() {
        for (int i = 0; i < super.code.length(); i++) {
//            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z'){
//                pass+=(char)((super.code.charAt(i)+5-'a')%('z'-'a')+'a');
//
//            }
//
//            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z'){
//                pass+=(char)((super.code.charAt(i)+5-'A')%('Z'-'A')+'A');
//
//            }
//
//            else{
//                if(i%2==0)
//                    pass+=(char)((super.code.charAt(i)*5%9-'a')%('z'-'a')+'a');
//                else
//                    pass+=super.code.charAt(i);
//            }
            super.pass += (char) (super.code.charAt(i) + 5);
        }
        return super.pass;
    }

    @Override
    public String DePass() {
        for (int i = 0; i < super.code.length(); i++) {
            super.pass += (char) (super.code.charAt(i) - 5);

        }
        return super.pass;
    }
}
