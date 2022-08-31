package august3122.io_reference.input_stream.filter_in_st.buff_in_st;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        byte[] buf = s.getBytes();
    }
}
