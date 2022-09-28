package september1322;

public class WorkingWithDebug {
    public static void main(String[] args) {
        test(1);
        test(0);
    }

    public static void test(int i) {
        System.out.println("bla bla");
        if (i == 0) {
            throw new IllegalArgumentException();
        }
    }
}
