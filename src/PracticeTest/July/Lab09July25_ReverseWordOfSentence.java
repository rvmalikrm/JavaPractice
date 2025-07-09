package PracticeTest.July;
import java.util.HashMap;
import java.util.Map;

public class Lab09July25_ReverseWordOfSentence {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rakesh");
        map.put(2, "Mahesh");
        map.put(3, "Suresh");
        map.put(4, "Akansha");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Suresh")) {
                System.out.println("Key is --> "+entry.getKey());
            }
        }
    }
}

