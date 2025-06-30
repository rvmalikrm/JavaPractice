package PracticeTest.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab13June_Q16_EY_rearrange_Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Left product array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // Right product array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        // Final result
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
