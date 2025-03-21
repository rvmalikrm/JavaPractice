package PracticeTest.Mar;
final class Base1
{

}
class derived extends Base1
{
    public void fun(){
        System.out.println("To much noise, too little substance");
    }
}
public class Lab21Mar25_Prevent_Inheritance_Project {
    public static void main(String[] args) {
        derived d=new derived();
        d.fun();
    }
}
