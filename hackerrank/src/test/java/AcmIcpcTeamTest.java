import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AcmIcpcTeamTest {

    @Test
    void acmTeamTest1() {
        assertEquals(List.of(5, 2), AcmIcpcTeam.acmTeam(List.of("10101",
                "11100",
                "11010",
                "00101")));
    }

    @Test
    void acmTeamTest2() {
        assertEquals(List.of(5, 1), AcmIcpcTeam.acmTeam(List.of("10101",
                "11110",
                "00010")));
    }
}