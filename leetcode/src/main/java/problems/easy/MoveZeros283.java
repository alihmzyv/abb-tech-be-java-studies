package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        List<Integer> nonZerosList = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList<Integer>::new));
        nonZerosList.removeIf(num -> num == 0);
        int[] nonZeros = nonZerosList.stream().mapToInt(i -> i).toArray();
        int[] zeros = IntStream.generate(() -> 0).limit(nums.length - nonZeros.length).toArray();
        System.arraycopy(nonZeros, 0, nums, 0, nonZeros.length);
        System.arraycopy(zeros, 0, nums, nonZeros.length, zeros.length);
    }
}
