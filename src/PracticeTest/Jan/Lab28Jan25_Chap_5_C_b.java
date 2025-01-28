package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: Chapter 5: Loop Control Instruction C_b           *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Two numbers are entered through the keyboard. Write a program
 * to find the value of one number raised to the power of another.                                                                *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 28, 2025                                           *
 * Last Modified: January 28, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab28Jan25_Chap_5_C_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int result=1,count=1;
        while(count<=pow){
            result=result*num;
            count++;
        }
        System.out.println(num +" rasied to the power "+pow+ " is "+result);
    }
}
