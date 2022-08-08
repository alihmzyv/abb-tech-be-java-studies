package august822.QueueDemo;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("A", 1, 2);
        Rectangle rectangle1 = new Rectangle("A", 2, 2);
        Rectangle rectangle2 = new Rectangle("B", 2, 2);
//        PriorityQueue<Rectangle> rectangleQueue = new PriorityQueue<>(Arrays.asList(rectangle, rectangle1, rectangle2, rectangle));
////        System.out.println(rectangleQueue.offer(rectangle));
//        Iterator<Rectangle> rectangleIterator = rectangleQueue.iterator();
//        while (rectangleIterator.hasNext()) {
//            System.out.println(rectangleIterator.next());
//        }
//        System.out.println(rectangleQueue);


//        Queue<Rectangle> integerQueue = new PriorityQueue<>(Arrays.asList(rectangle, rectangle1, rectangle2));
//        System.out.println(integerQueue);
        List<Rectangle> rectangleList = Arrays.asList(rectangle1, rectangle2, rectangle, rectangle2);
        Collections.sort(rectangleList, Collections.reverseOrder());
        System.out.println(Collections.binarySearch(rectangleList, rectangle));
        System.out.println(rectangleList);

//        Set<Rectangle> rectangleSet = new TreeSet<>(Arrays.asList(rectangle, rectangle1, rectangle2));
//        rectangleSet.add(rectangle2);
//        System.out.println(rectangleSet);
    }
}

class Rectangle implements Comparable<Rectangle>{
    String name;
    int width;
    int length;

    public Rectangle(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return width * length;
    }

    @Override
    public int compareTo(Rectangle o) { //1)alphabetical order by names, 2)area, 3) length, 4) width
        int result = name.compareTo(o.name);
//        if (result == 0) {
//            result = this.getArea() - o.getArea();
//        }
        if (result == 0) {
            result = this.length - o.length;
        }
        if (result == 0) {
            result = this.width - o.width;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, width = %d, length = %d", name, width, length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && length == rectangle.length && Objects.equals(name, rectangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length);
    }
}
