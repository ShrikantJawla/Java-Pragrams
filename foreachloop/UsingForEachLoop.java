package foreachloop;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingForEachLoop {
    public static void main(String[] args) {
        int[] array = {45, 34, 57, 343, 787, 23, 34, 65, 57, 23};
        Arrays.sort(array);
        ArrayList<String> names = new ArrayList<>();
        names.add("Hello");
        names.add("How");
        names.add("are");
        names.add("you");
        names.add("hope");
        names.add("fine");
        for(String check : names )
            System.out.print(check+" ");

        System.out.println();
         int i=0;
        for(int num : array)
            System.out.println(num+" "+i++);
    }
}
