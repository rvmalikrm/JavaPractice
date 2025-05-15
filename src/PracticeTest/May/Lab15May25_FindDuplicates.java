package PracticeTest.May;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab15May25_FindDuplicates {
    public static void main(String[] args) {
        int[] input={2,4,5,4};
        List<Integer> result=findingDuplicatas(input);

        System.out.println("Output :"+result);
    }
    public static List<Integer> findingDuplicatas(int[] input){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for ( int num: input){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
}
