import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HallowenSaleTest {

    @Test
    void howManyGamesTest1() {
        assertEquals(5, HallowenSale.howManyGames(20, 3, 6, 70));
    }

    @Test
    void howManyGamesTest2() {
        assertEquals(6, HallowenSale.howManyGames(20, 3, 6, 80));
    }

    @Test
    void howManyGamesTest3() {
        assertEquals(7, HallowenSale.howManyGames(20, 3, 6, 85));
    }

    @Test
    void howManyGamesTest4() {
        assertEquals(9917, HallowenSale.howManyGames(16, 2, 1, 9981));
    }

    @Test
    void howManyGamesTest5() {
        assertEquals(9777, HallowenSale.howManyGames(1, 100, 1, 9777));
    }
}