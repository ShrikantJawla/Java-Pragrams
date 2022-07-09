
import java.util.Scanner;

public class CountVowels {

    public static int countVowel(String word) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                sum1 += 1;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                sum2 += 1;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'o' || word.charAt(i) == 'O') {
                sum3 += 1;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'i' || word.charAt(i) == 'I') {
                sum4 += 1;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                sum5 += 1;
            }
        }

        return sum1 + sum2 + sum3 + sum4 + sum5;
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a word or a line to know the number of vowels in it: ");
        String word = as.nextLine();

        System.out.println("Number of vowels are: " + countVowel(word));
    }
}
