package PracticeTest.Aug;

public class factorialCalculator
{
    public static void main(String[] args)
    {
        int num =5;
        int output = factorial(num);
        System.out.println(output);
    }
    public static int factorial(int num)
    {
        int result=1;
        for(int i=1 ;i<=num;i++)
        {
            result *=i;
        }
        return result;
    }
}
