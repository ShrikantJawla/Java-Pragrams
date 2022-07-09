
import java.util.Scanner;

public class AreaOfTriangle {

    public static double areaOfTriangle(double a, double b, double c) {
        double s= (a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter three sides of a triangle: ");
        double a= as.nextInt();
        double b= as.nextInt();
        double c= as.nextInt();

        System.out.println("Area of the triangle is: "+ areaOfTriangle(a,b,c));
    }
}
