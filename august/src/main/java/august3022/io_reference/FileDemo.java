package august3022.io_reference;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("august/src/main/java/august3022/io_reference/file1.txt");
//        file.createNewFile();
//        //getName()
//        p(file.getName());
//
//        //getPath()
//        p(file.getPath());
//
//
//        //getAbsolutePath()
//        p(file.getAbsolutePath());
//
//        //getParent()
//        p(file.getParent());
//
//        //exists()
//        p(String.valueOf(file.exists()));
//
//        //canWrite()
//        p(String.valueOf(file.canWrite()));
//
//        //canRead()
//        p(String.valueOf(file.canRead()));
//
//        //isDirectory, isFile
//        p(String.valueOf(file.isAbsolute()));
//
//        //lastModified()
//        p(LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault()).toString());

        //renameTo(String s)
//        file.renameTo(new File("august/src/main/java/august3022/io_reference/file2Renamed.txt"));

        //deleteOnExit()

        //setReadOnly()
//        file.setReadOnly();
//        file.setWritable(true);
//        new PrintWriter(new FileWriter(file, true)).println("Cannot write"); //FileNotFoundException

        //compareTo()

        //list(), listFiles()
        File dir = new File("august/src/main/java/august3022");
        Optional<File[]> optionalFileList = Optional.ofNullable(dir.listFiles());
        //FilenameFilter
        optionalFileList = Optional.ofNullable(dir.listFiles((dr, name) -> name.contains("file")));
        //FileFilter
//        optionalFileList = Optional.ofNullable(dir.listFiles(File::isFile));
        optionalFileList.ifPresent(files -> Arrays.stream(files)
                .forEach(f -> System.out.printf("%s is a %s\n", f.getName(), f.isFile() ? "file" : "directory")));

        //mkdirs()
        File dirNotExisting = new File("august/src/main/java/august3122/io_reference");
        p(String.valueOf(dirNotExisting.mkdir())); //false, the path does not exist
        p(String.valueOf(dirNotExisting.mkdirs())); //true, path is correct, the dirs are created which did not exist

    }
    public static void p(String s) {
        System.out.println(s);
    }
}
