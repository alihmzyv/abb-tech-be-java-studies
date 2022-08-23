package problems.easy;

import java.util.stream.IntStream;

public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        return IntStream.rangeClosed(1, n)
//                .unordered()
//                .parallel()
//                .filter(i -> {
//                    if (i == 1 && isBadVersion(i)) {
//                        return true;
//                    }
//                    return isBadVersion(i) && !isBadVersion(i - 1);
//                })
//                .findAny()
//                .getAsInt();
//    }
}
