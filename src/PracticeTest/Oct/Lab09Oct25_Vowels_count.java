package PracticeTest.Oct;

public class Lab09Oct25_Vowels_count {
    public static void main(String[] args) {
        String str= "Automation";
        int count =0;
        for(char ch: str.toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println(count);
    }
}
