package PracticeTest.May;

import java.util.Stack;

public class Lab12May25_StackDemo_revision {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("Home");
        stack.push("Office");
        stack.push("Metro");
        stack.push("Road");
        System.out.println("Stack contains "+ stack);
        String str;
        if(!stack.isEmpty()){
            str= stack.pop();
            System.out.println(str);
            System.out.println(stack);
        }
    }
}
