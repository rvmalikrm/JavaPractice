package PracticeTest.May;

public class Lab19May25_SecondLargestFinder {
    public static void main(String[] args) {
        int[] input={3,6,8,100,123,9,12};
        int result= findSecondLargest(input);
        System.out.println("The Second largest number is : "+result);
    }
    public static int findSecondLargest(int[] input){
        if(input==null && input.length<2)
        {
            throw new IllegalArgumentException("There is inllege input");
        }
        int firstLargest= Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
        for(int num :input){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest &num!=firstLargest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("There is no distinct element");
        }
        return secondLargest;
    }
}
