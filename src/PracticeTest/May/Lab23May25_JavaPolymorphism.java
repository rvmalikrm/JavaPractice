package PracticeTest.May;

public class Lab23May25_JavaPolymorphism {
    public static void main(String[] args) {
        MathOperations mat = new MathOperations();
        System.out.println(mat.add(12, 32));
        System.out.println(mat.add(512, 324, 90));
        System.out.println(mat.add(51.2, 8.0));

    }
}
class MathOperations{
        // Method to add two Intergers
        int add(int a, int b){
            return a+b;
        }
// Overloaded method to add three integers
        int add( int a, int b, int c){
            return a+b+c;
        }
        // Overloaded method to add two doubles
    double add(double a , double b){
            return a+b;
    }
    }


