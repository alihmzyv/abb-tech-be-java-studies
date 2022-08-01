package july3022.danit;

class ParentCustomClass {
    public String m1() {
        System.out.println(" parent m1()");
        return null;
    }

    public ParentCustomClass m2() {
        System.out.println(" parent m2()");
        return null;
    }
}

class ChildtCustomClass extends ParentCustomClass {
    public String m1() {
        System.out.println("child m1()");
        return "";
    }

    @Override
    public ChildtCustomClass m2() {
        System.out.println(" child m2()");
        return null;
    }
}

public class CoVarientTypes {
    public static void main(String[] args) {
        ParentCustomClass class1 = new ChildtCustomClass();
        class1.m1();
        class1.m2();


        /*A method declaration d1 with return type R1 is return-type-substitutable for another method d2 with return type R2, if and only if the following conditions hold:

        If R1 is void then R2 is void.
        If R1 is a primitive type, then R2 is identical to R1.
        If R1 is a reference type then:
        R1 is either a subtype of R2 or R1 can be converted to a subtype of R2 by unchecked conversion (§5.1.9), or
        R1 = |R2|*/

    }
}
