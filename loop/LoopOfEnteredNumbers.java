package loop;
import java.util.Scanner;
public class LoopOfEnteredNumbers {

	public static void main(String[] args) {
		Scanner ag=new Scanner(System.in);
		System.out.print("Enter a positive value: ");
		int a= ag.nextInt();
		int max=a;
		int min=a;
		if(a>=0) {
			while(true) {
			System.out.print("Enter a positive value: ");
			int b=ag.nextInt();
			
			if(b<0)
				break;
			else if(b>=max) {
				max=b;
				continue;
			}
			else if(b<=min && b>0) {
				min=b;
				continue;
			}
			}
			System.out.print("Max= "+max +"min= "+min);
		}
		
		else
			System.out.print("Entered negative value run the program again.");
	}
}
