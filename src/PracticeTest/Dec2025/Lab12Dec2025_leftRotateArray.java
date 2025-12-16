package PracticeTest.Dec2025;

public class Lab12Dec2025_leftRotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //output like 2,3,4,5,1

        int first =arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
