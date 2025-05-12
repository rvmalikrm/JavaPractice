package PracticeTest.May;

public class Lab12May25_GenericFunction {
    public static <T> void printArray(T[] arr){
        for (T i : arr) {
            System.out.printf("%s", i);
        }
            System.out.println();

    }
    public static void main(String[] args) {
    Integer[] intArr= {2,5,4,6,7,6};
    Float[] floatArr = {3.4f, 5.4f, 5.6f, 3.2f,8.9f};
    Character[] charArr= {'Q','U','E','S','T'};
    printArray(intArr);
    printArray(floatArr);
    printArray(charArr);
    }
}
