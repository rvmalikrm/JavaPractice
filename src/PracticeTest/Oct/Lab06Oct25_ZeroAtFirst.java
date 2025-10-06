package PracticeTest.Oct;

public class Lab06Oct25_ZeroAtFirst
{
    public static void main(String[] args)
    {
        int[] arr = {0, 1, 0, 3, 12,0,23,6,0,7};
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num == 0) {
                result[index] = num;
                index++;
            }
        }
        for (int num : arr) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
