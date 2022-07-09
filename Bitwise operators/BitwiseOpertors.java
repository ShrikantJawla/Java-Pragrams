import java.util.Scanner;

public class BitwiseOpertors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        System.out.println(powerOfTwo(num));
    }

    public static boolean powerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        }
        return false;
    }
}
