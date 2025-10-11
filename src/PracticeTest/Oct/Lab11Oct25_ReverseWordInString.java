package PracticeTest.Oct;

public class Lab11Oct25_ReverseWordInString {
    public static void main(String[] args) {
        String str="QA is Automation";
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: arr)
        {
            result.insert(0,word+" ");
        }
        System.out.println(result.toString().trim());
    }
}
