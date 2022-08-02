package august122.oracle.interfaces;

public class ClassLoadingDemo {
    public static void main(String[] args) {
        System.out.println(A.i);
    }
}

class A {

     static int j = 6;
    static final int i = j + 4;
    static {
        System.out.println("Static block executed");
    }

    public static int getJ() {
        return j;
    }

    public static int getI() {
        return i;
    }
}
