package PracticeTest.Dec2025;

public class Lab24Dec2025_HashSet {
    public static void main(String[] args) {
        // What is hashSetr in java
        // HashSet is a collection class in java that implements the Set interface and is backed by a hash table
        // (actually a HashMap instance). It is used to store unique elements, meaning it does not allow duplicate values.
        // HashSet is part of the Java Collections Framework and is found in the java.util package.

        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added
        System.out.println("HashSet: " + set);
        System.out.println("HashSet: " + set.size());
        //System.out.println("HashSet: " + set(1));

    }
}
