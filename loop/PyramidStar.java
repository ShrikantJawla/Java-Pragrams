package loop;
import java.util.Scanner;
public class PyramidStar {

	public static void main(String[] args) {
		Scanner ad= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= ad.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
