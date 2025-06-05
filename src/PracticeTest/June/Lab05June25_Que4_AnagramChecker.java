package PracticeTest.June;

import java.util.Arrays;

public class Lab05June25_Que4_AnagramChecker {
    public static void main(String[] args) {
        String input1= "Listen";
        String input2= "silent";
        boolean result = areAnagram(input1, input2);
        System.out.println(" The given two Strings are Anagram "+result);

    }
    public static boolean areAnagram(String str1, String str2){
        // Remove the space and convert to lower case
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2= str2.replaceAll(" ", "").toLowerCase();
        // if inputs are not matched then they are not Anagram
        if (str1.length()!= str2.length()){
            return false;
        }
        // Convert to char Array and sort
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
