package PracticeTest.Sept;

public class Lab30Sept25_LastNonrepeatCharacter {
    public static void main(String[] args) {
        String str="swiss";
        str = str.toLowerCase();
        char result = ' ';
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result = ch;
                break;
            }
        }
        System.out.println(result);
    }
}
