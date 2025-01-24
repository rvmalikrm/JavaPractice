package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: Comparing Area and Perimeter of Rectangle         *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Given the length and breadth of a rectangle, write a program to find
 * whether the area of the rectangle is greater than its perimeter..                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 24, 2025                                           *
 * Last Modified: January 24, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab24jan25_C_h {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side a");
        int a=sc.nextInt();
        System.out.println("Enter the side b");
        int b=sc.nextInt();
        int area=a*b;
        int perimeter=2*(a+b);
        if(area>perimeter){
            System.out.println("The area of the Rectangle is greater than Perimeter area is "+area+ " and perimeter is "+perimeter);
        }
        else {
            System.out.println("The area is less than Perimeter area is "+area+ " and perimeter is "+perimeter);
        }
    }
}
