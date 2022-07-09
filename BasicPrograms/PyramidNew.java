package BasicPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PyramidNew {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int num = as.nextInt();
        int sum =0;
        int n=0;
        for(int j=1; j<100; j++){
            for (int k = 1; k <= j; k++) {
                sum+=k;
            }
            if(sum >= num)
                break;
            n++;
        }
        System.out.println(n);
    }
}
