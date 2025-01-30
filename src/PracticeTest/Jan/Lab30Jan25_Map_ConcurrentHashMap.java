package PracticeTest.Jan;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Lab30Jan25_Map_ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> chm=new ConcurrentHashMap();
        chm.put("Ravi",1);
        chm.put("Pooja",2);
        chm.put("Malik",3);
        chm.put("Katariay",4);
        System.out.println(chm.get("Malik"));
    }
}
