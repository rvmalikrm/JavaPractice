package PracticeTest.Aug;
import java.util.ArrayList;
import java.util.List;
public class IndecesOfSearchElements {
    public static void main(String[] args) {
        int[] input ={1,3,3,4,5,6,6,7,8,9,9};
        int searchElement = 6;
        List<Integer> result = findIndices(input, searchElement);
        System.out.println("Indices of element " + searchElement + ": "+ result);
    }
    public static List<Integer> findIndices(int[] input, int searchElement) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == searchElement) {
                list.add(i);
            }
        }
       return list;
    }
}
