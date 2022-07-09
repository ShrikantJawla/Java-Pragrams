package twodimensionalarray;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array= {{2,3,4},{5,6,4},{23,4,6}};
        int sum1=0;
        System.out.println("Sum of Rows:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum1+=array[i][j];
            }
            System.out.println("Sum of Row "+(i+1)+" "+ sum1);
            sum1=0;
        }
        System.out.println(" \n Sum of Columns:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum1+=array[j][i];
            }
            System.out.println("Sum of Column "+(i+1)+" "+ sum1);
            sum1=0;
        }
    }
}
