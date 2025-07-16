package PracticeTest.July;
import java.util.Map;
import java.util.HashMap;

public class Concept_decreasing_countOFMapValue
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        // Loop to decrease each value by 1
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry);
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Before"+map);
            // Decrease the value by 1
            map.put(key, value - 1);
            System.out.println("After"+map);
        }
            // Print updated map
        System.out.println("Final"+map);
    }
}