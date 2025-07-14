package PracticeTest.July;
import java.util.LinkedHashSet;
import java.util.Set;
public class Lab14July25_RemoveDuplicateWords
{
    public static void main(String[] args)
    {
        String input="mk ne mk ko mk se maar dala";
        String[] words= input.split(" ");
        Set<String> uniquewords= new LinkedHashSet<>();
        for(String word: words)
        {
            uniquewords.add(word);
        }
        StringBuilder sb= new StringBuilder();
        for(String word: uniquewords)
        {
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
