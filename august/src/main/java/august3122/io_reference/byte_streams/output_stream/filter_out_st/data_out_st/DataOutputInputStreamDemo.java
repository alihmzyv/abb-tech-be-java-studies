package august3122.io_reference.byte_streams.output_stream.filter_out_st.data_out_st;

import java.io.*;

public class DataOutputInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("august/src/main/java/august3122/io_reference/output_stream/filter_out_st/data_out_st/output.dat");
        try (FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeDouble(10.15);
            dos.writeFloat(10.15F);
            dos.writeBoolean(true);
        }
        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readDouble() + ", " + dis.readFloat() + ", " + dis.readBoolean());
        }
    }
}
