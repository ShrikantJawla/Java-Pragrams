package loop;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner ag=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= ag.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
