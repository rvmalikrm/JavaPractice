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
public class Lab27Jan25_String {
    public static void main(String[] args) {
        String s="Hey Ravi How are you";
        String s1="Hey Ravi How are you";
        System.out.println(s);
        System.out.println(s1);

        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        String s2=new String("Hello");
        String s3=new String("Hello");
        System.out.println(s2);
        System.out.println(s3);


        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    }
}
