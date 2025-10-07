package PracticeTest.Oct;

public class Lab07Oct25_Vowelscount {
    public static void main(String[] args) {
        String str= "Automation";
        int count =0;
        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
