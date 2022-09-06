package august3122.io_reference.byte_streams.input_stream.filter_in_st;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class FilterInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
    }
}

class FilterInputStreamTranslate extends FilterInputStream {
    //it is as the name suggests to transform the data or adding additional functionality rather than directly reading
    FilterInputStreamTranslate(FileInputStream fileInputStream) {
        super(fileInputStream);
    }
}