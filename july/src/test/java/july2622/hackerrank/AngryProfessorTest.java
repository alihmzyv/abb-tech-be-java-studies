package july2622.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AngryProfessorTest {

    @Test
    void angryProfessor() {
        assertEquals("NO",  AngryProfessor.angryProfessor(2, Arrays.asList(23, -35, -2, 58, -67, -56, -42, -73, -19, 37)));
    }
}