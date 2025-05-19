package PracticeTest.May;
import java.util.HashMap;
import java.util.Map;
public class Lab19May25_TwoSumFinder
{
    public static void main(String[] args)
    {
        int[] input = {2, 7, 11, 15};
        int targetErrorCode = 9;
        int[] result = findTwoSum(input, targetErrorCode);
        System.out.println("Output : [" + result[0] + "," + result[1] + "]");
    }

    public static int[] findTwoSum(int[] input, int targetErrorCode){
        Map<Integer, Integer> numsMap= new HashMap<>();
        for(int i=0;i< input.length;i++){
            int complement= targetErrorCode-input[i];
            if(numsMap.containsKey(complement)){
                return new int[] { numsMap.get(complement),i};
            }
            numsMap.put(input[i],i);
        }
        return new int[] {-1,-1};
    }
}
