package PracticeTest.Jan;

import java.util.Scanner;

public class Lab27Jan25_For_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,r,si;
        int n;
        for(int i=1 ; i<=3;i++){
        System.out.println("Enter the valie to p, r and n");
        p=sc.nextFloat();
        r=sc.nextFloat();
        n=sc.nextInt();
        si=(p*r*n)/100;
            System.out.println(si);
        }
    }
}
