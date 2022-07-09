package loop;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		System.out.print("Enter a number you want display even numbers upto: ");
		int a= ag.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2==0)
				continue;
				System.out.print(i+" ");
		}

	}

}
