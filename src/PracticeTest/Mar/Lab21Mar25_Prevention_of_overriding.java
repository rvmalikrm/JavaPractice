package PracticeTest.Mar;
class Base {
     final public void intg() { // there final keyword shoud remove to compile it
        System.out.println("In the final method");
    }
}
class derivedintg extends Base
{
    public void intg(){
        super.intg();
        System.out.println("Illegel");

    }
}
public class Lab21Mar25_Prevention_of_overriding {
    public static void main(String[] args) {
        derivedintg obj=new derivedintg();
        obj.intg();

    }
}
