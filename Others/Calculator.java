import java.util.Scanner;
class Calculator {
  public static void main(String[] args) {
    Scanner ag= new Scanner(System.in);
    System.out.print("Enter first number: ");
    double a= ag.nextDouble();
    System.out.print("Enter operator: ");
    char s= ag.next().charAt(0);
    System.out.print("Enter second number: ");
    double c= ag.nextDouble();
    if(s == '+')
    System.out.print((int)(a+c));
    else if(s == '-')
    System.out.print((int)(a-c));
    else if(s == '*')
    System.out.print((int)(a*c));
    else if(s == '/')
    System.out.print(a/c);
    }
}
