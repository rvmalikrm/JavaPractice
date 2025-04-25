package PracticeTest.Apr;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Lab24Apr25_charCompressor
{
    public static void main(String[] args)
    {
        String input="Automation"; //2u22m22i2n
        String lowerinput = input.toLowerCase();
        System.out.println("Input "+ input);
        System.out.println("Output "  + characterCompressorFunction(lowerinput));
    }
    public static String characterCompressorFunction(String lowerinput)
    {
        StringBuilder result=new StringBuilder();
        HashMap<Character, Integer>frequencyMap=new HashMap<Character, Integer>();
           for(char c :lowerinput.toCharArray())
           {
               frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
            }
           for(char c:lowerinput.toCharArray())
           {
               if(frequencyMap.get(c)>1)
               {
                   result.append("2");
               }
               else result.append(c);
           }
        return result.toString();
    }
}
