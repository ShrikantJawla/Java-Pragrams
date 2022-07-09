package array;
import java.util.Scanner;
public class ArraySumProdAvg {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        int sum =0;
        int pro =1;
        float avg =0;
        System.out.println("Enter how many numbers you wants to enter: ");
        int n=as.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter number: ");
            a[i]=as.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            pro*=a[i];
        }
            avg=(float)sum/n;
        System.out.println("sum= "+sum+", "+"product= "+pro+", "+"Average= "+avg);
    }
}
