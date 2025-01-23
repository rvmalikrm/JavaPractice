package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: triangle is valid or no                           *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * If the three sides of a triangle are entered through the keyboard,
 * write a program to check whether the triangle is valid or not. The
 * triangle is valid if the sum of two sides is greater than the largest of
 * the three sides..                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 23, 2025                                           *
 * Last Modified: January 23, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab23Jan25_C_f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd side of the triangle");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd side of the triangle");
        int c=sc.nextInt();
        if(a>b & a>c)
        {
                        System.out.println("a side is largest");
                        {
                            if(a==b+c)
                            {
                                System.out.println("VALID Triangle");
                            }
                            else
                            {
                                System.out.println("INVALID Triangle");
                            }
                        }
        }
        else if(b>a&b>c) {
            System.out.println("b is the largest side");
            {
                if (b == a + c) {
                    System.out.println("VALID Triangle");
                } else {
                    System.out.println("INVALID Triangle");
                }
            }
        }
        else
        {
            System.out.println("c is the largest side");
            if(c==a+b)
            {
                System.out.println("VALID triangel");
            }
            else {
                System.out.println("INVALID Triangle");
            }
        }
    }
}
