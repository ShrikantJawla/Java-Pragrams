package array;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter: ");
        int num= sd.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number: ");
            array[i] = sd.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Min= "+array[0]+", Max= "+array[array.length-1]);
    }
}
