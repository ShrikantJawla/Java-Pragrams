package loop;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner as=new Scanner(System.in);
		System.out.print("Enter a number to know the sum of its digits: ");
		int a= as.nextInt();
		int sum=0;
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		System.out.print("sum: "+sum);
	}

}
