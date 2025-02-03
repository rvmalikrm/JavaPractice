package PracticeTest.Jan;

import java.util.Scanner;

public class Lab30Jan25_Chap_5_C_g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int result=num*i;

        System.out.printf("%d * %d = %d",num,i,result);
            System.out.println();
    }}

}
