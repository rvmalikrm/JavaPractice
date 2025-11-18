package PracticeTest.Nov2025;

 class Parent1 {
    void home() {
        System.out.println("This is Parent Farm");
    }
}
class Child1 extends Parent1 {
    public Child1() {
        System.out.println("This is Child Constructor");
        super.home();
    }
    void car() {
        System.out.println("This is Child Car");
    }
    void home() {
        System.out.println("This is Child Home");
    }
}
public class Lab18Nov2025_ChildParent {
    public static void main(String[] args) {
        Child1 c= new Child1();
        c.car();
        c.home();

    }
}
