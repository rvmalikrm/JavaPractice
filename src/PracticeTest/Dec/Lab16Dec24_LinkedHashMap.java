package PracticeTest.Dec;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab16Dec24_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Object> map =new LinkedHashMap<>();
        map.put("Name","Ravi");
        map.put("Roll No.",123);
        map.put("Address","Noida");
        map.put("Age",34);
        System.out.println(map);
//        for(map.keySet() item : map.values()){
//            System.out.println(item);
//        }


    }
}
