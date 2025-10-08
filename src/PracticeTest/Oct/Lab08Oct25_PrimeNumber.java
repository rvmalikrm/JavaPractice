package PracticeTest.Oct;

public class Lab08Oct25_PrimeNumber {
    public static void main(String[] args) {
        for(int input =2;input<=100;input++){
            boolean isPrime = true;
            for(int i=2;i<=input/2;i++){
                if(input%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(input+" ");
            }
        }
    }
}
