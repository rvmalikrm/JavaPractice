package PracticeTest;

import java.util.Scanner;

public class Lab17Dec24_Let_us_java_D_c {
    public static void main(String[] args) {
        System.out.println("Enter the marks of Subjects :");
        Scanner sc =new Scanner(System.in);
        int sub1= sc.nextInt();
        int sub2= sc.nextInt();
        int sub3= sc.nextInt();
        int sub4= sc.nextInt();
        int sub5= sc.nextInt();
        int Total =(sub1+sub2+sub3+sub4+sub5);
        int avarage= Total/5;
        float Percentage= ((Total*100)/500);
        System.out.println("The average of the five subjects is " +avarage);
        System.out.println("The percentage of the Student is : " +Percentage);
    }
}
