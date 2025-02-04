package PracticeTest.Feb;

public class Lab04Feb25_CountChar_in_String {
    public static void main(String[] args) {
        String str="abb ccc d@@@dddeeeeee ffffffghhhhiijkkllmmnopkrrlweee";
        Countchar(str);
    }
    public static void Countchar(String str){
        int[] count=new int[256];
        char[] chr=str.toCharArray();
        System.out.println(chr);
        for(char ch:chr){
            count[ch]++;
        }
        System.out.println("Repeated Characters:");
        for(int i =0;i<256;i++){
            if(count[i]>1){
                System.out.println((char) i + " is repeated "+ count[i] +"  times");
            }
        }
    }
}
