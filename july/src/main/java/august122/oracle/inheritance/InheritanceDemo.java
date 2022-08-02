package august122.oracle.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.testClassMethod();
    }
}

class Animal {
    public void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    protected void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
    }
}
