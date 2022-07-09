package array;
import java.util.Scanner;
public class FindOccurrenceArray {
    public static void main(String[] args) {
        Scanner ag= new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        System.out.println("Enter Array length: ");
        int num = ag.nextInt();
        int[] array = new int[num];
        for (int n = 0; n < array.length; n++) {
            System.out.println("Enter number: ");
            array[n]=ag.nextInt();
        }
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < 10; l++) {
                if (array[k] == 1) {
                    a += 1;
                    break;
                }
                else if (array[k] == 2) {
                    b += 1;
                    break;
                }
                else if (array[k] == 3) {
                    c += 1;
                    break;
                }
                else if (array[k] == 4) {
                    d += 1;
                    break;
                }
                else if (array[k] == 5) {
                    e += 1;
                    break;
                }
                else if (array[k] == 6) {
                    f += 1;
                    break;
                }
                else if (array[k] == 7) {
                    g += 1;
                    break;
                }
                else if (array[k] == 8) {
                    h += 1;
                    break;
                }
                else if (array[k] == 9) {
                    i += 1;
                    break;
                }

            }
        }
        System.out.println("1 occurs "+a+" time");
        System.out.println("2 occurs "+b+" time");
        System.out.println("3 occurs "+c+" time");
        System.out.println("4 occurs "+d+" time");
        System.out.println("5 occurs "+e+" time");
        System.out.println("6 occurs "+f+" time");
        System.out.println("7 occurs "+g+" time");
        System.out.println("8 occurs "+h+" time");
        System.out.println("9 occurs "+i+" time");
    }
}
