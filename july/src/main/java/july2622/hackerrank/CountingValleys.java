package july2622.hackerrank;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int locBasedOnSeaLevel = 0;
        int locBasedOnSeaLevelPrevious;
        int countValleys = 0;

        for (int i = 0; i < path.length(); i++) {
            locBasedOnSeaLevelPrevious = locBasedOnSeaLevel;

            //change location
            if (path.charAt(i) == 'U') {
                locBasedOnSeaLevel++;
            }
            else {
                locBasedOnSeaLevel--;
            }

            //check how many times crossed from negative loc to zero or positive
            if (locBasedOnSeaLevelPrevious < 0 && locBasedOnSeaLevel >= 0) {
                countValleys++;
            }
        }

        return countValleys;
    }
}
