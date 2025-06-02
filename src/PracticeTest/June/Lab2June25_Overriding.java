package PracticeTest.June;

public class Lab2June25_Overriding {

    // Method with 2 parameter
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Lab2June25_Overriding obj= new Lab2June25_Overriding();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(5, 10, 25));
    }
}
