package PracticeTest.May;

public class Lab7May25_ReturningArray
{
    public static void main(String[] args) {
        int[] p;
        p = func();
        for (int i = 0; i < p.length - 1; i++) {
            System.out.println(p[i] + " ");
        }
    }
        static int[] func()
        {
            int[] arr = {10, 20, 30, 40, 50};
            return arr;
        }
    }

