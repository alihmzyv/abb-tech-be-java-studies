package august2922;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //checks if the file named abc.txt exists in the root dir of project, if yes, refers to that
        // if not, does not create a file
//        File f = new File("abc.txt");
//        System.out.println(f.exists()); //false if abc.txt does not exist
//        f.createNewFile(); //create the file if it does not exist
//        System.out.println(f.exists()); //true

//        //we can use java file object to refer to a dir as well
//        File dir1 = new File("dir1");
//        System.out.println(dir1.exists()); //false at first run
//        dir1.createNewFile(); //creates file with no format, dir1 refers to that from now on
//        System.out.println(dir1.exists());
//        dir1 = new File("dir2"); //will refer to dir created by name "dir2"
//        dir1.mkdir();
//        System.out.println(dir1.exists()); //true
//
//        //try on an existing directory from root dir of project
//        File dir2 = new File("src");
//        System.out.println(dir2.exists()); //true
//
//        //in unix os, everything is treated as a file. java file io concept is implemented based on unix os
//        //thus, java file objects can be used to represent both files and directories


        //File class constructors
        //#1
//        File file1 = new File("file_at_root_dir_of_project.txt");
//        file1.createNewFile();
//        System.out.println(file1.exists());
//
//
//        //#2
//        //since src is the root of project, dont need the full path
//        File file2 = new File("src", "file_at_src_dir");
//        file2.createNewFile();
//        System.out.println(file2.exists());
//
//
//        //try with non-existent dir in root
//        File file3 = new File("srcNon", "non_existing");
////        file3.createNewFile(); //IOException thrown
//        System.out.println(file3.exists());

        //#3
//        File dir1 = new File("dir1");//dir1 does not exist yet
//        File file4 = new File("dir1", "file_at_dir1");
//        file4.createNewFile(); ////IOException hence
//        System.out.println(file4.exists());

        //doing everything right
//        dir1.mkdir(); //dir1 directory created at root
//        System.out.println(file4.createNewFile());; //file4 now can be located in dir1

        //examples
//        File dir_at_Desktop = new File("C:\\Users\\Ali\\Desktop", "dir_at_Desktop");
//        dir_at_Desktop.mkdir();
//        File file_txt_at_dir = new File(dir_at_Desktop, "file_txt_at_dir.txt");
//        file_txt_at_dir.createNewFile();
//        File file2_txt_at_dir = new File("C:\\Users\\Ali\\Desktop\\dir_at_Desktop", "file2_txt_at_dir.txt");
//        file2_txt_at_dir.createNewFile();

        File dir_at_C = new File("C:\\", "dir_at_C");
        dir_at_C.mkdir();
        File file3_at_dir_C = new File(dir_at_C, "file3.txt");
        file3_at_dir_C.createNewFile();
        //dir2_C does not exist, thus createNewFile throws IOException
        File file4_at_dir2_C = new File("C:\\dir2_C\\", "file4_at_dir2_C");
//        file4_at_dir2_C.createNewFile();

        //methods
        //the ones above plus:
        //.isFile(), .isDirectory()
//        System.out.printf("dir_at_C is directory: %s\nfile3_at_dir_C is file: %s\n",
//                dir_at_C.isDirectory(), file3_at_dir_C.isFile());
        File dir2_at_Desktop_Java_File = new File("C:\\Users\\Ali\\Desktop\\java\\File", "dir2");
        dir2_at_Desktop_Java_File.mkdir();
        File dir2Sub = new File(dir2_at_Desktop_Java_File, "dir2Sub");
        dir2Sub.mkdir();
        File file1 = new File(dir2_at_Desktop_Java_File, "file1.txt");
        File file2 = new File(dir2Sub, "file2.txt");
        File file3 = new File("C:\\Users\\Ali\\Desktop\\java\\File\\dir2\\file3.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        //.list() -> String[] of file and dir names (Each string is a file name rather than a complete path.)
//        Arrays.stream(dir2_at_Desktop_Java_File.list()).forEach(System.out::println);
        //.listFiles()
//        Arrays.stream(dir2_at_Desktop_Java_File.listFiles()).forEach(file -> System.out.printf("%s is a %s\n", file.getName(), file.isFile() ? "file" : "dir"));
        //.length()
//        System.out.println(file3.length());
//        File javaCode = new File("C:\\Users\\Ali\\Desktop\\java\\File\\FileDemo.java");
//        System.out.println(javaCode.length());
//        //.delete()
//        javaCode.delete();

        //examples
        File desktop = new File("C:\\Users\\Ali\\Desktop");
//        Arrays.stream(desktop.listFiles()).forEach(file -> System.out.printf("%s is a %s;\n",
//                file.getName(), file.isFile() ? "file" : "dir"));
//        System.out.printf("There are %d total file and dirs.", desktop.listFiles().length);

        //display only file names
        System.out.println("Files at Desktop:");
        Arrays.stream(desktop.listFiles()).filter(File::isFile).forEach(System.out::println);
    }
}
