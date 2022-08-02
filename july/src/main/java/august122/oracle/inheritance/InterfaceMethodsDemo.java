package august122.oracle.inheritance;

////public class InterfaceMethodsDemo {
////}
////
////class Horse {
////    public static String identifyMyself() {
////        return "I am a horse.";
////    }
////}
////interface Flyer {
////    default public String identifyMyself() {
////        return "I am a flyer";
////    }
////}
////interface Mythical {
////     static public String identifyMyself() {
////         return "I am mythical";
////     }
////}
////class Pegasus implements Flyer, Mythical {
////
////    @Override
////    public String identifyMyself(){
////        return Mythical.identifyMyself();
////    }
////
////    public static void main(String... args) {
////        Pegasus myApp = new Pegasus();
////        System.out.println(myApp.identifyMyself());
////    }
////}
//
//class ClassA {
//    public void methodOne(int i) {
//    }
//    public void methodTwo(int i) {
//    }
//    public static void methodThree(int i) {
//    }
//    public static void methodFour(int i) {
//    }
//}
//
//class ClassB extends ClassA {
//    public static String methodOne(int i) {
//    }
//    public void methodTwo(int i) {
//    }
//    public void methodThree(int i) {
//    }
//    public static void methodFour(int i) {
//    }
//}