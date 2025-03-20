package PracticeTest.Mar;
class a
{
    public a(){
        System.out.println("a's 0-arg Ctor");
    }
    public a(int xx){
        System.out.println("a's 1-arg Ctor");
    }
}
class b extends a
{
    public b(){
        System.out.println("b's 0-arg Ctor");
    }
    public b(int x){
        super(x);
        System.out.println("b's 1-arg Ctor");
    }
}
public class Lab20Mar25_constructors_ininheritance_project {
    public static void main(String[] args) {
        b y=new b();
        b z=new b(10);
    }
}
