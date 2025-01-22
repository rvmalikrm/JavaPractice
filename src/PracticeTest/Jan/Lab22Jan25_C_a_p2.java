package PracticeTest.Jan;

import java.util.Scanner;

public class Lab22Jan25_C_a_p2 {
    public static void main(String[] args) {
        int dif,p,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost Price of the Item ");
        int cp= sc.nextInt();
        System.out.println("Enter the Selling Price of the Item ");
        int sp= sc.nextInt();
        dif=(cp>sp?(p=cp-sp):(l=sp-cp));
        if(cp<sp){
            System.out.println("Seller has " +dif + "₹ Rupees Profit");
        }
        else {
            System.out.println("Seller has " +dif + "₹ Rupees Loss");

        }

    }
}
