package PracticeTest.Apr;

public class Lab23Apr25_CharcountCompressor
{
    public static void main(String[] args)
    {
        String input="aabbbccddaa";
        String output=charecterCompressor(input);
        System.out.println(output);
    }
    public static String charecterCompressor(String input)
    {
        if(input==null || input.isEmpty()) return "";
        StringBuilder result =new StringBuilder();
        char currentChar=input.charAt(0);
        int count = 1;
        for(int i=1;i<input.length();i++)
        {
            if(input.charAt(i)==currentChar)
            {
                count++;
            }
            else
            {
                result.append(currentChar).append(count);
                currentChar=input.charAt(i);
                count=1;
            }
        }
        result.append(currentChar).append(count);
        return result.toString();
    }
}
