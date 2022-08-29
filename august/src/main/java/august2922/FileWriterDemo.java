package august2922;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //can use FileWriter to write char data to file
        //constructors
        //creates the file as well if file does not exist


        //overwriting fileWriter constructors
        //#1
//        FileWriter fileWriter =
//                new FileWriter("C:\\Users\\Ali\\IdeaProjects\\abb-tech-be-studies\\august\\src\\main\\java\\august2922\\file1.txt");

        //#2
        File file1 = new File("C:\\Users\\Ali\\IdeaProjects\\abb-tech-be-studies\\august\\src\\main\\java\\august2922\\file1.txt");
//        FileWriter fileWriter1 = new FileWriter(file1);

        //to append
        //#3
        FileWriter fileWriter2 = new FileWriter(file1, true);

        //#4
//        FileWriter fileWriter3 = new FileWriter("C:\\Users\\Ali\\IdeaProjects\\abb-tech-be-studies\\august\\src\\main\\java\\august2922\\file1.txt", true);


        //methods
        //.write(String, char[], int)
//        try (fileWriter1) { //exception in initialization of 2nd resource
//            fileWriter1.write("text1\n");
//            fileWriter1.write(97);
//            fileWriter1.write("\n");
//            fileWriter1.write(98);
//            fileWriter1.write(new char[]{'a', 'b', 'c', 'c' + 2});
//        }

//        //.flush()
//        fileWriter1.flush();
//
//        //.close()
//        fileWriter1.close();
        FileWriter fileWriter = new FileWriter(file1, true);
        try (fileWriter) {
            fileWriter.write("\nAppended text\n");
            fileWriter.write('\\');
            fileWriter.write('n');
            fileWriter.write("xxx");
        }

    }
}
