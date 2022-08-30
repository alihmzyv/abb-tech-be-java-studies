package august2922;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //* by using FileReader, we read the file char by char which is not efficient
        //* using FileWriter, have to provide line separator \n
        //* thus BufferedWriter(Reader) recommended to be used

        // * BufferedWriter used again to write char data to file
        // * Constructors
        //#1
        File file1 = new File("august\\src\\main\\java\\august2922\\file1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

        //#1
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file1));


        // * methods
        // * FileWriter methods

        // newLine()
        try (bufferedWriter) {
            bufferedWriter.write("Line One");
            bufferedWriter.newLine();
            bufferedWriter.write("Line Two");
            bufferedWriter.newLine();
            bufferedWriter.write("Line Three");
        }
    }
}
