package PracticeTest.Oct;

public class Lab09Oct25_PrintHighestLowestNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 30, 3, 12, 650, 23, 6, 10, 7};
            int highest = arr[0];
            int lowest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > highest) {
                    highest = arr[i];
                }
                if (arr[i] < lowest) {
                    lowest = arr[i];
                }
            }
            System.out.println("Highest number is: " + highest);
        System.out.println("Lowest number is: " + lowest);
    }
}
