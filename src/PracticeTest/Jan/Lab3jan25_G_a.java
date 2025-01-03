package PracticeTest.Jan;
import java.util.Scanner;
/*---------------------------------------
 | Author  | Ravi Malik
 | Agenda  | To enter the two numbers from keyboards and  then swap thier value
 | Date    | 3rd Jan 2025
-----------------------------------------*/
public class Lab3jan25_G_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of C and D ");
        int C= sc.nextInt();
        int D= sc.nextInt();
        System.out.println("Enter the Values of C " +C);
        System.out.println("Enter the Values of D " +D  +"\n");
         C=C+D;
         D=C-D;
         C=C-D;
        System.out.println("After Swapping the Values of C " +C);
        System.out.println("After Swapping the Values of D " +D);
    }
}
