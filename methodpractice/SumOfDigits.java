//Here I defined two ways to get sum of digits of any numbers using method:

package methodpractice;

import java.util.Scanner;

public class SumOfDigits {

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

//    public static int getSumWay2(int num) {
//        int sum=0;
//        while (num > 0) {
//            sum+= num%10;
//            num/=10;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter a number to get the sum of digits: ");
        int num= as.nextInt();

        System.out.println("sum is: "+ getSumOfDigits(num));
//        System.out.println("Sum is: "+ getSumWay2(num));
    }
}
