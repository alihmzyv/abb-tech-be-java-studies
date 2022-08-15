package august1522.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {
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

        Consumer<Student> Congratulate = student -> {
            if (HighAchieving.test(student)) {
                System.out.printf("Congrats, %s ! You are high achieving\n", student.name);
            }
        };

        Consumer<Student> Invite = student -> {
            if (HighAchieving.test(student)) {
                System.out.println("You're invited to ceremony");
            }
        };

        Consumer<Student> CongratulateAndInvite =  Congratulate.andThen(Invite);

        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student("X", 100), new Student("Y", 80), new Student("Z", 81)));
        for (Student student: studentList) {
            CongratulateAndInvite.accept(student);
        }
    }
}
