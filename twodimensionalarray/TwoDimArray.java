//This is way to declare and initialise two-dimensional array.

package twodimensionalarray;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
//        int[][] array= new int[3][3];
//        array[0][0]=2;
//        array[0][1]=3;
//        array[0][2]=4;
//        array[1][0]=5;
//        array[1][1]=4;
//        array[1][2]=9;
//        array[2][0]=4;
//        array[2][1]=7;
//        array[2][2]=6;
//        System.out.println(Arrays.deepToString(array));
//        System.out.print(array[0][0]+" ");
//        System.out.print(array[0][1]+" ");
//        System.out.print(array[0][2]+" ");
//        System.out.print(array[1][0]+" ");
//        System.out.print(array[1][1]+" ");
//        System.out.print(array[1][2]+" ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

        int[][] numbers={{2,3,4,5},{10,5,6,7}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
