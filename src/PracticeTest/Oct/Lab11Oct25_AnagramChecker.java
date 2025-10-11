package PracticeTest.Oct;

public class Lab11Oct25_AnagramChecker
{
    public static void main(String[] args) {
        String str1= "listen";
        String str2="silent";
        boolean isAnagram = true;
        if(str1.length()!=str2.length()){
            isAnagram=false;
        } else {
            for(char ch: str1.toCharArray()){
                if(str2.indexOf(ch)==-1){
                    isAnagram=false;
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    }

