package com.company;

public class CheckEn {
    private String pass;
    private String order;
    private Encrypt encrypt;

    public CheckEn(String pass, String order) {
        this.pass = pass;
        this.order = order;

    }

    public String Getpass(){
        for (int i = 0; i < order.length(); i++) {
            switch (order.charAt(i)){
                case '1' : {
                    encrypt = new En1(pass);
                    pass = encrypt.GenPass();
//                    System.out.println("In Getpass1 is "+ pass);
                    break;
                }


            }
        }
        return pass;
    }
}
