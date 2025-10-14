package PracticeTest.Oct;

public class Lab14Oct25_ReverseString {
    public static void main(String[] args) {
        String str= "Automation";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(str.length()-1-i));
        }
    }
}
