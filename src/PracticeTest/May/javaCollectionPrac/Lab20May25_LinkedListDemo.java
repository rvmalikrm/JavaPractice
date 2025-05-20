package PracticeTest.May.javaCollectionPrac;

import java.util.LinkedList;

public class Lab20May25_LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll;
        ll=new LinkedList<>();
        ll.add("Subash");
        ll.add("Mukesh");
        ll.add("Duruv");
        ll.add("Rohit");
        ll.add("Aksay-------------------");
        for (String s: ll){
            System.out.println(s);
        }
        System.out.println(" ");
        ll.add(1,"Intel");
        for(String s2: ll){
            System.out.println(s2);
        }
        ll.set(1,"Unicode");
        System.out.println(ll);

    }
}
