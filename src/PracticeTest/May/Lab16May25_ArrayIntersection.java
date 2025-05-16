package PracticeTest.May;
import java.util.*;
public class Lab16May25_ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4, 5};
        int[] result = findIntersection(arr1, arr2);
        System.out.println("Intersectio Arrays is : " + Arrays.toString(result));
    }
    public static int[] findIntersection(int[] arr11, int[] arr22) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();
        for (int num : arr11) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Check arr2 against the map
        for (int num : arr22) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersection.add(num);
                freqMap.put(num, freqMap.get(num) - 1); //Decrease count to handle duplicates
            }
        }
// Convert result to array
        return intersection.stream().mapToInt(i -> i).toArray();
    }
}


