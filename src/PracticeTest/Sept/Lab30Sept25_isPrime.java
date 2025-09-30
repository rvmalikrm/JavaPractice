package PracticeTest.Sept;
public class Lab30Sept25_isPrime
{
    public static void main(String[] args)
    {
        for(int input=2;input<=100;input++)
        {
            boolean isPrime = true;
            for (int i = 2; i <= input / 2; i++)
                {
                    if (input % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    {
                        System.out.println(input + " is a prime number.");
                    }
        }
    }
}
