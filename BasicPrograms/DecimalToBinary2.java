package BasicPrograms;

import java.util.Scanner;

public class DecimalToBinary2 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= as.nextInt();
        int r = 0;

        int [] num1 = new int[100];
        int i=0;
        while (num >= 1) {
            r = num%2;
            num/=2;
            num1[i] = r;
            i++;
        }

        System.out.print("The binary number is: (");
        for (int j = i; j >= 0; j--) {
            System.out.print(num1[j]);
        }
        System.out.print(")2");
    }
}
