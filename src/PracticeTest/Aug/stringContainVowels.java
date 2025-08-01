package PracticeTest.Aug;

public class stringContainVowels
{
    public static void main(String[] args)
    {
        String input = "Ravi Malik";
        boolean result = vowelsChecker(input);
        System.out.println(result);
    }
    public static boolean vowelsChecker(String input)
    {
      return   input.matches(".*[aeiou]*.");
    }
}
