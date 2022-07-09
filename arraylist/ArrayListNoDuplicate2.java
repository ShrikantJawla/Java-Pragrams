package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListNoDuplicate2 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the length of the array: ");
        int n = as.nextInt();
        System.out.print("Enter "+n+" numbers: " );
        for (int i = 0; i < n; i++) {
            int temp = as.nextInt();
            if (!(numbers.contains(temp))) {
                numbers.add(temp);
            }
        }
        Collections.sort(numbers);
        System.out.print("Resulted array in ascending order: "+numbers);
    }
}
