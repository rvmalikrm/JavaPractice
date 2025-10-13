package PracticeTest.Oct;

public class Lab12Oct25_VowelsCount {
    public static void main(String[] args) {
        String str= "Ravimalik";
        int count =0;
        for(char ch: str.toLowerCase().toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println(count);


    }
}
