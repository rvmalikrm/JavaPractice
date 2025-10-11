package PracticeTest.Oct;

public class Lab11Oct25_FirstCharacterCapital {
    public static void main(String[] args) {
        String str= "qa is automation";
        String[] arr = str.split(" ");
        String result = "";
        for(String word: arr){
            String firstChar = word.substring(0,1).toUpperCase();
            String remainChars=word.substring(1);
            result = result + firstChar + remainChars + " ";
        }
        System.out.println(result);
    }
}
