package PracticeTest.May.javaCollectionPrac;

import java.util.TreeSet;

public class Lab20May25_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts;
        ts=new TreeSet<>();
        ts.add(3);
        ts.add(9);
        ts.add(1);
        ts.add(4);
        ts.add(7);
        ts.add(11);
        System.out.println(ts);
        System.out.println(ts.subSet(4,11));
        ts.clear();
        System.out.println(ts);
    }
}
