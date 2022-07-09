import java.util.Scanner;

public class printMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to find multiplication table of that of that number:");
        int num=sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+": "+i*num);
        }
    }
}
