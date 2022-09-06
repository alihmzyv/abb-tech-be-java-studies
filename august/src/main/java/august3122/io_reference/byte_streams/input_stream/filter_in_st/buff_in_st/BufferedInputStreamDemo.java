package august3122.io_reference.byte_streams.input_stream.filter_in_st.buff_in_st;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        byte[] buf = s.getBytes();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(buf));
        int i = bufferedInputStream.read();
        System.out.println(i);
        bufferedInputStream.close();
    }
}
