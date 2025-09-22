package PracticeTest.Apr;
//import java.lang.String.*;
import java.util.*;
public class Lab8apr25_CharFrequencyEncoder
{
    public static void main(String[] args)
    {
        String input="aabbbccdda";
        String output =EncoderCharacterFrequency(input);
        System.out.println(output);
    }
    public static String EncoderCharacterFrequency(String str)
    {
        Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
        for (char ch : str.toCharArray())
        {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        return countMap.toString();
    }
}
