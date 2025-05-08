package PracticeTest.May;
//-----------------------------------------------------------------------------------------------//
//Rotate an Array to the Right by k Places                                                       //
//Scenario:                                                                                      //
//In a load-testing scenario, logs are rotated, and you need to shift them in a circular manner. //
//        Example:                                                                               //
//Input: [1, 2, 3, 4, 5], k=2Output: [4, 5, 1, 2, 3]                                             //
//-----------------------------------------------------------------------------------------------//

import java.util.Arrays;

public class Lab8May25_RotateArray {
    public static void rotateRight(int[] arr, int k){
        int n= arr.length;
        reverse(arr,0, n-1);
        reverse(arr, 0,k-1);
        reverse(arr, k,n-1);

    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k =4;
        rotateRight(arr, k);
        System.out.println(" The rotated Array is "+ Arrays.toString(arr));
    }
}
