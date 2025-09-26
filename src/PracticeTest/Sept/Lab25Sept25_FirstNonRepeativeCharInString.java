package PracticeTest.Sept;
import java.util.Map;
import java.util.HashMap;
//Find the first non-repeated character in a String.
// Author: Ravi Malik
// Date: 25-09-2025
public class Lab25Sept25_FirstNonRepeativeCharInString {
    public static void main(String[] args) {
        String str= "automation";
        char result = firstNonRepeativeChar(str);
        if(result !='\0'){
            System.out.println("First non-repeating character is: "+ result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    public static char firstNonRepeativeChar(String str){
       // str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:str.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1)
                return ch;
        }
        return '\0';
    }
}
