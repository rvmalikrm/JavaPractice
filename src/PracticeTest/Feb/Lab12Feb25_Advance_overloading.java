package PracticeTest.Feb;

public class Lab12Feb25_Advance_overloading {
    public static void main(String[] args) {
        int i=-25,j;
        long l=-100000,m;
        double d=-12.34, e;
        j=abs(i);
        m=abs(l);
        e=abs(d);
        System.out.println("j = "+j);
        System.out.println("m = "+m);
        System.out.println("d = "+e);
    }
    static int abs(int ii){
        return (ii>0?ii:ii*(-1));
    }static long abs(long jj){
        return (jj>0?jj:jj*(-1));
    }static double abs(double dd){
        return (dd>0?dd:dd*(-1));
    }
}
