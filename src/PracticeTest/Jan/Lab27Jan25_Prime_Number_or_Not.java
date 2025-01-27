package PracticeTest.Jan;

import java.util.Scanner;

public class Lab27Jan25_Prime_Number_or_Not {
    public static void main(String[] args) {
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        i=2;
        while(i<=num-1){
            if(num%i==0){
                System.out.println("Not a prime Number");
                break;
            }
            i++;
            if(i==num){
                System.out.println("Prime Number12");
            }

        }
    }
}
