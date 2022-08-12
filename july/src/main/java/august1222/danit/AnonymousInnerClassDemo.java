package august1222.danit;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Student student = new Student(1);

        //e.g., used anonymous class to just create a subclass of Student to override only one method
        //if there are 100's of methods in Student, and one method is to be overriden,
        //then this approach is recommended for one time purpose:
        //I will not need a Student subclass overriding this method as following, again after this.
        //right hand side returns an object of an anonymous inner of AnonymousInnerClassDemo class which extends Student
        //assigned to Student (parent class) variable
        Student student2 = new Student(2) {
            @Override
            public void show() {
                System.out.printf("Class: %s\n", getClass().getName());
            }
        };

        Student student3 = new StudentSubclass(3);

//        System.out.println(student); //Student
//        System.out.println(student2);//InnerClassDemo
//        System.out.println(student instanceof Student); //true
//        System.out.println(student2 instanceof Student); //true
//        System.out.println(student3.getClass().getName());
        student2.show();
        student3.show();
    }
}

class Student {
    final int ID;

    //anonymous inner class of Student created (but cant accessible anywhere else ever after, due to anonymous)
    // which implements Comparator interface
    //instantiated by new
    //assigned into reference variable which is Interface type
    final static Comparator<Integer> compByID = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };


    public Student(int ID) {
        this.ID = ID;
    }

    public void show() {
        System.out.printf("Class: %s\n", this.getClass().getName());
    }
}

class StudentSubclass extends Student {
    public StudentSubclass(int ID) {
        super(ID);
    }
}
