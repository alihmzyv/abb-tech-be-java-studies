package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    void camelcaseTest1() {
        assertEquals(5, CamelCase.camelcase("saveChangesInTheEditor"));
    }
}