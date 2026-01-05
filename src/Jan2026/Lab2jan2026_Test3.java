package Jan2026;

public class Lab2jan2026_Test3 {
    public static void main(String[] args) {
        String str = "hello world manoj ravi india new year";
        // Output should be: Hello World
        String[] words= str.split(" ");

        StringBuilder result = new StringBuilder();
        for(String word: words){
            char firstChar= Character.toUpperCase(word.charAt(0));
            String rest= word.substring(1);
            result.append(firstChar).append(rest).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
