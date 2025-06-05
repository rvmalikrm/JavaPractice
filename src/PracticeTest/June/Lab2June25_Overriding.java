package PracticeTest.June;

public class Lab2June25_Overriding {
    public  void printer(String str){
    System.out.println("Parent printer"+ str);
    }
}
class HP extends Lab2June25_Overriding {
public void printer(String color){
    System.out.println("Coler of the class is "+ color);
}
}
class Overriding{
public static void main(String[] args) {
Lab2June25_Overriding obj=new Lab2June25_Overriding();
HP obj2=new HP();
obj.printer("Demo");
obj2.printer("color");
}
}
