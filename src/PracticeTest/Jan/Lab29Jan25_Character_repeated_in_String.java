package PracticeTest.Jan;

import java.util.Arrays;

public class Lab29Jan25_Character_repeated_in_String {
    public static void main(String[] args) {
        String s="abbccc";

        for(int i=0;i<s.length()-1;i++) {
            System.out.println(s.length());
        int count=0;

            char ch=s.charAt(1);
            if(ch==s.charAt(i))
                count=count+1;
            System.out.println("count of  "+i+" is "+count);


            System.out.println(ch);
        }

    }
}
