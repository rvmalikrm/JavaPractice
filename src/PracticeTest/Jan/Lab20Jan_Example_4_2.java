package PracticeTest.Jan;

import java.util.Scanner;

public class Lab20Jan_Example_4_2 {
    public static void main(String[] args) {
            float sub1, sub2, sub3, Total;
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student's all subject mark");
        sub1=sc.nextFloat();
        sub2=sc.nextFloat();
        sub3=sc.nextFloat();
        Total=sub1+sub2+sub3;
        Float percentage= (Total*100)/300;
        if(percentage>=60)
            System.out.println("The student secured First division ");
        if((percentage>50) && (percentage<60))
            System.out.println("The student secured Second division ");
        if((percentage>40)&&(percentage<50))
            System.out.println("The student secured Third division ");
        if(percentage<40)
            System.out.println("Student FAILED");
    }
}
