package methodpractice;

import java.util.Scanner;

public class CountWords {

    public static int getWords(String word) {
        return word.length();
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a  word to print length of that word: ");
        String word= as.nextLine();

        System.out.println("Length of the entered word is: "+ getWords(word));
    }
}
