import java.util.Scanner;
class Main {
	public static int positive(int num){
		if (num>0)
		return 1;
		else if (num<0)
		return 0;
		else
		return -1;
	}
	public static void main(String[] args) {
		Scanner as= new Scanner(System.in);
		int a = as.nextInt();
		int b = positive(a);
		switch(b) {
			case 0:
			System.out.print("Negative");
			break;
			case 1:
			System.out.print("Positive");
			break;
			default:
			System.out.print("Zero");
			break;
		}
	}

}
