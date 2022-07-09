package twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DMethods {
    public static void main(String[] args) {
        int[][] number=getArray();
        printArray(number);
    }

    private static void printArray(int[][] array) {
        System.out.print(Arrays.deepToString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    private static int[][] getArray() {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r= as.nextInt();
        System.out.println("Enter number of columns:");
        int c= as.nextInt();
        int[][] array = new int[r][c];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter number: ");
                array[i][j]= as.nextInt();
            }
        }
//        int [][] array= {{1,2,3},{4,5,6,8,9},{3,4,5,6}};
        return array;
    }
}
