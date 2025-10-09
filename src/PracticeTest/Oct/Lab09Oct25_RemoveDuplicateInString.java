package PracticeTest.Oct;

public class Lab09Oct25_RemoveDuplicateInString {
    public static void main(String[] args) {
        String  input = "aabbbcc";
        String result ="";
        for (Character ch: input.toCharArray()){
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
