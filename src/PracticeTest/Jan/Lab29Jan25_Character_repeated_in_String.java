package PracticeTest.Jan;

import java.util.Arrays;

public class Lab29Jan25_Character_repeated_in_String {
    public static void main(String[] args) {
        String s="aabccc";



        for(int i=0;i<s.length()-1;i++) {
            for(int j=0;j<s.length();j++){
            System.out.println("numbers of char "+s.length());
            int count=0;

            char ch=s.charAt(i);

            if(ch==s.charAt(j))
                count=count+1;
            System.out.println("count of  "+i+" is "+count);
            System.out.println("count of  "+j+" is here "+count);


            System.out.println(ch);
        }
            System.out.println("count for "+i+"is");
    }
}}
