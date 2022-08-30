package august3022;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class ExamplesDemo {
    public static File merge(File file1, File file2) throws IOException {
        File file3 = new File("august\\src\\main\\java\\august3022\\file3.txt");
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        PrintWriter printWriter1 = new PrintWriter(new FileWriter(file3, true))) {
            Stream.of(bufferedReader1.lines(), bufferedReader2.lines())
                    .flatMap(i -> i)
                    .forEach(System.out::println);
        }
        return file3;
    }

    public static File subtract(File input, File deleted) throws IOException {
        File file3 = new File("august\\src\\main\\java\\august3022\\output.txt");
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(input));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(deleted));
        PrintWriter printWriter = new PrintWriter(new FileWriter(file3, true))) {
            List<String> deletedList = bufferedReader2.lines().toList();
            bufferedReader1.lines()
                    .filter(line -> !deletedList.contains(line))
                    .forEach(printWriter::println);
        }
        return file3;
    }

    public static File getUniques(File input) throws IOException {
        File file3 = new File("august\\src\\main\\java\\august3022\\output2.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             PrintWriter printWriter = new PrintWriter(new FileWriter(file3, true))) {
            bufferedReader.lines().distinct().forEach(printWriter::println);
        }
        return file3;
    }


    public static void main(String[] args) throws IOException {
        File file1 = new File("august\\src\\main\\java\\august3022\\file1.txt");
        File file2 = new File("august\\src\\main\\java\\august3022\\file2.txt");
        new BufferedReader(new FileReader(getUniques(file1))).lines().forEach(System.out::println);
    }
}
