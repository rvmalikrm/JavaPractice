package PracticeTest.Jan;

public class Lab21Jan25_Ternary_operator_p2 {
    public static void main(String[] args) {
        int big, a, b, c ;
        a=7;
        b=10;
        c=8;
        big = a > b ? ( a > c ? 3: 4 ) : ( b > c ? 6: 8 ) ;
        System.out.println(big);
    }
}
