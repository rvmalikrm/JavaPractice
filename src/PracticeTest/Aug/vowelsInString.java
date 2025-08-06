package PracticeTest.Aug;

public class vowelsInString {
    public static void main(String[] args) {
        String input ="Automation";
        String output = vowelChecker(input);
        System.out.println(output);
    }
    public static String vowelChecker(String input){
        String vowels= "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray())
        {
            if(vowels.contains(String.valueOf(ch)))
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
