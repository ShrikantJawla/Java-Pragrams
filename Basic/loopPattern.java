import java.util.Scanner;

public class loopPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a new number:");
        int num= sc.nextInt();
        int a=num;
        for(int i=1; i<=num; i++){
            for (int j=1; j<=a; j++){
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
