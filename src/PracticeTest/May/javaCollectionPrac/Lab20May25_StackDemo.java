package PracticeTest.May.javaCollectionPrac;

import java.util.Stack;

public class Lab20May25_StackDemo {
    public static void main(String[] args) {
        Stack<String > s;
        s=new Stack<>();
        s.push("Delhi");
        s.push("Mumbai");
        s.push("Goa");
        s.push("Jaipur");
        s.push("Dubai");
        s.push("New York");

        String str;
        if(!s.isEmpty()){
            str= s.pop();
            System.out.println(str);

        }
    }
}
