package PracticeTest.Oct;

public class Lab11Oct25_ReverseString {
    public static void main(String[] args) {
        String str="QA is Automation";
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
