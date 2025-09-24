package PracticeTest.Sept;
import java.util.Arrays;
//==========================================================//
//  Check if two Strings are anagrams of each other.        //
// Author: Ravi Malik                                       //
// Date: 24-09-2024                                         //
//==========================================================//
public class Lab24Sept25_StringAnagrams {
    public static void main(String[] args) {
        String str1= "listen";
        String str2 = "silent";
        boolean anagrams = checkAnagrams(str1, str2);
        if (anagrams) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }
            }
    public static boolean checkAnagrams(String str1, String str2){
        str1.replaceAll("\\s","").toLowerCase();
        str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1,arr2));
    }
}
