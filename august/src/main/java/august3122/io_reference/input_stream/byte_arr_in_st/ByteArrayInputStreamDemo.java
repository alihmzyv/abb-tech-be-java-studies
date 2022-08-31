package august3122.io_reference.input_stream.byte_arr_in_st;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // ByteArrayInputStream as the name suggests differ from FileInputStream in that it uses byte array as its
        // data source
        // constructors
        //#1
        byte[] bytes = "The text to get the byte representation of".getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(bytes);

        //#2
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bytes, 10, bytes.length - 10);

        // * methods
        //read methods just as FileInputStream
        //mark and reset - supported
        byte[] bytesRead = byteArrayInputStream1.readAllBytes();
        System.out.println(new String(bytesRead, 0, bytesRead.length));
        byteArrayInputStream1.reset();
        bytesRead = byteArrayInputStream1.readAllBytes();
        System.out.println(new String(bytesRead, 0, bytesRead.length));
    }
}
