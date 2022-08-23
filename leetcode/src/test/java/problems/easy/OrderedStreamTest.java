package problems.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderedStreamTest {

    static OrderedStream sample = new OrderedStream(5);

    @Test
    void insertTest1() {
        assertEquals(List.of(), sample.insert(3, "ccccc"));
    }

    @Test
    void insertTest2() {
        assertEquals(List.of("aaaaa"), sample.insert(1, "aaaaa"));
    }


    @Test
    void insertTest3() {
        assertEquals(List.of("bbbbb", "ccccc"), sample.insert(2, "bbbbb"));
    }

    @Test
    void insertTest4() {
        assertEquals(List.of(), sample.insert(5, "eeeee"));
    }

    @Test
    void insertTest5() {
        assertEquals(List.of("ddddd", "eeeee"), sample.insert(4, "ddddd"));
    }
}