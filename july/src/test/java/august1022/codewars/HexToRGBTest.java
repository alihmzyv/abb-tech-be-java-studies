package august1022.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexToRGBTest {

    @Test
    void test1() {
        String hexCode = "#FF9933";
        assertArrayEquals(HexToRGB.hexStringToRGB("#00000"), null);
        assertArrayEquals(new int[]{255, 153, 51}, HexToRGB.hexStringToRGB(hexCode));
        assertArrayEquals(HexToRGB.hexStringToRGB("#FF9933"), new int[] {255, 153, 51});
        assertArrayEquals(HexToRGB.hexStringToRGB("#beaded"), new int[] {190, 173, 237});
        assertArrayEquals(HexToRGB.hexStringToRGB("#Fa3456"), new int[] {250, 52, 86});
    }


}