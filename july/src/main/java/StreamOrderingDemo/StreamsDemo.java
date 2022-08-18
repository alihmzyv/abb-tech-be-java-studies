package StreamOrderingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 15, 22, 11, 100);
        int sum = integerList.stream().parallel().filter(i -> i > 10).collect(Collectors.summingInt(i -> i));
        System.out.println(sum);
    }
}
