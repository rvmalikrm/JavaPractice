package PracticeTest.Jan;

import java.util.Scanner;
/****************************************************************************
 *                                                                          *
 *          Program Name: Comparing Area and Perimeter of Rectangle         *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Given a point (x, y), write a program to find out if it lies on the
 * X axis,  * Y-axis or on the origin, viz. (0, 0)                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 24, 2025                                           *
 * Last Modified: January 24, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab24jan25_C_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int yr=sc.nextInt();
        String ly=(yr%4==0?"Leap Year":"Regular Year");
        System.out.println(ly);


        int a = 10 ;
        int b = 20 ;
        boolean s1=(a > 5 && b != 5);
        boolean s2=(a != 0 & b < 34);
        boolean s3=(a > 45 || b > 45);
        boolean s4=(a == 10 | b == 20);
        boolean s5=(a > 5 && b != 3 || a + b >= 10);
        boolean s6=(a > 5 || b != 3 && a + b >= 10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
