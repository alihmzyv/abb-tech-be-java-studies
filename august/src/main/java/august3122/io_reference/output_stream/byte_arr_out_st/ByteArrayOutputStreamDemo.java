package august3122.io_reference.output_stream.byte_arr_out_st;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //uses a byte array as destination
        // constuctors
        // #1
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        //#2
        int size; //size of byte array can be given
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream(size = 100);

        // * methods
        //write methods just as FileOutputStream
        //toByteArray(), .size()

        //write
        byte[] bytes = "String source of bytes".getBytes();
        byteArrayOutputStream.write(bytes);

        System.out.println(new String(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));

        //it has toString method overriden
        System.out.println(byteArrayOutputStream);

        //write to
        try (FileOutputStream fileOutputStream = new FileOutputStream("august/src/main/java/august3122/io_reference/output_stream/byte_arr_out_st/output.txt")) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }

        //reset - clears the array of stream
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write("After reset".getBytes());
        System.out.println(byteArrayOutputStream);
    }
}
