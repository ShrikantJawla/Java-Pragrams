package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOddWithoutMethod {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter length of String: ");
        int n = as.nextInt();
        int[] array = new int[n];
        int[] temp = new int[n];
        int j = 0;
        int k = array.length-1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number: ");
            array[i]= as.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp[j++] = array[i];
            } else {
                temp[k--] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
        System.out.println(Arrays.toString(array));

    }
}
