import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyLadybugsTest {

    @Test
    void happyLadybugsTest1() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("YYR_B_BR"));
    }

    @Test
    void happyLadybugsTest2() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RBY_YBR"));
    }

    @Test
    void happyLadybugsTest3() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("X_Y__X"));
    }

    @Test
    void happyLadybugsTest4() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("__"));
    }

    @Test
    void happyLadybugsTest5() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("B_RRBR"));
    }

    @Test
    void happyLadybugsTest6() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("AABBC"));
    }

    @Test
    void happyLadybugsTest7() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("G"));
    }

    @Test
    void happyLadybugsTest8() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("GR"));
    }

    @Test
    void happyLadybugsTest9() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("_GR_"));
    }

    @Test
    void happyLadybugsTest10() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("_R_G_"));
    }

    @Test
    void happyLadybugsTest11() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("R_R_R"));
    }

    @Test
    void happyLadybugsTest12() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RRGGBBXX"));
    }

    @Test
    void happyLadybugsTest13() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("RRGGBBXY"));
    }

}