//This program prints an array by taking inputs from users.

package array;
import java.util.*;
public class TakeUserArray {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Mention how many numbers you want to Enter: ");
        int n= as.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Wrong entry! should be between 1 to 20. Enter again: ");
                n = as.nextInt();
            }
            int[] a = new int[n];
        for (int l = 0; l < a.length; l++) {
            System.out.println("enter number: ");
            a[l] = as.nextInt();
        }
        System.out.println("Entered numbers are: " + Arrays.toString(a));
    }
    }
