package july2622.hackerrank;

import java.util.List;
import java.util.regex.Pattern;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = word.chars()
                .unordered()
                .parallel()
                .map(i -> i - 97)
                .map(h::get)
                .max()
                .getAsInt();
        return maxHeight * word.length();
    }
}
