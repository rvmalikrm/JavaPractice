package PracticeTest.Jan;

import java.util.*;

public class Lab30Jan25_HashSap {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Banana");
        set.add("Apple");
        set.add("Guava");
        set.add("Guava");
        set.add("Pineapple");
        System.out.println(set);

        Set<String> set2=new LinkedHashSet<>();

        set2.add("Grapes");
        set2.add("Kiwi");
        set2.add("Cheery");
        set2.add("Drumstick");
        set2.add("Apple");
        set2.add("Apple");
        System.out.println(set2);

    }
}
