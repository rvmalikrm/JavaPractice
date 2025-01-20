package PracticeTest.Jan;

import java.util.Scanner;

public class Lab20Jan_Example_4_2_using_elseifladder {
    public static void main(String[] args) {
            float sub1, sub2, sub3, Total;
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student's all subject mark");
        sub1=sc.nextFloat();
        sub2=sc.nextFloat();
        sub3=sc.nextFloat();
        Total=sub1+sub2+sub3;
        Float percentage= (Total*100)/300;
        if(percentage>=60) {
            System.out.println("First Division");
        }
        else if (percentage>=50) {
            System.out.println("Second Division");
        }
        else if (percentage>=40) {
            System.out.println("Third Division");
        }
        else {
            System.out.println("FAILED");
        }

    }
}
