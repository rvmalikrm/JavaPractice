package PracticeTest.Oct;

public class Lab6Oct25_PrimeNumbersfrom0to100 {
    public static void main(String[] args) {
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
