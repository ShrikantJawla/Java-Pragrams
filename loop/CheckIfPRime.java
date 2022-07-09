package loop;

import java.util.Scanner;

public class CheckIfPRime {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int n = as.nextInt();
        int sum=0;
        for (int i=2;i<=n/2;i++) {
            if (n % i == 0) {
                sum+=1;
                break;
            }
        }
        if (sum == 1) {
            System.out.println("Not Prime.");
        } else {
            System.out.println("Prime");
        }
    }
}
