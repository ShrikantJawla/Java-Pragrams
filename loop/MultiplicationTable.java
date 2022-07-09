package loop;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner ad= new Scanner(System.in);
		System.out.print("Enter a number you want to print a multiplication table upto: ");
		int a= ad.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println();
		}

	}

}
