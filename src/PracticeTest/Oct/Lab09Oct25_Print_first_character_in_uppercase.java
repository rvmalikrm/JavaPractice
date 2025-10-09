package PracticeTest.Oct;

public class Lab09Oct25_Print_first_character_in_uppercase {
    public static void main(String[] args) {
        String str = "qa is automation";
        String[] arr= str.split(" ");
        for(String word: arr){
            String firstChar = word.substring(0,1).toUpperCase();
            String remainChars= word.substring(1);
            System.out.print(firstChar + remainChars+ " ");
        }

    }
}
