package PracticeTest.Feb;

public class Lab05Feb25_Find_out_Second_higest_nuber {
    public static void main(String[] args) {
        int[] arr={05,23,56,34,87,90,34,52};
        int result=SecondHigestNUm(arr);
        System.out.println("Second Highest "+ result);
    }
    public static int SecondHigestNUm(int[] arr){
        int firsthigest=Integer.MIN_VALUE;
        int secondhigest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firsthigest){
                secondhigest=firsthigest;
                firsthigest=arr[i];
            } else if (arr[i]>secondhigest&&arr[i]!=firsthigest)
            {
                secondhigest=arr[i];

            }
        }
        return secondhigest;
    }
}

