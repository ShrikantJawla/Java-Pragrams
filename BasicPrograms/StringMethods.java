package BasicPrograms;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = as.nextLine();
        int n= word.charAt(2);
        int letters =0, space =0, number =0, others =0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                letters++;
            } else if (Character.isDigit(word.charAt(i))) {
                number++;
            } else if (Character.isSpaceChar(word.charAt(i))) {
                space++;
            } else {
                others++;
            }
        }
        System.out.println("The String is:"+word);
        System.out.println("Letters are: "+ letters);
        System.out.println("Numbers are: "+ number);
        System.out.println("Spaces are: "+ space);
        System.out.println("Other Characters are: "+ others);
        System.out.println("The ascii value of third character is: "+ n);
        }
    }
