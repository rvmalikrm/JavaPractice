package PracticeTest.July;

public class Lab15July25_Triplet {
    public static void main(String[] args) {
        int[] arr= {1,0,1,1,0,1,1,1,0,1,1,0,3,3,3,5,4,2,6,6,6};
        int len= arr.length;
        int count =0;
        for(int i=0;i<len-2;i++)
            if(arr[i]==arr[i+1]&& arr[i]==arr[i+2]){
                count++;
            }
        System.out.println(count);
    }
}
