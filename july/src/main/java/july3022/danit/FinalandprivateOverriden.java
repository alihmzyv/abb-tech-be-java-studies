package july3022.danit;

class Parent_Access {
    public void method(String a, String b, int v, float d) {
        System.out.println("parent");
    }
}

class Child_Access extends Parent_Access {
    //Access levels cannot be restrictive
    /*private void method(String a,String b,int v,float d){
    System.out.println("parent");
    }*/

//    protected void method(String a, String b, int v, float d) {
//        System.out.println("child");
//    }
}

class SuperParent {
    public void m1() {
        System.out.println(" super m1()");
    }

    protected void m2() {
        System.out.println(" super m2()");
    }

    private void m3() {
        System.out.println(" super m3()");
    }
}

class SuperChild extends SuperParent {
    public void m1() {
        super.m1();
        super.m2();
        System.out.println("child m1()");
    }

    protected void m2() {
        System.out.println("m2()");
    }

    private void m3() {
        System.out.println(" m3()");
    }
}

public class FinalandprivateOverriden {
    public static void main(String[] args) {
       SuperParent parent = new SuperChild();
       parent.m1();
       parent.m2();
    }
}