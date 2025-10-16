package PracticeTest.Oct;
import java.util.*;

public class Lab09Oct25_FrequencyChecker {
    public static void main(String[] args) {
        String str= "aabbbcccddeffghhijj";
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("Character Frequency:"+ map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int count=0;
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
                count++;

            }
            System.out.println(count);
        }
    }
}
