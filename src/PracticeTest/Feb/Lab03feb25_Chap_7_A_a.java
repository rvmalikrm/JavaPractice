package PracticeTest.Feb;

public class Lab03feb25_Chap_7_A_a {
    public static void main(String[] args) {
        int a=10, b=20;
        modify(a,b);
        System.out.println(a+" "+b);

    }
    static void modify(int a, int b){
        a++;
        b++;
        System.out.println(a + ""+ b);
        return;
    }
}
