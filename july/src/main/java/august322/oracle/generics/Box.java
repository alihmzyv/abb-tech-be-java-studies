//package august322.oracle.generics;
//
//import java.util.List;
//
//public class Box<T> {
//    private T t;
//
//
//    public T get() {
//        return t;
//    }
//
//    public void set(T t) {
//        this.t = t;
//    }
//}
////    public <U extends Number & Interface1> void inspect(U u) {
//////        u.substring()
////        System.out.println("T: " + t.getClass().getName());
////        System.out.println("U: " + u.getClass().getName());
////    }
////
////    public static void main(String[] args) {
////        Box<Integer> integerBox = new Box<>();
////        integerBox.setT(new Integer(5));
////        integerBox.inspect(new StringSubclass());
////    }
//}
////
////class StringSubclass extends Number implements Interface1 {
////
////    @Override
////    public int intValue() {
////        return 0;
////    }
////
////    @Override
////    public long longValue() {
////        return 0;
////    }
////
////    @Override
////    public float floatValue() {
////        return 0;
////    }
////
////    @Override
////    public double doubleValue() {
////        return 0;
////    }
////}
////
////interface Interface1 {
////
////}