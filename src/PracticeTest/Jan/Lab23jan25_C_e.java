package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: triangle is valid or no                           *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Write a program to check whether a triangle is valid or not, when        *
 * the three angles of the triangle are entered through the keyboard.       *
 * A triangle is valid if the sum of all the three angles is equal to 180   *
 * degrees.                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 23, 2025                                           *
 * Last Modified: January 23, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab23jan25_C_e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st angle of triangle");
        int A=sc.nextInt();
        System.out.println("Enter the 2nd angle of triangle");
        int B=sc.nextInt();
        System.out.println("Enter the 3rd angle of triangle");
        int C=sc.nextInt();
        if(A+B+C==180){
            System.out.println("Triangle with given angles is a Valid Triangle");
        }
        else {
            System.out.println("Triangle with given angles is an Inv12alid Triangle");
        }
    }
}
