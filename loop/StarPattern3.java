package loop;
import java.util.Scanner;
public class StarPattern3 {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= as.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int k=1;k<=n;k++)
                    System.out.print("*");
            }
            else{
                System.out.print(" ");

                for(int d=1;d<=n-2;d++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
