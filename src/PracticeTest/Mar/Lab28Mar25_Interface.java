package PracticeTest.Mar;
interface Car {
    public void carSound();

    public void altoSound();
}
class Alto implements Car{
    public void carSound(){
        System.out.println("Whoo Whoo");
    }
    public void altoSound(){
        System.out.println("Alto sound WEee weee Whoo");
    }
}

public class Lab28Mar25_Interface {
    public static void main(String[] args) {
        Alto obj =new Alto();
        obj.carSound();
        obj.altoSound();


    }
}
