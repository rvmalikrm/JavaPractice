package PracticeTest.May;

import java.util.Arrays;
import java.util.Random;

public class Lab5May25_ArraysDemo
{
    public static void main(String[] args)
    {
        int arr[] = new int[11];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++)
        {
         arr[i]=r.nextInt(25);
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        System.out.println ( "After sorting: " ) ;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        Arrays.fill(arr,2,4,-4);
        System.out.println();
        System.out.println("After filling");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int pos;
        pos= Arrays.binarySearch(arr, -4);
        System.out.println();
        System.out.println("pos "+ pos);
    }
}
