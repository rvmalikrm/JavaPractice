package PracticeTest.July;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab11July25_Ques10_FindDuplicate
{
    public static void main(String[] args)
    {
        int[] input ={4, 3, 2, 7, 8, 2, 3, 1};

        Set<Integer> set= new LinkedHashSet<>();
        Set<Integer> duplicate= new LinkedHashSet<>();
        for(int i:input)
        if(!set.add(i)){
            duplicate.add(i);
        }

        System.out.println(duplicate);
        System.out.println(set);
    }
}
