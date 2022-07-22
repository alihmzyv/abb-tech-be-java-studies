package july1122;

public class july1122 {
    public static void main(String[] args) {
//        Person p1 = Person.createObject(33, "Ali");
//        System.out.println(p1.toString());
//        Person p2 = new Person(33, "ali");

       /* Person p1 = new Person(4, "Ali");
        System.out.println(p1 instanceof Children );*/
        /*Children ch1 = new Children(1, "ali", "football");
        Person ch1Person = (Person) ch1;
        System.out.println(ch1.equals(ch1Person));*/

        /*Children child1 = new Children(1, "Ali","volleyball");
        Children child2 = new Children(1, "Ali","volleyball");
        System.out.println("child1 hash code: "+child1.hashCode());
        System.out.println("child2 hashcode: "+child2.hashCode());*/

        /*Object child3 = new Children(1, "ALi", "basketball");
        System.out.println(child3.getClass());*/

       /* Children child1 = new Children(1, "Ali", new int[]{1, 2, 3}, "volleybol");
        Children child2 = new Children(1, "Ali", new int[]{1, 2, 3}, "volleybol");
        System.out.println("child1 hash code: "+child1.hashCode());
        System.out.println("child2 hashcode: "+child2.hashCode());*/

        /*july1122.A A1 = new july1122.A(1, 2);
        july1122.A A2 = new july1122.A(1, 2);
        B B1 = new B(A1, 2);
        B B2 = new B(A2, 2);
        System.out.println(B1.equals(B2));*/
/*
        B b1 = new B(1, 0);
        System.out.println(b1.hashCode());*/

        A A1 = new A(2, 2);
        A A2 = new A(2, 2);
        System.out.println(A1.equals(A2));
        System.out.println(A1.hashCode());
        System.out.println(A2.hashCode());

    }
}

/*
class Person {
    *//*{
        System.out.println("Non static block of parent class");
    }*//*
    public static int numberOfPeople;
    public static String lastDatePersonAdded;
    *//*static {
//        Java classes aren't loaded into memory all at once, but when required by an application.
        System.out.println("Static block of parent class");
        numberOfPeople = 0;
        lastDatePersonAdded = "Not added any person yet";
    }*//*
    private int age;
    private String name;

    private int[] arr;

    Person(int age, String name, int[] arr) {
        System.out.println("Person contructor");
//        System.out.println(this.age);
        this.age = age;
        this.name = new String(name);
        this.arr = arr;
    }

    Person() {
        System.out.println("Parent class no arg constructor");
    }

    public static Person createObject(int age, String name, int[] arr) {
        return new Person(age, name, arr);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Age: "+this.age+"\nName: "+this.name+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && Arrays.equals(arr, person.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getAge(), getName());
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}

class Children extends Person{
    private String favoriteGame;
    *//*{
        System.out.println("non static block of child class");
    }
    static {
        System.out.println("Static block of child class");
    }*//*


    Children(int age, String name, int[] arr, String game) {
        super(age, name, arr);
        favoriteGame = game;
        System.out.println("Children Constructor.");
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Children children = (Children) o;
        return Objects.equals(getFavoriteGame(), children.getFavoriteGame());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFavoriteGame());
    }
}*/

/*
class july1122.A {
    int a;
    int b;

    july1122.A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        july1122.A a1 = (july1122.A) o;
        return getA() == a1.getA() && getB() == a1.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }
}

class B implements Cloneable {
    private july1122.A A1;
    private int b;

    public july1122.A getA1() {
        return A1;
    }

    public void setA1(july1122.A a1) {
        A1 = a1;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public B(july1122.A a1, int b) {
        A1 = a1;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b1 = (B) o;
        return getB() == b1.getB() && Objects.equals(getA1(), b1.getA1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA1(), getB());
    }
}*/
/*

class july1122.A {
    private int a;

    july1122.A(int a) {
        this.a = a;
    }

    public void methodOverriden() {
        System.out.println("Class july1122.A");
    }
}

class B extends july1122.A {
    private int b;

    B(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b1 = (B) o;
        return b == b1.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }

    public void methodOverriden() {
        System.out.println("Class B");
    }
}*/



class A {
    private int a;
    private int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return getA() == a1.getA() && getB() == a1.getB();
    }

}