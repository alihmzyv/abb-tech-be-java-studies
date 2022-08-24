package august2422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReferenceDemo {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .parallel()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));
    }
}
