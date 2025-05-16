package PracticeTest.May;
import java.util.Arrays;
public class Lab16May25_MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,8};
        int[] arr2={2,4,6};
        int[] mergedarr= mergedSortedArray(arr1, arr2);
        System.out.println("Merged Array "+ Arrays.toString(mergedarr));
    }
    public static int[] mergedSortedArray(int[] arr11, int[] arr22){
        int n1= arr11.length;
        int n2= arr22.length;
        int[] result= new int[n1+n2];
        int i=0,j=0,k=0;
        // Merge both arrays
        while(i<n1&& j<n2)
        {
            if(arr11[i]<arr22[j])
            {
                result[k++]=arr11[i++];
            }
            else
            {
                result[k++]=arr22[j++];
            }
    }
        // Copy remaining elements of arr1
        while (i < n1) {
            result[k++] = arr11[i++];
        }
        while(j < n2) {
            result[k++]=arr22[j++];
        }
    return result;
    }
}
