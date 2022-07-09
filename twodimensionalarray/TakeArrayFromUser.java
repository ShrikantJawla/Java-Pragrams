package twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class TakeArrayFromUser {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
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
        System.out.println("Array is: "+Arrays.deepToString(array));
    }
}
