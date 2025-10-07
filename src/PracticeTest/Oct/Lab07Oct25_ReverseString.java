package PracticeTest.Oct;

public class Lab07Oct25_ReverseString {
    public static void main(String[] args) {
        String str= "QA is Automation";
       String[] arr = str.split(" ");
       for(int i=arr.length-1;i>=0;i--){
              System.out.print(arr[i]+" ");
       }
    }
}
