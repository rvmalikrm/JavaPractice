package PracticeTest.May;

import java.util.Arrays;

public class Lab7May25_MoreArrayOperationsProject {
    public static void main(String[] args) {
        int[] arr={39,24,15,6,87,78};
        System.out.println("Original Array");
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i] +" ");

        Arrays.sort(arr);
        System.out.println("\nSorted Array");
        for (int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+ " ");
        int index= Arrays.binarySearch(arr, 15);
        System.out.println("\nIndex of 15 in binary search is "+index);
        int[] newarr= new int[6];
        newarr= Arrays.copyOf(arr,arr.length);
        System.out.println( "\nNewly Copied  Array");
        for (int i=0;i<=newarr.length-1;i++) {
            System.out.print(newarr[i]+" ");
        }
            Arrays.fill(arr,0);
            System.out.println("\nNewwly created array");
            for ( int i=0;i<=arr.length-1;i++)
                System.out.print(arr[i]+ " ");


        }

    }

