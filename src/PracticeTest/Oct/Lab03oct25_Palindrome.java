package PracticeTest.Oct;

public class Lab03oct25_Palindrome {
    public static void main(String[] args) {
        int input = 121;
        int originalInput = input;
        int reversedNumber = 0;
        while (input != 0) {
            int digit = input % 10;
            reversedNumber = reversedNumber * 10 + digit;
            input /= 10;
        }
        if (reversedNumber == originalInput) {
            System.out.println(" Palindrome number."+originalInput);
        } else {
            System.out.println(" Not Palindrome number.");
        }
    }
}
