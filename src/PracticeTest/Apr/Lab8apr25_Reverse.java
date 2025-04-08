package Apr25;
public class Lab8apr25_Reverse {
    public static void main(String[] args){
        String str= "Hello World";
        String output = reverseWorld(str);
        System.out.println(output);
    }
    public static String reverseWorld(String str){
        String[] words= str.split(" ");
        StringBuilder result =new StringBuilder();
        for(String word :words){
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
