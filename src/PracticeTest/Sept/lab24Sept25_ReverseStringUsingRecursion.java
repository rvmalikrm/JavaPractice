package PracticeTest.Sept;

//-------------------------------------------------------------------------------
// Write a Java program to reverse a string using recursion.
// Author: Ravi Malik
// Date: 24-09-2024
//-------------------------------------------------------------------------------

public class lab24Sept25_ReverseStringUsingRecursion {
        public static void main(String[] args) {
            String str = "Selenium";
            System.out.println("Reversed String: " + reverse(str));
        }
        public static String reverse(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

