package PracticeTest.Oct;

public class Lab11Oct25_ReverseWordAtPlace {
    public static void main(String[] args) {
        String str = "QA is Automation";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            result += reversedWord + " ";
        }
        System.out.println(result.trim());
    }
}
