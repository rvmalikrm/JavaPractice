package PracticeTest.Sept;

//------------------------------------------------------------------
//Reverse a String without using StringBuilder or StringBuffer.
// Author: Ravi Malik
// Date: 24 Sept 2024
// Time: 10:00 AM
// -------------------------------------------------------------------
public class Lab24Sept_ReverseString {
    public static void main(String[] args) {
        String input ="Karuna";
        String output = reverseString(input);
        System.out.println(output);
    }
    public static String reverseString(String str){
        String resutl = "";
        if(str==null || str.isEmpty()){
            return "";
        }
        for (int i = str.length()-1; i>=0; i--){
            resutl += str.charAt(i);
        }
        return resutl;
    }
}
