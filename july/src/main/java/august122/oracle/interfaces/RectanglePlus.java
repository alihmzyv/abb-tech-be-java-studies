//package august122.oracle.interfaces;
//
//public class RectanglePlus
//    implements Relatable {
//
//    public static void main(String[] args) {
//        System.out.println(findLargest(new RectanglePlus(new Point(1, 1), 1, 2), new RectanglePlus(new Point(1, 1), 1, 33)));
//    }
//
//    public static Object findLargest(Object object1, Object object2) {
//        RectanglePlus obj1 = (RectanglePlus) object1;
//        RectanglePlus obj2 = (RectanglePlus) object2;
//        if (obj1.isLargerThan(obj2) > 0)
//            return object1;
//        else
//            return object2;
//    }
//        public int width = 0;
//        public int height = 0;
//        public Point origin;
//
//        // four constructors
//    public RectanglePlus() {
//            origin = new Point(0, 0);
//        }
//    public RectanglePlus(Point p) {
//            origin = p;
//        }
//    public RectanglePlus(int w, int h) {
//            origin = new Point(0, 0);
//            width = w;
//            height = h;
//        }
//    public RectanglePlus(Point p, int w, int h) {
//            origin = p;
//            width = w;
//            height = h;
//        }
//
//        // a method for moving the rectangle
//        public void move(int x, int y) {
//            origin.x = x;
//            origin.y = y;
//        }
//
//        // a method for computing
//        // the area of the rectangle
//        public int getArea() {
//            return width * height;
//        }
//
//        // a method required to implement
//        // the Relatable interface
//        public int isLargerThan(Relatable other) {
//            RectanglePlus otherRect
//                    = (RectanglePlus)other;
//            if (this.getArea() < otherRect.getArea())
//                return -1;
//            else if (this.getArea() > otherRect.getArea())
//                return 1;
//            else
//                return 0;
//        }
//
//        @Override
//    public String toString() {
//        return String.format("width: %d, height: %d", width, height);
//        }
//}
//
//class Point {
//    int x;
//    int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//
//    interface Relatable {
//
//        // this (object calling isLargerThan)
//        // and other must be instances of
//        // the same class returns 1, 0, -1
//        // if this is greater than,
//        // equal to, or less than other
//        public int isLargerThan(Relatable other);
//        static int getPosition(Relatable other) {
//            System.out.println("X");
//        }
//    }
