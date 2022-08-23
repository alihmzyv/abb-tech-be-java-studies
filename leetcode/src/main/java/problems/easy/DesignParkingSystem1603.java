package problems.easy;

import java.util.Arrays;
import java.util.List;

public class DesignParkingSystem1603 {

}

class ParkingSystem {

    private List<Integer> spaces; //0 - big, 1 - medium, 2 - small

    public ParkingSystem(int big, int medium, int small) {
        spaces = Arrays.asList(big, medium, small);
    }

    public boolean addCar(int carType) {
        int indexOfSpace = carType - 1;
        int emptySpaces = spaces.get(indexOfSpace);
        if (emptySpaces == 0) {
            return false;
        }
        spaces.set(indexOfSpace, --emptySpaces);
        return true;
    }
}
