package PracticeTest.May;
import java.lang.StringBuilder;
public class Lab5May25_Reverse_the_sentence
{
    public static void main(String[] args)
    {
        String input= " QA Automation is great";
        String output= reverseTheSentense(input);
        System.out.println(output);

    }
    public static String reverseTheSentense(String input)
    {
        String[] words =input.trim().split(" ");
        StringBuilder reversed= new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            reversed.append(words[i]).append(" ");
//            if(i!=0)
//            {
//                reversed.append(" ");
//            }
        }
        return reversed.toString().trim();
    }
}
