import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedKaprekarNumbersTest {

    @Test
    void kaprekarNumbersTest1() {
        ModifiedKaprekarNumbers.kaprekarNumbers(1, 100);
    }

    @Test
    void kaprekarNumbersTest2() {
        ModifiedKaprekarNumbers.kaprekarNumbers(1, 22222);
    }
}