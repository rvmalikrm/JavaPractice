package PracticeTest.Oct;

public class Lab08Oct25_PalindromeChecker{
    public static void main(String[] args)    {
    String str = "Mad9Dam";
    boolean result = palindroneChecker(str);
    System.out.println(result);
    }
    public static boolean palindroneChecker(String str)    {
        str= str.toLowerCase().replaceAll("[^a-z0-9]","");
    int left = 0;
    int right = str.length()-1;
    while (left<right)    {
        if(str.charAt(left)!=str.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
    }
}
