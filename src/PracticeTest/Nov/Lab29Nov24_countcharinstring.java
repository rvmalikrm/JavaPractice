
package PracticeTest.Nov;
import java.util.HashMap;
public class Lab29Nov24_countcharinstring {
    public static void main(String[] args) {
        String s="@#$%^&*(-al";
        s=s.toLowerCase();
// Create a Hashmap to store charecters count;
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
// Loop through each character in the String
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
            }
        }
// Print the character counts
        for (Character key : charCountMap.keySet()){
            System.out.println(key + ":" + charCountMap.get(key));
        }

//        s=s.trim();
//        int charactercount = s.length();
//        System.out.println("total count of the characters " + charactercount);


    }
}
