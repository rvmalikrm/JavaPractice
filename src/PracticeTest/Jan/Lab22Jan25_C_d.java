package PracticeTest.Jan;

import java.util.Scanner;

public class Lab22Jan25_C_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ages of Ram, Shyam and Ajay ");
        int ageofRam = sc.nextInt();
        int ageofShyam = sc.nextInt();
        int ageofAjay = sc.nextInt();
        if (ageofRam < ageofShyam & ageofRam < ageofAjay)
        {
            System.out.println("Ram is the Younger among them");
        } else if (ageofShyam<ageofAjay) {
            System.out.println("Shyam is the Younger among them");
        }
        else {
            System.out.println("Ajay is the Younger among them");
        }
    }
}
