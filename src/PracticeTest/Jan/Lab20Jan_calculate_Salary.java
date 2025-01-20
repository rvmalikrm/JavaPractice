package PracticeTest.Jan;

import java.util.Scanner;

public class Lab20Jan_calculate_Salary {
    public static void main(String[] args) {
            float bs, gs, da, hra;
        Scanner scr;
        System.out.println("Enter the Basic Salary ");
        scr=new Scanner(System.in);
        bs=scr.nextInt();
        if(bs<1500)
        {
            hra=bs*10/100;
            da=bs*90/100;
        }
        else
        {
        hra=1200;
        da=bs*98/100;
        }
        gs= bs+hra+da;
        System.out.println("Gross Salary " + gs);
    }
}
