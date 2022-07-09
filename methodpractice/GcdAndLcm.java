package methodpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class GcdAndLcm {

    public static int findGcd(int a, int b) {
        int dividend= 0;
        int divisor= 0;
        int r=1;
        if(a>b) {
            dividend = a;
            divisor= b;
        }
        else {
            divisor = a;
            dividend = b;
        }
        while (true) {
            r = dividend % divisor;
            if (r == 0) {
                return divisor;
            }
            dividend = divisor;
            divisor=r;
        }
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a= as.nextInt();
        int b= as.nextInt();

        System.out.println("HCF is:"+ findGcd(a,b));
        System.out.println("LCM is: "+ findLcm(a,b));
    }

    public static int findLcm(int a, int b) {
       int largest =0;
        largest = a > b ? a : b;
        while (true) {
            if (largest % a == 0 && largest % b == 0) {
                return largest;
            }
            largest++;
        }
    }
}
