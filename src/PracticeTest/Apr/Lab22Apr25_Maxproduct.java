package PracticeTest.Apr;

public class Lab22Apr25_Maxproduct
{
    public static void main(String[] args)
    {
        int[] input= {-1, 2, 4, -2, 6, -5};
        System.out.println("Maximum product of the Array Items is "+maxofproduct(input));
    }
    public static int maxofproduct(int[] numbers)
    {
        if(numbers.length<2)
        {
            System.out.println(" Array must contains atlest two numbers");
        }
        int max1=Integer.MIN_VALUE, max2= Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE, min2= Integer.MAX_VALUE;
        for(int num :numbers)
        {
            if(num>max1)
            {
                max2=max1;
                max1=num;
            }
        }
        for(int num:numbers)
        {
            if(num<min1)
            {
                min2=min1;
                min1=num;
            }
        }
        int maxprod= max1*max2;
        int minprod= min2*min1;
        int prodmaz=Math.max(maxprod,minprod);
    return prodmaz;
    }
}
