package PracticeTest.Oct;

public class Lab24Oct25_reverseString {
   public static void main(String[] args) {
        String str = "Hello World from Java";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
