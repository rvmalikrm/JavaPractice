package PracticeTest.May;

import java.util.HashMap;
import java.util.Map;

public class Lab13May25_Occurrence_Character__String {

    public static void main(String[] args) {
        String input = "Automation";
        Map<Character,Integer> map =checkOccurenace(input);
        System.out.println(map);
    }
    public static Map<Character, Integer> checkOccurenace(String input){
        input=input.replaceAll("\s","").toLowerCase().trim();
        Map< Character, Integer> countCharMap= new HashMap<>();

        for ( char ch: input.toCharArray()){
            if (countCharMap.containsKey(ch))
            countCharMap.put(ch,countCharMap.get(ch)+1);
            else
                countCharMap.put(ch,1);
        }

    return countCharMap;
    }
}
