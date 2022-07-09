package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= as.nextInt();
        int r=0;
        ArrayList<Integer> num1 = new ArrayList<>();
        while (num >= 1) {
            r = num%2;
            num/=2;
            num1.add(r);
        }
        int s= num1.size();

//      [[[[[[[  First way to print by making an array and do swapping.]]]]]]]
//        int [] num2 = new int[num1.size()];
//        for (int i = 0; i < num1.size(); i++) {
//            num2[s-1] = num1.get(i);
//            s--;
//        }
//        for(int i=0 ; i<num1.size() ;i++)
//        System.out.print("Binary is: (");
//        for (int i = 0; i < num2.length; i++) {
//            System.out.print(num2[i]);
//        }
//        System.out.print(")2");

//        [[[[[[Second way to directly print arraylist starting from last.]]]]]]
        for (int i = s - 1; i >= 0; i--) {
            System.out.print(num1.get(i));
        }
    }
}
