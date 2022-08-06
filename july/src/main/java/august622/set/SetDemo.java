package august622.set;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Box<String, Integer> stringIntegerBox = new Box<>("1", 3);
        Box<String, Integer> stringIntegerBox1 = new Box<>("2", 3);
        Box<String, Integer> stringIntegerBox2 = new Box<>("1", 2);

        List<Box<String, Integer>> boxList = Arrays.asList(new Box[]{stringIntegerBox, stringIntegerBox1, stringIntegerBox2});
        TreeSet boxSet = new TreeSet();
        boxSet.addAll(boxList);
        System.out.println(boxSet);

        TreeSet numbers = new TreeSet();
        numbers.addAll(Arrays.asList(1, 2, 3, 3));
        System.out.println(numbers);
    }

    static class MyComparator implements Comparator { //descending order
        @Override
        public int compare(Object o1, Object o2) {
//            return -((Box<?, ?>) o1).compareTo(o2);
//            return +1;
            return 0;
        }


    }
    static class Box<K, V> implements Comparable{

        K key;
        V value;

        public Box(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("Box: key = %s, value = %s", key, value);
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box<?, ?> box = (Box<?, ?>) o;
            return Objects.equals(key, box.key) && Objects.equals(value, box.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public int compareTo(Object o) {
            int result = ((Integer) this.value).compareTo(((Integer) ((Box<?, ?>) o).value));
            if (result == 0) {
                result = 1;
            }
            return result;
        }
    }
}

