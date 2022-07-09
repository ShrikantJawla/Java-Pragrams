package loop;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args){
        Scanner ad= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=ad.nextInt();
        for(int i=1;i<=a;i++){
            for(int b=1;b<=a;b++)
                System.out.print("*");
            System.out.println();
        }

    }
}
