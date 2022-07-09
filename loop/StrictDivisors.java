package loop;
import java.util.Scanner;
public class StrictDivisors {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		int p=0;
		System.out.print("Enter a number to know the sum of the strict divisiors of the same: ");
		int n= ag.nextInt();
		for(int i=1;i<=(n/2);) {
			if(n%i==0)
				p+=i;
			i++;
		}
		System.out.print(p+" is sum of all the strict divisors of the entered number.");
	}

}
