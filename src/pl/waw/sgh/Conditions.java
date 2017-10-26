package pl.waw.sgh;

public class Conditions {

    public static void main(String[] args) {


        {
            int hej;
        }

        /*hej nie zadziała, bo nie jest w tym scope zadeklarowane
        System.out.println("hej=" +hej)
        blok do komenta to ctrl shift slash*/

        boolean myCond=false;

        if(!myCond) {
            System.out.println("myCond is true");
            System.out.println("I'm in the block :)");
        }
        else
            System.out.println("myCond is false");

        // > >= <= ==
        //compate with a value - primitive data type

        int b=6;
        if (b==6){
            System.out.println("b = 6");
        }

        String s1 = "abc";
        String s2= "abc";

        if(s1==s2) System.out.println("stringi rowneo");
        if(s2.equals(s2)) System.out.println("elo");

        int c;

    }
}
