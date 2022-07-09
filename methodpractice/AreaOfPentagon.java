package methodpractice;

import java.util.Scanner;

public class AreaOfPentagon {

    public static double pentagonArea(int side) {
        double area = 5*((Math.sqrt(3)/4)*side*side);
        return area;
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter the side of pentagon: ");
        int side = as.nextInt();

        System.out.println("Area is: "+ pentagonArea(side));
    }
}
