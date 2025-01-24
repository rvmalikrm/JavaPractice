package PracticeTest.Jan;

public class Lab24Jan25_Arrayusingforloop {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=9;
        a[1]=8;
        a[2]=7;
        a[3]=5;
        a[4]=3;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int[] arr2= {2,4,6,8,9,12,15,34};
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println("Second Array's value  at index "+i+ " is " +arr2[i]);
        }

    }
}
