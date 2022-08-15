package august1522.danit;

import java.util.*;
import java.util.function.*;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> RandomNumber = () -> new Random().nextInt(10);
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomNumbers.add(RandomNumber.get());
        }
        System.out.println(randomNumbers);

    }
}
