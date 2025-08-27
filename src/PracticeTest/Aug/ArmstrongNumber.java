package PracticeTest.Aug;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input = 153;
        int originalInput = input;
        int sum = 0;
        while (input != 0) {
            int digit = input % 10;
            sum += digit*digit*digit;
            input /= 10;
        }
        if (sum == originalInput) {
            System.out.println( "  Armstrong number.");
        } else {
            System.out.println( " Not Armstrong number.");
        }
    }
}
