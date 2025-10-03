package PracticeTest.Oct;

public class lab03Oct25_Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean output = areAnagrams(str1, str2);
        System.out.println(output);
    }
        public static boolean areAnagrams(String str1, String str2){
            str1 = str1.replaceAll("\\s","").toLowerCase();
            str2 = str2.replaceAll("\\s","").toLowerCase();
            if(str1.length() != str2.length())
                return false;
            int[] charCount = new int[26];
            for(int i=0; i<str1.length(); i++){
                charCount[str1.charAt(i) - 'a']++;
                charCount[str2.charAt(i) - 'a']--;
            }
            for(int count : charCount){
                if(count != 0)
                    return false;
            }
            return true;
        }
}
