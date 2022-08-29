package august2722;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) throws Throwable {
//        Scanner sn = new Scanner(System.in);
            try(Scanner sn = new Scanner(System.in)) {
                sn.close();
                //Oracle - Putting cleanup code in a finally block (or try with resources ) is always a good practice, even when no exceptions are anticipated.
                System.out.print("Input an integer: ");
//            throw new RuntimeException();
//            try {
//                int x = sn.nextInt();
//            }
//            catch (IllegalStateException exc) {
//                //the exception is never thrown from sn.close() by try with resources
//                throw new IllegalStateException("from try block", exc);
//            }
//            IntStream.rangeClosed(1, x)
//                    .forEach(num -> {
//                        IntStream.rangeClosed(1, 10)
//                                .forEach(factor -> System.out.printf("%d * %d = %d\n", num, factor, num * factor));
//                        System.out.println();
//                    });
                throw new RuntimeException();
            }
            catch (IllegalArgumentException exc) {
                System.out.println("Declaration problem");
            }
            catch (RuntimeException exc) {
                System.out.println(exc.getStackTrace());
            }
//        catch (IllegalArgumentException exc) {
//            try {
//                sn.close();
//            }
//            catch (IllegalArgumentException exc2) {
//                System.out.println("Yes, in any termination of try block, the resources opened till that point is closed.");
//            }
//        }
//        catch (RuntimeException exc) {
//            try {
//                sn.nextLine(); //sn is already closed
//            }
//            catch (IllegalStateException exc2) {
//                System.out.println("sn is already closed");
//            }
//        }
    }

    public static void cat(File file) throws IOException{
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}


