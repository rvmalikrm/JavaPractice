package PracticeTest.May;


// Abstract class
abstract class Animal{
    // Abstract method (no body)
    abstract void makeSound();
    // Concrete method
    void sleep(){
        System.out.println("Sleeping................");
    }
}
// Concrete class extends abstract class
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog Sound like Barking ...... Barking....");
    }
}
public class Lab21may25_AbstractionExample {
    public static void main(String[] args) {
        // Upcasting
        Animal a = new Dog();
        a.makeSound();
        a.sleep();
    }
}
