package july2222.HakcerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> result = gradingStudents(Arrays.asList(29, 74, 75, 77));
        for (int x: result) {
            System.out.println(x);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
       List<Integer> gradesRounded = new ArrayList<>(grades); //create new array not to alter the original
       IntPredicate isRoundable = grade -> grade >= 38 && (grade/5 + 1) * 5 - grade < 3;
       IntUnaryOperator rounder = grade -> {
           if (isRoundable.test(grade)) {
               return grade = (grade/5 + 1) * 5;
           }
           else return grade;
       };

       gradesRounded = gradesRounded.stream()
               .mapToInt(i -> i)
               .map(rounder)
               .boxed()
               .collect(Collectors.toList());

        return gradesRounded;
    }
}
