package loop;
import java.util.Scanner;
public class ReverseOfString {

	public static void main(String[] args) {
		Scanner ag=new Scanner(System.in);
		System.out.print("Enter a String to get its reverse: ");
		String word=ag.nextLine();
		String reverse="";
		for(int i= word.length() - 1;i>=0;i--) {
			reverse+=word.charAt(i);
		}
		
		System.out.print(reverse);

	}

}
