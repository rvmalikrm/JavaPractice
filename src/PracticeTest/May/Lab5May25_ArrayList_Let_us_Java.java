package PracticeTest.May;

import java.util.ArrayList;

public class Lab5May25_ArrayList_Let_us_Java {
    public static void main(String[] args) {
        ArrayList<String> alnames= new ArrayList<>();
        alnames.add("Ravi");
        alnames.add("Pooja");
        alnames.add("Mohit");
        alnames.add("Virendra Pal Singh");
        alnames.add("Antresh");
        alnames.add("Swati");
        alnames.add("Bijnor");
        alnames.add("Noida");
        System.out.println("all Nmaes are " + alnames);
        alnames.add(2, "Delhi");
        alnames.remove(7);
        alnames.remove("Noida");
        System.out.println("all Names after remove"+ alnames);
        if(alnames.contains("Ravi")){
            System.out.println("Ravi is present in the Array List");
        }

    }

}
