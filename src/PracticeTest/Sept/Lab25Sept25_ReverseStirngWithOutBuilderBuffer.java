package PracticeTest.Sept;
import java.util.Arrays;
//=================================================================//
//  Reverse a String without using StringBuilder or StringBuffer===//
// Author: Ravi Malik                                              //
//=================================================================//
public class Lab25Sept25_ReverseStirngWithOutBuilderBuffer
{
    public static void main(String[] args)    {
        String input = "Automation";
        String result = reveserString(input);
        System.out.println(result);
    }
    public static String reveserString(String input)    {
        int len = input.length();
        char[] reversed = new char[len];
        for (int i = len - 1; i >= 0; i--)        {
            char ch=  (input.toCharArray())[i];
            reversed[len - 1 - i] = ch;
        }
        return Arrays.toString(reversed);
    }
}
