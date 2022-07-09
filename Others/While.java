import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner as = new Scanner (System.in);
      System.out.print
      ("Tell me how many times you want to print a string: ");
    int a = as.nextInt ();
    int i = 1;
    while (i <= a)
      {
	System.out.println ("Hello how are you  " + i);
	i++;
      }
  }
}
