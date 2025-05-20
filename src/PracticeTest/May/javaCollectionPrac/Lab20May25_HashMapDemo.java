package PracticeTest.May.javaCollectionPrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab20May25_HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Sun", "Ravi ");
        hm.put("Mon", "Prikshit ");
        hm.put("Tue", "Kiran");
        hm.put("wed", "Ankit");
        hm.put("Thurs", "Amit");
        hm.put("Fri", "Shiv");
        hm.put("Sat", "Sandeep");
        System.out.println(hm);
        String str= hm.get("wed");
        System.out.println(" On wed Status mainl will be sent by "+str);
    }
}
