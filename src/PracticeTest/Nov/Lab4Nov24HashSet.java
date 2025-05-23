package PracticeTest.Nov;

import java.util.Collections;
import java.util.HashSet;

public class Lab4Nov24HashSet {
    public static void main(String[] args) {
        HashSet hsSet =new HashSet();
        hsSet.add(1);
        hsSet.add(2);
        hsSet.add(3);
        hsSet.add(5);
        hsSet.add(4);
        hsSet.add(0);
        hsSet.add(4);

        System.out.println(hsSet);
        hsSet.remove(2);

        System.out.println(hsSet);
        System.out.println("Contains 3 " + hsSet.contains(3));
        System.out.println("Contains 2 " + hsSet.contains(2));
        int min = (int) Collections.min(hsSet);
        int max = (int) Collections.max(hsSet);

        System.out.println(min);
        System.out.println(max);

    }
}
