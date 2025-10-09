package PracticeTest.Oct;

import java.util.Arrays;

public class Lab09Oct25_ZeroatFirstnonZeroatLast {
    public static void main(String[] args) {
        int[] input = {0, 3, 0, 1, 0, 6, 0, 6, 8, 7, 5, 4, 0, 8, 9, 0, 0, 9, 2, 8, 4};
        int[] output = zeroAtFirstNonZeroAtLast(input);
        System.out.println("Output array is: " + Arrays.toString(output));
    }

    public static int[] zeroAtFirstNonZeroAtLast(int[] input) {
        int len = input.length;
        int[] result = new int[len];
        int zeroCount = 0;

        // First, count zeros
        for (int num : input) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Now, fill zeros at the beginning
        for (int i = 0; i < zeroCount; i++) {
            result[i] = 0;
        }

        // Then, fill non-zero elements after the zeros
        int index = zeroCount;
        for (int num : input) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
