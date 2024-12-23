package PracticeTest.Dec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab23Dec24_one_more_Way {
    public static void main(String[] args) throws IOException {
        float p, si,r;
        int n;
        InputStreamReader isr;
        BufferedReader br;

        isr =new InputStreamReader(System.in);
        br =new BufferedReader(isr);

        System.out.println("Enter the valude of p,n and r ");
        p=Float.parseFloat(br.readLine());

        /* The numeric values that we supply to the three readLine( ) functions is
        treated as string of characters, rather than as numbers. So we need to
        Chapter 3: Java Data Types and Instructions 41
        convert the strings into numbers. This conversion is done by the
        parseFloat( ) and parseInt( ) functions. These functions belong to a
        library classes called Float and Integer, respectively. */

        n=Integer.parseInt(br.readLine());
        r=Float.parseFloat(br.readLine());
        si=(p*n*r)/100;
        System.out.println("The simple Interest is Rs "+si);
    }
}
