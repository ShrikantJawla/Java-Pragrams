import java.util.Arrays;
import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 numbers with spaces in between them");
        int [] arr= new int[5];
        for(int i=0,j=1; i<5; i++,j++){
            System.out.println("Enter "+j+"st number:");
            arr[i]= sc.nextInt();
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
