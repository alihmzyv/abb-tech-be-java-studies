package sortable_shapes;

public class CustomShape extends Shape {
    private double area;

    public CustomShape(double area) {
        this.area = area;
    }

    @Override
    protected double getArea() {
        return area;
    }
}
