package august3022;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //can write any reference and primite type to file
        //constructors
        //#1
//        PrintWriter printWriter = new PrintWriter("august\\src\\main\\java\\august2922\\file1.txt");

        //#2
//        PrintWriter printWriter1 = new PrintWriter(new File("august\\src\\main\\java\\august2922\\file1.txt"));
//
//        //#3
        PrintWriter printWriter2 = new PrintWriter(new FileWriter(new File("august\\src\\main\\java\\august2922\\file1.txt"), true));

        //methods from BufferedWriter
        //print
        //println

        try (printWriter2) {
            printWriter2.println(100);
            printWriter2.write(new char[]{100, 98, 99});
            printWriter2.println();
            printWriter2.write("Text1");
            printWriter2.println();
            printWriter2.println(1);
            printWriter2.println(new char[]{100, 98, 99});
            printWriter2.println(Arrays.toString(new Student[]{new Student(2, "Hasan", "Hasanov")}));
            printWriter2.println("Text1");
            printWriter2.println(new Student(1, "Mammad", "Mammadov"));
        }
    }
}
class Student {
    int id;
    String name;
    String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
