package PracticeTest.Sept;
import java.util.Arrays;
public class Lab23Sept_EYQuestions {
    public static void main(String[] args) {
        int[] input= {1,2,3,4};
        // output should be {24,12,8,6}
        int[] output= multiplyofArraydevidedbyIndex(input);
        System.out.println(Arrays.toString(output));
    }
    public static int[] multiplyofArraydevidedbyIndex(int[] input){
        int multiply=1;
        for(int i=0;i<input.length;i++) {
            multiply = multiply * input[i];
        }
        for(int i=0;i<input.length;i++) {
            input[i]= multiply/input[i];
        }
        return input;
    }
}
