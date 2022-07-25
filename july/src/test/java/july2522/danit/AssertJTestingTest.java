package july2522.danit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertJTestingTest {

    @Test
    void twoPlusTwoEquals4() {
        assertEquals(4, multiple(2, 2));
    }

    void equals() {
        Assertions.assertThat(new AssertJTesting(1)).isEqualTo(new AssertJTesting(55));
    }
}