import java.util.Scanner;

public class cbseBoardPer {
    public static void main(string[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks in english");
        float marks1=sc.nextInt();
        System.out.println("Enter marks in Maths");
        float marks2=sc.nextInt();
        System.out.println("Enter marks in Hindi");
        float marks3=sc.nextInt();
        float res=(marks1+marks2+marks3)/3;
        System.out.println("Your percentage is:"+res);
    }
}
