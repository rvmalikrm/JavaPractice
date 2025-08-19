package PracticeTest.Aug;

import java.util.ArrayList;
import java.util.List;

public class Question_19Aug25_Zero_at_End {
    public static void main(String[] args) {
        int[] input ={1,4,0,3,8,0,3,9,7,0,4,0,6,1,0,6,8,34,0,67,0,18,0,56};
        List<Integer> list= new ArrayList<>();
        int count=0;
        for(int n:input)
        {
            if(n!=0)
            {
                list.add(n);
            }
            else
            {
                count++;
            }
        }
        for(int n=0;n<count;n++)
        {
            list.add(0);
        }
        System.out.println(list);
    }
}
