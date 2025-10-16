package PracticeTest.Oct;

public class Lab16Oct25_PallindromCheck_Part_B {
    public static void main(String[] args){
        String input ="Madam";
        boolean result = isPallindrome(input);
        System.out.println(result);
        }
        public static boolean isPallindrome(String input)
        {
            int left =0;
            int right = input.length()-1;
            input =input.toLowerCase().replaceAll(" ","");
            while(left<right){
                if(input.charAt(left)!=input.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
}
