package august1222.danit;

public class Outer {
    int x = 1;
    static int y;

     class Inner {

        int x = 2;
        public void m1() {
            int x = 3;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }

        public void m2() {
            System.out.println(x);
        }
    }

    public void m3() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Outer().new Inner().m1();
    }
}
