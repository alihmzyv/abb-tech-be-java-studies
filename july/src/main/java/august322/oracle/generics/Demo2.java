package august322.oracle.generics;

public class Demo2 {
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)  // compiler error
                ++count;
        return count;
    }
}
