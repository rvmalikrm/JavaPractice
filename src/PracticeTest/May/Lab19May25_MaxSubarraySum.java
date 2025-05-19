package PracticeTest.May;

public class Lab19May25_MaxSubarraySum {
    public static void main(String[] args) {
        int[] input ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum=maxSubArraySum(input);
        System.out.println(" The maximum sum is : "+ maxSum);
    }
    public static int maxSubArraySum(int[] arr){
        if(arr==null && arr.length==0)
            return 0;
        int currentMax=arr[0];
        int globalMax=arr[0];
        for(int i=1;i<arr.length-1;i++){
            currentMax=Math.max(arr[i],currentMax+arr[i]);
            globalMax= Math.max(globalMax,currentMax);
        }
        return globalMax;
    }
}
