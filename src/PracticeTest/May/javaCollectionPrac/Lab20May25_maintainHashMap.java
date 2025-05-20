package PracticeTest.May.javaCollectionPrac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab20May25_maintainHashMap {
    public static void main(String[] args) {
        Map<String,String> hm2 =new HashMap<>(10);
        hm2.put("Ravi","test1@test.com");
        hm2.put("Mohan","test2@test.com");
        hm2.put("Kavi","test3@test.com");
        hm2.put("Shiva","test4@test.com");
        hm2.put("Krishna","test5@test.com");
        hm2.put("Vedik","test6@test.com");
        hm2.put("Avyukt","test7@test.com");
        hm2.put("Parul","test8@test.com");
        hm2.put("Charul","test9@test.com");
        hm2.put("John","test10@test.com");


        System.out.println(hm2);
        Iterator< Map.Entry<String,String>> iterator= hm2.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
