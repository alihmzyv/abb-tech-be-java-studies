package july2222;

public class Grader {

    public static char determineLetterGrade (int numberGrade) {
        if (numberGrade<0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number grade can be in range [0, 100]");
        }

        else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 81) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
