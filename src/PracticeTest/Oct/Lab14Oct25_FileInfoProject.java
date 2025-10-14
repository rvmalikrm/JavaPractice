package PracticeTest.Oct;

public class Lab14Oct25_FileInfoProject {
    public static void main(String[] args) {
        String fileName = "my.document.final.version.pdf";

        // Extracting the file extension
        String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1);
        System.out.println("File Extension: " + fileExtension);

        // Extracting the base name (file name without extension)
        String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
        System.out.println("Base Name: " + baseName);

        // Counting the number of characters in the base name
        int charCount = baseName.length();
        System.out.println("Number of characters in base name: " + charCount);

        // Counting the number of words in the base name (assuming words are separated by '.')
        String[] words = baseName.split("\\.");
        int wordCount = words.length;
        System.out.println("Number of words in base name: " + wordCount);
    }
}
