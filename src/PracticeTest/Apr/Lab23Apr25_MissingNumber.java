package PracticeTest.Apr;

public class Lab23Apr25_MissingNumber
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6,8,9,10,11,12};
        System.out.println(findMissingNumber(nums));
    }
    public static int findMissingNumber(int[] nums)
    {
        int n=nums.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num: nums)
        {
            actualSum +=num;
        }
        return expectedSum-actualSum;
    }
}
