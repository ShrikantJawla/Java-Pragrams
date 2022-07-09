package loop;
import java.util.Scanner;
public class AdditionLoop {

	public static void main(String[] args) {
		Scanner ad= new Scanner(System.in);
		int i=0;
		for( ;i<100; ) {
			System.out.print("Enter a value until sum gets to zero: ");
			i+= ad.nextInt();
		}
		System.out.print("Total is: "+i+ " Done");

	}

}


//or else I can use this code
//int sum=0;
//while(true){
//System.out.print("Enter a number: ");
//sum+= ad.nextInt();

//if(sum>100)
//	break;
//}
