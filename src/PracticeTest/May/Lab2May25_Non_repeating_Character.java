//-------------------------------------------------------------------------------------------
// Find the First Non-Repeating Character                                                   //
// Scenario:                                                                                //
// You need to find the first character in a given test log string that does not repeat.    //
// Example:                                                                                 //
// Input: "automation"                                                                      //
// Output: 'u'                                                                              //
//------------------------------------------------------------------------------------------//

package PracticeTest.May;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab2May25_Non_repeating_Character {
    public static void main(String[] args) {
        String input = "automation";
        char result = firstnonrepeat(input);
        if (result != '\0') {
            System.out.println(result);
        } else
        {
            System.out.println("No non-repeating character found.");
        }}
        public static char firstnonrepeat (String input)
        {
            Map<Character, Integer> freq = new LinkedHashMap<>();
            char[] chrarray = input.toCharArray();
            // Count frequency of each character
            for (char ch : chrarray) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                System.out.println(freq);
            }
            // Find first character with count 1
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return '\0';
        }
    }
