package sortable_shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
    abstract protected double getArea();

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }
        else if (this.getArea() == o.getArea()) {
            return 0;
        }
        else {
            return - 1;
        }
    }
}
