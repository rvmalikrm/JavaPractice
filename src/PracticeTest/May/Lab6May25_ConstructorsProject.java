package PracticeTest.May;

import java.util.Scanner;

class Numbers
{
    private int i;

    public void setData(int j)

    {
        i = j;
    }

    public void getData()
    {
        Scanner scn;
        scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        i = scn.nextInt();
    }
    public Numbers()
    {
        // zero argument constructor
    }
    public Numbers(int j) // one argument constructor
    {
        i=j;
    }
    public  void displayData()
    {
        System.out.println("value of i "+  i);
    }
}
public class Lab6May25_ConstructorsProject
{
    public static void main(String[] args)
    {
        Numbers n1, n2, n3;
        n1=new Numbers();
        n1.displayData();
        n1.setData(200); // first method to set data in ovject
        n1.displayData();

        n2=new Numbers();
        n2.displayData();
        n2.getData(); // second method ot set data in Object
        n2.displayData();

        n3=new Numbers();
        n3.displayData(); // third method to set data in Object
    }
}
