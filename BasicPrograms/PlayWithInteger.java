package BasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PlayWithInteger {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = as.nextInt();
        System.out.println("The value of n+nn+nnn: "+num+" + "+num+num+" + "+num+num+num);
        System.out.printf("%d + %d%d + %d%d%d\n",num, num, num, num, num, num);
    }
}
