package august1522.danit;

import java.sql.Ref;
import java.util.function.*;

public class ReferenceDemo {
    private int num;

    public void display() {
        System.out.printf("Num: \n", num);
    }
    ReferenceDemo(int num) {
        this.num = num;
        System.out.println("Constructor of ReferenceDemo Class 1");
    }

    ReferenceDemo() {
        System.out.println("Constructor with no arguments 2");
    }

    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Child Thread");
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
//        Thread.sleep(100);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Main Thread");
//        }
//        IntUnaryOperator SumDigits = new ReferenceDemo()::sumOfDigits;
//        System.out.println(SumDigits.applyAsInt(1234));
//        IntConsumer intConsumer = new ReferenceDemo()::sumOfDigits;
//        intConsumer.accept(55);
//        WorkingWithIntegers workingWithIntegers = new ReferenceDemo()::sumOfDigits;
//        System.out.println(workingWithIntegers.sumOfDigits(51212));
//        WorkingWithIntegers workingWithIntegers = ReferenceDemo :: new;
//        workingWithIntegers.sumOfDigits(4).display();
//        WorkingWithIntegers2 workingWithIntegers2 = ReferenceDemo :: new;
//        workingWithIntegers2.createReferenceDemo();

        IntFunction<Person> defaultPersonSupplier = Person::new;
        Person person = defaultPersonSupplier.apply(5);
        System.out.println(person);

        BiFunction<String, String, Person> personCreator = Person::new;
        Person person1 = personCreator.apply("Ali", "Hamzayev");
        System.out.println(person1);
    }



//    public int sumOfDigits(int num) {
//        int sum = 0;
//
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//
//        return sum;
//    }
}

//interface WorkingWithIntegers {
//    ReferenceDemo sumOfDigits(int num);
//}
//
//interface WorkingWithIntegers2 {
//    void createReferenceDemo();
//}

class Person {
    String name;
    String surname;
    int ID;

    private static int countPersons = 0;

    public Person(int ID) {
        this.ID = ID;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = getID();
    }

    private static int getID() {
        return ++countPersons;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Surname = %s, ID = %d", name, surname, ID);
    }
}