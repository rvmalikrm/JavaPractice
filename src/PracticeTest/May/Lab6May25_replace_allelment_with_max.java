package PracticeTest.May;

import java.util.Arrays;

public class Lab6May25_replace_allelment_with_max
{
    public static void main(String[] args)
    {
        int[] input={1,7,88,4,9,44,6};
        int max=0;
        for(int i=0; i<input.length-1;i++)
        {
            if (input[i] > max)
            {
                max = input[i];
            }
        }
        Arrays.fill(input,max);
        System.out.println("Output :"+Arrays.toString(input));
    }
}
