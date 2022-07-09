package methodpractice;

import java.util.Scanner;

public class SmallestAmongThree {

    public static int getSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter three values to find smallest amoung them: ");
        int a= as.nextInt();
        int b= as.nextInt();
        int c= as.nextInt();

        System.out.println("the smallest amoung them: " + getSmallest(a, b, c));
    }
}
