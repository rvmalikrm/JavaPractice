package PracticeTest.May;
// Creating and handling array of objects
class Sample
{
    private int i;
    private float f;
    public Sample(int ii, float ff){
        i=ii;
        f=ff;
    }
    public void display()
    {
        System.out.println("i is "+i+" f is "+f);
    }
}

public class Lab7May25_arrayofobjectsproject {
    public static void main(String[] args) {
        Sample[] s=new Sample[3];
        s[0]=new Sample(10, 1.4f);
        s[1]=new Sample(23, 5.4f);
        s[2]=new Sample(12, 8.4f);
        for (Sample sim:s)
            sim.display();
    }
}
