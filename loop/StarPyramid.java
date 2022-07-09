package loop;
import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args){
        Scanner ag= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= ag.nextInt();
        for(int i=1;i<=n;i++) {
            if (i == n) {
                for (int h = 1; h <= (2 * n) - 1; h++)
                    System.out.print("*");
            }
            else {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                System.out.print("*");
                for (int k = 2;k<=(i*2)-2;k++)
                    System.out.print(" ");
                if(i>=2)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
