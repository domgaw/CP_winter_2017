package pl.waw.sgh.email;

public class check {
    public static void main(String[] args) {

        String email="asda!@qwert12";

        //System.out.println(email.charAt(5));
        //(int) email.charAt(1);

        boolean valid=true;

        int malpa =email.indexOf("@");

        if (malpa<=0 || malpa>=(email.length()-3) || email.charAt(0)=='.'|| email.charAt(malpa-1)=='.') valid=false;

     /*   else {
                for (int i=0;i<malpa;i++)
                {
                    if ((int) email.charAt(i)<=48 || ((int) email.charAt(i)>=48 && (int) email.charAt(i)<=48)) valid=false;
                }
        }*/

        if(valid) System.out.println("valid email adress");
        else System.out.println("not a valid email adress");





    }
}
