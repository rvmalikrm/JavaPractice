package PracticeTest.Dec;

public class Lab020Dec24_implicit_conversion {
    public static void main(String[] args) {
        byte a=100;
        byte b=50;
        //byte c=a+b; resulting in int so now byte allowed here
        int d=a+b;
        //System.out.println(c);
        System.out.println(d);
    }
}
