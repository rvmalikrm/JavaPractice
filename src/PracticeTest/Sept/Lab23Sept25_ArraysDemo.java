package PracticeTest.Sept;

import java.util.Arrays;
import java.util.Random;

public class Lab23Sept25_ArraysDemo    {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Random r = new Random();
        for(int i =0 ;i<arr.length;i++){
            arr[i] = r.nextInt(25);
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println ( "After sorting: " ) ;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,10);
        System.out.println ( "After filling: " ) ;
        System.out.println(Arrays.toString(arr));

    }
}
