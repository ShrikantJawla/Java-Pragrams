import java.util.Arrays;

public class multidimendionalArray {
    public static void main(String[] args) {
//        int [][] arr= new int[2][3];
//        arr[0][1]=2;
//        arr[0][2]=3;
//        arr[1][2]=4;
        int arr[][]={{23,34,3,35,45,45},{34,4,34,34,3,3,34,3,4}};
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[0].length; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i=0; i<arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
