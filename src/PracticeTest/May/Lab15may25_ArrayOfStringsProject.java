package PracticeTest.May;

import java.util.Scanner;

public class Lab15may25_ArrayOfStringsProject {
    public static void main(String[] args) {
        String[] masterList= new String[] {"Ravi","Karuna", "Prikshit", "Vaibhav","Sumit","Amit","Sandeep"};
        int i, a;
        boolean flag;
        String yourname;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name");
        yourname= sc.nextLine();
        flag= false;
        for(i=0;i<masterList.length-1;i++)
        {
            a= masterList[i].compareTo(yourname);
            if(a==0){
                System.out.println("Your can enter the place");
                flag= true;
                break;

            }
        }
        if(false==false)
        {
            System.out.println("Sorry, you are a trespasser");
        }

    }
}
