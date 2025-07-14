package PracticeTest.July;
import java.util.HashMap;
import java.util.Map;

public class Lab09July25_ReverseWordOfSentence
{
    public static void main(String[] args)
    {
       String input = "Automation Testing";
       String[] words = input.split(" ");
       StringBuilder sb= new StringBuilder();
       for(String word: words)
       {
           StringBuilder reverseword= new StringBuilder(word);
           sb.append(reverseword.reverse().toString()).append(" ");
           //System.out.println(sb.toString());
       }
        System.out.println(sb.toString());
    }
}

