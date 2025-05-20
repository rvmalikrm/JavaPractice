package PracticeTest.May.javaCollectionPrac;

import java.util.Arrays;

public class Lab20may25_ArraysClass {
    public static void main(String[] args) {

        // Arrays.toString(arr)

        int[] arr = {1, 2, 3, 4};
        for(int s:arr){
            System.out.print(s);}
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr)
        int[] arr1 = {2, 3, 4, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


        // Arrays.equals(arr, arr1)
        System.out.println(Arrays.equals(arr, arr1));

        // Arrays.copyOf(orignal, newlenght)
        int[] a = {1, 2, 3};
        int[] b =Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(b));


        //Arrays.copyOfRange(array, from, to)
        int[] aa = {10, 20, 30, 40, 50};
        int[] sub= Arrays.copyOfRange(aa, 1,3);
        System.out.println(Arrays.toString(sub));
    }
}
