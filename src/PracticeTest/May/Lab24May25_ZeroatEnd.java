package PracticeTest.May;

import java.util.ArrayList;
import java.util.List;

public class Lab24May25_ZeroatEnd {
    public static void main(String[] args) {
        int[] input = {1, 0, 3, 9, 5, 0, 4, 0, 45, 0, 456, 0, 7, 0, 0};
        List<Integer> result = new ArrayList<>();
        int zeroCount=0;
        for (int n : input)
        {
            if (n != 0)
            {
                result.add(n);
            }
            else
            {
                zeroCount++;
            }
        }
        for(int i=0;i<zeroCount;i++)
        {
        result.add(0);
        }
        System.out.println(result);
    }
}


