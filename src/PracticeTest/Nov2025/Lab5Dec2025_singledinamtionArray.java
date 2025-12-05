package PracticeTest.Nov2025;

public class Lab5Dec2025_singledinamtionArray {
    public static void main(String[] args) {
        // single dimension Array
        // Array declaration

        String[] names = new String[5];
        // Array initialization
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "Diana";
        names[4] = "Ethan";
        // Accessing array elements
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }
    }
}
