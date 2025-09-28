package PracticeTest.Sept;

public class Lab28SeptGenerics {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};
        Character[] charArray = {'a', 'b', 'c', 'd'};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        Double[] doubleArray = {1.11, 2.22, 3.33, 4.44};
        printArray(intArray);
        printArray(strArray);
        printArray(charArray);
        printArray(floatArray);
        printArray(doubleArray);
    }
    public static <T> void printArray(T[] array){
        for(T ele:array){
            System.out.println("Elements of  Array "+ele+" ");
        }
    }
}
