package method;

import java.awt.*;

public class CircleClass {
    Point center;
    double radius;

    CircleClass(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    CircleClass(){}

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setCenter(Point center) {
        this.center = center;
    }

    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
