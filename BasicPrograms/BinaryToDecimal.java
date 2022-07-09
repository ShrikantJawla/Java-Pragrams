package BasicPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int lastdigit =0;
        int sum=0;
        int j=1;
        System.out.println("Enter a binary number: ");
        int num = as.nextInt();
        int numofdigits = findNumberOfDigits(num);
//        while (num > 0) {
//         lastdigit = num%10;
//         sum+= lastdigit*j;
//         j*=2;
//         num/=10;
//        }

//        Second way to write the same condition using for loop and using Math.pow function.
        for (int i = 0; i <= numofdigits; i++) {
            lastdigit = num%10;
            if (lastdigit == 1) {
                sum += Math.pow(2, i);
            }
            num/=10;
        }

        System.out.println("The Decimal number: "+ sum);
        }

    public static int findNumberOfDigits(int num) {
        int lastdigit =0;
        int i=0;
        while (num > 0) {
            lastdigit = num%10;
            num/=10;
            i++;
        }
        return  i;
    }
}
