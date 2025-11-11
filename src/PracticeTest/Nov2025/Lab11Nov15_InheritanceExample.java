package PracticeTest.Nov2025;
class GrandParent {
    void farm() {
        System.out.println("This is GrandParent Farm");
    }
}
class Parent extends GrandParent{
    public Parent(){
        System.out.println("This is Parent Constructor");

    }
    void home(){
        System.out.println("This is Parent Home");
    }
    void Tracker(){
        System.out.println("This is Parent tracter");
    }
}
 class Child extends Parent{

    public Child(){

        System.out.println("This is Child Constructor");
        super.home();
    }
    void car(){

        System.out.println("This is Child Car");
    }
    void home(){
        System.out.println("This is Child Home");
    }
}
public class Lab11Nov15_InheritanceExample {
    public static void main(String[] args) {
        Child c= new Child();
        c.car();
        c.home();
        c.Tracker();


    }
}
