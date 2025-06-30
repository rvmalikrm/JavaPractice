package PracticeTest.June;

import java.util.*;

// @Author =Ravi Malik
class Rectangle /*e of the class, i.e., Rectangle. The body of a
class is delimited by braces. The Rectangle class contains two data items
        len and br and four functions setData( ), getData( ), displayData( ) and
areaPeri( ) */
{
    private int len, brd;
    //receives the values of data items
    public  void getData()
    {
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.println("Enter the lenght and breath");
        len= sc.nextInt();
        brd= sc.nextInt();
    }
    //sets the data items
    //(len and brd) to values passed to it
    public void setData(int l, int b)
    {
        len= l;
        brd = b;
    }
    public void dispalyData()
    {
        System.out.println("length"+len);
        System.out.println("breath"+brd);
    }
    public void areaPeri()
    {
        int a, p;
        a= len*brd;
        p= 2*(len+brd);
        System.out.println("area " + a);
        System.out.println("Perimeter " + p);
    }
}

public class ClassandObjectProject
{
    public static void main(String[] args) {
        Rectangle r1, r2, r3; // define three references
        r1= new Rectangle();
        r2= new Rectangle();
        r3= new Rectangle();

        r1.setData(10, 20);// set data in elements of objects
        r1.dispalyData(); // display the data set by setData
        r1. areaPeri(); // calculate the area and perimeter

        r2.setData(5, 8);
        r2.dispalyData();
        r2.areaPeri();


        r3.getData(); // get data from Keyboard
        r3.dispalyData();
        r3.areaPeri();
    }
}
