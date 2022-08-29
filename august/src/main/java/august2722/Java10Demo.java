package august2722;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java10Demo {
    public static void main(String[] args) {
        //var type
        List<Integer> list = new ArrayList<>();
        list.add(null);
        var unmodifiableList = Collections.unmodifiableList(list); //list can be modified, and unmodifiableList will get updated
        list.add(5);
        unmodifiableList.forEach(System.out::println);
//        try {
////            unmodifiableList.set(0, 0);
//            unmodifiableList.add(1);
//        }
//        catch (UnsupportedOperationException exc) {
//            System.out.println("Cannot modify unmodifiable list");
//        }

        //to create an unmodifiable collection
//        var list2 = List.copyOf(list); //not backed by list, null not allowed
//        List.of(); //null not allowed
//
//        IntStream.range(1, 10)
//                .boxed().toList();
//        Optional
    }
}
