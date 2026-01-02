package Jan2026;

public class Lab2Jan2026_Test2 {
    public static void main(String[] args) {
        String input = "test";
        String input2= "test";
        String input3= new String("test");
        String input4= new String("test");;
        if(input.equals(input2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(input==input2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(input3.equals(input4)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(input3==input4){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
