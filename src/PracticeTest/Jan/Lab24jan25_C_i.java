package PracticeTest.Jan;

import java.util.Scanner;
import java.math.*;

/****************************************************************************
 *                                                                          *
 *          Program Name: Comparing Area and Perimeter of Rectangle         *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Given the coordinates (x, y) of a center of a circle and its radius,
 * write a program which will determine whether a point lies inside
 * the circle, on the circle or outside the circle. (Hint: Use Math.sqrt( )
 * and Math.pow( ) functions).                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 24, 2025                                           *
 * Last Modified: January 24, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab24jan25_C_i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the center of circle");
        float cx=sc.nextFloat();
        float cy=sc.nextFloat();
        System.out.println("Enter the Radius of circle");
        float cr=sc.nextFloat();
        System.out.println("Enter the points ");
        float px=sc.nextFloat();
        float py=sc.nextFloat();
        double d=Math.sqrt(Math.pow((cx-px),2)+Math.pow((cy-py),2));
        if(d<cr){
            System.out.println("Point is inside the circle");
        } else if (d==cr) {
            System.out.println("Point is on circle boundary");
        }
        else {
            System.out.println("Point is outside the Circle");
        }
    }
}
