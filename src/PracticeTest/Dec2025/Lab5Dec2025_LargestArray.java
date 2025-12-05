package PracticeTest.Dec2025;

public class Lab5Dec2025_LargestArray {
    public static void main(String[] args) {
        int[] arr={4,9,2,10,6};
        // Assumption : first element is largest
        int largest= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        System.out.println("Largest element in the array is: "+largest);
    }
}
