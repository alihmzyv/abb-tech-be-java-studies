package august2722;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java11Demo {
    public static void main(String[] args) {
//        BiFunction<String, Integer, String> repeatString = (s, count) -> {
//            StringBuilder sb = new StringBuilder();
//            IntStream.range(0, count)
//                    .forEach(i -> sb.append(s));
//            return sb.toString();
//        };
//        System.out.println(repeatString.apply("three", 3));
        //string can be repeated:
        String repeated = "three".repeat(3);

        var String = "Ali went\nAli came back\nAli slept";
        String.lines().forEach(line -> System.out.println(line.length()));
        //can check if Optional isEmpty
        String string = "   Stripping.. ";
        System.out.println(string.strip());
        //stripLeading, stripTrailing

    }
}
