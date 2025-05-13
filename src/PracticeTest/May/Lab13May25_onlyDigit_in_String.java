package PracticeTest.May;

public class Lab13May25_onlyDigit_in_String {
    public static void main(String[] args) {
        String input = "123456";
        System.out.println("String have only digit "+ checkDigit(input));
    }
    public static boolean checkDigit(String input)
    {
        input = input.replaceAll("\s","").toLowerCase().trim();

        if(input==null || input.isEmpty()) {
            return false;
        }
        for ( char ch: input.toCharArray()){
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
