package PracticeTest.Aug;

public class Question19Aug25_Method_Overriding
{
    public static void main(String[] args)
    {
        Animal19Aug a =new Dog19Aug();
        a.sound();
        Animal19Aug a1= new Cat19Aug();
        a1.sound();
        Animal19Aug a2=new Animal19Aug();
        a2.sound();
    }
}
class Animal19Aug
{
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog19Aug extends Animal19Aug
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}
class Cat19Aug extends Animal19Aug
{
    public void sound()
    {
        System.out.println("Cat meows");
    }
}