import java.util.stream.IntStream;

public class HappyLadybugs {
    public static String happyLadybugs(String b) {
        if (b.chars().allMatch(i -> i == '_')) { //if board contains only '_'
            return "YES";
        }
        if (b.length() == 1) {
            return "NO";
        }
        if (b.contains(String.valueOf('_')) && b.chars() //if there is '_', there should be at least 2 of each color
                .distinct()
                .filter(i -> i != '_')
                .allMatch(i -> b.indexOf((char) i) != b.lastIndexOf((char) i))) {
            return "YES";
        }
        if (!b.contains(String.valueOf('_'))) {//if no '_', then without moves, they all should be "happy"
            return b.charAt(0) == b.charAt(1)
            && IntStream.range(1, b.length() - 1)
                    .allMatch(i -> b.charAt(i - 1) == b.charAt(i)
                            || b.charAt(i + 1) == b.charAt(i))
                    && b.charAt(b.length() - 1) == b.charAt(b.length() - 2)
                    ? "YES" : "NO";
        }
        return "NO";
    }
}
