package com.company;

public class En1 extends Encrypt {
    public En1(String code) {
        super(code);
    }

    @Override
    public String GenPass() {
        for (int i = 0; i < super.code.length(); i++) {
            if (super.code.charAt(i)>='a'&&super.code.charAt(i)<='z'){
                pass+=(char)((super.code.charAt(i)+5-'a')%('z'-'a')+'a');
//                System.out.println("in a");
            }

            else if (super.code.charAt(i)>='A'&&super.code.charAt(i)<='Z'){
                pass+=(char)((super.code.charAt(i)+5-'A')%('Z'-'A')+'A');
//                System.out.println("in A");
            }

            else{
                if(i%2==0)
                    pass+=(char)((super.code.charAt(i)*5%9-'a')%('z'-'a')+'a');
                else
                    pass+=super.code.charAt(i);
            }
        }
//        System.out.println(pass);
//        System.out.println();
//        System.out.println();
//        System.out.println("Pass in En1 GenPass is "+ pass);
        return pass;
    }
}
