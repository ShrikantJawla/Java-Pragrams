package loop;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner as=new Scanner(System.in);
		System.out.print("Enter a number upto you want to show fibonacci series: ");
		int n= as.nextInt();
		int a=1;
		int b=1;
		int result=0;
		System.out.print(a +" "+ b + " ");
		
		for(int i=1;i<=(n-2);i++) {
			result=a+b;
			a=b;
			b=result;
			System.out.print(result+" ");
		}

		System.out.print(" Sum is: "+result);
	}

}
