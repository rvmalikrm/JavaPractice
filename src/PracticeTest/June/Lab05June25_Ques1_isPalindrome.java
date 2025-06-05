package PracticeTest.June;

public class Lab05June25_Ques1_isPalindrome {
    public static  boolean isPalindrome(String str){
        // Remove the spaces and convert to Lowercase
        str=str.replaceAll("\\s","").toLowerCase();
        int left =0;
        int right= str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "mAdam";
        boolean result = isPalindrome(str);
        System.out.println("Input : "+str +"Output : "+result);
    }
}
