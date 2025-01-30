package PracticeTest.Jan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Lab30Jan25_Map {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<Integer, String>();
        map.put(1,"Unicode");
        map.put(2,"Intelegencia");
        map.put(3,"KIET");
        map.put(4,"GIC");
        map.put(5,"SPS");
        System.out.println(map);
        map.put(6,"Getta");
        System.out.println(map);
    }
}
