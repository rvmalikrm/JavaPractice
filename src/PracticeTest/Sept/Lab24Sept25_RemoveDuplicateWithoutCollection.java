package PracticeTest.Sept;
// Remove duplicate characters from a String without using any collection.
// Author: Ravi Malik
// Date: 24-09-2024
public class Lab24Sept25_RemoveDuplicateWithoutCollection {
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println(output); // Output: progamin
    }
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);
            if(sb.indexOf(String.valueOf(currentChar))==-1)
            {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
