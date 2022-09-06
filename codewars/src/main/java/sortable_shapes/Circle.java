package sortable_shapes;

import java.util.Map;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return radius * radius * Math.PI;
    }
}
