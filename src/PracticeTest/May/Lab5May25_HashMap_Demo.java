package PracticeTest.May;

import java.util.HashMap;

public class Lab5May25_HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String,String> hm =new HashMap<>();
        hm.put("Sun","Ravi");
        hm.put("Mon","Som");
        hm.put("Tue","Mangal");
        hm.put("Wed","Bhudh");
        hm.put("Thurs","Guru");
        hm.put("Fri","Shukra");
        hm.put("Sat","Shani");
        System.out.println(hm);
        String str=hm.get("Wed");
        System.out.println(str);
    }
}
