package august222.collections.interfaces;

import java.lang.reflect.Type;
import java.util.*;

public class CollectionsCoreInterfacesDemo {
    public static void main(String[] args) {
        Shape shape1 = new Shape(Color.GREEN, "circle");
        Shape shape2 = new Shape(Color.YELLOW, "triangle");
        Shape shape3 = new Shape(Color.RED, "square");
        List<Shape> shapesCollection = new ArrayList<>();
        shapesCollection.add(shape1);
        shapesCollection.add(shape2);
        shapesCollection.add(shape3);
        shapesCollection.add(shape1);
        Set<Shape> noDups = new HashSet<>(shapesCollection);
        for (Shape shape: noDups) {
            System.out.println(shape);
        }
    }
}

class Shape {

    //fields
    private Color color;
    private String name;

    //constructors
    public Shape(Color color, String name) {
        this.color = color;
        this.name = name;
    }


    //getter and setters
    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Color : %s", name, color.name());
    }
}

enum Color {
    RED,
    GREEN,
    YELLOW;
}
