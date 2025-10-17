package PracticeTest.Oct;
public class Lab17Oct25_ZerosAtStartOnesAtEnd
{
    public static void main(String[] args){
        String str= "1001001100";
        String result ="";
        int countZero=0;
        int countOne=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == '0')            {
                countZero++;
            }
            else{
                countOne++;
            }
        }
            for(int j=countZero;j>0;j--){
                result= result +0;
            }
            for(int k=countOne;k>0;k--){
                result= result +1;
            }
        System.out.println(result);
    }
}

