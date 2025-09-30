package PracticeTest.Sept;

import java.util.HashMap;
import java.util.Map;

public class Lab30Sept25_LastNONRepeatwithCollections {
    public static void main(String[] args) {

    String str="swiss";
    char result=' ';
    Map<Character,Integer> map=new HashMap<>();
    for(char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        if(map.get(ch)==1){
            result=ch;
            break;
        }

    }
        System.out.println(result);

}
}
