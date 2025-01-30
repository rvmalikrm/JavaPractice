package PracticeTest.Jan;

public class Lab30Jan25_Chap_5_C_f {
    public static void main(String[] args) {
        int y;
        double x;
        double i;
        for( y=1;y<=6;y++){
            for( x=5.5;x<=12.5;x++){
                i = 2 + ( y + (0.5* x));
                System.out.println("| i "+i+" =  y "+y+" x  "+x+ " |");
            }
        }
    }
}
