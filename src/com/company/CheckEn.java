package com.company;

public class CheckEn {
    private String code;
    private String order;
    private Encrypt encrypt;

    public CheckEn(String code, String order) {
        this.code = code;
        this.order = order;

    }

    public String GetEnpass(){
        for (int i = 0; i < order.length(); i++) {
            switch (order.charAt(i)){
                case '1' : {
                    encrypt = new En1(code);
                    code = encrypt.EnPass();
//                    System.out.println("In Getpass1 is "+ pass);
                    break;
                }

                case '2' : {
                    encrypt = new En2(code);
                    code = encrypt.EnPass();
                    break;
                }

            }
        }
        return code;
    }

    public String GetDePass()
    {
        for (int i = 0; i < order.length(); i++) {
            switch (order.charAt(i)){
                case '1' : {
                    encrypt = new En1(code);
                    code = encrypt.DePass();

                    break;
                }

                case '2' : {
                    encrypt = new En2(code);
                    code = encrypt.DePass();
                    break;
                }

            }
        }
        return code;
    }
}
