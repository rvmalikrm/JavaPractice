package PracticeTest.Jan;

import java.util.Scanner;

public class Lab27Jan25_Nested_For_loop {
    public static void main(String[] args) {
        int r, c, sum;
        for (r = 1; r < 4; r++) {
            for (c = 1; c <= 3; c++) {
                sum = r + c;
                System.out.println("r " + r + " c " + c + " sum " + sum);
            }
        }
    }
}

