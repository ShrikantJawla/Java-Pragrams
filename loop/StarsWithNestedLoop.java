package loop;

import java.util.Scanner;

public class StarsWithNestedLoop {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		System.out.println("Enter a number to display astrisk': ");
		int a= ag.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

	}
	}

}
