package PracticeTest;
import java.util.Scanner;

public class Lab18Dec24_Scanner_class_char_byte_long_string {
    public static void main(String[] args) {
        // Calculation of simple interest
        System.out.println("Enter the details as below :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age :");
        byte age = sc.nextByte();
        System.out.println("Enter the villagepoppulation :");
        short villagepoppulation = sc.nextShort();
        System.out.println("Enter if  is_Male :");
        boolean is_Male =sc.nextBoolean();
        System.out.println("Enter the Salary :");
        double salary =sc.nextDouble();
        System.out.println("Enter the Mobile :");
        long mobile = sc.nextLong();
        System.out.println("Enter your favaurate Character :");
        char c= sc.next().charAt(0); /*Note that to receive a character we have to receive a string by calling
        next( ) and then obtain the character at 0th position from this string by
        calling charAt( ) function. */
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        System.out.println(" Details are below :");
        System.out.println(age);
        System.out.println(villagepoppulation);
        System.out.println(is_Male);
        System.out.println(salary);
        System.out.println(mobile);
        System.out.println(c);
        System.out.println(str);





    }
}
