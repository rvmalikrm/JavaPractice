package PracticeTest.Jan;

import java.util.Scanner;

public class Lab22Jan25_C_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The given number " +a + " is even");
        }
        else {
            System.out.println("The given number " + a + " is odd");
        }
        }

}
