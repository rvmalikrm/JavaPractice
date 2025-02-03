package PracticeTest.Feb;

public class Lab03feb25_Chap_7_A_c {
    public static void main(String[] args) {
        float area;
        int radius=1;
        area= areaofcircle(radius);
        System.out.println(area);
    }
    static float areaofcircle(int r){
        float a;
        a=3.14f*r*r;
        return (a);
    }
}
