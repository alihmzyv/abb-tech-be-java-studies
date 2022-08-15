package august1522.danit;

public class DefaultStaticMethodsInterfaceDemo {
    public static void main(String[] args) {
//        //static
//        FuncInterface1.display2();
//
//        //abstract
//        FuncInterface1 funcInterface1 = () -> System.out.println("abstract, lambda");
//        funcInterface1.display();
//        //default
//        funcInterface1.display1();
//
//        //using anonymous class
//        FuncInterface1 funcInterface2 = new FuncInterface1() {
//            @Override
//            public void display() {
//                System.out.println("abstract, anonymous class");
//            }
//        };
//        //abstract
//        funcInterface2.display();
//        //default
//        funcInterface2.display1();
    }
}

interface FuncInterface1 {
    void display();
    default void display1() {
        System.out.println("default");
    }
    static void display2() {
        System.out.println("static");
    }
}