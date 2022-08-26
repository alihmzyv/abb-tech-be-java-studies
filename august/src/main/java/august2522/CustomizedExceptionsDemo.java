package august2522;

import java.io.FileNotFoundException;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomizedExceptionsDemo {
//    static int x = 10 / 0;
    public static void main(String[] args) throws AgeNotInRange {
//        Profile profile = new Profile();
//        Scanner sn = new Scanner(System.in);
//        while (true) {
//            try {
//                profile.setAge(sn.nextInt());
//                System.out.println("Age set successfully");
//            }
//            catch (InputMismatchException exc) {
//                System.out.println("Please input integer as your age.");
//                sn.nextLine();
//            }
//        }
    }
}

class AgeNotInRange extends Exception {

    AgeNotInRange(String message) {
        super(message);
    }
}

class Profile {
    private int age;

    public void setAge(int age) throws AgeNotInRange {
        if (age < 16) {
            throw new AgeNotInRange("Too young");
        }
        if (age > 60) {
            throw new AgeNotInRange("Too old");
        }
        this.age = age;
    }
}
