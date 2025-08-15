package PracticeTest.Aug;

public class secondLargestNumber02
{
    public static void main(String[] args)
    {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int output = secondLargestf(input);
        System.out.println(output);
    }
    public static int secondLargestf(int[] numbers)
    {
        int firstLargest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : numbers)
        {
            if(num>firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if(num>secondLargest && num!= firstLargest)
            {
                secondLargest = num;
            }

        }
        return secondLargest;
    }
}

