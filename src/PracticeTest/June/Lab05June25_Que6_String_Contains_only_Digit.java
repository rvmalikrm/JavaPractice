package PracticeTest.June;

public class Lab05June25_Que6_String_Contains_only_Digit {
    public static void main(String[] args) {
        String input= "124567qw89";
        boolean output= digitChecker(input);
        System.out.println(output);
    }
    public  static boolean digitChecker(String str)
    {
        boolean onlydigit = true;
        char[] chararray = str.toCharArray();
        for (char ch : chararray)
            if (!Character.isDigit(ch)) {
                onlydigit = false;
                break;
            }
    return onlydigit;
    }
}
