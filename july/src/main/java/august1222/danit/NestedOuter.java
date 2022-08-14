package august1222.danit;

//public class StaticNestedClassesDemo {
////    public static void main(String[] args) throws InterruptedException {
////        //created inner class object without creating outer class object thanks to nested class
////        NestedOuter.NestedInner x = new NestedOuter.NestedInner();
////    }
//}

public class NestedOuter {

    //no strong dependency on outer class
    //no possibility to access Inner class without existing outer class object
    static int x;

    class NestedInner {
        public static void show() {
            System.out.println("Nested Inner Class");
            System.out.println(x);
        }

        public static void main(String[] args) {
            show();
        }
    }


}
