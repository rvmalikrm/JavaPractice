package PracticeTest.Dec2025;

public class Lab19Dec2025_PrintFirstCharinUpper {
    public static void main(String[] args) {
        String str= "hello world";
        char firstChar = str.charAt(0);
        char upperFirstChar = Character.toUpperCase(firstChar);
        String result = upperFirstChar + str.substring(1);
        System.out.println(result);
    }
}
