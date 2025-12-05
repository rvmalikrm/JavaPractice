package PracticeTest.Dec2025;

public class Lab5Dec2025_MultiDArrays {
    public static void main(String[] args) {
        // Syntax :
//        int[][] arr;
//        int [][]arr2;
//        int arr3[][];
//        int []arr4[];

        // Number of elemetns in multi D array = rows * columns
        int[][] arr = new int[2][3]; // 2 Rows and 3 Columns
        // Array can store the data 2*3 = 6 elements

        arr[0][0] = 11;
        arr[0][1] = 22;
        arr[0][2] = 33;
        arr[1][0] = 44;
        arr[1][1] = 55;
        arr[1][2] = 66;

        // Print the elements of 2D array
        for (int i = 0; i < arr.length; i++) { // outer loop for rows
            for (int j = 0; j < arr[i].length; j++) { // inner loop for columns
                System.out.print(arr[i][j] + " ");

            }
        }
    }
}
