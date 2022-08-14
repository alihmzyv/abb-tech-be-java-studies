package august1422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
//        StringWorker stringWorker1 = str -> {return str.length(); };
//        System.out.println(stringWorker1.getLength("ALI"));
//        IntegerWorker integerWorker1 = ((a, b) -> (a + b));
//        System.out.println(integerWorker1.getSum(1, 2));
//        StringWorker stringWorker = new StringWorker() {
//            @Override
//            public int getLength(String str) {
//                return str.length();
//            }
//        };
//        System.out.println(stringWorker.getClass().getName());
    }
}


@FunctionalInterface
interface StringWorker {
    int getLength(String str);
}

@FunctionalInterface
interface IntegerWorker {
    int getSum(int a, int b);
}
