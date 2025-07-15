package PracticeTest.July;
import java.util.Map;
import java.util.HashMap;
public class Lab15July25_countEachworkrepeatation {
    public static void main(String[] args) {
        String s= "I go Noida and Noida is in India and I love India and Noida";
        String[] arrstr= s.split(" ");
        Map<String, Integer> map= new HashMap<>();
        for(int i=0 ;i<arrstr.length;i++){
            map.put(arrstr[i],map.getOrDefault(arrstr[i],0)+1);
        }
        System.out.println(map);
        }
    }

