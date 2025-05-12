package PracticeTest.May;

public class Lab12May25_GenericSorting {
    public static <T extends Comparable <T>> void sort(T[] n, int size){
        int i,j;
        T t;
        for (i=0;i<=size-2;i++){
            for(j=i+1;j<=size-1;j++){
                if(n[i].compareTo(n[j])>0){
                    t=n[i];
                    n[i]=n[j];
                    n[j]=t;

                }
            }
        }
    }

    public static void main(String[] args) {
        Float num[] = {5.4f,3.2f, 2.15f,1.09f,34.66f};
        Integer arr[]= {-12,23,14,0,245,78,66,-9};
        int i;
        sort(num, 5);
        for (i=0;i<4;i++)
            System.out.print(num[i] + " ");
        System.out.println();
        sort(arr, 8);
        for(i=0;i<7;i++)
            System.out.print(arr[i]+ " ");


    }
}
