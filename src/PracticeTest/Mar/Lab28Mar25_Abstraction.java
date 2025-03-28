package PracticeTest.Mar;
abstract class Animal
{
    public abstract void animalSoutn();
        public void sound()
        {
            System.out.println("Zzzz...");
        }
}
class pig extends Animal
{
    @Override
    public void animalSoutn()
    {
        System.out.println("Pig says  : weee.. wee..");
    }
}
public class Lab28Mar25_Abstraction
{
    public static void main(String[] args)
    {
        pig obj=new pig();
        obj.animalSoutn();
        obj.sound();
    }
}
