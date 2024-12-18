package PracticeTest;
import java.util.Scanner;

public class Lab18Dec24_Scanner_class {
    public static void main(String[] args) {
        // Calculation of simple interest
        float p, r, si;
        int n;
        System.out.println("Enter the value of p, n and r :");
        Scanner sc =new Scanner(System.in); //System.in represents the keyboard.
        p=sc.nextFloat();
        n=sc.nextInt();
        r =sc.nextFloat();
        si= ((p*n*r)/100);
        System.out.println("Simple Intrest is "+si);


    }
}
