package PracticeTest.July;
import java.util.LinkedHashSet;
import java.util.Set;
public class Lab14July25_RemoveDuplicateWords
{
    public static void main(String[] args)
    {
        String input="mk ne mk ko maar se dala mk se maar dala";
        String[] words= input.split(" ");
        Set<String> uniquewords= new LinkedHashSet<>();
        Set<String> duplicate= new LinkedHashSet<>();
        for(String word: words)
        if(!uniquewords.add(word))
        {
            duplicate.add(word);
        }
//        StringBuilder sb= new StringBuilder();
//        for(String word: uniquewords)
//        {
//            sb.append(word).append(" ");
//        }
        //System.out.println(sb.toString().trim());
            System.out.println(duplicate+ " ");
        }

    }

