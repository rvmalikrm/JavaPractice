package PracticeTest.Oct;

public class Lab08Oct25_ReverseString {
    public static void main(String[] args) {
        String str = "QA is Automation";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i]+ " ";

        }
        System.out.println(result);
    }
}