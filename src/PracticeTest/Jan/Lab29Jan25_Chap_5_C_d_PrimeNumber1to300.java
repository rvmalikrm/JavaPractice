package PracticeTest.Jan;

public class Lab29Jan25_Chap_5_C_d_PrimeNumber1to300
{
    public static void main(String[] args)
    {
        boolean prime;
        for(int num=1;num<=300;num++ )
        {
            if(num==1)
            {
                System.out.println("1 is neither prime nor composite");
                continue;
            }
            prime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        if(prime){
            System.out.println(num);

        }
        }


    }
}


