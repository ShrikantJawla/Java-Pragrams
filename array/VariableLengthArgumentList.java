package array;

import java.util.Arrays;

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        int a= sum(12,45,25,41,32,-47,56,21);
        System.out.println(a);

        System.out.println(sum(12,45,36,12,-98,45,56));

        int[] b= {12,56,23,14,34};
        System.out.println(sum(b));

    }

    public static int sum(int... num) {
        int sum=0;
        for(int i=0;i<num.length;i++)
            sum+=num[i];
        return sum;
    }
}
