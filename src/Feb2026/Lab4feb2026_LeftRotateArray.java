package Feb2026;

public class Lab4feb2026_LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // Number of positions to rotate

        // Normalize k if it's greater than n
        k = k % n;

        // Create a new array to hold the rotated values
        int[] rotatedArr = new int[n];

        // Perform the left rotation
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + k) % n];// Shift elements to the left by k positions
        }

        // Print the rotated array
        System.out.print("Array after left rotation: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
