package july2522.danit;

import java.util.Objects;

public class AssertJTesting {
    int a;

    AssertJTesting(int a) {
        this.a = a;
    }
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssertJTesting that = (AssertJTesting) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
