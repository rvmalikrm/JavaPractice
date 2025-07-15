package PracticeTest.July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Lab15July25_Ques12_FindtheIntersection
{
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of each number in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Debug: Print frequency map
        System.out.println("Frequency Map: " + map);

        // Find intersection with nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); // Decrement count
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2, 4, 5};
        List<Integer> intersection = intersect(nums1, nums2);

        // Output result
        System.out.println("Intersection: " + intersection);
    }
}