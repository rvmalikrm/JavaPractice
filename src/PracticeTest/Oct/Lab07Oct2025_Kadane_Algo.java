package PracticeTest.Oct;

public class Lab07Oct2025_Kadane_Algo {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int result = kadane(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
    public static int kadane(int[] arr) {
        int maxEndinghere = arr[0];
        int maxSoFar = arr[0];
        for (int i= 1;i<arr.length;i++){
            maxEndinghere = Math.max(arr[i], maxEndinghere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndinghere);
        }
        return maxSoFar;
    }
}
