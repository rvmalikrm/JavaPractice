package PracticeTest.Apr;

public class Lab17Apr25_Palindrome
{
    public static void main(String[] arg)
    {
            String input = "Madam";
            if (isPalindrome(input.toLowerCase()))
            {
                System.out.println("Palindorme");
            } else
            {
                System.out.println("Not palindrome");
            }
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                System.out.println("Not Palindorme");
                return false;
            }
        }
        return true;
    }
}
