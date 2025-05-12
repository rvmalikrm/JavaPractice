package PracticeTest.May;
import java.util.*;

public class Lab12May25_Numberwithindex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        System.out.println("Enter the number to search");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = numberWithIndex(arr, input);
        if (result != '\0') {
            System.out.println("Index of given number is " +result);
        } else {
            System.out.println("search result not found");
        }
    }
    public static int numberWithIndex(int[] arr, int input) {
        int len = arr.length;

        Map<Integer, Integer> indexmap = new LinkedHashMap<>();
        List<Integer>  indexlist = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            indexmap.put(i, arr[i]);
            for (Map.Entry<Integer, Integer> entry : indexmap.entrySet()) {
                if (entry.getValue() == input) {
                  indexlist.add(entry.getKey());
                }
            }
        }
        return '\0';
    }
}
