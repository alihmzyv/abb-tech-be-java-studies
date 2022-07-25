package july2522.hackerrank;

import java.util.List;
import java.util.stream.IntStream;

public class MigratoryBirds {
    public static void main(String[] args) {

    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] birdsIDs = arr.stream().mapToInt(i->i).toArray();
        int[] birdsIDsNoDublicates = IntStream.of(birdsIDs).distinct().toArray();


        int maxOccuringID = 0;
        int occurencyOfMaxOccuringID = 0;


        int countOccurencies;
        for (int i = 0; i < birdsIDsNoDublicates.length; i++) {
            countOccurencies = 0;
            for (int j = 0; j < birdsIDs.length; j++) {
                if (birdsIDsNoDublicates[i] == birdsIDs[j]) {
                    countOccurencies++;
                }
            }

            if (countOccurencies > occurencyOfMaxOccuringID) {
                occurencyOfMaxOccuringID = countOccurencies;
                maxOccuringID = birdsIDsNoDublicates[i];
            }
            else if(countOccurencies == occurencyOfMaxOccuringID) {
                if (birdsIDsNoDublicates[i] < maxOccuringID) {
                    maxOccuringID = birdsIDsNoDublicates[i];
                }
            }
        }

        return maxOccuringID;
    }
}
