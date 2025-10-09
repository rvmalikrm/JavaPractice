package PracticeTest.Oct;

public class Lab09Oct25_PrintHighestNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 23, 6, 0, 7};
            int highest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > highest) {
                    highest = arr[i];
                }
            }
            System.out.println("Highest number is: " + highest);
    }
}
