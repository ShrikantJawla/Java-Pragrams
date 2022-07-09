package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("\nSelect option:\n1. Add\n2. Remove\n3. Display\n4. Exit\n");
            System.out.println("Your choice: ");
            int n=as.nextInt();
            if (n == 1) {
                System.out.println("Enter the number you want to add: ");
                numbers.add(as.nextInt());
                System.out.println("Added.");
                continue;
            } else if (n == 2) {
                System.out.println("Enter the number you want to remove: ");
                int r= as.nextInt();
                if (numbers.contains(r)) {
                    numbers.remove(Integer.valueOf(r));
                    System.out.println("Removed.");
                    continue;
                } else {
                    System.out.println("Number not present in the list.");
                    continue;
                }

            } else if (n == 3) {
                System.out.println("Your list: "+numbers);
                continue;
            } else if (n == 4) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Wrong option. ");
                continue;
            }
        }
    }
}
