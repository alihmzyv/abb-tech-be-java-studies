package july2522.danit;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(Cat.i);
    }
}

class Cat {
    static int i = 6;

    static {
        System.out.println("Class loaded");
    }
}
