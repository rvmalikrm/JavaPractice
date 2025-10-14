package PracticeTest.Oct;

public class Lab14Oct25_ExceptionHandling {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try {
            System.out.println(arr[3]);
            System.out.println("Try Block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are accessing the 5th element in and Array but there is only 3 elements");
        }finally {
            System.out.println("Finally Block");
        }
        System.out.println("Hello World");
    }
}
