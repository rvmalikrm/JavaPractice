package PracticeTest.Jan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab27Jan25_ArrayList {
    public static void main(String[] args) {
        String[] strarr= new String[5];
        strarr[0]="Intelegencia";
        strarr[1]="Unicode";
        strarr[2]="Infosys";
        strarr[3]="Kiet";
        strarr[4]="GIC";
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Malik");
        al.add("Unicode");
        al.add("Intelgencia");
        al.add("Gurgoan");
        al.add("Noida");
        //System.out.println(al.get(3));
        al.add("Delhi");
        //System.out.println(al.get(6));
        for(String s:al){
            System.out.println(s);
        }
        for(int i=0; i<al.size();i++){
            System.out.println("Regular for loop "+ al.get(i));
        }
        List<String> arrlist=Arrays.asList(strarr);
        boolean bol =arrlist.contains("GIC");
        System.out.println(bol);
        List<String> mutableList = new ArrayList<>(arrlist);
        mutableList.add("Laptop");
        mutableList.add("Mobile");
        mutableList.add("car");
        System.out.println(mutableList.get(7));
        for(String str:mutableList){
            System.out.println(str);
       }
    }
}
