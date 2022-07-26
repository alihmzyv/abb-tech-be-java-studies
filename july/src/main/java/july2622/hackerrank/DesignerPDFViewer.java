package july2622.hackerrank;

import java.util.List;
import java.util.regex.Pattern;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int[] letterHeights = h.stream().mapToInt(i->i).toArray(); //convert to array that is faster
        word = word.replace(" ", ""); //remove spaces
        int maxLetterHeight = letterHeights[word.charAt(0) - 97]; //assign to the height of first letter char initially
        int alphabeticOrderOfLetter;

        for (int i = 0; i < word.length(); i++) {
            alphabeticOrderOfLetter = word.charAt(i) - 97; //starting from 0 for a

            if (letterHeights[alphabeticOrderOfLetter] > maxLetterHeight) {
                maxLetterHeight = letterHeights[alphabeticOrderOfLetter];
            }
        }

        return maxLetterHeight * word.length();
    }
}
