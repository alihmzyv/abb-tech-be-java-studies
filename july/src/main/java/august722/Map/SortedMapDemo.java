package august722.Map;

import com.sun.source.tree.Tree;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        Map<X, String> xStringHashMap = new HashMap<>();
//        xStringHashMap.put(null, "Gul");
        xStringHashMap.put(new X(1, "x"), "Ali");
        xStringHashMap.put(new X(3, "y"), "Kanan");
        xStringHashMap.put(new X(1,"x"), "X");
        xStringHashMap.put(new X(0, "c"), "Y");
        System.out.println(xStringHashMap);
        SortedMap<X, String> xStringSortedMap = new TreeMap<>(xStringHashMap);
        System.out.println(xStringSortedMap);
    }
}

class Reversed implements Comparator<X> {

    @Override
    public int compare(X o1, X o2) {
        int result = - o1.a.compareTo(o2.a);

        if (result == 0) {
            result = o1.name.compareTo(o2.name);
        }

        return result;
    }
}
class X implements Comparable<X> {
    String name;
    Integer a;

    public X(int a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("X: a = %d, Name: %s", a, name);
    }

    @Override
    public int compareTo(X o) {
        int result = a.compareTo(o.a);

        if (result == 0) {
            result = name.compareTo(o.name);
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        X x = (X) o;
        return Objects.equals(name, x.name) && Objects.equals(a, x.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a);
    }
}
