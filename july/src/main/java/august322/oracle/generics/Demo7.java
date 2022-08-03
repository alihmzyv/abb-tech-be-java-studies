package august322.oracle.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;

        Box<String> integerBox = new Box<>("ali");
        integerBox.doSomething();

        Box<? super String> box2 = new Box<>(5);
        box2.doSomething();
    }
}

class NaturalNumber {

    private int i;

    public NaturalNumber(int i) { this.i = i; }
    // ...
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) { super(i); }
    // ...
}

class Box<T> {
    T object;

    public Box(T object) {
        this.object = object;
    }

    public void doSomething() {
        System.out.println("Did something");
    }
}