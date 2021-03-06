package com.company;

public class CheckEn {
    private String code;
    private String order;
    private String check;
    private Encrypt encrypt;

    public CheckEn(String code, String order,String check) {
        this.code = code;
        this.order = order;
        this.check = check;
    }

    public String StartEn() {
        if(check.toLowerCase().equals("Encrypt")||check.toLowerCase().equals("e")){
            return GetEnpass();
        }
        else if(check.equals("Decrypt")||check.toLowerCase().equals("d"))
        {
            return GetDePass();
        }
        else return "Choose e/n";
    }

    public String GetEnpass(){
        for (int i = 0; i < order.length(); i++) {
            switch (order.charAt(i)){
                case '0' : {
                    encrypt = new En0(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '1' : {
                    encrypt = new En1(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '2' : {
                    encrypt = new En2(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '3' : {
                    encrypt = new En3(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '4' : {
                    encrypt = new En4(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '5' : {
                    encrypt = new En5(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '6' : {
                    encrypt = new En6(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '7' : {
                    encrypt = new En7(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '8' : {
                    encrypt = new En8(code);
                    code = encrypt.EnPass();
                    break;
                }

                case '9' : {
                    encrypt = new En9(code);
                    code = encrypt.EnPass();
                    break;
                }

            }
        }
        return code;
    }

    public String GetDePass()
    {
        for (int i = order.length()-1; i >= 0 ; i--) {
            switch (order.charAt(i)){
                case '0' : {
                    encrypt = new En0(code);
                    code = encrypt.DePass();
                    break;
                }

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

                case '3' : {
                    encrypt = new En3(code);
                    code = encrypt.DePass();
                    break;
                }

                case '4' : {
                    encrypt = new En4(code);
                    code = encrypt.DePass();
                    break;
                }

                case '5' : {
                    encrypt = new En5(code);
                    code = encrypt.DePass();
                    break;
                }

                case '6' : {
                    encrypt = new En6(code);
                    code = encrypt.DePass();
                    break;
                }

                case '7' : {
                    encrypt = new En7(code);
                    code = encrypt.DePass();
                    break;
                }

                case '8' : {
                    encrypt = new En8(code);
                    code = encrypt.DePass();
                    break;
                }

                case '9' : {
                    encrypt = new En9(code);
                    code = encrypt.DePass();
                    break;
                }


            }
        }
        return code;
    }
}
