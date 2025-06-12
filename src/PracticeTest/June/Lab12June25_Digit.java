package PracticeTest.June;

public class Lab12June25_Digit {
    public static void main(String[] args) {
        String input = "1212121";
        boolean output = checkDigit(input);
        System.out.println("Output :" +output);
    }
    public static boolean checkDigit(String input){
        return  input.matches("\\d+");

    }
}
