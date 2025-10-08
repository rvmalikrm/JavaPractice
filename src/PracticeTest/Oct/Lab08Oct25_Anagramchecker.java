package PracticeTest.Oct;
import java.util.Arrays;
public class Lab08Oct25_Anagramchecker {
    public static void main(String[] args) {
        String str1= "silent";
        String str2= "listen";
        boolean result = checkAnagrams(str1,str2);
        if(result){
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }    }
    public static boolean checkAnagrams(String str1, String str2){
      str1= str1.replaceAll("\\s","").toLowerCase();
        str2= str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            return false;        }
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        } else {
            return false;
        }
    }
}
