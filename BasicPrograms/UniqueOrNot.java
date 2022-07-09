package BasicPrograms;
import java.io.*;
import java.util.*;

public class UniqueOrNot {

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        String s = as.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    sum += 1;
            }
        }
        if (sum >= 1)
            System.out.print("NO");
        else if (sum == 0)
            System.out.print("Unique");

    }
}