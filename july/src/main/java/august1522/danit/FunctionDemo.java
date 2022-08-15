package august1522.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<Integer, Integer> Reverse = (x) -> Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
//        System.out.println(Reverse.apply(561)); //165
//        Function<String, Integer> GetLength = s -> s.length();
//        Function<String, Integer> getReverseOfLength = Reverse.compose(GetLength);
//        System.out.println(getReverseOfLength.apply("abcdetertregreg"));
        Function<Student, String> Grader = student -> {
            if (student.mark > 80) {
                return "A";
            }
            else if (student.mark > 70) {
                return "B";
            }
            else if(student.mark > 60) {
                return "C";
            }
            else {
                return "F";
            }
        };

        Predicate<Student> HighAchieving = student -> Grader.apply(student).equals("A");
        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student("X", 100), new Student("Y", 80), new Student("Z", 81)));
        for (Student student: studentList) {
            if (HighAchieving.test(student)) {
                System.out.println(student);
            }
        }


    }
}

class Student {
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Mark: %d", name, mark);
    }
}
