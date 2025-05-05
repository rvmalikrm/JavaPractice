package PracticeTest.May;
import java.util.Stack;
public class Lab5May25_stack_Demo {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("Delhi");
        s.push("Noida");
        s.push("Gurgaon");
        s.push("Bengluru");
        s.push("jaipur");
        s.push("Gurgaon");
        String str;
        for(int i=s.size();i>0;i--)
        {
            if (!s.isEmpty())
            {
                str = s.pop();
                System.out.println(str);
            }
        }
        System.out.println("Now stack has been empty");
    }
}
