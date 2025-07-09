package PracticeTest.July;

import java.util.Arrays;

public class Lab02July_25_Ques9_PUtZerros_At_end
{
    public static void main(String[] args)
    {
        int[] input = {0, 1, 0, 3, 12,0,34,6,0,23,7,0,0,56,7,0,45};
        int[] output = zerroAtEnd(input);
        System.out.println("Array with Zeros at End  "+ Arrays.toString(output));
    }
    public static int[] zerroAtEnd(int[] input)
    {
        int index =0;
        for(int i=0; i<input.length;i++)
        {
            if(input[i]!=0)
            {
                input[index]=input[i];
                index=index+1;
            }
        }
        while(index<input.length){
            input[index]=0;
            index = index+1;
        }
        return input;
    }

}
