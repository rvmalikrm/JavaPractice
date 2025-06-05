package PracticeTest.June;

public class Lab2June25_Overloading {
    // Method with 2 parameter
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Lab2June25_Overloading obj= new Lab2June25_Overloading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(5, 10, 25));
    }
}
