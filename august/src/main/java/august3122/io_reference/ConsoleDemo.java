package august3122.io_reference;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

public class ConsoleDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Console is primarily a convenience class because most of its
        //functionality is available through System.in and System.out. However, its use can simplify
        //some types of console interactions, especially when reading strings from the console.

        //Console is primarily a convenience class because most of its
        //functionality is available through System.in and System.out. However, its use can simplify
        //some types of console interactions, especially when reading strings from the console.

        //no constructor
        Console console = System.console();

        // * methods
        //.printf()
        console.printf("%d + %d = %d\n", 5, 5, 5 + 5);
        Thread.sleep(1000);

        //.reader()
        Reader reader = console.reader();
        char[] chars = new char[10];
        reader.read(chars);
        console.printf("chars: %s\n", new String(chars, 0, chars.length));

        //.readLine()
        String read = console.readLine();
        console.printf("String read 1: %s\n", read);

        //.readLine(String, varArgs)
        read = console.readLine("String read:\n");
        console.writer().printf("String read 2: %s\n", read);
    }
}
