package august3122.io_reference.output_stream.filter_out_st;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;

public class FilterOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
    }
}

class FilterOutputStreamTranslate extends FilterOutputStream {
    //it is as the name suggests to transform the data or adding additional functionality rather than directly writing
    FilterOutputStreamTranslate(FileOutputStream fileOutputStream) {
        super(fileOutputStream);
    }
}