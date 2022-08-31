package august3122.io_reference.output_stream.file_out_st;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // * FileOutputStream <- OutputStream
        // * constructors
        /*
        FileOutputStream(String filePath)
        FileOutputStream(File fileObj)
        FileOutputStream(String filePath, boolean append)
        FileOutputStream(File fileObj, boolean append)
         */

//        //#1
//        FileOutputStream fileOutputStream1 = new FileOutputStream("august/src/main/java/august3122/io_reference/FileOutputStreamDemo.java");
//
//
//        //#2
//        File file = new File("august/src/main/java/august3122/io_reference/FileOutputStreamDemo2.java");
//        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
//
//
//        //#3
//        FileOutputStream fileOutputStream3 = new FileOutputStream(file, false);
//
//        //#4
//        FileOutputStream fileOutputStream4 = new FileOutputStream("august/src/main/java/august3122/io_reference/FileOutputStreamDemo2.java", false);


        // * methods
        try (FileOutputStream fileOutputStream1 = new FileOutputStream("august/src/main/java/august3122/io_reference/file1.txt");
             FileOutputStream fileOutputStream2 = new FileOutputStream("august/src/main/java/august3122/io_reference/file2.txt");
             FileOutputStream fileOutputStream3 = new FileOutputStream("august/src/main/java/august3122/io_reference/file3.txt")) {
            String str = "Witpevze mappos isoletu fo res bi geow pofin mu rupoho revzi utva ne.";
            byte[] bytes = str.getBytes();
            int count = 0;

            //write(int byte)
            while (count < bytes.length) {
                fileOutputStream1.write(bytes[count]);
                count += 2;
            }

            //write(byte[] arr)
            fileOutputStream2.write(bytes);

            fileOutputStream3.write(Arrays.copyOfRange(bytes, bytes.length - (bytes.length / 4), bytes.length));
        }
    }
}
