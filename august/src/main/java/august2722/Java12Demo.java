package august2722;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Java12Demo {
    public static void main(String[] args) {
        //two new methods in String class
        //1. indent
//        String text = "\t  -Hello !, How are you.\n -I am fine, and you?"; //despite \t, there are 3 white spaces
//        text = text.indent(-3);
//        System.out.println(text);
//
//        //2. transform
//        text = text.transform(s -> new StringBuilder(s).reverse().toString());

        //switch expressions

//        //automatic casting in case of true return from instanceOf
//
////        Object obj = "string";
//        Object obj = 5;
//        ToLongFunction<String> countS = s -> s.toLowerCase().chars().filter(i -> i == 's').count();
//        if (obj instanceof String s) {
//            System.out.println(countS.applyAsLong(s));
//        }

//        String dayOfWeek = LocalDate.now().getDayOfWeek().toString();
//        String dayOfWeek = "TUESDAY";
//        int value = switch (dayOfWeek) {
//            case "TUESDAY" -> 1;
//            case "WEDNESDAY" -> 2;
//            case "THURSDAY" -> 3;
//            case "FRIDAY" -> 4;
//            case "MONDAY", "SUNDAY" -> 6;
//        };
//
//        z:
//        for (int i = 0; i < 10; ++i) {
//            int k = switch (i) {
//                case 0:
//                    break 1;
//                case 1:
//                    break 2;
//                default:
//                    continue z;
//                    // ERROR! Illegal jump through a switch expression
//            };
//    ...
//        }

        try {
            m2();
        }
        catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

//        new BufferedReader()
    }

    public static void m2() throws FileNotFoundException{
        m1();
    }

    public static void m1() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}
