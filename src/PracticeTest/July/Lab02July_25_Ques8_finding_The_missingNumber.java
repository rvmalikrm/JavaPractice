package PracticeTest.July;

public class Lab02July_25_Ques8_finding_The_missingNumber {
    public static void main(String[] args) {


        int[] input = {1, 2, 4, 5};
        int output = findMissingNumber(input);
        System.out.println("Missing number is "+ output);
    }
    public static int findMissingNumber(int[] input)
    {
        int expectednum=input.length+1;
        int expectedtotal =((expectednum*(expectednum+1))/2);
        int actualsum=0;
        for(int i=0;i<input.length;i++){
            actualsum=actualsum+input[i];
        }
        int missingnum = expectedtotal-actualsum;
        return missingnum;
    }
}
