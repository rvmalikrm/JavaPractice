package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: Chapter 5: Loop Control Instruction    *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * The while Loop.                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 24, 2025                                           *
 * Last Modified: January 24, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab24jan25_The_While_Loop {
    public static void main(String[] args) {
        float p,r,si;
        int n, count=1;
        Scanner sc=new Scanner(System.in);
        while (count<=3){
            System.out.println("Enter the details of p, r and n");
            p=sc.nextFloat();
            r=sc.nextFloat();
            n=sc.nextInt();
            si=(p*r*n)/100;
            System.out.println("Simple Interest is " +si);
            count=count+1;
        }

    }
}
