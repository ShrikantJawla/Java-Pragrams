import java.util.*;

public class checkKthBitIsSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number and value of K:");
        int num =sc.nextInt();
        int k=sc.nextInt();
        System.out.println(ckeckKthBit(num,k));;
    }

    private static boolean ckeckKthBit(int num, int k) {
        int i=1;
        i=i<<k;
        if((num&i)!=0){
            return true;
        }else{
            return false;
        }
    }
}
