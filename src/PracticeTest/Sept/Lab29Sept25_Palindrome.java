package PracticeTest.Sept;

public class Lab29Sept25_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean output = isPalindrome(str);
        System.out.println(output);
    }
    public static boolean isPalindrome(String str) {
        str=str.toLowerCase();
        int left=0;
        int  right= str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
