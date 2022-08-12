package august1222.danit;

import java.util.List;

public class NestedClassesDemo {
    public static void main(String[] args) {
        //case 1 - accessing inner class from outer class static part
        System.out.println(new NestedClassesDemo().new Inner().methodInner());
    }

    //case 2 - accessing inner class from instance area (okay to  access directly, since instance area of outer means
    // outer class is instantiated already)
    private String methodInnerOutput = new Inner().methodInner();

    //cannot access inner class from static area of outer because then it would be accesing inner class without creating outer object
//    private static String methodInnerOuput2 = new Inner().methodInner();


    class Inner {
        private int x;
        public String methodInner() {
            return "method inner";
        }
    }
}
