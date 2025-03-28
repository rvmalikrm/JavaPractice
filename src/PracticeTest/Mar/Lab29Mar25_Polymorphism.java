package PracticeTest.Mar;
class animal123{
    public void animalvoice(){
        System.out.println("Animal sounds like");
    }
}
class Cat extends animal123 {
    public void animalvoice() {
        System.out.println("Cat voice is Mew... Mew...");
    }
}
class Dog extends animal123
{
    public void animalvoice(){
        System.out.println("Dog sounds is Bow....bopww....");
    }
}
public class Lab29Mar25_Polymorphism {
    public static void main(String[] args) {
        animal123 myobj=new animal123();
        animal123 myobj1=new Cat();
        animal123 myobj2=new Dog();

        myobj1.animalvoice();
        myobj2.animalvoice();
        myobj.animalvoice();

    }
}
