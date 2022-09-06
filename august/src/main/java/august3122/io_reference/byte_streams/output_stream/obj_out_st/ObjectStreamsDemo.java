package august3122.io_reference.byte_streams.output_stream.obj_out_st;

import java.io.*;

public class ObjectStreamsDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //The ObjectOutputStream class extends the OutputStream class and implements the ObjectOutput interface.
        //ObjectOutput interface extends the DataOutput and AutoCloseable interfaces and
        //supports object serialization.

        // * constructors
        File outputFile = new File("august/src/main/java/august3122/io_reference/byte_streams/output_stream/obj_out_st/serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile, false));
        oos.writeObject(new MyClass("a", 1, 1.5));
        oos.writeObject(new MyClass("b", 2, 2.5));

        //.writeObject(Object obj)

        //The ObjectInputStream class extends the InputStream class and implements the ObjectInput interface
        //ObjectInput interface extends the DataOutput and AutoCloseable interfaces and
        //supports object serialization.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFile));



        try (ois) {
            while (true) {
                System.out.println(ois.readObject());
            }
        }
        catch (EOFException exc) {
            System.out.println("Finished");
        }
        // * Serialization Example *

    }
}

class MyClass {
    String s;
    int i;
    double d;
    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
