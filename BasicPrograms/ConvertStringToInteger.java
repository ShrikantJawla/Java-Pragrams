package BasicPrograms;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a Number(String) to change it to integer: ");
        String word = as.nextLine();
        int num = Integer.valueOf(word);
        System.out.println(num);
    }
}
