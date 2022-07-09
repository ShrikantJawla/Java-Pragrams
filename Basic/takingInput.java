import java.util.Scanner;
public class takingInput {
    public static void main(string[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two entered numbers:"+sum);
    }
}
