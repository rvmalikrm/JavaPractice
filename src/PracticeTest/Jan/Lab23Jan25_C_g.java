package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: triangle is valid or no                           *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * If the three sides of a triangle are entered through the keyboard,
 * write a program to check whether the triangle is isosceles,
 * equilateral, scalene or right angled triangle..                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 23, 2025                                           *
 * Last Modified: January 23, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab23Jan25_C_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd side of the triangle");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd side of the triangle");
        int c = sc.nextInt();
        String str = (((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(b*b)+(a*a))?"Right angled":((a == b && b == c) ? "equilateral" : (a == b || a == c || b == c) ? "isosceles" : "scalene"));
        System.out.println("The given triangle is " +str +" Triangele");
//        if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(b*b)+(a*a)){
//            System.out.println("The given triangle is Right Angled Triangele");
//        }
//        else {
//            String str = ((a == b && b == c) ? "equilateral" : (a == b || a == c || b == c) ? "isosceles" : "scalene");
//            System.out.println("The given triangle is " +str +" Triangele");
//        }
    }
}
