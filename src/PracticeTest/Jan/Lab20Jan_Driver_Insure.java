package PracticeTest.Jan;

import java.util.Scanner;

public class Lab20Jan_Driver_Insure {
    public static void main(String[] args) {
        char sex, ms;
        int age;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age, sex and marital status");
        age=sc.nextInt();
        sex=sc.next().charAt(0);
        ms=sc.next().charAt(0);
        /*(a) Driver is married.
        (b) Driver is an unmarried male above 30 years of age.
        (c) Driver is an unmarried female above 25 years of age.*/
        if((ms=='M') || (ms=='U' && sex=='M' && age>30) ||(ms=='U' && sex=='F'&& age>25))
            System.out.println("Driver is issured");
        else
            System.out.println("Driver is now issured");
    }
}
