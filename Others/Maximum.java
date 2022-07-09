// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner ag= new Scanner(System.in);
        int a= ag.nextInt();
        int b= ag.nextInt();
        int c= ag.nextInt();
        if(a>=b && a>=c)
            System.out.print(a);
        else if(b>=a && b>=c)
            System.out.print(b);
        else
            System.out.print(c);
    }
}
