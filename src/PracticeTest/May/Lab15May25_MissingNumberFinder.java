package PracticeTest.May;

public class Lab15May25_MissingNumberFinder {
    public static void main(String[] args) {
        int[] input={1,2,3,4,6,7,8,9,10};
        int resutl= findingMisingNumber(input);
        System.out.println(" The missing number is "+resutl);
    }
    public static int findingMisingNumber(int[] input){
        int n= input.length+1;
        int expecte_sum= n*(n+1)/2;
        int actual_sum= 0;
        for(int i=0;i<input.length;i++)
        {
            actual_sum= actual_sum+input[i];
        }
        return expecte_sum-actual_sum;
    }
}
