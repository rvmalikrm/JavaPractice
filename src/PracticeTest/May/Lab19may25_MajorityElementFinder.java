package PracticeTest.May;

public class Lab19may25_MajorityElementFinder {
    public static void main(String[] args) {
        int[] input = {3, 3, 4, 2, 3, 3, 3, 2};
        int majority = findMajorityElement(input);
        System.out.println("Most frequent test failure: " + majority);
    }
    public static int findMajorityElement(int[] input){
        int count =0;
        Integer candidate = null;
        for (int num: input)
        {
            if(count==0)
            {
                candidate=num;
            }
            if(num== candidate)
            {
                count++;
            }
            else
            {
                count--;
            }

        }
        // Optional: Verify the candidate appears more than n/2 times
        count = 0;
        for (int num : input) {
            if (num == candidate) {
                count++;
            }
        }
        if(count>input.length/2){
            return candidate;
        }
        else {
            throw new IllegalArgumentException("No majority element found ");
        }
    }
}
