package august3022;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //can read lines
        File file = new File("august\\src\\main\\java\\august2922\\file1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        try (bufferedReader) {
            Stream.generate(() -> {
                String line = "";
                try {
                    line = bufferedReader.readLine();
                }
                catch (IOException exc) {
                    //swallow
                }
                return line;
            }).takeWhile(Objects::nonNull)
                    .forEach(System.out::println);



            new BufferedReader(new FileReader(file)).lines().forEach(System.out::println);
        }
    }
}
