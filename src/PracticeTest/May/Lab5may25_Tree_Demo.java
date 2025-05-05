package PracticeTest.May;
import java.util.TreeSet;
public class Lab5may25_Tree_Demo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(3);
        ts.add(9);
        ts.add(1);
        ts.add(4);
        ts.add(7);
        ts.add(11);
        System.out.println(ts);
        System.out.println(ts.subSet(4,11));
        ts.clear();
        System.out.println(ts);
    }
}

