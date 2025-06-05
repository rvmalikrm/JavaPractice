package PracticeTest.June;

public class Lab05June25_Que3_ReversewordsInSentence {
    public static void main(String[] args) {
        String input =" QA automation is great";
        String output= reverseWord(input);
        System.out.println("input : " +input);
        System.out.println("Output : "+ output);
    }
    public static String reverseWord(String str){
        // Split the owrds where space occured
        String[] words= str.split(" ");
        //Reverse the word
        StringBuilder reversed = new StringBuilder();
        for (int i =words.length-1;i>=0;i--){
        reversed.append(words[i]);
        if(i>0)reversed.append(" ");
        }
        return reversed.toString();
            }
}
