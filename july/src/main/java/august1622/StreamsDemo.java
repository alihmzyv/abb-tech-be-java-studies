package august1622;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        //take a list of even numbers using streams in one line only after 1.8 v.
        List<Integer> integerList = new ArrayList<>(Arrays.asList(6, 3, 2, 1, 4, 5));
        List<Integer> evenIntegersList = integerList.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenIntegersList);

        //take a list of double integers of a list using streams
        List<Integer> doubleIntegersList = integerList.stream().map((x) -> 2 * x).collect(Collectors.toList());
        System.out.println(doubleIntegersList);

        //count odd numbers using stream
        long countOddNumbers = integerList.stream().filter(x -> x % 2 != 0).count();
        System.out.println(countOddNumbers);

        //sort in ascending order
        integerList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);

        //sort in descending order
        integerList = integerList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList);

        //students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ali", 21));
        studentList.add(new Student("Cafar", 20));
        studentList.add(new Student("Calil", 21));
        studentList.add(new Student("Babak", 20));

        //babak, cafar, ali, calil - natural ordering
        studentList = studentList.stream().sorted().collect(Collectors.toList());
//        System.out.println(studentList);

        //sort according to length of names - Ali, babak, cafar, calil
        studentList = studentList.stream().sorted(Comparator.comparing(s -> s.getName().length())).collect(Collectors.toList());
        System.out.println(studentList);

//        Collections.sort(studentList, Comparator.comparing(s -> s.getName().length()));
//        System.out.println(studentList);

        //Ali
        Student minStudent = studentList.stream().min(Comparator.comparing(s -> s.getName().length())).get();
        System.out.println(minStudent);
        //Babak
        Student maxStudent = studentList.stream().max(Comparator.comparing(s -> s.getName().length())).get();
        System.out.println(maxStudent);


        //forEach
        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        integerList1.stream().forEach(num -> System.out.print(num * num + " "));


        //convert int[] to Integer[]
        int[] arr = new int[]{1, 2, 3, 4};
        Integer[] arrBig = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Integer[] arrBig2 = IntStream.of(arr).boxed().toArray(Integer[]::new);


        //convert Integer[] to int[]
        int[] arr2 = Arrays.stream(arrBig).mapToInt(Integer::intValue).toArray();
        int[] arr3 = Stream.of(arrBig).mapToInt(Integer::intValue).toArray();
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
