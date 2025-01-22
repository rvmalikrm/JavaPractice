package PracticeTest.Jan;

import java.util.Scanner;

public class Lab22Jan25_C_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost Price of the Item ");
        int cp= sc.nextInt();
        System.out.println("Enter the Selling Price of the Item ");
        int sp= sc.nextInt();
        if(cp>sp){
            System.out.println("INCURRED LOSS " +(cp-sp));
        }
        else {
            System.out.println("MADE PROFIT " +(sp-cp));
        }

    }
}
