package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LoopInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(289);
        numbers.add(267);
        numbers.add(56);
        numbers.add(45);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }

//        Sorting of ArrayList and Arrays
        Collections.sort(numbers);
        System.out.println();
        System.out.println(numbers);

        int[] array = {12, 56, 75, 32, 12, 05, 78, 95, 26};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));



    }
}
