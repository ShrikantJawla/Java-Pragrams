package methodpractice;

import java.util.Scanner;

public class PrimeNumber {

    public static void prime(int num) {
        System.out.print("1, 2, ");
        int s=0;
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    s+=1;
                    break;
                }
            }
            if(s==0)
            System.out.print(i+", ");
            s=0;
        }
        }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number upto that you want to know prime number: ");
        int num= as.nextInt();
        prime(num);
    }
    }
