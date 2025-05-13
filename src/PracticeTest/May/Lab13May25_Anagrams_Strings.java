package PracticeTest.May;

import java.util.Arrays;

public class Lab13May25_Anagrams_Strings
{
    public static void main(String[] args)
    {
        String str1= "listeen";
        String str2= "silent";
        boolean angrams= checkAnagrams(str1, str2);
        System.out.println("Anagrams  "+ angrams);
    }
    public static boolean checkAnagrams(String str1, String str2)
    {
        str1= str1.replaceAll("\s","").toLowerCase();
        str2= str2.replaceAll("\s","").toLowerCase();
        if( str1.length()!=str2.length())
        {
            return false;
        }
        // Convert strings to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr2);
        if(arr1.equals(arr2))
            return true;
    return true;
    }

}
