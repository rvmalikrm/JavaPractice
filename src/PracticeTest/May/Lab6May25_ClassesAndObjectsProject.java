package PracticeTest.May;

import java.util.Scanner;

class Rectangle
{
    private int len,brd;
    public void getData()
    {
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Enter the lenght and breadth");
        len= sc.nextInt();
        brd=sc.nextInt();
    }
    public void setData(int l, int b)
    {
        len=l;
        brd=b;
    }
    public void displayData()
    {
        System.out.println("len " +len);
        System.out.println("brd " +brd);
    }
    public void perArea()
    {
        int a, p;
        a= len* brd;
        p= 2*(len+brd);
        System.out.println("area " + a);
        System.out.println("perimeter " + p);
    }
}
public class Lab6May25_ClassesAndObjectsProject
{
    public static void main(String[] args)
    {
        Rectangle r1, r2, r3; // define the three reference
        r1= new Rectangle();
        r2= new Rectangle();
        r3= new Rectangle();

        r1.setData(10,20); //set data in elements of object
        r1.displayData(); // display the data set by setData()
        r1.perArea(); // calculate and print  the area and perimeter

        r2.setData(5, 10);
        r2.displayData();
        r2.perArea();

        r3.getData(); // recieve data from the keyboard
        r3.displayData();
        r3.perArea();
    }
}
