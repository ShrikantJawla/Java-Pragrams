import java.util.Scanner;
class LuckeyNumber
{
  public static void main (String[]args)
  {
    Scanner sg = new Scanner (System.in);
      System.out.print ("Enter a four digit number: ");
    int num = sg.nextInt ();
    //abcd
    if (!(num > 999 && num < 10000))
        System.out.print (num + " is not a four digit number.");
    else
      {
	int d = (num % 10);
	int c = (num / 10) % 10;
	int b = (num / 100) % 10;
	int a = (num / 1000) % 10;

	if (a + b == c + d)
	  System.out.print ("Luckey");

	else
	    System.out.print ("Unlucky");
      }
  }
}
