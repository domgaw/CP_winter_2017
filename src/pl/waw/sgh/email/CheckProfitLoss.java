package pl.waw.sgh.email;

import java.util.Scanner;

public class CheckProfitLoss
{
    public static void main(String[] args) {

        double cost;
        double sell;
        int units;
        int wynik;

        System.out.println("Please provide unit cost:");
        cost = new Scanner(System.in).nextDouble();

        System.out.println("Please provide selling price:");
        sell = new Scanner(System.in).nextDouble();

        System.out.println("Please provide unit sold:");
        units = new Scanner(System.in).nextInt();

        if(cost>sell) System.out.println("Cost is higher than profit");
        if(cost==sell) System.out.println("Cost is equal to profit");
        if(cost<sell) System.out.println("Profit is higher than cost");
        System.out.println("Balance is equal to" +(sell*units-cost*units));



    }
}
