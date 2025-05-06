package PracticeTest.May;
//===========================================================//
//Write a Java program to Find Vowels in a String in Java    //
//-Input: "Easy Automation"                                  //
//        -Output: Vowels - 8                                //
//===========================================================//

public class Lab6may25_count_vowels_in_an_String
{
    public static void main(String[] args)
    {
        String input = "Easy Automationeeeeeeeeeeee";
        int outpu=countVowels(input);
        System.out.println("vowels count in String is "+ outpu);

    }
    public static int countVowels(String input){
        int count=0;
        String vowels="aeiouAEIOU";
        char[] chararr=input.toCharArray();
        for(char ch:chararr)
        {
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}
