package PracticeTest.Sept;

public class Lab03_FindtheLargesNumberI
{
    public static void main(String[] args) {
        int[] input = {3, 5, 7, 2, 8, 6, 1};
        int output = findLargestNumber(input);
        System.out.println(output);
    }
    public static int findLargestNumber(int[] input){
        int max= input[0];
        for(int i=1;i<input.length;i++)
        {
            if(input[i]>max)
            {
                max=input[i];
            }
        }
        return max;
    }
}
