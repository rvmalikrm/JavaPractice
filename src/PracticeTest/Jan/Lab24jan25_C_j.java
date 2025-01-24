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

public class Lab24jan25_C_j {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the points's axis ");
        float px=sc.nextFloat();
        float py=sc.nextFloat();
        if(px==0 &py==0) {
            System.out.println("Point in on Origin Point");
        }
         else if (py==0) {
            System.out.println("Point is lie on Y-axis");
        }
        else if(px==0){
            System.out.println("Point is lie on X-axis");
        }
        else {
            System.out.println("Point is somewhere away from X-axis, Y-axis and Origin");
        }

    }
}
