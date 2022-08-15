package august1522.danit;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
//        System.out.println(isEven.test(10));
//        Predicate<String> isPalindromic = (a) -> {
//            StringBuilder sb = new StringBuilder(a);
//            return a.equals(sb.reverse().toString());
//        };
//        String word = "aasdaa";
//        System.out.printf("%s is %sPalindromic\n", word, isPalindromic.test(word) ? "" : "not ");
//        EmployeeTest employeeTest = new EmployeeTest(true, 1000);
//        EmployeeTest employeeTest1 = new EmployeeTest(false, 999);
//        Predicate<EmployeeTest> isRichAndHasGirlfriend = (e) -> e.hasGirlfriend && e.salary >= 1000;
//        System.out.println(isRichAndHasGirlfriend.test(employeeTest));
//        System.out.println(isRichAndHasGirlfriend.test(employeeTest1));
//        Predicate<Integer> isPalindromicNumber = (num) -> (String.valueOf(num)).equals(new StringBuilder(String.valueOf(num)).reverse().toString());
//        System.out.println(isPalindromicNumber.test(55));
//        Predicate<String> isLong = s -> s.length() > 5;
//        System.out.println(isLong.test("Ali123"));
//        Predicate<Integer> isGreaterThan10 = num -> num > 10;
//        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10).negate();
//        Consumer;
//        Supplier;
//        Function;

    }
}

interface isEven2 {
    <T> boolean test(T o);
}

class EmployeeTest {
    boolean hasGirlfriend;
    int salary;

    public EmployeeTest(boolean hasGirlfriend, int salary) {
        this.hasGirlfriend = hasGirlfriend;
        this.salary = salary;
    }
}
