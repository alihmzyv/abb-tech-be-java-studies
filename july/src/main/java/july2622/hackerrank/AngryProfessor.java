package july2622.hackerrank;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        int[] arrivalTimes = a.stream().mapToInt(i->i).toArray();
        int countStudentsNotLate = 0;
        String continuation = "YES";

        for (int time: arrivalTimes) {
            if (time <= 0) {
                countStudentsNotLate++;
            }

            if (countStudentsNotLate >= k) {
                continuation = "NO";
                break;
            }
        }
        return continuation;
    }
}
