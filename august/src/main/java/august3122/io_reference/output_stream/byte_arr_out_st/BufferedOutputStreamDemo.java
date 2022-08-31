package august3122.io_reference.output_stream.byte_arr_out_st;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //Not special
        //only is used to improve performance by only writing the data to the supplied stream once in the end
        // * constructors
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("august/src/main/java/august3122/io_reference/output_stream/byte_arr_out_st/output.txt", true));
        try (bufferedOutputStream) {
            bufferedOutputStream.write("\nBufferedOutputStream says Hello x2!".getBytes());
        }
    }
}
