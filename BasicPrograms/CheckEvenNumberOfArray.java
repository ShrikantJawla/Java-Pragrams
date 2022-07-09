package BasicPrograms;

import java.util.Arrays;

public class CheckEvenNumberOfArray {
    public static void main(String[] args) {
        int[] num1 = {12, 24, 36, 15, 23, 45, 78, 98, 45, 26, 45, 12, 10, 89, 48, 84};
        int even =0;
        int odd =0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] % 2 == 0) {
                even++;
            }
            else
                odd++;
        }
        System.out.println("The Array is: "+Arrays.toString(num1));
        System.out.println("The length of the array is: "+ num1.length);
        System.out.println("Even numbers in the String are: "+ even);
        System.out.println("Odd numbers in the String are: "+ odd);
    }
}
