package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListNoDuplicate {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int s=0;

        //        Here I have taken the array length from user
        System.out.println("Enter the length of string: ");
        int n = as.nextInt();

        //        here took the string from the user
        int[] array = new int[n];
        System.out.print("Enter "+n+" number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = as.nextInt();
        }
        System.out.println("Array's length: "+array.length+"\nEntered array: "+Arrays.toString(array));

//        Assigned the array in arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

//        Check the duplicate and remove it
            for (int i = 0; i < array.length; i++) {
                for (int j = (i+1); j < array.length; j++) {
                    if (array[i] == array[j]) {
                        s+=1;
                        break;
                    }
                }
                if(s==0)
                    numbers.add(array[i]);
                s=0;
            }
        System.out.print("\n"+ numbers);
        System.out.println();
        Collections.sort(numbers);
        System.out.print(numbers);
    }
}
