package PracticeTest.Oct;

public class Lab10Oct25_Kadane_algo {
    public static void main(String[] args) {
        int[] arr={1,0,-3,-7,6,-7,8,-9,-9,9,-2,6};
        int maxEndinghere=arr[0];
        int maxSoFar=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEndinghere = Math.max(arr[i], maxEndinghere+arr[i]);
            maxSoFar= Math.max(maxSoFar, maxEndinghere);

        }
        System.out.println(maxSoFar);
    }
}
