package PracticeTest.Jan;
/****************************************************************************
 *                                                                          *
 *          Program Name: String  *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * The String.                                                                 *
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: January 27, 2025                                           *
 * Last Modified: January 27, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com                                            *
 *                                                                          *
 ***************************************************************************/
public class Lab27Jan25_String_operations {
    public static void main(String[] args) {
        String s="Hey Ravi How are you";
//        String[] splitedlist =s.split(" ");
//        System.out.println(splitedlist[0]);
//        System.out.println(splitedlist[1]);
//        System.out.println(splitedlist[2]);
//        System.out.println(splitedlist[3]);
//        System.out.println(splitedlist[4]);
//        System.out.println(splitedlist[0]);
//        for(String st:splitedlist){
//            System.out.println(st);
//        }
        String[] splitlist=s.split("Ravi");
        System.out.println(splitlist[0]);
        System.out.println(splitlist[1]);
        System.out.println(splitlist[1].trim());

    }
}
