package PracticeTest.Oct;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//PallindromCheck
class Lab14Oct25_PalindromeOrNot {
    public static void main(String[] args) {
        String str= " Madam ";
        boolean result = palindrimChecker(str);
        System.out.println(result);
    }
    public static boolean palindrimChecker(String str)
    {
        str= str.toLowerCase().replaceAll("[^a-z0-9]","");
        int left =0;
        int right=str.length()-1;
        char[] arr= str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}