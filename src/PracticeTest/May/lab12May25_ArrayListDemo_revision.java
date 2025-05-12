package PracticeTest.May;

import java.util.ArrayList;

public class lab12May25_ArrayListDemo_revision {
    public static void main(String[] args) {
        ArrayList<String> alnames= new ArrayList<>();
        alnames.add("Ravi ");
        alnames.add("Malik");
        alnames.add("Noida");
        alnames.add("Delhi");
        alnames.add("Gurgoan");
        alnames.add("Intelegencia");
        System.out.println("Array list contains "+ alnames);
        System.out.println(alnames.contains("Ravi "));

    }
}
