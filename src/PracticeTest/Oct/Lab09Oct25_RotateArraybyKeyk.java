package PracticeTest.Oct;

public class Lab09Oct25_RotateArraybyKeyk
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4; // number of rotations
        int n = arr.length;
        k = k % n; // in case k is greater than n

        // Rotate the array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        // Print the rotated array
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
