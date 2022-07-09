package methodpractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckEvenOdd {

    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = as.nextInt();

        boolean ifeven = checkEven(num);
        if (ifeven == true) {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
