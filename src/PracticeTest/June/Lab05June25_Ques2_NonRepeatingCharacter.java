package PracticeTest.June;


import java.util.LinkedHashMap;
import java.util.Map;

public  class Lab05June25_Ques2_NonRepeatingCharacter{
    public static void main(String[] args) {
        String str= "automation";
        Character result = nonRepeatingChar(str);
        if(result!=null){
            System.out.println("Input  : "+str+"Output :" +result);
        }
        else{
            System.out.println("Input "+ str+"Putput : there is no repeating Character");
        }
    }
    public static Character nonRepeatingChar(String input){
        Map<Character, Integer> charcountMap= new LinkedHashMap<>();
        // Count frequency of each character
        for (char ch: input.toCharArray()){
            charcountMap.put(ch,charcountMap.getOrDefault(ch, 0)+1);
        }
        // Find the first character with count 1
        for(Map.Entry<Character, Integer> entry : charcountMap.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }
}