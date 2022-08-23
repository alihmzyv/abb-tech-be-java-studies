package august2322;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args) {
        //Optional - map
        Optional<String> optionalNonEmpty = Optional.of("Name").map(String::toUpperCase);
        String nullStr = null;
        Optional<String> emptyOptional = Optional.ofNullable(nullStr).map(String::toLowerCase);
        System.out.printf("optionalNonEmpty: %s\n", optionalNonEmpty.orElse("Empty"));
        System.out.printf("emptyOptional: %s\n", emptyOptional.orElse("Empty"));

        //flatMap
        Optional<String> optionalNested = Optional.of(Optional.of("Surname")).flatMap(optional -> optional.map(String::toLowerCase));
        System.out.println(optionalNested);

        //filter
        Optional<String> stringOptional = Optional.of("three").filter(s -> s.length() > 4);
        Optional<String> stringOptional1 = Optional.of("four").filter(s -> s.length() > 4); //empty optional
        System.out.printf("1: %s\n2: %s\n", stringOptional, stringOptional1);

        //isPresent
        String str1 = null;
        String str2 = "string";
        Optional<String> stringOptional2 = Optional.ofNullable(str1);
        Optional<String> stringOptional3 = Optional.ofNullable(str2);
        System.out.println(stringOptional2.isPresent());
        System.out.println(stringOptional3.isPresent());

        //ifPresent
        stringOptional2.ifPresent(s -> System.out.println("IS PRESENT")); //does nothing
        stringOptional3.ifPresent(s -> System.out.println("IS PRESENT")); //does

        //orElse
        System.out.println(stringOptional2.orElse("Other")); //prints "Other"
        System.out.println(stringOptional3.orElse("Other")); //print "string"

        //orElseGet
        System.out.println(stringOptional2.orElseGet(() -> String.valueOf(new Random().nextInt(10)))); //random [0 - 9]
        System.out.println(stringOptional3.orElseGet(() -> String.valueOf(new Random().nextInt(10)))); //"string"

        //ifPresentOrElse
        stringOptional2.ifPresentOrElse(System.out::println, () -> System.out.println("Empty Run")); //empty run
        stringOptional3.ifPresentOrElse(System.out::println, () -> System.out.println("Empty Run")); //String


        /*
        https://www.oracle.com/technical-resources/articles/java/java8-optional.html
        */
        Optional<String> version = Optional.of("1.7");
        Optional<USB> usb = Optional.of(new USB(version));
        Optional<Soundcard> soundcard = Optional.empty();
        Optional<Computer> computer = Optional.of(new Computer(soundcard));
        String versionOrDefault = computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUsb)
                .flatMap(USB::getVersion)
                .orElse("default");
        System.out.println(versionOrDefault);
        stringOptional2.or()
    }
}

class USB {
    Optional<String> version;

    public USB(Optional<String> version) {
        this.version = version;
    }

    public USB() {
    }

    public Optional<String> getVersion() {
        return version;
    }
}

class Soundcard {
    Optional<USB> usb;

    public Soundcard(Optional<USB> usb) {
        this.usb = usb;
    }

    public Soundcard() {
    }

    public Optional<USB> getUsb() {
        return usb;
    }
}

class Computer {
    Optional<Soundcard> soundcard;

    public Computer(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }

    public Computer() {
    }

    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }
}
