package PracticeTest.Oct;

public class Lab16Oct25_ReverseString {
    public static void main(String[] args) {
        String str= "QA is Automation";
        String reversedStr="";
        String[] words= str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            reversedStr+=words[i]+" ";
        }
        System.out.println(reversedStr.trim());
    }
}
