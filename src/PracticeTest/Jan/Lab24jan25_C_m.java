package PracticeTest.Jan;

import java.util.Scanner;
/****************************************************************************
 *                                                                          *
 *          Program Name: Comparing Area and Perimeter of Rectangle         *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Using conditional operators determine
 * (1) Whether the character entered through the keyboard is a
 * lower case alphabet or not.
 * (2) Whether a character entered through the keyboard is a special
 * symbol or not.
 * (3) Whether a character entered through the keyboard is a digit or
 * not.
 * (4) Whether a character entered through the keyboard is
 * alphanumeric or not.                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 24, 2025                                           *
 * Last Modified: January 24, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab24jan25_C_m {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        String str=sc.next();
        char ch=str.charAt(0);
        String str2=(Character.isLowerCase(ch)?"lowercase":Character.isUpperCase(ch)?"UpperCase":Character.isAlphabetic(ch)?"AlphaNumeric":Character.isDigit(ch)?"Digit":"Special Character");
        System.out.println(str2);
    }
}
