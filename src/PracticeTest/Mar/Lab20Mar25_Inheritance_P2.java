package Mar;

class Ex {
    public void fun() {
        System.out.println("Inside EX-fun()");
    }

    public void save() {
        System.out.println("Inside the EX-Save()");
    }

    public void enc() {
        System.out.println("Inside Ex-END()");
    }

    public void open() {
        System.out.println("Inside Ex-Open()");
    }
}

class NewEx extends Ex {
    public void save() {
        System.out.println("Inside NewEx-Save()");
    }

    public void enc() {
        System.out.println("Inside NewEx-enc()");
    }

    public void autoUpdate() {
        System.out.println("Inside NewEx-autoUpdate()");
    }

    public void open() {
        super.open();
        System.out.println("Inside NewEx-Open()");

    }
}

public class Lab20Mar25_Inheritance_P2 {
    public static void main(String[] args) {
        NewEx e = new NewEx();
        e.fun();
        e.save();
        e.enc();
        e.autoUpdate();
        e.open();
    }
}
