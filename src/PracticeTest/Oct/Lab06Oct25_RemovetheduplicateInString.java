package PracticeTest.Oct;

public class Lab06Oct25_RemovetheduplicateInString {
    public static void main(String[] args) {
        String str = "abbccc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
