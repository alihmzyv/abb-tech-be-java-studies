package august222.danit.overriding;

public class PackageParent {
    public void m1() {
        System.out.println("m1()");
    }
    protected void m2() {
        System.out.println("m2()");
    }

    //Defalut methods are allowed only ininterface
    /*default void m3(){
    System.out.println("m3()");
    }*/


    private void m4() {
        System.out.println("m1()");
    }
}
