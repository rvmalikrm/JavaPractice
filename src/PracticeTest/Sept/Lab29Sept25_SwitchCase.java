package PracticeTest.Sept;

import java.util.Locale;
import java.util.Scanner;

public class Lab29Sept25_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (day)  {
            case "monday":
                System.out.println("It's Monday, start of the week!");
                break;
            case "tuesday":
                System.out.println("It's Tuesday, second day of the week!");
                break;
            case "wednesday":
                System.out.println("It's Wednesday, midweek day!");
                break;
            case "thursday":
                System.out.println("It's Thursday, almost the weekend!");
                break;
            case "friday":
                System.out.println("It's Friday, last day of the workweek!");
                break;
            case "saturday":
                System.out.println("It's Saturday, weekend fun!");
                break;
            case "sunday":
                System.out.println("It's Sunday, rest and recharge!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
