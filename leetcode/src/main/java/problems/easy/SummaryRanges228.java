package problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        //1. iterate through the array
        //2. starting from the first element, while the range is contiguous, iterate
        //3. when it is not, add the range of [first, one before the last checked]

        int lengthOfArray = nums.length;
        List<List<Integer>> ranges = new ArrayList<>();
        for (int i = 0; i < lengthOfArray; i++) {
            if (i == lengthOfArray - 1) { //if only last element is left outside of ranges
                ranges.add(List.of(nums[lengthOfArray - 1], nums[lengthOfArray - 1]));
                break;
            }
            List<Integer> range = new ArrayList<>();
            int lowerBound = nums[i];
            range.add(lowerBound);
            int upperBoundIndex = IntStream.range(i + 1, lengthOfArray)
                    .filter(j -> nums[j] != nums[j - 1] + 1)
                    .findFirst()
                    .orElse(lengthOfArray) - 1; //nothing found for filter means the range is till the end of array
            int upperBound = nums[upperBoundIndex];
            range.add(upperBound);
            ranges.add(range);
            i = upperBoundIndex; //continue from the one after the upper bound of last range
        }

        return ranges.stream()
                .map(range -> {
                    int lowerBound = range.get(0);
                    int upperBound = range.get(1);
                    if (lowerBound != upperBound) return String.format("%d->%d", lowerBound, upperBound);
                    return String.valueOf(lowerBound);
                }).toList();
    }
}
