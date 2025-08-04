package PracticeTest.Aug;
public class secondLargestNumber {
    public static void main(String[] args) {
        int[] input= {23,45,67,83,10,76,43};
        int output= secondlargestChecker(input);
        System.out.println("The second Largest number "+output);
    }
    public static int secondlargestChecker(int[] input){
        int firstLargest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for(int num:input){
            if(num>firstLargest){
                secondLargest= firstLargest;
                firstLargest= num;
            }
            else if(num>secondLargest & num!= firstLargest){
                secondLargest= num;
            }
        }
        return secondLargest;
    }
}
