package BasicPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is palindrome or not: ");
        int num = as.nextInt();
        String s = String.valueOf(num);
        int i=0, j = s.length()-1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                System.out.println("Not Palindrome.");
                break;
            }
        }
        if (s.charAt(i++) == s.charAt(j--)) {
            System.out.println("Palindrome.");
        }
    }
}
