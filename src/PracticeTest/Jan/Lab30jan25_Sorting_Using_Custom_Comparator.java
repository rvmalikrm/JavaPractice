package PracticeTest.Jan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab30jan25_Sorting_Using_Custom_Comparator {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Raavi", "Malik", "Alice","Tree");
        Collections.sort(str,(a,b)->b.compareTo(a));
        System.out.println(str);
    }
}
