package PracticeTest.Nov;

import java.util.ArrayList;
import java.util.List;

public class Lab3Nov2024countZeroandappendthem {
    public static void main(String[] args) {
        // Input List
        int[] nums = {1,0,3,2,0,4,8,1,3,0};
        // Result List
        List<Integer> result = new ArrayList<Integer>();

        for (int num : nums){
            if (num == 0){
                result.add(0);
            }
        }
        for (int num : nums){
            if (num!=0){
                result.add(num);
            }
        }

        System.out.println(result);



    }
}
