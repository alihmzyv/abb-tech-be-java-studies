package august3122.io_reference.byte_streams.output_stream.filter_out_st.print_st;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // * constructors
//        // #1
//        PrintStream p1 = new PrintStream(new FileOutputStream("august/src/main/java/august3122/io_reference/output_stream/filter_out_st/print_st/output.txt", true));
//        p1.println("\nAppended");
//
//        // #2
//        PrintStream p2 = new PrintStream(new FileOutputStream("august/src/main/java/august3122/io_reference/output_stream/filter_out_st/print_st/output.txt", true), true);

        /*
        PrintStream(File outputFile) throws FileNotFoundException
        PrintStream(File outputFile, String charSet)
         throws FileNotFoundException, UnsupportedEncodingException
        PrintStream(String outputFileName) throws FileNotFoundException
            PrintStream(String outputFileName, String charSet) throws FileNotFoundException,
        UnsupportedEncodingException
         */

        // #3
        File file = new File("august/src/main/java/august3122/io_reference/output_stream/filter_out_st/print_st/output.txt");
        PrintStream p3 = new PrintStream(file);

        // #4
        PrintStream p4 = new PrintStream("august/src/main/java/august3122/io_reference/output_stream/filter_out_st/print_st/output.txt");

//        try (p3; p4) {
            p3.println("From p3");
//            p4.println("From p4"); //when created p4, it tried to erase the output.txt, even when starting printing it clears the file !
//        }

        try (p4) {
            p4.printf("Student 1: %s", new Student(1, "Ali", "Hamzayev"));
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
