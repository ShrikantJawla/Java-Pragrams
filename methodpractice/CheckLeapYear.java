package methodpractice;

import java.util.Scanner;

public class CheckLeapYear {

    public static boolean checkLeap(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 100 != 0  && year % 400 != 0 && year % 4 == 0) {
            return true;
        } else {
        }
            return false;
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = as.nextInt();

        boolean isrime = checkLeap(num);
        if (isrime == true) {
            System.out.println("Wow! Year is Prime.");
        } else
            System.out.println("Oops! Year is not prime.");
    }
}
