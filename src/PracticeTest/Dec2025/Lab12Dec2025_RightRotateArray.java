package PracticeTest.Dec2025;

public class Lab12Dec2025_RightRotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        //set the last element to first position
        arr[0]=last;
        //print the rotated array
        System.out.println("Array after right rotation:");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
