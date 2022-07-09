package loop;
import java.util.Scanner;
public class ReadCharactorsInString {

	public static void main(String[] args) {
		Scanner ag= new Scanner(System.in);
		System.out.print("Enter a String: ");
		String word= ag.nextLine();
		int p= word.length();
		for(int i=0;i<=p-1;i++) {
			System.out.print(word.charAt(i)+" ");
		}
		System.out.print("\n Length of String is: "+p);

	}

}
