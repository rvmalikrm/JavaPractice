package PracticeTest.May;

import java.util.LinkedList;

public class Lab5May25_Linked_list_demo
{
    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Subhash");
        ll.add("Rahul");
        ll.add("Joe");
        ll.add("Vineeta");
        for (String s: ll)
        {
            System.out.println(s);
        }
        ll.set(2, "Neha");
            System.out.println(ll);
        String name =ll.get(2);
            System.out.println("String at position 2 "+name);
        ll.add(3, "Sanjay");
            System.out.println(ll);
        ll.remove(1);
            System.out.println(ll);


    }
}
