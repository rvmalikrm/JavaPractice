package PracticeTest.June;

import java.util.HashSet;
import java.util.Set;
public class firstRepeat
{
    public static void main(String[] args)
    {
        String input = "Ravi Malik";
        Character output = firstRepeatChar(input);
        System.out.println("The first repeated chracter is  -->  "+output);
    }
    public static Character firstRepeatChar(String input) {
        Set<Character> set = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return null;
    }
}
