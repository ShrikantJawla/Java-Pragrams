package array;

public class ArrayUsingMethods {
    public static void main (String[] args)
    {
        int[] num= {0,1};
        changeArray(num);
        printArray(num);
    }

    public static void changeArray(int n[]){
        n[0]=1;
        n[1]=2;
    }

    public static void printArray(int[] m) {
        for(int i=0;i<m.length;i++)
            System.out.print(m[i]+" ");
    }

}

