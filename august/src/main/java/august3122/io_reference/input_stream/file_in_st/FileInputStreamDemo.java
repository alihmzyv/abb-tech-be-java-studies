package august3122.io_reference.input_stream.file_in_st;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //FileInputStream <- InputStream
        // * constructors
        //#1
        File file = new File("august/src/main/java/august3122/io_reference/input_stream/file_in_st/FileInputStreamDemo.java");
        FileInputStream fileInputStream1 = new FileInputStream(file);

        //#2
//        FileInputStream fileInputStream2 = new FileInputStream("august/src/main/java/august3122/io_reference/input.txt");

        // * methods
        try (fileInputStream1) {
            int size;

            //int available()
            System.out.printf("Available bytes: %d\n", size = fileInputStream1.available());
            int n = size / 40;
            System.out.println("First " + n +
                    " bytes of the file one read() at a time");

            //int read()
            for (int i=0; i < n; i++) {
                System.out.print((char) fileInputStream1.read());
            }
            System.out.printf("Still available bytes: %d\n", fileInputStream1.available());

            System.out.println("Reading the next " + n +
                    " with one read(b[])");

            //int read(byte[] arr) - writes to the array
            byte[] b = new byte[n];
            if (fileInputStream1.read(b) != n) {
                System.err.println("couldn’t read " + n + " bytes.");
            }

            //readAllBytes() returns the byte array representation of file
            //readNBytes(long n)
            //reset - not supported

            System.out.println(new String(b, 0, b.length));
            System.out.printf("Still available: %d\n", size = fileInputStream1.available());
            System.out.println("Skip half of the remaining bytes..");

            //int skip(long n) - returns actual number of bytes skipped
            fileInputStream1.skip(size / 2);
            System.out.println("Still available: " + (size = fileInputStream1.available()));
        }
    }
}
