package method;
import java.util.Scanner;
public class Method1 {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String n= ag.nextLine();
		System.out.println(name(n));
		System.out.println("Enter your age: ");
		int a= ag.nextInt();
		System.out.println(age(a));
	}
	
	public static String name(String n) {
		return n;
	}
	
	public static int age(int a) {
		return a;
	}

}
