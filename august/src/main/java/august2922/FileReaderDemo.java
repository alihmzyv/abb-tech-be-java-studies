package august2922;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //constructors
        //#1
        File file1 = new File("C:\\Users\\Ali\\IdeaProjects\\abb-tech-be-studies\\august\\src\\main\\java\\august2922\\file1.txt");
        FileReader fileReader = new FileReader(file1);

        //#2
        FileReader fileReader1 = new FileReader("C:\\Users\\Ali\\IdeaProjects\\abb-tech-be-studies\\august\\src\\main\\java\\august2922\\file1.txt");


        //methods
        //.read()
//        StringBuilder sb = new StringBuilder();
//        Stream.generate(() -> {
//            try {
//                return fileReader1.read();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        })
//                .takeWhile(i -> i != -1)
//                .map(i -> (char) i.intValue())
//                .forEach(ch -> sb.append(ch));
////        System.out.println(sb);
//
//        //ready()
//        System.out.println(fileReader1.ready());
//
//        //.read(char[] ch)
//        char[] chars = new char[10];
//        int countRead = fileReader.read(chars);
//        for (char ch: chars) {
//            System.out.print(ch);
//        }
//        System.out.println(countRead);

        //.length and read(char[] ch)
        FileReader fileReader2 = new FileReader(file1);
        char[] chars2;
        try (fileReader2) {
            chars2 = new char[(int) file1.length()];
            fileReader2.read(chars2);
        }

        for (char ch: chars2) {
            System.out.print(ch);
        }
    }
}
