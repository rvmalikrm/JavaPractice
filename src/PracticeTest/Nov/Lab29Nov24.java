package PracticeTest.Nov;

public class Lab29Nov24 {
    public static void main(String[] args) {
        String s ="NITIN";
        String t ="";
        for (int i=s.length()-1; i>=0; i--)
        {
            t=t+s.charAt(i);

        }
        System.out.println(t);
        if(s==t)
        {
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The given String is NOT Palindrome");
        }
    }
}
