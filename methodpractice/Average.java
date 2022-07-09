
import java.util.Scanner;

public class Average {

    public static float average(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter three numbers to get the average: ");
        int a = as.nextInt();
        int b = as.nextInt();
        int c = as.nextInt();

        System.out.println("The average is: " + average(a, b, c));
    }
}
