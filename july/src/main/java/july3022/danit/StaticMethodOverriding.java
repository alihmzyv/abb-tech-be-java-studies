package july3022.danit;

class ParentStatic {
    public void method(String string) {
        System.out.println("Parent   :" + string);
    }

    public void method2(String string) {
        System.out.println("Parent   :" + string);
    }
}

class ChildStatic extends ParentStatic {

    public void method(String string) {
        System.out.println("Child   :" + string);
    }
}
public class StaticMethodOverriding {
    public static void main(String[] args) {

        /*1) For class (or static) methods, the method according to the type of
        reference is called, not according to the abject being referred, which means
        method call is decided at compile time.

        2) For instance (or non-static) methods, the method is called according to the type
        of object being referred, not according to the type of reference, which means method
        calls is decided at run time.*/

        new ChildStatic().method("Me");

        ParentStatic parentStatic = new ChildStatic();
        parentStatic.method("Me");
    }
}
