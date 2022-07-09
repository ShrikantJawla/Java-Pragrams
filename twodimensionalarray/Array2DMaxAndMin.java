package twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DMaxAndMin {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = as.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = as.nextInt();
        int[][] array = new int[n][c];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a num: ");
                array[i][j]=as.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
//        int max=array[0][0];
//        int min=array[0][0];
        for (int i = 0; i < array.length; i++) {
            int max=array[i][0];
            int min=array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                } else if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println("Max of Rows "+(i+1)+": " + max);
            System.out.println("Min of Rows "+(i+1)+": " + min);
            System.out.println();
        }
    }
}
