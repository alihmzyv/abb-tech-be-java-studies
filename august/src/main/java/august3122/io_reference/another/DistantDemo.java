package august3122.io_reference.another;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DistantDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("august/src/main/java/august3122/io_reference/online/file.bin"))) {
            System.out.println(ois.readObject());
        }
    }
}
