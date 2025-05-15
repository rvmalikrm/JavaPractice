package PracticeTest.May;

import java.util.Arrays;

public class Lab15May25_allZeroAtEnd
{
    public static void main(String[] args)
    {
    int[] input = {0, 1, 0, 3, 12};
    String result= replaceallZeroAtEnd(input);
    System.out.println("output: "+result);

    }
    public static String replaceallZeroAtEnd(int[] input)
    {
        int index= 0;
        for(int num: input)
        {
            if(num!=0)
            {
                input[index++]=num;
            }
        }
        while(index< input.length){
            input[index++]=0;
        }
        return Arrays.toString(input);
    }
}

