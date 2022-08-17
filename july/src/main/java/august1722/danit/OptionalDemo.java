package august1722.danit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //Optional.empty creates an Optional instance with value null
        Optional<String> optional = Optional.empty();

        //Optional.of(T value) returns an Optional instance with this.value = value;
        Optional<String> optional1 = Optional.of("x");


        //Optional.ofNullable(T value) returns an Optional with this.value = value or returns Optional.empty
        String x = "x";
        String y = null;
        Optional<String> optionalX = Optional.ofNullable(x);
        Optional<String> optionalY = Optional.ofNullable(y); //this.value = null;


        //.get - If a value is present, returns the value, otherwise throws NoSuchElementException.
        //.IsPresent returns value != null
        //.isEmpty returns value == null
        System.out.printf("optionalX is not null: %s\n", optionalX.isPresent());
        System.out.printf("optionalY is null: %s\n", optionalY.isEmpty());

        //ifPresent - If a value is present, performs the given action with the value, otherwise nothing
        optionalX.ifPresent(System.out::println); //x
        optionalY.ifPresent(System.out::println); //

        //isPresentOrElse - if a value is present, performs the given action with the value, otherwise performs the given empty-based action.
        optionalX.ifPresentOrElse(System.out::println, () -> System.out.println("There is none")); //x
        optionalY.ifPresentOrElse(System.out::println, () -> System.out.println("There is none")); //there is none

        //.filter - If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty Optional
        String str = optionalX.filter(s -> !s.isEmpty()).get();
        System.out.println(str);
//        String str2 = optionalX.filter(s -> s.isEmpty()).get(); //error

        //.map - If a value is present, returns an Optional describing (as if by ofNullable) the result of applying the given mapping function to the value, otherwise returns an empty Optional.
        System.out.println(optionalX.map(String::length).get()); //1
    }
}
