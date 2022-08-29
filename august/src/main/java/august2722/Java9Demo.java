package august2722;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java9Demo implements New {
    public static void main(String[] args) {
        //takeWhile, dropWhile
        IntStream.range(1, 10)
                .dropWhile(num -> num < 5)
                .forEach(System.out::println);

        //ofNullable
        Stream.ofNullable(5);

        Optional.ofNullable("string").stream();

    }
}

interface New {
    default int m1() {
        return get(2);
    }

    default int m2() {
        return get(1);
    }


    //private methods can be used as helper in interfaces since 1.9
    private int get(int a) {
        return a;
    }
}
