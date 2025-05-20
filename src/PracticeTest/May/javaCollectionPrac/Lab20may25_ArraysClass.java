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

        // Arrays.fill(array, value)

        int[] arr2 = new int[5];
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));

        //Arrays.binarySearch(array, value)

        int[] aaa = {1, 3, 5, 7, 9};
        int index= Arrays.binarySearch(aaa,7);
        System.out.println(index);

        //Arrays.deepEquals(arr1, arr2) to compare multi dimentional array

        int[][] a3 = {{1,2}, {3,4}};
        int[][] b3 = {{1,2}, {3,4}};
        System.out.println(Arrays.deepEquals(a3,b3));

        //Arrays.deepToString(array)

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix));

    }
}
