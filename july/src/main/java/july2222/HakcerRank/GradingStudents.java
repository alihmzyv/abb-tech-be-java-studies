package july2222.HakcerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> result = gradingStudents(Arrays.asList(new Integer[]{29, 74, 75, 77}));
        for (int x: result) {
            System.out.println(x);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
       ArrayList<Integer> gradesRounded = new ArrayList<>(grades); //create new array not to alter the original

        for (int i = 0; i < grades.toArray().length; i++) {
            gradesRounded.set(i, round(gradesRounded.get(i))) ;
        }

        return gradesRounded;
    }


    //rounding method
    public static Integer round(Integer grade) {
        if (grade >= 38 && (grade/5 + 1)*5 - grade < 3) {
            grade = (grade/5 + 1)*5;
        }
        return grade;
    }
}
