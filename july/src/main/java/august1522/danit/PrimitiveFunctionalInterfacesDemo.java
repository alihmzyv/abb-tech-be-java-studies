package august1522.danit;

import java.util.Comparator;
import java.util.function.*;

public class PrimitiveFunctionalInterfacesDemo {
    public static void main(String[] args) {
//        ToIntFunction<String> Length = str -> str.length();
        IntToDoubleFunction SquareRoot = Math::sqrt;
        System.out.println(SquareRoot.applyAsDouble(5));
        Function<Integer, Integer> function = UnaryOperator.identity();
        System.out.println(function.apply(5));
        BinaryOperator<Integer> integerBinaryOperator = Math::addExact;
        BinaryOperator<Integer> intBinaryOperator = BinaryOperator.maxBy(Comparator.comparingInt((Integer x) -> x % 10));
        System.out.println(intBinaryOperator.apply(9, 12));
    }
}