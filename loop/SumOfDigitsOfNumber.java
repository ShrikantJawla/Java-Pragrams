package loop;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static int getSumOfDigits(int num) {
        int sum=0;
        int last= num;
        int i=1;
        while (last>0) {
            sum += (num / i) % 10;
            last/=10;
            i*=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter a number to get the sum of digits: ");
        int num= as.nextInt();

        System.out.println("sum is: "+ getSumOfDigits(num));
    }
}
