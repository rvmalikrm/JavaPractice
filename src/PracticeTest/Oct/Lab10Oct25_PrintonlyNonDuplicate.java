package PracticeTest.Oct;

public class Lab10Oct25_PrintonlyNonDuplicate {
    public static void main(String[] args) {

        String  input = "aabbbccdeef";
        String result ="";
        for (Character ch: input.toCharArray()){
            if(input.indexOf(ch)==input.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
