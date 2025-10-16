package PracticeTest.Oct;

public class Lab16Oct25_PallindromCheck {
    public static void main(String[] args){
        String input ="Madam";
        input.toLowerCase().replaceAll(" ","");
        StringBuilder sb= new StringBuilder(input);
        sb.reverse();
        if(input.equalsIgnoreCase(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
