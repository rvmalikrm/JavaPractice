package PracticeTest.July;

import java.util.*;

public class Lab11July25_Ques111_Add_TwoArray_inSortedWay
{
    public static void main(String[] args)
    {
       int[] arr1= {1,3,5};
       int[] arr2= {2,4,6};
       int len1= arr1.length;
       int len2= arr2.length;
       int totallen= len1+len2;
       int[] result = new int[totallen];
       int i=0,j=0,k=0;
        // Merge while both arrays have elements
        while(i<len1&& j<len2)
        {
            if(arr1[i]<arr2[j])
            {
                result[k++]=arr1[i++];
            }
            else
            {
                result[k++]=arr2[j++];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
