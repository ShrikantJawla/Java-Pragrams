package BasicPrograms;

import java.util.Arrays;

public class SwappingInArray {
    public static void main(String[] args) {
        int[] num1 = {12, 54, 78, 35, 15, 65, 12, 78, 35, 15};
        int[] num2 = new int[num1.length];

        num2[0] = num1[num1.length - 1];
        num2[num1.length-1] = num1[0];
        for (int i = 1; i < num1.length - 1; i++) {
            num2[i] = num1[i];
        }
        System.out.println("The first array: "+ Arrays.toString(num1));
        System.out.println("The second array: "+Arrays.toString(num2));
    }
}
