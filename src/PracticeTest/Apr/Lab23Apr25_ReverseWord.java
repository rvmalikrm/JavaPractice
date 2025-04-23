package PracticeTest.Apr;
public class Lab23Apr25_ReverseWord
{
    public static void main(String[] args)
    {
        String input = "Hello World";
        String output = reverseEachWord(input);
        System.out.println(output);
    }
    public static String reverseEachWord(String input){
        if(input==null||input.isEmpty())
        {
            return input;
        }
        String[] words= input.split(" ");
        StringBuilder result= new StringBuilder();
        for(String word:words)
        {
            StringBuilder reversedWord= new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }
}
