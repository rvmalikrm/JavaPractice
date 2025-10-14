// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//PrimeNumber
package PracticeTest.Oct;
class Lab14Oct25_PrimeNumberTill100 {
    public static void main(String[] args) {
        for(int input=2;input<=100;input++)
        {
            boolean isPrime=true;
            for(int num=2;num<=input/2;num++)
            {
                if(input%num==0)
                {
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(input+ " ");
            }
        }
    }
}