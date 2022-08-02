package august222.danit.overriding;

public class AllAboutOverridingDemo {

    public static void main(String args[]) {
        //All well it will print
        // Parent   :Me

        //Parent parent=new Parent();
        //parent.method("Me");


        //If we comment method in Parent and remove override in child
        //It throws CE
        //if we cast it to child also will get RE
        //Exception in thread "main" java.lang.ClassCastException: com.me.overriding.Parent cannot be cast to com.me.overriding.Child
        //at com.me.overriding.ChildParenRule.main(ChildParenRule.java:19)

       /* Parent parent2=new Parent();
        ((Child) parent2).method("Me");
*/
        //Calls the child  lass Method,If not found calls
        //Parent class's Method

        //Child child=new Child();
        //child.method("Me");


        //Though Reference type is Parent overriding occurs at RE
        //It will take as child object and calls child method
        //if not there it will search for parent class method

        Parent parent=new Child();
        parent.method("Me");


        //CE as Type mismatch: cannot convert from Parent to Child
        //We can't convert  parent to child class
        //Exception in thread "main" java.lang.Error: Unresolved compilation problems:
        //Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
        //Syntax error, insert ";" to complete LocalVariableDeclarationStatement

        //at com.me.overriding.ChildParenRule.main(ChildParenRule.java:53)

        //Child child=(Child) new Parent();
        //child.method("Me");


        //
        /*6
        down vote
        A parent class should not have knowledge of child classes.
        Parent parent=new Parent();
        ((Child)parent).method("Me");*/

    }
}

/*class Superclass {
    public Superclass(int x) {
        System.out.println("000000");
    }

    public Superclass() {
        System.out.println("  ty");
    }
    public Superclass(String y) {}
}

class Subclass extends Superclass {
    public Subclass() {
        super(5); // chain to Superclass(int) constructor
    }
}

class One {
    public One() { // Super Class constructor

    }

    One(int a) { // Super Class Constructor Overloading

    }
}

class Two extends One {
    *//* {
      //One() {    // this is a method not constructor
         // because name should not match with Class name
     }*//*

    Two() { // sub class constructor
    }

    Two(int b) { // sub class constructor overloading

    }
}*/
//class B
//{
//    int a=10;
//    public void print()
//    {
//        System.out.println("inside B super class");
//    }
//
//}
//class C extends B
//{
//    int a=20;
//    public void print()
//    {
//        System.out.println("inside C sub class");
//    }
//
//
//}

//class ParentStatic2 {
//    public static void method(String string) {
//        System.out.println("Parent   :" + string);
//    }
//
//    public void method2(String string) {
//        System.out.println("Parent   :" + string);
//    }
//}
//
//class ChildStatic2 extends ParentStatic2 {
//
//    //This static method cannot hide the instance method from ParentStatic
//    public void method(String string) {
//        System.out.println("Child   :" + string);
//    }
//
//    //This static method cannot hide the instance method from ParentStatic
//    public static void method2(String string) {
//        System.out.println("Child   :" + string);
//    }
//}

//public class AllAboutOverridingDemo {
//    public static void main(String[] args) {
//
//
////        Parent_2 child_2 = new Child_2();
////        child_2.m1();
////
////        //The method m2() from the type Parent_2 is not visible
////        child_2.m2();
//
//
////        String temp = "Monday";
////        Child_Params child_Params = new Child_Params();
////
////
////        /*Parent_params params=new Child_Params();
////        child_Params=(Child_Params) params;
////        child_Params.method(temp,temp,2);*/
////
////        Parent_params params2 = new Parent_params();
////        child_Params = (Child_Params) params2;
////        child_Params.method(temp, temp, 2);
//
//    }
//}
//
//
//
//class ExceptionParent {
//    public void m1() throws IOException {
//        System.out.println("m1()");
//    }
//}
//
////Exception Exception is not compatible with throws clause in ExceptionParent.m1()
////It should be sam or narrowed or unchecked exception
//
////CE
///*class ExceptionChild extends ExceptionParent{
//public void m1() throws Exception{
//System.out.println("m1()");
//}*/
//
////CE
////IllegalArgumentException is Un-checked
///*class ExceptionChild extends ExceptionParent{
//public void m1() throws Exception,IllegalArgumentException{
//System.out.println("m1()");
//}*/
//
////OK bccz of Un-Checked Exception
///*class ExceptionChild extends ExceptionParent{
//public void m1() throws IllegalArgumentException{
//System.out.println("m1()");
//}*/
//
///*//CE bcz of Checked
//class ExceptionChild extends ExceptionParent{
//public void m1() throws IOException,InterruptedException{
//System.out.println("m1()");
//}*/
//
//class ExceptionChild extends ExceptionParent {
//
//    @Override
//    public void m1() throws DirectoryIteratorException {
//        System.out.println("m1() x");
//    }
//
//}
//
////interface Interface {
////    public void m1();
////}
////
////
/////*If an abstract class implements the above interface,
////then it doesn’t require the subclass to override the move() method,
////as shown in the following AbstractDog class:*/
////
////
////abstract class AbstractClass implements Interface {
////    public abstract void m2();
////    public void m3() {
////        System.out.println("m3()");
////    }
////}
////
////
/////*//But if a concrete (non-abstract) class, says BullDog, is a subclass of the
////AbstractDog class or the Animal interface, then it must override all the inherited
////abstract methods, as shown below:*/
////
////
////class ConcreteClass extends AbstractClass {
////
////    @Override
////    public void m1() {
////        // TODO Auto-generated method stub
////        System.out.println("m1()");
////    }
////
////    @Override
////    public void m2() {
////        // TODO Auto-generated method stub
////        System.out.println("m2()");
////    }
////
////    @Override
////    public void m3() {
////        // TODO Auto-generated method stub
////        System.out.println("m3()");
////    }
////
////}
//
////class SuperParent {
////    public void m1() {
////        System.out.println(" super m1()");
////    }
////
////    protected void m2() {
////        System.out.println(" super m2()");
////    }
////
////    private void m3() {
////        System.out.println(" super m3()");
////    }
////}
////
////class SuperChild extends SuperParent {
////    public void m1() {
////        super.m1();
////        super.m2();
////        System.out.println("m1()");
////    }
////
////    protected void m2() {
////        System.out.println("m2()");
////    }
////
////    private void m3() {
////        System.out.println(" m3()");
////    }
////}
//
//
////class Dad {
////    private static final String me = "dad";
////
////    protected String getMe() {
////        return me;
////    }
////
////    public void printMe() {
////        System.out.println(getMe());
////    }
////}
////
////class Son extends Dad {
////    private static final String me = "son";
////
////    @Override
////    protected String getMe() {
////        return me;
////    }
////}
//
////class ParentStatic {
////    int a = 4;
////    public static void method(String string) {
////        System.out.println("Parent   :" + string);
////    }
////
////    public void method2(String string) {
////        System.out.println("Parent   :" + string);
////    }
////}
////
////class ChildStatic extends ParentStatic {
////    int a = 5;
////
////    public static void method(String string) {
////        System.out.println("Child   :" + string);
////    }
////}
//
////class ParentCustomClass {
////    public Object m1() {
////        System.out.println(" parent m1()");
////        return null;
////    }
////
////    public ParentCustomClass m2() {
////        System.out.println(" parent m2()");
////        return null;
////    }
////}
////
////class ChildtCustomClass extends ParentCustomClass {
////    @Override
////    public String m1() {
////        System.out.println("child m1()");
////        return null;
////    }
////
////    @Override
////    public ChildtCustomClass m2() {
////        System.out.println(" child m2()");
////        return null;
////    }
////}
//
////class Parent_params {
////    void method(String a, String b, int v, float d) {
////        System.out.println("parent");
////    }
////
////    void method2(String a, String b, int v) {
////        System.out.println("parent");
////    }
////
////    void method3(String a, int v) {
////        System.out.println("parent");
////    }
////}
////
////class Child_Params extends Parent_params {
////    //If we want to override the parent class you need to have same
////    //no of params as parent had
////    //WRONG...
////    /*@Override
////    void method(String a){
////    System.out.println("child");
////    }*/
////
////    //Order of the params should also be same as parent
////    //WRONG
////    /*@Override
////    void method(String a,float d,int a,String b){
////    System.out.println("parent");
////    }*/
////
////    //Override
////    @Override
////    void method(String a, String b, int v, float d) {
////        System.out.println("child");
////    }
////
////    //Overloading
////    //We can define a method like this
////    void method(String a, String b, int v) {
////        System.out.println("child");
////    }
////
////    void method2(String a, int b, String v) {
////        System.out.println("child");
////    }
////
////    void method3(int v, String a) {
////        System.out.println("child");
////    }
////
////}
////
////class Parent1 {
////    public void method(String string) {
////        System.out.println("Parent   :" + string);
////    }
////
////    public void method2(String string) {
////        System.out.println("Parent   :" + string);
////    }
////}
////
////class Child1 extends Parent1 {
////
////    //The return type is incompatible with Parent1.method(String)
////
////    @Override
////    public int method(String string) {
////        System.out.println("Child   :" + string);
////    }
////}
//
////class Parent_2 {
////    public final void m1() {
////        System.out.println("m1()");
////    }
////
////    private void m2() {
////        System.out.println("m2() parent");
////    }
////}
//
////Cannot override the final method from Parent_2
////class Child_2 extends Parent_2 {
////    public final void m1() {
////        System.out.println("m1()");
////    }
////
////    private void m2() {
////        System.out.println("m2() of child");
////    }
////}
//
////class Parent_Access {
////    protected void method(String a, String b, int v, float d) {
////        System.out.println("parent");
////    }
////}
////
////class Child_Access extends Parent_Access {
////    //Access levels cannot be restrictive
////    /*private void method(String a,String b,int v,float d){
////    System.out.println("parent");
////    }*/
////
////    public void method(String a, String b, int v, float d) {
////        System.out.println("parent");
////    }
////}

//class ParentStatic_1 {
//    public void method(String string) {
//        System.out.println("Parent   :" + string);
//    }
//
//    public void method2(String string) {
//        System.out.println("Parent   :" + string);
//    }
//}
//
//class ChildStatic_1 extends ParentStatic_1 {
//
//    public static void method(String string, int b) {
//        System.out.println("Child   :" + string);
//    }
//
//    public static void method2(String string, int b, float c) {
//        System.out.println("Child   :" + string);
//    }
//}

//class ParentStatic_2 {
//    public void method(String string) {
//        System.out.println("Parent   :" + string);
//    }
//
//    public void method2(String string) {
//        System.out.println("Parent   :" + string);
//    }
//}
//
//class ChildStatic_2 extends ParentStatic_2 {
//
//    public void method(String string) {
//        System.out.println("Child  -1 :" + string);
//    }
//}
//
//class ChildStatic_3 extends ChildStatic_2 {
//
//    public void method(String string) {
//        System.out.println("Child -2  :" + string);
//    }
//}
//
//class ChildStatic_4 extends ChildStatic_3 {
//
//    public void method(String string) {
//        System.out.println("Child -3  :" + string);
//    }
//}

//class ParentStatic_2 {
//    public void method(String string) {
//        System.out.println("Parent   :" + string);
//    }
//
//    public void method2(String string) {
//        System.out.println("Parent   :" + string);
//    }
//}
//
//class ChildStatic_2 extends ParentStatic_2 {
//
//    public void method(String string) {
//        System.out.println("Child  -1 :" + string);
//    }
//}
//
//class ChildStatic_3 extends ChildStatic_2 {
//
//    public void method(String string) {
//        System.out.println("Child -2  :" + string);
//    }
//}
//
//class ChildStatic_4 extends ChildStatic_3 {
//
//    public void method(String string) {
//        System.out.println("Child -3  :" + string);
//    }
//}

class Parent {
    public void method(String string) {
        System.out.println("Parent   :" + string);
    }

    public void method2(String string) {
        System.out.println("Parent   :" + string);
    }
}

class Child extends Parent {
    @Override
    public void method(String string) {
        System.out.println("Child   :" + string);
    }
}