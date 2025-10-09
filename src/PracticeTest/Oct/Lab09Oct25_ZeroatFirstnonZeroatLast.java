package PracticeTest.Oct;

import java.util.Arrays;

public class Lab09Oct25_ZeroatFirstnonZeroatLast {
    public static void main(String[] args) {
        int[] input=  {0,3,0,1,0,6,0,6,8,7,5,4,0,8,9,0,0,9,2,8,4};
        int[] output= zeroatFirstnonZeroatLast(input);
        System.out.println("Output array is:"+ Arrays.toString(output));
    }
    public static int[] zeroatFirstnonZeroatLast(int[] input){
        int len= input.length;
        int count=0;
        int[] result= new int[len];
        for(int n:input){
            if(n==0){
                result[n]=n;
            }
            else{
                count++;
            }
        }
        int i= len-count;
        for(int n:input){
            if(input[n]!=0){
                result[i++]=input[n];
            }
        }
        return result;
    }
}
