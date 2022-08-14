package august1422;

import java.util.function.Function;
import java.util.function.Predicate;

public class JavaEight {
    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x * x;
        System.out.printf("Square of %d = %d\n", 5, function.apply(5));

        Predicate<Integer> isEven = x -> x % 2 ==0;
        System.out.printf("Is %d even?: %s", 3, isEven.test(3));
    }
}
