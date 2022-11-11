import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Scanner scanner) {
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    static double area(int radius){
        return PI * (radius * radius);
    }

    static double circumference(int radius){
        return PI * (2 * radius);

    }

    @Override
    public String toString() {
        return "Circle radius: " + radius +
                "\narea: " + area(radius) +
                "\ncircumference: " + circumference(radius);
    }

}
