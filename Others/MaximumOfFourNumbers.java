import java.util.Scanner;
class MaximumOfFourNumbers {
	public static void main (String[] args) {
    Scanner sg= new Scanner(System.in);
	int P= sg.nextInt();
	int Q= sg.nextInt();
	int R= sg.nextInt();
	int S= sg.nextInt();
	if(P>=Q && P>=R && P>=S)
	{	System.out.print(P);
	}
	else if(Q>=P && Q>=R && Q>=S)
	{	System.out.print(Q);
	}
	else if(R>=P && R>=Q && R>=S)
	{	System.out.print(R);
	}
	else
	{	System.out.print(S);
	}

	}
}
