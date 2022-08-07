package august722.Map;

import java.util.*;

public class IdentityHashMapDemo {
    static int countGCCollection = 0;
    public static void main(String[] args) throws InterruptedException {

//        Map<Box, String> boxSet = new HashMap<>();
//        //HashMap
//        Box box1 = new Box(1,2);
//        String ID1 = "1";
//        boxSet.put(box1, ID1);
//        box1 = null; //new Box(1,2) will not be collected since is referenced by HashMap entity value
//        System.gc();
//        Thread.sleep(10000);
//        System.out.println(boxSet);

        Map<Box, String> boxSet = new WeakHashMap<>();
        //HashMap
        Box box1 = new Box(1,2);
        String ID1 = "1";
        boxSet.put(box1, ID1);
        box1 = null; //new Box(1,2) will be ready to be collected since is not referenced by WeakHashMap entity value after left unreferenced
        System.gc();
        Thread.sleep(10000);
        System.out.println(boxSet); //boxSet can be empty

        //GC revision
//        for (int i = 0; i < Math.pow(10, 6); i++) {
//            IdentityHashMapDemo x = new IdentityHashMapDemo();
//            x = null;
//            System.gc(); //makes unreferenced objects ready but not collected
//            //if not called, objects will be ready when gc is implicitly called
//        }

    }
}

class Box {
    int width;
    int length;

    public Box(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return width == box.width && length == box.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return String.format("Box: width = %d, length = %d", width, length);
    }

    @Override
    public void finalize() {
        System.out.println("Box collected");
    }
}
