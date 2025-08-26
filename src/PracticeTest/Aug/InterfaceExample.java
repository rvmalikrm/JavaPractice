package PracticeTest.Aug;
interface Mouse {
    void lBtndown(int x, int y);
    void rBtndown(int x, int y);
}
public class InterfaceExample {
 public void LBtnDown(int x, int y){
     System.out.println("Left button down at coordinates: (" + x + ", " + y + ")");
 }
 public void rBtnDown(int x, int y){
     System.out.println("Right button down at coordinates: (" + x + ", " + y + ")");
 }
    public static void main(String[] args) {
        InterfaceExample ie = new InterfaceExample();
        ie.LBtnDown(10,20);
        ie.rBtnDown(30,40);
 }
}
