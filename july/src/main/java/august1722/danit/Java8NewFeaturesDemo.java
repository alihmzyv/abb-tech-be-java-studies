package august1722.danit;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8NewFeaturesDemo {
    public static void main(String[] args) {
        //stream methods not covered
        //distinct
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        integerList.stream().distinct().forEach(System.out::println);
//
//        //print all elements of list, without stream required to write 5-6 lines of code
//        //with stream:
//        integerList.stream().forEach(System.out::println);

//        //anymatch
//        System.out.println(integerList.stream().anyMatch(num -> num % 2 == 0)); //true
//
//        //allmatch
//        System.out.println(integerList.stream().allMatch(num -> num < 10)); //true
//
//        //noneMatch
//        System.out.println(integerList.stream().noneMatch(num -> num > 10)); //true
//
//
//        //flatMap
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(List.of("math", "physics"), "ali", "hamzayev"));
//        studentList.add(new Student(List.of("english", "biology"), "Anar", "Mammadov"));
//        studentList.stream()
//                .flatMap(student -> student.getSubjects().stream())
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        //reduce
//        int multiply = integerList.stream().mapToInt(Integer::intValue).reduce((el1, el2) -> el1 * el2).getAsInt();
//        System.out.println(multiply);
//
//        //collect
//        studentList.stream().flatMap(student -> student.getSubjects().stream()).collect(Collectors.toList());

        System.out.println(integerList);

        //sum even number
        int sumOfEvenNumbers = integerList.stream()
                .mapToInt(i -> i)
                .filter(num -> num % 2 ==0)
                .sum();
        System.out.println(sumOfEvenNumbers);

        //find the greatest odd number in integerList greater than 3 less than 7
        int six = integerList.stream()
                .filter(num -> num > 3 && num < 7 && num % 2 == 0)
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                        .orElse(-1);



        System.out.println(six);

        List<String> stringList = new ArrayList<>(Arrays.asList("Ali", "Three", "Four", "Three"));
        Map<String, Integer> stringsLengthsMap = stringList.stream().collect(Collectors.toMap(Function.identity(), String::length,
                (s, i) -> i + i, TreeMap::new)); //Ali = 3, Four = 4, Three = 10;
        System.out.println(stringsLengthsMap);
        stringList.stream().collect(Collectors.toList());
    }
}

class Student {
    List<String> subjects;
    String name;
    String surname;

    public Student(List<String> subjects, String name, String surname) {
        this.subjects = subjects;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Subjects: %s", name, surname, subjects);
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}