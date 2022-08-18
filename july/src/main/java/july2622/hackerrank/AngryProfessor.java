package july2622.hackerrank;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        long lateStudents = a.stream()
                .filter(time -> time > 0)
                .limit(k)
                .count();

        return lateStudents == k ? "NO" : "YES";
    }
}
