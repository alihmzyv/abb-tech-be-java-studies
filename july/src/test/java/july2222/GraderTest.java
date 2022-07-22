package july2222;

import com.sun.nio.sctp.IllegalReceiveException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF() {
        assertEquals('F', Grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        assertEquals('D', Grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        assertEquals('C', Grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        assertEquals('B', Grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnD() {
        assertEquals('A', Grader.determineLetterGrade(99));
    }

    @Test
    void negativeOrOverHundreadShouldReturnIllegalArgumentExc() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Grader.determineLetterGrade(-5);
                });
    }
}