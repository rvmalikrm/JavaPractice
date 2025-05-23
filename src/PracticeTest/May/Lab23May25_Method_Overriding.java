package PracticeTest.May;

public class Lab23May25_Method_Overriding {
    public static void main(String[] args) {


        Animal2 a;
        a = new Dog2();
        a.sound();
        a=new Cat2();
        a.sound();
        a= new Animal2();
        a.sound();
    }
}

class Animal2{
    void sound(){
        System.out.println(" Animal make a sound");
    }
}
class Dog2 extends Animal2{
    void sound(){
        System.out.println(" Dog make barking sound");
    }
}
class Cat2 extends Animal2{
    void sound(){
        System.out.println("Cat sound Meow Meoww....");
    }
}

