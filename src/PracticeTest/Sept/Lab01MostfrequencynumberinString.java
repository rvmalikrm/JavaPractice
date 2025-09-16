// src/PracticeTest/Sept/Lab01MostfrequencynumberinString.java
package PracticeTest.Sept;
public class Lab01MostfrequencynumberinString {
    public static void main(String[] args) {
        String input = "aabbccddeeeeefffff";
        int maxCount = 0;
        int[] freq = new int[26];
        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
                if (freq[c - 'a'] > maxCount) {
                    maxCount = freq[c - 'a'];
                }
            }
        }
        // Print all characters with max frequency
        System.out.print("Most frequent characters: ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxCount) {
                System.out.print((char) (i + 'a') + " ");
            }
        }
        System.out.println("with count: " + maxCount);
    }
}