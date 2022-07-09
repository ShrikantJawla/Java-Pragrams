package array;
import java.util.Arrays;
public class ArraySortingAndFilling {
    public static void main(String[] args) {
        int[] num = {23,5,42,12,2,32,18,96};
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
        System.out.println();
        System.out.println(Arrays.toString(num));

        char[] c= {'b','v','s','a','b','m'};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
        System.out.println();

        int[] unicode= {'b','v','s','a','b','m'};
        Arrays.sort(unicode);
        System.out.println(Arrays.toString(unicode));

        int[] n={12,56,14,23,78,20,14,24};
        Arrays.sort(n,0,4);
        System.out.println(Arrays.toString(n));

        String[] as= {"asd","cfg","nhg","nyu"};
        Arrays.sort(as);
        System.out.println(Arrays.toString(as));

//        How to fill arrays?

        int[] a= new int[10];
        int[] b= new int[10];
        Arrays.fill(a,45);
        System.out.println(Arrays.toString(a));

        Arrays.fill(b,2,6,25);
        System.out.println(Arrays.toString(b));

        String[] s= new String[8];
        Arrays.fill(s,"Hello");
        System.out.println(Arrays.toString(s));
    }
}
