package PracticeTest.May;

import java.util.Scanner;

public class Lab7May25_firstArrayProgram {
    public static void main(String[] args) {
        int i, avg, sum=0;
        int[] marks;
        Scanner sc;
        marks=new int[30];
        sc=new Scanner(System.in);

        //store daya in array
        for(i=0;i<=29;i++){
            System.out.println("Enter the marks of student "+(i+1));
            marks[i]=sc.nextInt();
        }
        // read data from array
        for (i=0;i<=29;i++) {
            sum = sum + marks[i];
        }
            avg= sum/30;
            System.out.println("Average marks are " + avg);

    }
}
