import java.util.Scanner;
class Main {
	public static void main(String[] args);
	Scanner as = new Scanner(System.in);
	char a= as.next().charAt(0);
	char b= as.next().charAt(0);
	if ((a=='R') || (b=='R'))
	System.out.print("R");
	if else ((a=='J') || (b=='B') || (a=='B') || (b=='J'))
	System.out.print("B");
	if else ((a=='J') || (b=='M') || (a=='M') || (b=='J'))
	System.out.print("M");
	if else ((a=='J') || (b=='S') || (a=='S') || (b=='J'))
	System.out.print("S");
	else
	System.out.print("D");
}
