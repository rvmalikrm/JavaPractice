package PracticeTest.May;

public class Lab19May25_SortTestPriorities {
    public static void main(String[] args) {
        int[] priorities = {2, 0, 2, 1, 1, 0};
        sortPriorities(priorities);
        System.out.print("Sorted Priorities ");
        for ( int var: priorities){
            System.out.print(var+" ");
        }
    }
    public static void sortPriorities(int[] arr){
        int low=0, mid=0, high= arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    // Swap arr[low] and arr[mid] , move both forword
                    int temp0= arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high] , move high backward
                    int temp2= arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;
            }
        }
    }
}
