package PracticeTest.Jan;

import java.util.Scanner;

/****************************************************************************
 *                                                                          *
 *          Program Name: Chapter 5: Loop Control Instruction C_c           *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * TWrite a program to print out all Armstrong numbers between 1 and
 * 500. If sum of cubes of each digit of the number is equal to the
 * number itself, then the number is called an Armstrong number. For
 * example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )                                                                *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 28, 2025                                           *
 * Last Modified: January 28, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/

public class Lab28Jan25_Chap_5_C_c {
    public static void main(String[] args) {


        for(int i=1;i<=500;i++){
            int orignalnum=i;
            int sum=0;
            while(orignalnum!=0){
                int digit=orignalnum%10;

                sum+=digit*digit*digit;

                orignalnum/= 10;

            }
            if(sum==i){
                System.out.println(i);
            }
        }

    }
}
