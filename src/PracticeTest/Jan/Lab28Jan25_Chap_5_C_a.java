package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: Chapter 5: Loop Control Instruction               *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Write a program to find the factorial value of any number entered
 * through the keyboard.                                                                *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 28, 2025                                           *
 * Last Modified: January 28, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab28Jan25_Chap_5_C_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int num = sc.nextInt();
        int n=1,fact = 1;
        while (n !=num) {
            fact = fact* (n+1);
            n++;
        }
        System.out.println("Factorial of the "+num +" is " +fact);
    }
}
