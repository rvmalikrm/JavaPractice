package PracticeTest.Jan;

public class Lab24Jan25_Array_printonlyeven_values {
    public static void main(String[] args) {
        int[] arr2= {1,2,3,4,5,6,7,8,9,10,12,34,45,67,78,97,122,123};
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]%2==0)
            {
                System.out.println(arr2[i]);
            }
        }
    }
}
