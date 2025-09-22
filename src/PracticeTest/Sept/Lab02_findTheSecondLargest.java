package PracticeTest.Sept;

public class Lab02_findTheSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,23,43,9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
