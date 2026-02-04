package Feb2026;

public class Lab4Feb2026_RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // Number of positions to rotate

        // Normalize k if it's greater than n
        k = k % n;

        // Create a new array to hold the rotated values
        int[] rotatedArr = new int[n];

        // Perform the right rotation
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i]; // Shift elements to the right by k positions
        }

        // Print the rotated array
        System.out.print("Array after right rotation: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
