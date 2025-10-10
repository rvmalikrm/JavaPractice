package PracticeTest.Oct;

public class Lab10Oct25_roateArraybyKeyK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // number of rotations
        int n = arr.length;

        // Normalize k to ensure it's within the bounds of the array length
        k = k % n;

        // Create a new array to hold the rotated values
        int[] rotatedArr = new int[n];

        // Fill in the rotated array
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }

        // Print the rotated array
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
