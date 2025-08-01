package PracticeTest.Aug;

public class reverseNumericValueInString {
    public static void main(String[] args) {
        String input ="Java is 2016 programming 2033";
        StringBuilder sb= new StringBuilder();
        String[] strarr= input.split(" ");
        for(String str:strarr)
        {
            if(str.matches("\\d+"))
            {
               sb.append(new StringBuilder(str).reverse().append(" "));
            }
            else
            {
                sb.append(str).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
