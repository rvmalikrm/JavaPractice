package PracticeTest.Mar;

abstract class Animal1
{
    public abstract void Animalsound();
    public void sound(){
        System.out.println("Zeee Zeee");
    }
}
class pig1 extends Animal1
{
    @Override
    public void Animalsound() {
        System.out.println("Pigs says : wee wee");
    }
}

public class Lab21Mar25_Abstraction {
    public static void main(String[] args) {
        pig1 myobj=new pig1();
        myobj.Animalsound();
        myobj.sound();
    }
}
