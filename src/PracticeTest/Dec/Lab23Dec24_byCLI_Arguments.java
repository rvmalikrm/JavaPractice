package PracticeTest.Dec;

import java.lang.*;
public class Lab23Dec24_byCLI_Arguments {
    public static void main(String[] args) throws NullPointerException {
        float p,r, si;
        int n;
        p=Float.parseFloat(args[0]);
        n=Integer.parseInt(args[1]);
        r=Float.parseFloat(args[2]);
        si = (p*n*r)/100;
        System.out.println("Simple Interest is Rs "+si);

    }
}
