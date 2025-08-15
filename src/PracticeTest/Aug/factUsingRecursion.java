package PracticeTest.Aug;

public class factUsingRecursion {
    public static void main(String[] args) {
        int num =5;
        int output =fact(num);
        System.out.println(output);
    }
    public static int fact(int num){
        if(num<=1){
            return 1;
        }
        return  num*fact(num-1);
    }
}

