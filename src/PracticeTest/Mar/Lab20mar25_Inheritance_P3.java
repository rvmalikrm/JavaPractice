package PracticeTest.Mar;
class Ex
{
    public void save(){
        System.out.println("Inside the Ex-Save()");
    }
}
class NewEx extends Ex{
    public void autoUpdate(){
        System.out.println("Inside NewEX-AutoUpdate");
    }
    public void save(){
        System.out.println("Inside in NewEx-Save");
        super.save();
    }
}
public class Lab20mar25_Inheritance_P3 {
    public static void main(String[] args) {
        NewEx obj = new NewEx();
        obj.save();
        obj.autoUpdate();
    }
}
