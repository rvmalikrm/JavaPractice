package PracticeTest.Oct;

public class Lab08Oct25_OddNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 23, 6, 0, 7};
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}


