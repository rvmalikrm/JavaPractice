package PracticeTest.Oct;

public class Lab07Oct25_FirstCharacterCapital {
    public static void main(String[] args) {
        String str= "qa is automation";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String restOfWord = word.substring(1);
            result.append(firstChar).append(restOfWord).append(" ");
       }
        System.out.println(result);
    }
}
