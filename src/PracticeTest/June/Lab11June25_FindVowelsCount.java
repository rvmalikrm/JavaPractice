package PracticeTest.June;

public class Lab11June25_FindVowelsCount {
    public static void main(String[] args) {
        String input ="Automationeeee";
        int output = countVowels(input);
        System.out.println("Vowels present in the String are " + output);
    }
    public static int countVowels(String input){
        int count =0;
        String vowels= "aeiouAEIOU";
        char[] arr= input.toCharArray();
        for(char ch : arr){
            if (vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}
