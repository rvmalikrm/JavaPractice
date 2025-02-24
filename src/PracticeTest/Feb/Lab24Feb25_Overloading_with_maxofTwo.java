package PracticeTest.Feb;

public class Lab24Feb25_Overloading_with_maxofTwo {

    static int max(int a, int b){
        return (a>b)?a:b;
    } static float max(float a, float b){
        return (a>b)?a:b;
    } static double max(double a, double b){
        return (a>b)?a:b;
    }



    public static void main(String[] args) {
        System.out.println("Max of 5 and 10 "+ max(5,10));
        System.out.println("Max of 5.5 and 2.5(float) "+ max(5.5f,2.5f));
        System.out.println("Max of 4.12345 and 7.43343(double)  "+ max(4.12345,7.43343));

    }
}
