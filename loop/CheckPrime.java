package loop;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner as= new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
		int n= as.nextInt();
		int b=0;
		for(int i=1;i<=(n/2);i++) {
			if(n%i==0){
				b+=i;
			}
		}
		
		if(b==1)
			System.out.print("Prime");
		
		else
			System.out.print("Not Prime");

	}

}
