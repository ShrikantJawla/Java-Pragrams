package array;

import java.util.Arrays;
import java.util.Scanner;

public class TakeUserArray2 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 20: ");
        int a = as.nextInt();
        while (a < 0 || a > 20) {
            System.out.println("Wrong entry! try again: ");
            a = as.nextInt();
        }
        int[] n = new int[a];
        fillArray(n);
        printArray(n);
    }
    public static void fillArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("enter number ");
            Scanner af = new Scanner(System.in);
            n[i]= af.nextInt();
        }
    }

    public static void printArray(int[] n) {
        System.out.println("Entered numbers- "+ Arrays.toString(n));
    }
}
