package PracticeTest.June;

public class Lab05June25_Que5_String_Contains_only_Digit_regex
{
    public static void main(String[] args)
    {
        String input= "1234567";
        if(input.matches("\\d+"))
            {
                 System.out.println("String ocntains only Digit");
            }
            else
                {
                    System.out.println("String contains NON-DIGIT Characters");
                }

}
}
