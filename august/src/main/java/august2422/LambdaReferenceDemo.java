package august2422;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaReferenceDemo {
    public static void main(String[] args) {
//        IntUnaryOperator getFactorial = n -> IntStream.rangeClosed(1, n).reduce(1, Math::multiplyExact);
//        System.out.println(getFactorial.applyAsInt(0));
//        System.out.println(getFactorial.applyAsInt(3));
//        //without mapMulti
//        IntStream.rangeClosed(2, 10)
//                .filter(num -> num % 2 == 0)
//                .mapToObj(num -> IntStream.rangeClosed(1, num).boxed().toList());

        //with mapMulti
//        IntStream.rangeClosed(2, 10)
//                .boxed()
//                .mapMulti((num, consumer) -> {
//                    if (num % 2 == 0) {
//                        consumer.accept(IntStream.rangeClosed(1, num).boxed());
//                    }
//                })
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 10, 100, 2000, 100000);
//        Set<Integer> integerSet = new HashSet<>(integerList);
//        integerSet.stream().map()
//        integerSet.stream().forEachOrdered(System.out::println);

        //grouping1 - get Map of lengths of Strings -> strings
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight");
        Map<Integer, List<String>> map = list
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        //grouping2 -
        Map<Integer, Long> map1 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        //grouping3
        SortedMap<Integer, Long> map2 =         list.stream()
                .collect(Collectors.groupingBy(String::length, () -> new TreeMap<Integer, Long>(Comparator.reverseOrder()), Collectors.counting()));
        System.out.println(map2);
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Demo {
    private int num;

    public Demo(int num) {
        this.num = num;
    }

    public static Demo of(int num) {
        return new Demo(num);
    }

    public static int sumNum1(Demo demo1, Demo demo2) {
        return demo1.num + demo2.num;
    }

    public int sumNum2(Demo demo1, Demo demo2) {
        return this.num + demo1.num + demo2.num;
    }

    public int sumNum3(Demo demo1, Demo demo3, Demo demo2) {
        return demo1.num + demo2.num + demo3.num;
    }
}
