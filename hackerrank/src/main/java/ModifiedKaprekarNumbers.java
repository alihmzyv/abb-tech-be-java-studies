import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ModifiedKaprekarNumbers {
    public static void kaprekarNumbers(int p, int q) {
        //take the square of number
        //from left, split to two parts, l digits and d digits (d = digits of original number)
        //if sum of them == original number, take that

        List<Long> integerList = LongStream.rangeClosed(p, q)
                .filter(num -> {
                    String square = String.valueOf( num * num);
                    String numStr = String.valueOf(num);
                    int splitIndex = square.length() - numStr.length();
                    if (splitIndex == 0) {
                        return num == Long.parseLong(square.substring(splitIndex));
                    }
                    return num == Long.parseLong(square.substring(splitIndex)) +
                            Long.parseLong(square.substring(0, splitIndex));
                })
                .boxed()
                .collect(Collectors.toList());
        if (integerList.isEmpty()) {
            System.out.println("INVALID RANGE");
        }
        else {
            integerList.forEach(num -> System.out.print(num + " "));
        }
    }
}
