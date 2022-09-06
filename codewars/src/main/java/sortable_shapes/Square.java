package sortable_shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    protected double getArea() {
        return side * side;
    }
}
