package loop;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		System.out.print("Enter a number or a word: ");
		String word=ad.nextLine();

		boolean yes=true;
		for(int i=0,j=word.length()-1;i<j;i++,j--) {
			if(word.charAt(i)==word.charAt(j)) {
				continue;
			}
			yes=false;
		}
		System.out.print(yes?"Plindrome":"Not Palindrome");

	}

}
