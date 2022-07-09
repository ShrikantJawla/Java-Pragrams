package method;

import java.awt.*;

public class CallObject {
    public static void main(String[] args) {
        CircleClass hi = new CircleClass();  //This CircleClass constructor can be empty or take -
//        or it can be like this- CircleClass hi = new CircleClass(new Point(1,3),4); // - perimeter, depend on the CircleClass.

//        First way to pass values to attributes.
        hi.radius=3.6;
        hi.center = new Point(1, 3);

//        Second way to pass the value to attribute.
        hi.setCenter(new Point(1, 5));
        hi.setRadius(3.4);

        System.out.println(hi.center);
        System.out.println(hi.radius);
        System.out.println(hi.getPerimeter());
        System.out.println(hi.getArea());

    }
}
