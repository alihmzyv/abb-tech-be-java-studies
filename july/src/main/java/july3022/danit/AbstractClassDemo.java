package july3022.danit;

import java.util.Calendar;

/*
interface CreatureHabits {
    void sleep();
    void eat();
    default void walk() {
        System.out.println("Walking");
    }

    static void exist() {
        System.out.println("Creature exists");
    }
}

interface PersonHabits extends CreatureHabits {
    default void speak() {
        System.out.println("Person is speaking");
    }
}

class Person implements PersonHabits {

    int age;
    String name;

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    public void eat() {
        System.out.println("Person is eating");
    }


}

public class AbstractClassDemo {
    public static void main(String[] args) {
//        CreatureHabits personHabits = new Person();
//        CreatureHabits.exist();
        MyProducer myp1 = new Car<String>();
        System.out.println(myp1.produce());
    }
}


interface MyProducer <T> {
    public T produce();
}

class Car<T> implements MyProducer<T> {
    public T produce() {
        return (T) new Car();
    }
}*/

//public class AbstractClassDemo implements MyInterface1, MyInterface2{
//
//
//
//    public static void main(String[] args) {
//        new AbstractClassDemo().method1();
//    }
//}
//
//interface MyInterface1 {
//
//    default void method1() {
//        System.out.println("MyInterface 1 method1");
//    }
//
//}
//interface MyInterface2 {
//    default void method1() {
//        System.out.println("MyInterface 2 method1");
//    }
//
//}