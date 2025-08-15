package PracticeTest.Aug;

public class numericPalindrome02 {
    public static void main(String[] args)
    {
    int n=1234321;
    boolean result = isNumPalindrome(n);
}
public static boolean isNumPalindrome(int num)
    {
        String input = String.valueOf(num);
        String reverseString = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reverseString);
        System.out.println("Given number is Palindrome -->  " + isPalindrome);
        return isPalindrome;
    }
}