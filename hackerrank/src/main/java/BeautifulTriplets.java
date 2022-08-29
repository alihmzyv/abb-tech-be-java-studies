import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        //get the stream from 0 till the index of 3rd element from the end
        //get the stream from i + 1 till the index of 2nd element from the end
        //get the stream from i + 2 till the index of the last element
        //filter isBeautiful
        //count
        Predicate<int[]> isBeautiful = triplet -> triplet[1] - triplet[0] == d && triplet[2] - triplet[1] == d;
        return (int) IntStream.rangeClosed(0, arr.size() - 3)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, arr.size() - 2)
                        .boxed()
                        .flatMap(j -> IntStream.rangeClosed(j + 1, arr.size() - 1)
                                .mapToObj(k -> new int[]{arr.get(i), arr.get(j), arr.get(k)})
                                .filter(triplet -> triplet[2] - triplet[1] == triplet[1] - triplet[0] && triplet[1] - triplet[0] == d)))
                .count();

    }
}
