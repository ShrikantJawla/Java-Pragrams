package loop;
import java.util.Scanner;
public class CheckPrimeWithMethods {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=ag.nextInt();
		int b=ag.nextInt();
		primebetween(a,b);
	}
	
	public static boolean isprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		
		return true;

}
	
	public static void primebetween(int from, int to) {
		for(int i=from;i<=to;i++) {
			if(isprime(i))
				System.out.print(i + " ");
		}
	}
}
