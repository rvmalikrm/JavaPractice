package PracticeTest.June;

import java.util.HashMap;
import java.util.Map;

public class Lab05June25_Que5_CharacterFrequencyCounter {
    public static void main(String[] args) {
        String input= "testcase";
        Map<Character, Integer> output= charFrequency(input);
        System.out.println(output);
    }
    public  static Map<Character, Integer> charFrequency(String str){
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch: str.toCharArray()){
            //If Character is already exist then increament it
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
        }
        return charCount;
    }
}
