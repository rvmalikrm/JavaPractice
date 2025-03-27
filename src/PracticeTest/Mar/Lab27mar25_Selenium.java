package PracticeTest.Mar;

public class Lab27mar25_Selenium
{
    public static boolean  palindrome(String s)
    {

//    String s= "Madam";
    s=s.replace("a-zA-Z0-9", "").toLowerCase();
    int left=0;
    int right=s.length()-1;
    while(left<right)
    {
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        left++;
        right--;
    }
    return true;
    }

    public static void main(String[] args) {
        String x="Naman";
        if(palindrome(x)){
            System.out.println(x +" is Palindrome");}
            else{
            System.out.println(x+" is NOT Palindrome");
        }
    }
}







