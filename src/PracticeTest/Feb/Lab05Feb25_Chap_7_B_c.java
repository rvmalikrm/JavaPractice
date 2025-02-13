package PracticeTest.Feb;

public class Lab05Feb25_Chap_7_B_c {
    public static void main(String[] args) {
        float area;
        int radius=1;
        area=areaofCircle(radius);
        System.out.println(area);
    }
    public  static float areaofCircle(int r){
        float a;
        a=3.14f*r*r;
        return a;
    }
}
