package PracticeTest;

public class Lab020Dec24_implicit_conversion_char {
    public static void main(String[] args) {
        char ch='A';
        char dh='b';
        //char fh=ch+dh;  //resulting in int so now short allowed here
        int eh=ch+dh;
        //System.out.println(fh);
        System.out.println(eh);
    }
}
