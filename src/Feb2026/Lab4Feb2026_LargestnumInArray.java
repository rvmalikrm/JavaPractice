package Feb2026;

public class Lab4Feb2026_LargestnumInArray {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int largest = numbers[0]; // Assume the first number is the largest initially

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
