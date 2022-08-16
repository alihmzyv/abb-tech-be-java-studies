package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                triangle.add(Arrays.asList(1));
            }
            else if (i == 1) {
                triangle.add(Arrays.asList(1, 1));
            }
            else {
                List<Integer> row = new ArrayList<>(i + 1);
                row.add(0, 1);
                row.add(row.size() - 1, 1);
                List<Integer> previousRow = triangle.get(triangle.size() - 1);
                for (int j = 0, k = 1; j < previousRow.size() - 1; j++, k++) {
                    row.add(k, previousRow.get(j) + previousRow.get(j + 1));
                }
                triangle.add(row);
            }
        }

        return triangle.get(rowIndex);
    }
}
