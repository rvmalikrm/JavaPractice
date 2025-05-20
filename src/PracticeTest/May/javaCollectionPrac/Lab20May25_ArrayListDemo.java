package PracticeTest.May.javaCollectionPrac;

import java.util.ArrayList;

public class Lab20May25_ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("Ravi ");
        al.add("Pooja");
        al.add("Robin");
        al.add("Kapil");
        al.add("Rohit");
        al.add("Kiran");
        al.add("Kriti");
        al.add("John");
        al.add("Johnson");
        System.out.println("cotenet of ArrayList "+al);
        al.add(2,"Mohan");
        System.out.println("New contendt of al  "+al);
        al.remove(4);
        System.out.println("After remove 4th contente "+al);
        if(al.contains("Pooja")){
            System.out.println("Pooja is available in Array List");
        }

    }
}
