package november42022.tasksgiven.solution21;

import november42022.tasksgiven.solution19.ReverseArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwitchColumnsRowsDemo {
    public static void main(String[] args) {

    }

    public static int[][] switchColumnsRows(int[][] arr) {
        List<List<Integer>> list = int2DArrToList2D(arr);
        List<List<Integer>> listSwitched = IntStream.range(0, list.size())
                .mapToObj(i -> list.stream()
                        .map(listEl -> listEl.get(i))
                        .toList())
                .toList();
        return list2DtoInt2DArr(listSwitched);
    }

    public static List<List<Integer>> int2DArrToList2D (int[][] arr) {
        return Arrays.stream(arr)
                .map(ReverseArrayDemo::intArrToList)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static int[][] list2DtoInt2DArr(List<List<Integer>> list) {
        int[][] result = new int[list.size()][list.size()];
        List<int[]> listOfIntArrs =  list.stream()
                .map(ReverseArrayDemo::listToIntArr)
                .toList();
        IntStream.range(0, result.length)
                .forEach(i -> result[i] = listOfIntArrs.get(i));
        return result;
    }
}
