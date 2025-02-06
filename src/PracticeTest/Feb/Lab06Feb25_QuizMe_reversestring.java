package PracticeTest.Feb;
import java.util.List;
import java.util.ArrayList;

public class Lab06Feb25_QuizMe_reversestring {
    public static void main(String[] args) {
        String input = "Hello World!";
        ArrayList[] c = new ArrayList[input.length()];
        String str1 = input.substring(0, 5);
        String str2 = input.substring(6, 11);
        String rstr1;
        System.out.println(str1);
        System.out.println(str2);
        for (int i = str1.length() - 1; i >= 0; i--)
            {
                char ch = str1.charAt(i);
                System.out.print(ch);
                //System.out.println(c);
            }
            System.out.println(" ");
            for (int j = str2.length() - 1; j >= 0; j--) {
                char ch = str2.charAt(j);
                System.out.print(ch);
            }

    }
}
