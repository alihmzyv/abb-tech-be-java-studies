package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheGridSearchTest {

    @Test
    void gridSearchTest1() {
        assertEquals("YES", TheGridSearch.gridSearch(List.of("7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"), List.of("9505",
                "3845",
                "3530")));
    }

    @Test
    void gridSearchTest2() {
        assertEquals("NO", TheGridSearch.gridSearch(List.of("400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"), List.of("99",
                "99")));
    }
}