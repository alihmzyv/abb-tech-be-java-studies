package august1622;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    private static int counter = 0;

    public static boolean isLong(String s) {
        counter++;
        return s.length() > 1;
    }

    public static void main(String[] args) {
//        //take a list of even numbers using streams in one line only after 1.8 v.
//        List<Integer> integerList = new ArrayList<>(Arrays.asList(6, 3, 2, 1, 4, 5));
//        List<Integer> evenIntegersList = integerList.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenIntegersList);
//
//        //take a list of double integers of a list using streams
//        List<Integer> doubleIntegersList = integerList.stream().map((x) -> 2 * x).collect(Collectors.toList());
//        System.out.println(doubleIntegersList);
//
//        //count odd numbers using stream
//        long countOddNumbers = integerList.stream().filter(x -> x % 2 != 0).count();
//        System.out.println(countOddNumbers);
//
//        //sort in ascending order
//        integerList = integerList.stream().sorted().collect(Collectors.toList());
//        System.out.println(integerList);
//
//        //sort in descending order
//        integerList = integerList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(integerList);
//
//        //students
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Ali", 21));
//        studentList.add(new Student("Cafar", 20));
//        studentList.add(new Student("Calil", 21));
//        studentList.add(new Student("Babak", 20));
//
//        //babak, cafar, ali, calil - natural ordering
//        studentList = studentList.stream().sorted().collect(Collectors.toList());
////        System.out.println(studentList);
//
//        //sort according to length of names - Ali, babak, cafar, calil
//        studentList = studentList.stream().sorted(Comparator.comparing(s -> s.getName().length())).collect(Collectors.toList());
//        System.out.println(studentList);
//
////        Collections.sort(studentList, Comparator.comparing(s -> s.getName().length()));
////        System.out.println(studentList);
//
//        //Ali
//        Student minStudent = studentList.stream().min(Comparator.comparing(s -> s.getName().length())).get();
//        System.out.println(minStudent);
//        //Babak
//        Student maxStudent = studentList.stream().max(Comparator.comparing(s -> s.getName().length())).get();
//        System.out.println(maxStudent);
//
//
//        //forEach
//        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
//        integerList1.stream().forEach(num -> System.out.print(num * num + " "));
//
//
//        //convert int[] to Integer[]
//        int[] arr = new int[]{1, 2, 3, 4};
//        Integer[] arrBig = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Integer[] arrBig2 = IntStream.of(arr).boxed().toArray(Integer[]::new);
//
//
//        //convert Integer[] to int[]
//        int[] arr2 = Arrays.stream(arrBig).mapToInt(Integer::intValue).toArray();
//        int[] arr3 = Stream.of(arrBig).mapToInt(Integer::intValue).toArray();


        //empty Stream
//        Stream<String> stringStream = Stream.empty();
//        stringStream.map((x) -> x.length()).forEach(System.out::println);


//        //usage of empty Stream
//        List<String> stringList = null;
//        Stream<String> stringStream1 = StreamsDemo.streamOf(stringList);
//        stringStream1.forEach(System.out::println);
//
//
//

//        //Stream.generate
//        //create 10 random numbers between 1 and 10
//        int[] randomNums = IntStream.generate(() -> new Random().nextInt(10)).limit(10).toArray();
//        Arrays.stream(randomNums).forEach(System.out::println);
//
//        //create array of even integer till 10
//        int[] evenNums = IntStream.iterate(2, index -> index <= 10, index -> ++index).toArray();
//        Arrays.stream(evenNums).forEach(x -> System.out.print(x + " "));
//

        //range, rangeClosed
//        IntStream.range(1, 3).forEach(System.out::println); //3 excluded
//        IntStream.rangeClosed(1, 3).forEach(System.out::println); //3 included

        //new Random().doubles
//        new Random().ints(10, 1, 11).forEach(System.out::println);

//        String sentence = "Good morning, all";
//        sentence.chars().mapToObj(i -> (char) i).forEach(System.out::print); //word
//        System.out.println();
//
//        //take words
//        List<String> words = Pattern.compile("[^a-zA-Z\\d]").splitAsStream(sentence).collect(Collectors.toList());
//        System.out.println(words);
//        List<String> stringList = new ArrayList<>(Arrays.asList("Ali", "Babak", "Jafar", "Damir"));

        //findAny
//        System.out.println(Stream.of("x", "yz", "wxyz").filter(s -> s.contains("yz")).findAny().orElse("none"));
//
//        //findFirst
//        System.out.println(Stream.of("x", "yz", "wxyz").filter(s -> s.contains("yz")).findFirst();


       //skip
//        Stream.of("abc", "bcd", "cde").skip(2).forEach(System.out::println);

        //filter is lazy
        //intermediate operations are lazy
        Stream.of("abc", "bcd", "cde").filter(StreamsDemo::isLong);
        System.out.println(counter); //0

        Stream.of("abc", "bcd", "cde").filter(StreamsDemo::isLong).forEach(System.out::println);
        System.out.println(counter);

        // intermediate operations which reduce the size of the stream should be placed before operations which are applying to each element.
        // So we need to keep methods such as skip(), filter(), and distinct() at the top of our stream pipeline.


        //reduce
        System.out.println(Stream.of("abc", "bcd", "cde").reduce("Word=", (el1, el2) -> el1 + el2));

        //collect - new features
        //Reducing to String:
        System.out.println(Stream.of("abc", "bcd", "cde").collect(Collectors.joining(", ")));

        System.out.println(Stream.of("abc", "bcd", "cde").collect(Collectors.joining(", ", "pre", "suf")));

        //Processing the average value of all numeric elements of the stream:
        System.out.println(Stream.of("abc", "bcd", "cdef").collect(Collectors.averagingInt(String::length))); //3.33


        //Processing the sum of all numeric elements of the stream:
        System.out.println(Stream.of("abc", "bcd", "cdef").collect(Collectors.summingInt(String::length)));

        //Collecting statistical information about stream’s elements:
        IntSummaryStatistics x = Stream.of("abc", "bcd", "cdef").collect(Collectors.summarizingInt(String::length));
        System.out.printf("Average: %f\n", x.getAverage());

        //grouping by
        //Grouping of stream’s elements according to the specified function:
        System.out.println(Stream.of("abc", "bcd", "cdef").collect(Collectors.groupingBy(String::length)));

        //Dividing stream’s elements into groups according to some predicate:
        System.out.println(Stream.of("abc", "bcd", "cdef").collect(Collectors.partitioningBy(s -> s.length() > 3)));

        //Pushing the collector to perform additional transformation:
        int y =Stream.of("abc", "bcd", "cdef").collect(Collectors.collectingAndThen(Collectors.toList(), List::size));
        System.out.println(y);

    }

    public static Stream<String> streamOf(List<String> list) {
        //if list is null or empty returns empty stream, otherwise stream of the parameter list
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int flag = this.age - o.age;
        if (flag == 0) {
            flag = name.compareTo(o.name);
        }
        return flag;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d\n", name, age);
    }
}
