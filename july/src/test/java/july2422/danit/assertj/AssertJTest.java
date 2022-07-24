package july2422.danit.assertj;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;



class AssertJTest {

    @Test
    public void twoIsOdd() {
        AssertJ obj = new AssertJ();
        obj.i = 2;
        assertThat(obj.isEven()).isTrue();
    }
}