package PracticeTest;

public class Lab020Dec24_implicit_conversion_short {
    public static void main(String[] args) {
        short a=100;
        short b=50;
        //short c=a+b; resulting in int so now short allowed here
        int d=a+b;
        //System.out.println(c);
        System.out.println(d);
    }
}
