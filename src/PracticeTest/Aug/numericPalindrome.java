package PracticeTest.Aug;
public class numericPalindrome
{
    public static void main(String[] args)
    {
        int num = 1234321;
        boolean result =isNumPalindrome(num);
        System.out.println("Given number is Palindrome -->  "+result);
    }
    public static boolean isNumPalindrome(int num)
    {
        String input = String.valueOf(num);
        String reverseString= new StringBuilder(input).reverse().toString();
        return (input.equals(reverseString));
    }
}
